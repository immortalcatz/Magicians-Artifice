package magiciansartifice.main.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

/**
 * User: joel / Date: 16.12.13 / Time: 22:36
 */
public class ContainerAdvancedBook extends Container {

    public ContainerAdvancedBook() {
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return true;
    }
}