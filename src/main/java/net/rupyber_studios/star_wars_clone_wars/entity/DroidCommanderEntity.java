
package net.rupyber_studios.star_wars_clone_wars.entity;

import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModEntities;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

public class DroidCommanderEntity extends Monster implements RangedAttackMob {
	public DroidCommanderEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(StarWarsModEntities.DROID_COMMANDER.get(), world);
	}

	public DroidCommanderEntity(EntityType<DroidCommanderEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 4;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, CloneTrooperEntity.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, CloneTrooperCommanderEntity.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, CloneTrooper501stEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, CloneTrooperGuardEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CloneTrooperCaptainEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CloneTrooperSergeantEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CloneTrooper212thEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CloneTrooper41stEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CloneTrooper91stEntity.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, CloneTrooper104thEntity.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, CloneTrooper327thEntity.class, false, false));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, CloneTrooperCommanderCodyEntity.class, false, false));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, CloneTrooperCommanderWolffeEntity.class, false, false));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, CloneTrooperCommanderFoxEntity.class, false, false));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, CloneTrooperCommanderAppoEntity.class, false, false));
		this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, CloneTrooperCommanderGreeEntity.class, false, false));
		this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, CloneTrooperLiutenantEntity.class, false, false));
		this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, CloneTrooperBombEntity.class, false, false));
		this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, CloneTrooperCommanderBlyEntity.class, false, false));
		this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, CloneTrooperCaptainRexEntity.class, false, false));
		this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, CloneTrooperCommanderPondsEntity.class, false, false));
		this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, CloneTrooper25633rdEntity.class, false, false));
		this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, RepublicTankEntity.class, false, false));
		this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, RepublicTankAutoEntity.class, false, false));
		this.goalSelector.addGoal(26, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(27, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(28, new FloatGoal(this));
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
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		BlasterE5Entity.shoot(this, target);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
