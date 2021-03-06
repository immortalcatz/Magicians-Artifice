package magiciansartifice.main.fluids;

import cpw.mods.fml.common.Optional;
import magiciansartifice.main.compat.ticon.fluids.BlockFluidPureStarSteel;
import magiciansartifice.main.compat.ticon.fluids.BlockFluidRawStarSteel;
import magiciansartifice.main.fluids.fluidblocks.BlockFluidMagicWater;
import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by poppypoppop on 29/07/2014.
 */
public class LiquidRegistry {
	public IIcon flowing;
	public IIcon still;
	public IIcon pureFlowing;
	public IIcon purStill;
	
    public static Fluid magicWater;
    public static Block magicWaterBlock;
    public static Fluid moltenStarSteel;
    public static Block moltenStarSteelBlock;
    public static Fluid pureMoltenStarSteel;
    public static Block pureMoltenStarSteelBlock;

    public static void registerFluids() {
        magicWater = new Fluid("magicWater");
        FluidRegistry.registerFluid(magicWater);
        magicWaterBlock = new BlockFluidMagicWater(magicWater);
        GameRegistry.registerBlock(magicWaterBlock, magicWaterBlock.getUnlocalizedName());
        magicWater.setUnlocalizedName(magicWaterBlock.getUnlocalizedName());
    }

    @Optional.Method(modid = "TConstruct")
    public static void registerTiConFluids() {
        moltenStarSteel = new Fluid("moltenStarSteel").setViscosity(2000);
        FluidRegistry.registerFluid(moltenStarSteel);
        moltenStarSteelBlock = new BlockFluidRawStarSteel(moltenStarSteel);
        GameRegistry.registerBlock(moltenStarSteelBlock, moltenStarSteelBlock.getUnlocalizedName());
        moltenStarSteel.setUnlocalizedName("moltenStarSteel");

        pureMoltenStarSteel = new Fluid("pureMoltenStarSteel").setViscosity(3000);
        FluidRegistry.registerFluid(pureMoltenStarSteel);
        pureMoltenStarSteelBlock = new BlockFluidPureStarSteel(pureMoltenStarSteel);
        GameRegistry.registerBlock(pureMoltenStarSteelBlock, pureMoltenStarSteelBlock.getUnlocalizedName());
        pureMoltenStarSteel.setUnlocalizedName(pureMoltenStarSteelBlock.getUnlocalizedName());
    }

}
