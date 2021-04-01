// Methods are ordered by class features, followed by spells according
// to their appropriate level

public class BardClass {

    public static void showBardicInspiration() {
        System.out.println("\nYou can inspire others through stirring words or music. \n" +
                "To do so, you use a Bonus Action on Your turn to choose one creature other\n" +
                "than yourself within 60 ft of you who can hear you.  That creature gains\n" +
                "one Bardic Inspiration die, a d6.\n\n" +
                "" +
                "Lasts for 10 minutes, the creature can roll the dice and add the number\n" +
                "to an ability check, attack roll, or saving throw.  Can be used after the\n" +
                "user rolls a d20.\n\n" +
                "" +
                "You can use this feature a number of times equal to your Charisma modifier\n" +
                "and regain all uses after a long rest.\n\n" +
                "" +
                "Die becomes d8 at 5th level, d10 at 10th level, and d12 at 15th level");
    }
    public static void showBardFeatures() {
        System.out.println("Hit Dice: 1d8 \n" +
                "Hit Points at 1st Level: 8 + CON modifier \n" +
                "Hit Points at Higher Levels: 1d8 + CON modifier");

        System.out.println("Proficiencies \n" +
                "Armor: Light armor \n" +
                "Weapons: Simple weapons, hand crossbows, longswords, rapiers, shortswords \n" +
                "Tools: Three musical instruments of your choice \n\n" +
                "Saving Throws: DEX and CHA\n" +
                "Skills: Choose any 3");
    }
    public static void showJackOfAllTrades() {
        System.out.println("Starting at 2nd level, you can add half your proficiency bonus, rounded down, to any \n" +
                "ability check you make that doesn't already use your proficiency bonus");
    }
    public static void showSongOfRest() {
        System.out.println("Beginning at 2nd level, you or any friendly creature(s) who can hear your \n" +
                "performance during a short rest gain an additional 1d6 hit points for every Hit Dice used. \n\n" +
                "" +
                "9th Level: 1d8 \n" +
                "13th Level: 1d10 \n" +
                "17th Level: 1d12 \n");
    }
    public static void showBardExpertise() {
        System.out.println("At 3rd level, choose two of your skill proficiencies and double it.  At 10th level you can \n" +
                "choose another two skills that you're proficient in.");

    }
    public static void showFontOfInspiration() {
        System.out.println("When you reach 5th level, you regain all your expended uses of Bardic Inspiration \n" +
                "when you finish a short or long rest.");
    }
    public static void showCountercharm() {
        System.out.println("At 6th level you can start a performance that lasts until the end of your next turn. \n" +
                "You and any friendly creatures wthin 30 ft of you have advantage on saving throws against being \n" +
                "frightened or charmed.  A creature must be able to hear you to gain this benefit.  The performance \n" +
                "ends early if you are incapacitated or silenced or voluntarily.");
    }
    public static void showMagicalSecrets() {
        System.out.println("At 10th level choose two spells from any class, they now count as Bard spells and \n" +
                "are included in the number of known spells.  \n\n" +
                "You learn two additional spells at level 14 and again at 18.");
    }
    public static void showColleges() {

    }
}
