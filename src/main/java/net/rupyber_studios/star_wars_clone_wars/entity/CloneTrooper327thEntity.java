
package net.rupyber_studios.star_wars_clone_wars.entity;

import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModItems;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModEntities;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;

public class CloneTrooper327thEntity extends Monster implements RangedAttackMob {
	public CloneTrooper327thEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(StarWarsModEntities.CLONE_TROOPER_327TH.get(), world);
	}

	public CloneTrooper327thEntity(EntityType<CloneTrooper327thEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
		setCustomName(Component.literal("Clone Trooper"));
		setCustomNameVisible(true);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(StarWarsModItems.BLASTER_DC_15S.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(StarWarsModItems.CLONE_TROOPER_327TH_ARMOR_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(StarWarsModItems.CLONE_TROOPER_327TH_ARMOR_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(StarWarsModItems.CLONE_TROOPER_327TH_ARMOR_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(StarWarsModItems.CLONE_TROOPER_327TH_ARMOR_BOOTS.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, DroidCommanderEntity.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, DroidEntity.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, DroidPilotEntity.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DroidSecurityEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, SeparatistTankEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DroidKashyyykEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, DroidCommanderKashyyykEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, DroidPilotKashyyykEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, DroidSecurityKashyyykEntity.class, false, false));
		this.goalSelector.addGoal(10, new TemptGoal(this, 1.5, Ingredient.of(StarWarsModItems.CLONE_TROOPER_COMMUNICATOR.get()), false));
		this.goalSelector.addGoal(11, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(12, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(14, new FloatGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		BlasterDc15sProjectileEntity.shoot(this, target);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
		return builder;
	}
}
