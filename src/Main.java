import Core.PlayerCharacter;
import Storyline.*;
import Storyline.World1.*;
import Storyline.World2.*;

public class Main {
    public static void main(String[] args){
        Opening.opening();
        PlayerCharacter player = PlayerSelection.createPlayer();
        Intro1.intro1(player);
        W1Mission1.mission1(player);
        W1Mission2.mission2(player);
        W1Mission3.mission3(player);
        Intro2.intro2();
        W2Mission1.mission1(player);
    }
}
