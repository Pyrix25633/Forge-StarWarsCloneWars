
package net.mcreator.starwars.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
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
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.starwars.init.StarWarsModEntities;

public class SeparatistTankEntity extends Monster implements RangedAttackMob {
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.BLUE,
			ServerBossEvent.BossBarOverlay.NOTCHED_10);

	public SeparatistTankEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(StarWarsModEntities.SEPARATIST_TANK.get(), world);
	}

	public SeparatistTankEntity(EntityType<SeparatistTankEntity> type, Level world) {
		super(type, world);
		xpReward = 50;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, RepublicTankAutoEntity.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, RepublicTankEntity.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, CloneTrooperEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, CloneTrooperCommanderEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CloneTrooper501stEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CloneTrooperGuardEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CloneTrooperCaptainEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CloneTrooperSergeantEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CloneTrooper212thEntity.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, CloneTrooper41stEntity.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, CloneTrooper91stEntity.class, false, false));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, CloneTrooper104thEntity.class, false, false));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, CloneTrooper327thEntity.class, false, false));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, CloneTrooperCommanderCodyEntity.class, false, false));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, CloneTrooperCommanderWolffeEntity.class, false, false));
		this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, CloneTrooperCommanderFoxEntity.class, false, false));
		this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, CloneTrooperCommanderAppoEntity.class, false, false));
		this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, CloneTrooperCommanderGreeEntity.class, false, false));
		this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, CloneTrooperLiutenantEntity.class, false, false));
		this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, CloneTrooperBombEntity.class, false, false));
		this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, CloneTrooperCommanderBlyEntity.class, false, false));
		this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, CloneTrooperCaptainRexEntity.class, false, false));
		this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, CloneTrooperCommanderPondsEntity.class, false, false));
		this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, CloneTrooper25633rdEntity.class, false, false));
		this.goalSelector.addGoal(26, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(27, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(28, new FloatGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10) {
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
	public double getPassengersRidingOffset() {
		return super.getPassengersRidingOffset() + -0.3;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("star_wars:entity.walk.tank")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("star_wars:entity.hurt.tank"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.CACTUS)
			return false;
		if (source.getMsgId().equals("trident"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		SeparatistTankShotEntity.shoot(this, target);
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 600);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 10);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1.5);
		return builder;
	}
}
