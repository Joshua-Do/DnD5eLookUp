/*
This program acts as a tool to help Dungeon Masters to quickly look up info through the
Windows Terminal command.

If the user enters a class or race, they are given a list of choices
and picking one of the choices will display the info.

If the user wants to look up a spell, they simply type it in and all the relevant information
is given to the user.

NOTES:
- Spells are organized alphabetically, the searching algorithm will take a look at the first
character of the word, enter the category of spells that begin with the character and then
use the whole word to search for the spell.

For example
    Fireball
    Level 3
    Casting Time: 1 action
    Range: 150 ft
    Components: Visual, somatic, material (tiny ball of bat guano and sulfur)
    Duration: Instantaneous

    8d6 damage.  Each creature in a 20ft radius must make a dexterity saving throw, they
    take half damage if they make the save.

Programmed by Joshua Do
Date Last Modified: 2/4/2021
 */

import java.util.Scanner;

// C:\Users\Joshua\codingProjects\dndLookUp\src

public class Main {

    public static String inputToLowerNoWhiteSpace(String userInput) {
        userInput = userInput.toLowerCase();
        userInput = userInput.replaceAll("\\s", "");
        return userInput;
    }

    public static void main(String[] args) {
        String classInput = null;
        String featureSpellInput = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What do you want to look up?");
        classInput = scanner.nextLine();
        classInput = inputToLowerNoWhiteSpace(classInput);

        if (classInput.equals("bard")) {
            System.out.print("Enter what you want to look up: ");
            featureSpellInput = scanner.nextLine();
            featureSpellInput = inputToLowerNoWhiteSpace(featureSpellInput);

            switch (featureSpellInput) {
                case "inspiration":
                case "bardicinspiration": BardClass.showBardicInspiration();
                break;
                case "features":
                case "feature":
                case "bardfeature":
                case "bardfeatures":
                case "classfeature":
                case "classfeatures": BardClass.showBardFeatures();
                break;
                case "jackofalltrades": BardClass.showJackOfAllTrades();
                break;
                case "songofrest": BardClass.showSongOfRest();
                break;
                case "expertise": BardClass.showBardExpertise();
                break;
                case "fontofinspiration": BardClass.showFontOfInspiration();
                break;
                case "countercharm": BardClass.showCountercharm();
                break;
                case "magicalsecrets": BardClass.showMagicalSecrets();
                break;
                case "colleges":
                case "bardcolleges":
                case "collegesoflore": BardClass.showColleges();
                break;



            }
        }
        if (classInput.equals("druid")) {

        }
        if (classInput.equals("fighter")) {

        }
        if (classInput.equals("rogue")) {

        }
        if (classInput.equals("sorcerer")) {

        }
        else {
            // Checks first character of the string, goes to class according to first char
            // Searches through the spells and prints the info
            char spellChar = featureSpellInput.charAt(0);
        }
    }
}