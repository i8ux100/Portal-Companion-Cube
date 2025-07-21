package com.i8ux100.companioncube;

import com.fox2code.foxloader.loader.Mod;
import com.fox2code.foxloader.registry.EntityRegistry;

import net.minecraft.common.block.Blocks;
import net.minecraft.common.item.ItemStack;
import net.minecraft.common.item.Items;
import net.minecraft.common.recipe.CraftingManager;
import net.minecraft.client.gui.creative.CreativeTab;
import net.minecraft.client.gui.creative.CreativeTabs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.common.block.Block;
import net.minecraft.common.block.data.Materials;
import net.minecraft.common.block.sound.StepSounds;
import net.minecraft.common.item.data.EnumTools;
import net.minecraft.common.entity.player.EntityPlayer;
import net.minecraft.common.world.World;
import java.awt.*;

public class CompanionCubeMod extends Mod {

    @Override
    public void onPreInit() {
        EntityRegistry.registerEntityClass(EntityCompanionCube.class, "companion_cube");
        /*
        CraftingManager.getInstance().addRecipe(new ItemStack(COMPANION_CUBE_BLOCK),
            "III",
            "IAI",
            "III",
            'I', Items.IRON_INGOT, 'A', Items.RED_APPLE);
        */
    }

    @Override
    public void onInit() {
        EntityRendererManager.instance.addEntityRenderer(EntityCompanionCube.class, new RenderCompanionCube(new ModelCompanionCube()));
    }
}
