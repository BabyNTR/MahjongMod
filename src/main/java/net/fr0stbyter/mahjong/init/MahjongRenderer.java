package net.fr0stbyter.mahjong.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.fr0stbyter.mahjong.init.MahjongRegister.*;

public class MahjongRenderer {
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    private static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
    @SideOnly(Side.CLIENT)
    public static void render() {
        registerRender(blockMjm1);
        registerRender(itemMjm1);
        registerRender(blockMjm2);
        registerRender(itemMjm2);
        registerRender(blockMjm3);
        registerRender(itemMjm3);
        registerRender(blockMjm4);
        registerRender(itemMjm4);
        registerRender(blockMjm5);
        registerRender(itemMjm5);
        registerRender(blockMjm6);
        registerRender(itemMjm6);
        registerRender(blockMjm7);
        registerRender(itemMjm7);
        registerRender(blockMjm8);
        registerRender(itemMjm8);
        registerRender(blockMjm9);
        registerRender(itemMjm9);
        registerRender(blockMjp1);
        registerRender(itemMjp1);
        registerRender(blockMjp2);
        registerRender(itemMjp2);
        registerRender(blockMjp3);
        registerRender(itemMjp3);
        registerRender(blockMjp4);
        registerRender(itemMjp4);
        registerRender(blockMjp5);
        registerRender(itemMjp5);
        registerRender(blockMjp6);
        registerRender(itemMjp6);
        registerRender(blockMjp7);
        registerRender(itemMjp7);
        registerRender(blockMjp8);
        registerRender(itemMjp8);
        registerRender(blockMjp9);
        registerRender(itemMjp9);
        registerRender(blockMjs1);
        registerRender(itemMjs1);
        registerRender(blockMjs2);
        registerRender(itemMjs2);
        registerRender(blockMjs3);
        registerRender(itemMjs3);
        registerRender(blockMjs4);
        registerRender(itemMjs4);
        registerRender(blockMjs5);
        registerRender(itemMjs5);
        registerRender(blockMjs6);
        registerRender(itemMjs6);
        registerRender(blockMjs7);
        registerRender(itemMjs7);
        registerRender(blockMjs8);
        registerRender(itemMjs8);
        registerRender(blockMjs9);
        registerRender(itemMjs9);
        registerRender(blockMjm5r);
        registerRender(itemMjm5r);
        registerRender(blockMjp5r);
        registerRender(itemMjp5r);
        registerRender(blockMjs5r);
        registerRender(itemMjs5r);
        registerRender(blockMjh1);
        registerRender(itemMjh1);
        registerRender(blockMjh2);
        registerRender(itemMjh2);
        registerRender(blockMjh3);
        registerRender(itemMjh3);
        registerRender(blockMjh4);
        registerRender(itemMjh4);
        registerRender(blockMjh5);
        registerRender(itemMjh5);
        registerRender(blockMjh6);
        registerRender(itemMjh6);
        registerRender(blockMjh7);
        registerRender(itemMjh7);
        registerRender(blockMjh8);
        registerRender(itemMjh8);
        registerRender(blockMjf1);
        registerRender(itemMjf1);
        registerRender(blockMjf2);
        registerRender(itemMjf2);
        registerRender(blockMjf3);
        registerRender(itemMjf3);
        registerRender(blockMjf4);
        registerRender(itemMjf4);
        registerRender(blockMjd1);
        registerRender(itemMjd1);
        registerRender(blockMjd2);
        registerRender(itemMjd2);
        registerRender(blockMjd3);
        registerRender(itemMjd3);
        registerRender(blockMjBlank);
        registerRender(itemMjBlank);
        registerRender(blockRiichibou);
        registerRender(itemRiichibou);
        registerRender(itemMjFacem1);
        registerRender(itemMjFacem9);
        registerRender(itemMjFacep1);
        registerRender(itemMjFacep9);
        registerRender(itemMjFaces1);
        registerRender(itemMjFaces9);
        registerRender(blockMjTable);
        registerRender(itemMjTable);
    }
}
