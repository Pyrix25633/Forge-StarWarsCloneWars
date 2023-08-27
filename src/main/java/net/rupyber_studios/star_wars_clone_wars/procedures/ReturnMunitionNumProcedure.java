package net.rupyber_studios.star_wars_clone_wars.procedures;

import net.rupyber_studios.star_wars_clone_wars.network.StarWarsModVariables;

import net.minecraft.world.entity.Entity;

public class ReturnMunitionNumProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return ("" + (entity.getCapability(StarWarsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsModVariables.PlayerVariables())).munition_num).replace(".0", "");
	}
}
