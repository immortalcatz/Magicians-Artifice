package mysticartifice.guis.machines;

import mysticartifice.ModInfo;
import mysticartifice.containers.ContainerMysticAnvil;
import mysticartifice.tileentities.TileEntityMysticAnvil;
import mysticartifice.utils.TextHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Millsy on 19/07/14.
 */
public class GuiMysticAnvil extends GuiContainer {

    public static final ResourceLocation metalMixerGui = new ResourceLocation(ModInfo.MODID, "textures/guis/guiMysticAnvil.png");
    @SuppressWarnings("unused")
    private ContainerMysticAnvil container;
    private TileEntityMysticAnvil te;

    public GuiMysticAnvil(EntityPlayer player, TileEntityMysticAnvil tile) {
        super(new ContainerMysticAnvil(player, tile));
        this.container = (ContainerMysticAnvil) this.inventorySlots;
        this.te = tile;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        fontRendererObj.drawString(TextHelper.localize("gui.mystic.anvil"), xSize / 2 - fontRendererObj.getStringWidth(TextHelper.localize("gui.mystic.anvil")) / 2, 2, 4210752);
        fontRendererObj.drawString(TextHelper.localize("container.inventory"), 8, ySize - 96 + 4, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GL11.glColor4f(1F, 1F, 1F, 1F);

        Minecraft.getMinecraft().getTextureManager().bindTexture(metalMixerGui);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);

        int i1 = this.te.getScaledProgress(24);
        this.drawTexturedModalRect(xStart + 96, yStart + 35, 176, 14, i1 + 1, 16);

    }
}