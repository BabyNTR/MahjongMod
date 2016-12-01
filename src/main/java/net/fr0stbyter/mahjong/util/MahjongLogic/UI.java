package net.fr0stbyter.mahjong.util.MahjongLogic;

import net.minecraft.util.EnumFacing;

import java.util.HashMap;

public interface UI {
    Game getGame();
    void setGame(Game gameIn);
    void dealOver();
    void nextDealOver();
    void options();
    void discard(Player playerIn); //discard phase
    void choose(Player playerIn, Player.Option option, EnumTile tileIn);
    void discard(Player playerIn, EnumTile tileIn); //discard act
    void melded();
    void requestConfirm();
    void showReport(Player playerIn, HashMap<Player, Integer> scoreChangeIn);
    void showReport(Game.Ryuukyoku ryuukyokuIn, HashMap<Player, Integer> scoreChangeIn);
    void showReport();
    void riichi(Player playerIn);
    void gameOver();
    void setPositions(HashMap<String, EnumFacing> playersIn);
}
