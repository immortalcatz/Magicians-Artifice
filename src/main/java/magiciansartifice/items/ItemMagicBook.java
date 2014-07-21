package magiciansartifice.items;

import magiciansartifice.MagiciansArtifice;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemMagicBook extends Item {

    public ItemMagicBook() {
        this.setUnlocalizedName("magiciansartifice.book");
        this.setTextureName("magiciansartifice:book");
        this.setCreativeTab(MagiciansArtifice.tab);
        ItemRegistry.items.add(this);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (world.isRemote) {
            player.openGui(MagiciansArtifice.instance, 2, world, 0, 0, 0);
        }

        return stack;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par4) {
        lore.add("by Merlin");
    }
}