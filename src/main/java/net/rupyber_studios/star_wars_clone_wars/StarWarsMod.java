/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.rupyber_studios.star_wars_clone_wars;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModTabs;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModItems;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModFeatures;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModEntities;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModBlocks;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModBiomes;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("star_wars")
public class StarWarsMod {
	public static final Logger LOGGER = LogManager.getLogger(StarWarsMod.class);
	public static final String MODID = "star_wars";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public StarWarsMod() {
		StarWarsModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		StarWarsModBlocks.REGISTRY.register(bus);
		StarWarsModItems.REGISTRY.register(bus);
		StarWarsModEntities.REGISTRY.register(bus);

		StarWarsModFeatures.REGISTRY.register(bus);

		StarWarsModBiomes.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
