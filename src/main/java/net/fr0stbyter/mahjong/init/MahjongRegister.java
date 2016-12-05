package net.fr0stbyter.mahjong.init;

import net.fr0stbyter.mahjong.blocks.*;
import net.fr0stbyter.mahjong.items.*;
import net.fr0stbyter.mahjong.tileentity.TileEntityMjTable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MahjongRegister {
    public static CreativeTabs tabMahjong;
    public static Block blockMjm1, blockMjm2, blockMjm3, blockMjm4, blockMjm5, blockMjm6, blockMjm7, blockMjm8, blockMjm9;
    public static Item itemMjm1, itemMjm2, itemMjm3, itemMjm4, itemMjm5, itemMjm6, itemMjm7, itemMjm8, itemMjm9;
    public static Block blockMjp1, blockMjp2, blockMjp3, blockMjp4, blockMjp5, blockMjp6, blockMjp7, blockMjp8, blockMjp9;
    public static Item itemMjp1, itemMjp2, itemMjp3, itemMjp4, itemMjp5, itemMjp6, itemMjp7, itemMjp8, itemMjp9;
    public static Block blockMjs1, blockMjs2, blockMjs3, blockMjs4, blockMjs5, blockMjs6, blockMjs7, blockMjs8, blockMjs9;
    public static Item itemMjs1, itemMjs2, itemMjs3, itemMjs4, itemMjs5, itemMjs6, itemMjs7, itemMjs8, itemMjs9;
    public static Block blockMjm5r, blockMjp5r, blockMjs5r;
    public static Item itemMjm5r, itemMjp5r, itemMjs5r;
    public static Block blockMjh1, blockMjh2, blockMjh3, blockMjh4, blockMjh5, blockMjh6, blockMjh7, blockMjh8;
    public static Item itemMjh1, itemMjh2, itemMjh3, itemMjh4, itemMjh5, itemMjh6, itemMjh7, itemMjh8;
    public static Block blockMjf1, blockMjf2, blockMjf3, blockMjf4;
    public static Item itemMjf1, itemMjf2, itemMjf3, itemMjf4;
    public static Block blockMjd1, blockMjd2, blockMjd3;
    public static Item itemMjd1, itemMjd2, itemMjd3;
    public static Block blockRiichibou;
    public static Item itemRiichibou;
    public static Block blockMjBlank;
    public static Item itemMjBlank;
    public static Item itemMjFacem1, itemMjFacem9, itemMjFacep1, itemMjFacep9, itemMjFaces1, itemMjFaces9;
    public static Block blockMjTable;
    public static Item itemMjTable;
    public static Item itemMjOpOk, itemMjOpNo, itemMjOpKita, itemMjOpChi, itemMjOpPeng, itemMjOpGang, itemMjOpRyuu, itemMjOpRii, itemMjOpHe;
    public static void define() {
        tabMahjong = new CreativeTabs("mahjong") {
            @Override
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return itemMjm1;
            }
        };
        blockMjm1 = new BlockMj(Material.clay, "m1").setRegistryName("mjm1").setUnlocalizedName("1man");
        itemMjm1 = new ItemBlock(blockMjm1).setRegistryName("mjm1").setUnlocalizedName("1man").setMaxStackSize(4);
        blockMjm2 = new BlockMj(Material.clay, "m2").setRegistryName("mjm2").setUnlocalizedName("2man");
        itemMjm2 = new ItemBlock(blockMjm2).setRegistryName("mjm2").setUnlocalizedName("2man").setMaxStackSize(4);
        blockMjm3 = new BlockMj(Material.clay, "m3").setRegistryName("mjm3").setUnlocalizedName("3man");
        itemMjm3 = new ItemBlock(blockMjm3).setRegistryName("mjm3").setUnlocalizedName("3man").setMaxStackSize(4);
        blockMjm4 = new BlockMj(Material.clay, "m4").setRegistryName("mjm4").setUnlocalizedName("4man");
        itemMjm4 = new ItemBlock(blockMjm4).setRegistryName("mjm4").setUnlocalizedName("4man").setMaxStackSize(4);
        blockMjm5 = new BlockMj(Material.clay, "m5").setRegistryName("mjm5").setUnlocalizedName("5man");
        itemMjm5 = new ItemBlock(blockMjm5).setRegistryName("mjm5").setUnlocalizedName("5man").setMaxStackSize(4);
        blockMjm6 = new BlockMj(Material.clay, "m6").setRegistryName("mjm6").setUnlocalizedName("6man");
        itemMjm6 = new ItemBlock(blockMjm6).setRegistryName("mjm6").setUnlocalizedName("6man").setMaxStackSize(4);
        blockMjm7 = new BlockMj(Material.clay, "m7").setRegistryName("mjm7").setUnlocalizedName("7man");
        itemMjm7 = new ItemBlock(blockMjm7).setRegistryName("mjm7").setUnlocalizedName("7man").setMaxStackSize(4);
        blockMjm8 = new BlockMj(Material.clay, "m8").setRegistryName("mjm8").setUnlocalizedName("8man");
        itemMjm8 = new ItemBlock(blockMjm8).setRegistryName("mjm8").setUnlocalizedName("8man").setMaxStackSize(4);
        blockMjm9 = new BlockMj(Material.clay, "m9").setRegistryName("mjm9").setUnlocalizedName("9man");
        itemMjm9 = new ItemBlock(blockMjm9).setRegistryName("mjm9").setUnlocalizedName("9man").setMaxStackSize(4);
        blockMjp1 = new BlockMj(Material.clay, "p1").setRegistryName("mjp1").setUnlocalizedName("1pin");
        itemMjp1 = new ItemBlock(blockMjp1).setRegistryName("mjp1").setUnlocalizedName("1pin").setMaxStackSize(4);
        blockMjp2 = new BlockMj(Material.clay, "p2").setRegistryName("mjp2").setUnlocalizedName("2pin");
        itemMjp2 = new ItemBlock(blockMjp2).setRegistryName("mjp2").setUnlocalizedName("2pin").setMaxStackSize(4);
        blockMjp3 = new BlockMj(Material.clay, "p3").setRegistryName("mjp3").setUnlocalizedName("3pin");
        itemMjp3 = new ItemBlock(blockMjp3).setRegistryName("mjp3").setUnlocalizedName("3pin").setMaxStackSize(4);
        blockMjp4 = new BlockMj(Material.clay, "p4").setRegistryName("mjp4").setUnlocalizedName("4pin");
        itemMjp4 = new ItemBlock(blockMjp4).setRegistryName("mjp4").setUnlocalizedName("4pin").setMaxStackSize(4);
        blockMjp5 = new BlockMj(Material.clay, "p5").setRegistryName("mjp5").setUnlocalizedName("5pin");
        itemMjp5 = new ItemBlock(blockMjp5).setRegistryName("mjp5").setUnlocalizedName("5pin").setMaxStackSize(4);
        blockMjp6 = new BlockMj(Material.clay, "p6").setRegistryName("mjp6").setUnlocalizedName("6pin");
        itemMjp6 = new ItemBlock(blockMjp6).setRegistryName("mjp6").setUnlocalizedName("6pin").setMaxStackSize(4);
        blockMjp7 = new BlockMj(Material.clay, "p7").setRegistryName("mjp7").setUnlocalizedName("7pin");
        itemMjp7 = new ItemBlock(blockMjp7).setRegistryName("mjp7").setUnlocalizedName("7pin").setMaxStackSize(4);
        blockMjp8 = new BlockMj(Material.clay, "p8").setRegistryName("mjp8").setUnlocalizedName("8pin");
        itemMjp8 = new ItemBlock(blockMjp8).setRegistryName("mjp8").setUnlocalizedName("8pin").setMaxStackSize(4);
        blockMjp9 = new BlockMj(Material.clay, "p9").setRegistryName("mjp9").setUnlocalizedName("9pin");
        itemMjp9 = new ItemBlock(blockMjp9).setRegistryName("mjp9").setUnlocalizedName("9pin").setMaxStackSize(4);
        blockMjs1 = new BlockMj(Material.clay, "s1").setRegistryName("mjs1").setUnlocalizedName("1sou");
        itemMjs1 = new ItemBlock(blockMjs1).setRegistryName("mjs1").setUnlocalizedName("1sou").setMaxStackSize(4);
        blockMjs2 = new BlockMj(Material.clay, "s2").setRegistryName("mjs2").setUnlocalizedName("2sou");
        itemMjs2 = new ItemBlock(blockMjs2).setRegistryName("mjs2").setUnlocalizedName("2sou").setMaxStackSize(4);
        blockMjs3 = new BlockMj(Material.clay, "s3").setRegistryName("mjs3").setUnlocalizedName("3sou");
        itemMjs3 = new ItemBlock(blockMjs3).setRegistryName("mjs3").setUnlocalizedName("3sou").setMaxStackSize(4);
        blockMjs4 = new BlockMj(Material.clay, "s4").setRegistryName("mjs4").setUnlocalizedName("4sou");
        itemMjs4 = new ItemBlock(blockMjs4).setRegistryName("mjs4").setUnlocalizedName("4sou").setMaxStackSize(4);
        blockMjs5 = new BlockMj(Material.clay, "s5").setRegistryName("mjs5").setUnlocalizedName("5sou");
        itemMjs5 = new ItemBlock(blockMjs5).setRegistryName("mjs5").setUnlocalizedName("5sou").setMaxStackSize(4);
        blockMjs6 = new BlockMj(Material.clay, "s6").setRegistryName("mjs6").setUnlocalizedName("6sou");
        itemMjs6 = new ItemBlock(blockMjs6).setRegistryName("mjs6").setUnlocalizedName("6sou").setMaxStackSize(4);
        blockMjs7 = new BlockMj(Material.clay, "s7").setRegistryName("mjs7").setUnlocalizedName("7sou");
        itemMjs7 = new ItemBlock(blockMjs7).setRegistryName("mjs7").setUnlocalizedName("7sou").setMaxStackSize(4);
        blockMjs8 = new BlockMj(Material.clay, "s8").setRegistryName("mjs8").setUnlocalizedName("8sou");
        itemMjs8 = new ItemBlock(blockMjs8).setRegistryName("mjs8").setUnlocalizedName("8sou").setMaxStackSize(4);
        blockMjs9 = new BlockMj(Material.clay, "s9").setRegistryName("mjs9").setUnlocalizedName("9sou");
        itemMjs9 = new ItemBlock(blockMjs9).setRegistryName("mjs9").setUnlocalizedName("9sou").setMaxStackSize(4);
        blockMjm5r = new BlockMj(Material.clay, "m5r").setRegistryName("mjm5r").setUnlocalizedName("5manRed");
        itemMjm5r = new ItemBlock(blockMjm5r).setRegistryName("mjm5r").setUnlocalizedName("5manRed").setMaxStackSize(4);
        blockMjp5r = new BlockMj(Material.clay, "p5r").setRegistryName("mjp5r").setUnlocalizedName("5pinRed");
        itemMjp5r = new ItemBlock(blockMjp5r).setRegistryName("mjp5r").setUnlocalizedName("5pinRed").setMaxStackSize(4);
        blockMjs5r = new BlockMj(Material.clay, "s5r").setRegistryName("mjs5r").setUnlocalizedName("5souRed");
        itemMjs5r = new ItemBlock(blockMjs5r).setRegistryName("mjs5r").setUnlocalizedName("5souRed").setMaxStackSize(4);
        blockMjh1 = new BlockMj(Material.clay, "h1").setRegistryName("mjh1").setUnlocalizedName("chun");
        itemMjh1 = new ItemBlock(blockMjh1).setRegistryName("mjh1").setUnlocalizedName("chun").setMaxStackSize(4);
        blockMjh2 = new BlockMj(Material.clay, "h2").setRegistryName("mjh2").setUnlocalizedName("xia");
        itemMjh2 = new ItemBlock(blockMjh2).setRegistryName("mjh2").setUnlocalizedName("xia").setMaxStackSize(4);
        blockMjh3 = new BlockMj(Material.clay, "h3").setRegistryName("mjh3").setUnlocalizedName("qiu");
        itemMjh3 = new ItemBlock(blockMjh3).setRegistryName("mjh3").setUnlocalizedName("qiu").setMaxStackSize(4);
        blockMjh4 = new BlockMj(Material.clay, "h4").setRegistryName("mjh4").setUnlocalizedName("dong");
        itemMjh4 = new ItemBlock(blockMjh4).setRegistryName("mjh4").setUnlocalizedName("dong").setMaxStackSize(4);
        blockMjh5 = new BlockMj(Material.clay, "h5").setRegistryName("mjh5").setUnlocalizedName("mei");
        itemMjh5 = new ItemBlock(blockMjh5).setRegistryName("mjh5").setUnlocalizedName("mei").setMaxStackSize(4);
        blockMjh6 = new BlockMj(Material.clay, "h6").setRegistryName("mjh6").setUnlocalizedName("lan");
        itemMjh6 = new ItemBlock(blockMjh6).setRegistryName("mjh6").setUnlocalizedName("lan").setMaxStackSize(4);
        blockMjh7 = new BlockMj(Material.clay, "h7").setRegistryName("mjh7").setUnlocalizedName("zhu");
        itemMjh7 = new ItemBlock(blockMjh7).setRegistryName("mjh7").setUnlocalizedName("zhu").setMaxStackSize(4);
        blockMjh8 = new BlockMj(Material.clay, "h8").setRegistryName("mjh8").setUnlocalizedName("ju");
        itemMjh8 = new ItemBlock(blockMjh8).setRegistryName("mjh8").setUnlocalizedName("ju").setMaxStackSize(4);
        blockMjf1 = new BlockMj(Material.clay, "f1").setRegistryName("mjf1").setUnlocalizedName("east");
        itemMjf1 = new ItemBlock(blockMjf1).setRegistryName("mjf1").setUnlocalizedName("east").setMaxStackSize(4);
        blockMjf2 = new BlockMj(Material.clay, "f2").setRegistryName("mjf2").setUnlocalizedName("south");
        itemMjf2 = new ItemBlock(blockMjf2).setRegistryName("mjf2").setUnlocalizedName("south").setMaxStackSize(4);
        blockMjf3 = new BlockMj(Material.clay, "f3").setRegistryName("mjf3").setUnlocalizedName("west");
        itemMjf3 = new ItemBlock(blockMjf3).setRegistryName("mjf3").setUnlocalizedName("west").setMaxStackSize(4);
        blockMjf4 = new BlockMj(Material.clay, "f4").setRegistryName("mjf4").setUnlocalizedName("north");
        itemMjf4 = new ItemBlock(blockMjf4).setRegistryName("mjf4").setUnlocalizedName("north").setMaxStackSize(4);
        blockMjd1 = new BlockMj(Material.clay, "d1").setRegistryName("mjd1").setUnlocalizedName("bai");
        itemMjd1 = new ItemBlock(blockMjd1).setRegistryName("mjd1").setUnlocalizedName("bai").setMaxStackSize(4);
        blockMjd2 = new BlockMj(Material.clay, "d2").setRegistryName("mjd2").setUnlocalizedName("fa");
        itemMjd2 = new ItemBlock(blockMjd2).setRegistryName("mjd2").setUnlocalizedName("fa").setMaxStackSize(4);
        blockMjd3 = new BlockMj(Material.clay, "d3").setRegistryName("mjd3").setUnlocalizedName("zhong");
        itemMjd3 = new ItemBlock(blockMjd3).setRegistryName("mjd3").setUnlocalizedName("zhong").setMaxStackSize(4);
        blockRiichibou = new BlockRiichibou(Material.clay).setRegistryName("riichibou").setUnlocalizedName("riichibou");
        itemRiichibou = new ItemBlock(blockRiichibou).setRegistryName("riichibou").setUnlocalizedName("riichibou");
        blockMjBlank = new BlockMj(Material.clay).setRegistryName("mjBlank").setUnlocalizedName("blank_mahjong");
        itemMjBlank = new ItemBlock(blockMjBlank).setRegistryName("mjBlank").setUnlocalizedName("blank_mahjong");
        itemMjFacem1 = new ItemMjFace().setRegistryName("mjFacem1").setUnlocalizedName("mjFacem1");
        itemMjFacem9 = new ItemMjFace().setRegistryName("mjFacem9").setUnlocalizedName("mjFacem9");
        itemMjFacep1 = new ItemMjFace().setRegistryName("mjFacep1").setUnlocalizedName("mjFacep1");
        itemMjFacep9 = new ItemMjFace().setRegistryName("mjFacep9").setUnlocalizedName("mjFacep9");
        itemMjFaces1 = new ItemMjFace().setRegistryName("mjFaces1").setUnlocalizedName("mjFaces1");
        itemMjFaces9 = new ItemMjFace().setRegistryName("mjFaces9").setUnlocalizedName("mjFaces9");
        blockMjTable = new BlockMjTable(Material.clay).setRegistryName("mjTable").setUnlocalizedName("mahjong_table");
        itemMjTable = new ItemBlock(blockMjTable).setRegistryName("mjTable").setUnlocalizedName("mahjong_table");
        itemMjOpOk = new ItemMjOption("ok").setRegistryName("mjOpOk").setUnlocalizedName("mjOpOk");
        itemMjOpNo = new ItemMjOption("no").setRegistryName("mjOpNo").setUnlocalizedName("mjOpNo");
        itemMjOpKita = new ItemMjOption("kita").setRegistryName("mjOpKita").setUnlocalizedName("mjOpKita");
        itemMjOpChi = new ItemMjOption("chi").setRegistryName("mjOpChi").setUnlocalizedName("mjOpChi");
        itemMjOpPeng = new ItemMjOption("peng").setRegistryName("mjOpPeng").setUnlocalizedName("mjOpPeng");
        itemMjOpGang = new ItemMjOption("gang").setRegistryName("mjOpGang").setUnlocalizedName("mjOpGang");
        itemMjOpRyuu = new ItemMjOption("ryuu").setRegistryName("mjOpRyuu").setUnlocalizedName("mjOpRyuu");
        itemMjOpRii = new ItemMjOption("rii").setRegistryName("mjOpRii").setUnlocalizedName("mjOpRii");
        itemMjOpHe = new ItemMjOption("he").setRegistryName("mjOpHe").setUnlocalizedName("mjOpHe");
    }
    public static void register() {
        GameRegistry.register(blockMjm1);
        GameRegistry.register(itemMjm1);
        GameRegistry.register(blockMjm2);
        GameRegistry.register(itemMjm2);
        GameRegistry.register(blockMjm3);
        GameRegistry.register(itemMjm3);
        GameRegistry.register(blockMjm4);
        GameRegistry.register(itemMjm4);
        GameRegistry.register(blockMjm5);
        GameRegistry.register(itemMjm5);
        GameRegistry.register(blockMjm6);
        GameRegistry.register(itemMjm6);
        GameRegistry.register(blockMjm7);
        GameRegistry.register(itemMjm7);
        GameRegistry.register(blockMjm8);
        GameRegistry.register(itemMjm8);
        GameRegistry.register(blockMjm9);
        GameRegistry.register(itemMjm9);
        GameRegistry.register(blockMjp1);
        GameRegistry.register(itemMjp1);
        GameRegistry.register(blockMjp2);
        GameRegistry.register(itemMjp2);
        GameRegistry.register(blockMjp3);
        GameRegistry.register(itemMjp3);
        GameRegistry.register(blockMjp4);
        GameRegistry.register(itemMjp4);
        GameRegistry.register(blockMjp5);
        GameRegistry.register(itemMjp5);
        GameRegistry.register(blockMjp6);
        GameRegistry.register(itemMjp6);
        GameRegistry.register(blockMjp7);
        GameRegistry.register(itemMjp7);
        GameRegistry.register(blockMjp8);
        GameRegistry.register(itemMjp8);
        GameRegistry.register(blockMjp9);
        GameRegistry.register(itemMjp9);
        GameRegistry.register(blockMjs1);
        GameRegistry.register(itemMjs1);
        GameRegistry.register(blockMjs2);
        GameRegistry.register(itemMjs2);
        GameRegistry.register(blockMjs3);
        GameRegistry.register(itemMjs3);
        GameRegistry.register(blockMjs4);
        GameRegistry.register(itemMjs4);
        GameRegistry.register(blockMjs5);
        GameRegistry.register(itemMjs5);
        GameRegistry.register(blockMjs6);
        GameRegistry.register(itemMjs6);
        GameRegistry.register(blockMjs7);
        GameRegistry.register(itemMjs7);
        GameRegistry.register(blockMjs8);
        GameRegistry.register(itemMjs8);
        GameRegistry.register(blockMjs9);
        GameRegistry.register(itemMjs9);
        GameRegistry.register(blockMjm5r);
        GameRegistry.register(itemMjm5r);
        GameRegistry.register(blockMjp5r);
        GameRegistry.register(itemMjp5r);
        GameRegistry.register(blockMjs5r);
        GameRegistry.register(itemMjs5r);
        GameRegistry.register(blockMjh1);
        GameRegistry.register(itemMjh1);
        GameRegistry.register(blockMjh2);
        GameRegistry.register(itemMjh2);
        GameRegistry.register(blockMjh3);
        GameRegistry.register(itemMjh3);
        GameRegistry.register(blockMjh4);
        GameRegistry.register(itemMjh4);
        GameRegistry.register(blockMjh5);
        GameRegistry.register(itemMjh5);
        GameRegistry.register(blockMjh6);
        GameRegistry.register(itemMjh6);
        GameRegistry.register(blockMjh7);
        GameRegistry.register(itemMjh7);
        GameRegistry.register(blockMjh8);
        GameRegistry.register(itemMjh8);
        GameRegistry.register(blockMjf1);
        GameRegistry.register(itemMjf1);
        GameRegistry.register(blockMjf2);
        GameRegistry.register(itemMjf2);
        GameRegistry.register(blockMjf3);
        GameRegistry.register(itemMjf3);
        GameRegistry.register(blockMjf4);
        GameRegistry.register(itemMjf4);
        GameRegistry.register(blockMjd1);
        GameRegistry.register(itemMjd1);
        GameRegistry.register(blockMjd2);
        GameRegistry.register(itemMjd2);
        GameRegistry.register(blockMjd3);
        GameRegistry.register(itemMjd3);
        GameRegistry.register(blockRiichibou);
        GameRegistry.register(itemRiichibou);
        GameRegistry.register(blockMjBlank);
        GameRegistry.register(itemMjBlank);
        GameRegistry.register(itemMjFacem1);
        GameRegistry.register(itemMjFacem9);
        GameRegistry.register(itemMjFacep1);
        GameRegistry.register(itemMjFacep9);
        GameRegistry.register(itemMjFaces1);
        GameRegistry.register(itemMjFaces9);
        GameRegistry.register(blockMjTable);
        GameRegistry.register(itemMjTable);
        GameRegistry.registerTileEntity(TileEntityMjTable.class, "mjTable");
        GameRegistry.register(itemMjOpOk);
        GameRegistry.register(itemMjOpNo);
        GameRegistry.register(itemMjOpKita);
        GameRegistry.register(itemMjOpChi);
        GameRegistry.register(itemMjOpPeng);
        GameRegistry.register(itemMjOpGang);
        GameRegistry.register(itemMjOpRyuu);
        GameRegistry.register(itemMjOpRii);
        GameRegistry.register(itemMjOpHe);

    }
    public static void registerRecipe() {
        GameRegistry.addRecipe(new ItemStack(itemMjBlank, 1), new Object[] { "AAA", "BCB", "DDD", 'A', new ItemStack(Items.dye, 1, EnumDyeColor.WHITE.getDyeDamage()), 'B', Items.quartz, 'C', Blocks.stone, 'D', new ItemStack(Items.dye, 1, EnumDyeColor.GREEN.getDyeDamage())});
        GameRegistry.addRecipe(new ItemStack(itemMjFacem9, 1), new Object[] { "AAA", "AAA", "AAA", 'A', itemMjFacem1});
        GameRegistry.addRecipe(new ItemStack(itemMjFacep9, 1), new Object[] { "AAA", "AAA", "AAA", 'A', itemMjFacep1});
        GameRegistry.addRecipe(new ItemStack(itemMjFaces9, 1), new Object[] { "AAA", "AAA", "AAA", 'A', itemMjFaces1});
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjFacem1, 1), Items.gold_nugget);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm1, 1), blockMjBlank, itemMjFacem1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm2, 1), blockMjBlank, itemMjFacem1, itemMjFacem1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm3, 1), blockMjBlank, itemMjFacem1, itemMjFacem1, itemMjFacem1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm4, 1), blockMjBlank, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm5, 1), blockMjBlank, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm5r, 1), itemMjm5, new ItemStack(Items.dye, 1, EnumDyeColor.RED.getDyeDamage()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm6, 1), blockMjBlank, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm7, 1), blockMjBlank, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm8, 1), blockMjBlank, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1, itemMjFacem1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm9, 1), blockMjBlank, itemMjFacem9);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjFacep1, 3), Items.cookie);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp1, 1), blockMjBlank, itemMjFacep1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp2, 1), blockMjBlank, itemMjFacep1, itemMjFacep1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp3, 1), blockMjBlank, itemMjFacep1, itemMjFacep1, itemMjFacep1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp4, 1), blockMjBlank, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp5, 1), blockMjBlank, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp5r, 1), itemMjp5, new ItemStack(Items.dye, 1, EnumDyeColor.RED.getDyeDamage()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp6, 1), blockMjBlank, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp7, 1), blockMjBlank, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjp8, 1), blockMjBlank, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1, itemMjFacep1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjm9, 1), blockMjBlank, itemMjFacep9);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjFaces1, 1), Items.reeds);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs1, 1), blockMjBlank, itemMjFaces1, Items.feather);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs2, 1), blockMjBlank, itemMjFaces1, itemMjFaces1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs3, 1), blockMjBlank, itemMjFaces1, itemMjFaces1, itemMjFaces1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs4, 1), blockMjBlank, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs5, 1), blockMjBlank, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs5r, 1), itemMjs5, new ItemStack(Items.dye, 1, EnumDyeColor.RED.getDyeDamage()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs6, 1), blockMjBlank, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs7, 1), blockMjBlank, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs8, 1), blockMjBlank, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1, itemMjFaces1);
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjs9, 1), blockMjBlank, itemMjFaces9);
        GameRegistry.addRecipe(new ItemStack(itemMjf1, 1), new Object[] { "  A", " BA", "  A", 'A', new ItemStack(Items.dye, 1, EnumDyeColor.BLACK.getDyeDamage()), 'B', itemMjBlank});
        GameRegistry.addRecipe(new ItemStack(itemMjf2, 1), new Object[] { "   ", " B ", "AAA", 'A', new ItemStack(Items.dye, 1, EnumDyeColor.BLACK.getDyeDamage()), 'B', itemMjBlank});
        GameRegistry.addRecipe(new ItemStack(itemMjf3, 1), new Object[] { "A  ", "AB ", "A  ", 'A', new ItemStack(Items.dye, 1, EnumDyeColor.BLACK.getDyeDamage()), 'B', itemMjBlank});
        GameRegistry.addRecipe(new ItemStack(itemMjf4, 1), new Object[] { "AAA", " B ", "   ", 'A', new ItemStack(Items.dye, 1, EnumDyeColor.BLACK.getDyeDamage()), 'B', itemMjBlank});
        GameRegistry.addRecipe(new ItemStack(itemMjd1, 1), new Object[] { "AAA", "ABA", "AAA", 'A', new ItemStack(Items.dye, 1, EnumDyeColor.WHITE.getDyeDamage()), 'B', itemMjBlank});
        GameRegistry.addRecipe(new ItemStack(itemMjd2, 1), new Object[] { "AAA", "ABA", "AAA", 'A', new ItemStack(Items.dye, 1, EnumDyeColor.GREEN.getDyeDamage()), 'B', itemMjBlank});
        GameRegistry.addRecipe(new ItemStack(itemMjd3, 1), new Object[] { "AAA", "ABA", "AAA", 'A', new ItemStack(Items.dye, 1, EnumDyeColor.RED.getDyeDamage()), 'B', itemMjBlank});
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjh1, 1), blockMjBlank, new ItemStack(Blocks.red_flower, 1,BlockFlower.EnumFlowerType.RED_TULIP.getMeta()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjh2, 1), blockMjBlank, new ItemStack(Blocks.red_flower, 1, BlockFlower.EnumFlowerType.ORANGE_TULIP.getMeta()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjh3, 1), blockMjBlank, new ItemStack(Blocks.red_flower, 1, BlockFlower.EnumFlowerType.WHITE_TULIP.getMeta()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjh4, 1), blockMjBlank, new ItemStack(Blocks.red_flower, 1, BlockFlower.EnumFlowerType.PINK_TULIP.getMeta()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjh5, 1), blockMjBlank, new ItemStack(Blocks.red_flower, 1, BlockFlower.EnumFlowerType.ALLIUM.getMeta()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjh6, 1), blockMjBlank, new ItemStack(Blocks.red_flower, 1, BlockFlower.EnumFlowerType.BLUE_ORCHID.getMeta()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjh7, 1), blockMjBlank, new ItemStack(Blocks.red_flower, 1, BlockFlower.EnumFlowerType.POPPY.getMeta()));
        GameRegistry.addShapelessRecipe(new ItemStack(itemMjh8, 1), blockMjBlank, new ItemStack(Blocks.red_flower, 1, BlockFlower.EnumFlowerType.OXEYE_DAISY.getMeta()));
        GameRegistry.addRecipe(new ItemStack(itemRiichibou, 1), new Object[] { "BCB", "AAA", "   ",'A', Items.stick, 'B', new ItemStack(Items.dye, 1, EnumDyeColor.WHITE.getDyeDamage()), 'C', new ItemStack(Items.dye, 1, EnumDyeColor.RED.getDyeDamage())});
    }
}
