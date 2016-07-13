package net.fr0stbyter.mahjong.util.MahjongLogic.Hand;

import net.fr0stbyter.mahjong.util.MahjongLogic.EnumTile;

import java.util.ArrayList;
import java.util.Arrays;


public class AnGang extends HandTiles {
    private ArrayList<EnumTile> tiles;

    public AnGang(EnumTile tileIn1, EnumTile tileIn2, EnumTile tileIn3, EnumTile tileIn4) {
        tiles = new ArrayList<EnumTile>(Arrays.asList(tileIn1, tileIn2, tileIn3, tileIn4));
    }
    // TODO try and catch
    public ArrayList<EnumTile> getTiles() {
        return tiles;
    }

    public EnumTile getTile() {
        return tiles.get(0);
    }
}
