import Core.PlayerCharacter;
import Storyline.*;
import Storyline.World1.*;
import Storyline.World2.*;

public class Main {
    public static void main(String[] args){
        Opening.opening();
        PlayerCharacter player = PlayerSelection.createPlayer();
        Intro1.intro1();
        W1Mission2.w1mission2(player);
        Intro2.intro2();
    }
}
