package Core;

public class CharacterBuilder {
    public static PlayerCharacter build(String name, int raceChoice) {
        Race race = null;

        if (raceChoice == 1) {
            race = new Tikbalang();
        } else if (raceChoice == 2) {
            race = new Kapre();
        }

        return new PlayerCharacter(name, race);
    }
}
