package com.i8ux100.companioncube;

import com.fox2code.foxloader.loader.Mod;
import net.minecraft.common.block.Blocks;
import net.minecraft.common.item.ItemStack;
import net.minecraft.common.item.Items;
import net.minecraft.common.recipe.CraftingManager;
import net.minecraft.client.gui.creative.CreativeTab;
import net.minecraft.client.gui.creative.CreativeTabs;
import net.minecraft.common.block.Block;
import net.minecraft.common.block.data.Materials;
import net.minecraft.common.block.sound.StepSounds;
import net.minecraft.common.item.data.EnumTools;
import net.minecraft.common.entity.player.EntityPlayer;
import net.minecraft.common.world.World;
import java.awt.*;

public class CompanionCubeMod extends Mod {
    public static CompanionCubeBlock COMPANION_CUBE_BLOCK;

    @Override
    public void onPreInit() {
        COMPANION_CUBE_BLOCK = new CompanionCubeBlock("companion_cube");
        CraftingManager.getInstance().addRecipe(new ItemStack(COMPANION_CUBE_BLOCK),
            "III",
            "IAI",
            "III",
            'I', Items.IRON_INGOT, 'A', Items.RED_APPLE);
    }

    public class CompanionCubeBlock extends Block {
        public CompanionCubeBlock(String name) {
            super(name, Materials.METAL);
            this.setSound(StepSounds.SOUND_METAL);
            this.setFlammable(1, 10);
            this.setBurnTime(0, 300);
            this.setHardness(1F);
            this.setTooltipColor(Color.PINK.getRGB());
            this.setEffectiveTool(EnumTools.PICKAXE);
        }

        @Override
        public CreativeTab getRegisterFLTab() {
            return CreativeTabs.FUNCTIONAL_BLOCKS;
        }

        @Override
        public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int metadata) {
            this.dropBlockAsItem_do(world, x, y, z, new ItemStack(getItemID(), 1, damageDropped(metadata)));
            player.addToPlayerScore(null, 1, true);
        }
    }
}
