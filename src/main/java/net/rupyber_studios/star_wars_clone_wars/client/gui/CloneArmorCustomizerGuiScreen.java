package net.rupyber_studios.star_wars_clone_wars.client.gui;

import net.rupyber_studios.star_wars_clone_wars.world.inventory.CloneArmorCustomizerGuiMenu;
import net.rupyber_studios.star_wars_clone_wars.network.CloneArmorCustomizerGuiButtonMessage;
import net.rupyber_studios.star_wars_clone_wars.StarWarsMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CloneArmorCustomizerGuiScreen extends AbstractContainerScreen<CloneArmorCustomizerGuiMenu> {
	private final static HashMap<String, Object> guistate = CloneArmorCustomizerGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_customize;

	public CloneArmorCustomizerGuiScreen(CloneArmorCustomizerGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("star_wars:textures/screens/clone_armor_customizer_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("star_wars:textures/screens/.png"), this.leftPos + 30, this.topPos + 28, 0, 0, 18, 18, 18, 18);

		guiGraphics.blit(new ResourceLocation("star_wars:textures/screens/arrow.png"), this.leftPos + 120, this.topPos + 28, 0, 0, 26, 18, 26, 18);

		guiGraphics.blit(new ResourceLocation("star_wars:textures/screens/.png"), this.leftPos + 75, this.topPos + 28, 0, 0, 18, 18, 18, 18);

		guiGraphics.blit(new ResourceLocation("star_wars:textures/screens/clone_armor_customizer_grade_slot.png"), this.leftPos + 54, this.topPos + 29, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("star_wars:textures/screens/clone_armor_customizer_dye_slot.png"), this.leftPos + 98, this.topPos + 29, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.star_wars.clone_armor_customizer_gui.label_clone_armor_customizer"), 7, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_customize = Button.builder(Component.translatable("gui.star_wars.clone_armor_customizer_gui.button_customize"), e -> {
			if (true) {
				StarWarsMod.PACKET_HANDLER.sendToServer(new CloneArmorCustomizerGuiButtonMessage(0, x, y, z));
				CloneArmorCustomizerGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 53, this.topPos + 54, 70, 20).build();
		guistate.put("button:button_customize", button_customize);
		this.addRenderableWidget(button_customize);
	}
}
