package magiciansartifice.items.tools.starsteel;

import magiciansartifice.MagiciansArtifice;
import magiciansartifice.items.ItemRegistry;
import magiciansartifice.libs.ModInfo;
import net.minecraft.item.ItemHoe;

/**
 * Created by poppypoppop on 22/07/2014.
 */
public class ItemHoeStarSteel extends ItemHoe {
    public ItemHoeStarSteel() {
        super(ItemRegistry.starSteel);
        this.setCreativeTab(MagiciansArtifice.tab);
        this.setTextureName(ModInfo.MODID + ":tools/starSteelHoe");
        this.setUnlocalizedName("star.steel.hoe");
        ItemRegistry.items.add(this);
    }
}