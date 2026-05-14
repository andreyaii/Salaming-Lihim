import Core.*;
import Storyline.*;
import Storyline.World1.*;
import Storyline.World2.*;
import Storyline.World3.*;

public class Main {
    public static void main(String[] args) {
        Opening.opening();
        PlayerCharacter player = PlayerSelection.createPlayer();

        // ── World 1 ───
        Intro1.intro1(player);
        if (!W1Mission1.mission1(player)) return;
        W1Mission2.mission2(player);
        Shop.enterShop(player);
        if (!W1Mission3.mission3(player)) return;
        Shop.enterShop(player);

        // ── World 2 ───
        Intro2.intro2();
        if (!W2Mission1.mission1(player)) return;
        Shop.enterShop(player);
        if (!W2Mission2.w2mission2(player)) return;
        Shop.enterShop(player);
        if (!W2Mission3.w2mission3(player)) return;
        Shop.enterShop(player);

        W2Mission4.w2mission4(player);
        Shop.enterShop(player);
        if (!W2Mission5.w2mission5(player)) return;
        Shop.enterShop(player);

        // ── World 3 ────
        Intro3.intro3();
        if (!W3Mission1.w3mission1(player)) return;
        Shop.enterShop(player);
        if (!W3Mission2.w3mission2(player)) return;
        Shop.enterShop(player);
        W3Mission3.w3mission5(player);
        Shop.enterShop(player);


        if (!W3Mission4.w3mission4(player)) return;

        Ending.ending();
    }
}