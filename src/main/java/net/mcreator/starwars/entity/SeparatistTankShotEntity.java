
package net.mcreator.starwars.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.starwars.procedures.TankShootExplosionProcedureProcedure;
import net.mcreator.starwars.init.StarWarsModItems;
import net.mcreator.starwars.init.StarWarsModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class SeparatistTankShotEntity extends AbstractArrow implements ItemSupplier {
	public SeparatistTankShotEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(StarWarsModEntities.SEPARATIST_TANK_SHOT.get(), world);
	}

	public SeparatistTankShotEntity(EntityType<? extends SeparatistTankShotEntity> type, Level world) {
		super(type, world);
	}

	public SeparatistTankShotEntity(EntityType<? extends SeparatistTankShotEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public SeparatistTankShotEntity(EntityType<? extends SeparatistTankShotEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(StarWarsModItems.BLASTER_MUNITIONS.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		TankShootExplosionProcedureProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(),
				blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static SeparatistTankShotEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		SeparatistTankShotEntity entityarrow = new SeparatistTankShotEntity(StarWarsModEntities.SEPARATIST_TANK_SHOT.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("star_wars:entity.laser.shot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static SeparatistTankShotEntity shoot(LivingEntity entity, LivingEntity target) {
		SeparatistTankShotEntity entityarrow = new SeparatistTankShotEntity(StarWarsModEntities.SEPARATIST_TANK_SHOT.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 8f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(6);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("star_wars:entity.laser.shot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}