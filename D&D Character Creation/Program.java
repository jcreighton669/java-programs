/*
 * Copyright 2020 Justin Allen Creighton
 */

package program;
import java.util.Random;
import java.io.*;

class RPGCharacter {
    public String name;
    private String profession;
    private String armor;
    private String race;
    private String Alignment;
    private int Strength;
    private int Dexterity;
    private int Constitution;
    private int Intelligence;
    private int Wisdom;
    private int Charisma;
    
    public String getRace() {
        return race;
    }
    
    public String getAlignment() {
        return Alignment;
    }
    
    public String getProfession() {
        return profession;
    }
    
    public static int rollDice(int options) {
        Random dice = new Random();
        int number = dice.nextInt(options) + 1;
        return number;
    }
    
    public static int rollD20() {
        Random d20 = new Random();
        int number = d20.nextInt(20) + 1;
        return number;
    }
    
    public void setAttributes() {
        Strength = rollD20();
        Dexterity = rollD20();
        Constitution = rollD20();
        Intelligence = rollD20();
        Wisdom = rollD20();
        Charisma = rollD20();
    }
    
    public void chosenRace(int number) {
        switch(number) {
            case 1: 
                this.race = "Dragonborn";
                break;
            case 2:
                this.race = "Dwarf";
                break;
            case 3:
                this.race = "Elf";
                break;
            case 4:
                this.race = "Gnome";
                break;
            case 5:
                this.race = "Half-Elf";
                break;
            case 6:
                this.race = "Halfling";
                break;
            case 7:
                this.race = "Half-Orc";
                break;
            case 8:
                this.race = "Human";
                break;
            case 9: 
                this.race = "Tiefling";
                break;
        }
    }
    
    public void chosenAlignment(int number) {
        switch(number) {
            case 1: 
                this.Alignment = "Lawful Good";
                break;
            case 2:
                this.Alignment = "Neutral Good";
                break;
            case 3:
                this.Alignment = "Chaotic Good";
                break;
            case 4:
                this.Alignment = "Lawful Neutral";
                break;
            case 5:
                this.Alignment = "Neutral";
                break;
            case 6:
                this.Alignment = "Chaotic Neutral";
                break;    
            case 7:
                this.Alignment = "Lawful Evil";
                break;    
            case 8:
                this.Alignment = "Neutral Evil";
                break;
            case 9:
                this.Alignment = "Chaotic Evil";
                break;
        }
    }
    
    public void chosenProfession(int number) {
        switch(number) {
            case 1: 
                this.profession = "Barbarian";
                break;
            case 2:
                this.profession = "Bard";
                break;
            case 3:
                this.profession = "Cleric";
                break;
            case 4:
                this.profession = "Druid";
                break;
            case 5:
                this.profession = "Fighter";
                break;
            case 6:
                this.profession = "Monk";
                break;    
            case 7:
                this.profession = "Paladin";
                break;    
            case 8:
                this.profession = "Ranger";
                break;
            case 9:
                this.profession = "Rogue";
                break;
            case 10:
                this.profession = "Sorcerer";
                break;
            case 11:
                this.profession = "Warlock";
                break;
            case 12:
                this.profession = "Wizard";
                break;
        }
    }
    
    @Override
    public String toString() {
        String background = "";
        String story = "";
        switch(rollDice(6)) {
            case 1: 
                background = "Acolyte";
                story = "You have spent your life in the service of a temple to "
                        + "\na specific god or pantheon of gods. You act as an "
                        + "\nintermediary between the realm of the holy and the "
                        + "\nmortal world, performing sacred rites and offering "
                        + "\nsacrifices in order to conduct worshipers into the "
                        + "\npresence of the divine. You are not necessarily a "
                        + "\ncleric - performing sacred rites is not the same "
                        + "\nthing as channeling divie power.";
                break;
            case 2: 
                background = "Criminal/Spy";
                story = "You are an experienced criminal with a history of "
                        + "\nbreaking the law. You have spent a lot of time among "
                        + "\nother criminals and still have contacts within the "
                        + "\ncriminal underworld. You're far closer than most "
                        + "\npeople to the world of murder, theft, and violence "
                        + "\nthat pervades the underbelly of civilization, and "
                        + "\nyou have survived up to this point by flouting "
                        + "\nthe rules and regulations of society";
                break;
            case 3:
                background = "Folk Hero";
                story = "You come from a humble social rank, but you are "
                        + "\ndestined for so much more. Already the people of "
                        + "\nyour home village regard you as their champion, and "
                        + "\nyour destiny calls you to stand against the tyrants "
                        + "\nand monsters that threaten the common folk "
                        + "\neverywhere.";
                break;
            case 4:
                background = "Noble";
                story = "You understand wealth, power, and privilege. You "
                        + "\ncarry a noble title, and your family owns land, "
                        + "\ncollects taxes, and wields significant political "
                        + "\ninfluence. You might be a pampered aristocrat "
                        + "\nunfamiliar with work or discomfort, a former "
                        + "\nmerchant just elevated to the nobility, or a "
                        + "\ndisinherited scoundrel with a disproportionate "
                        + "\nsense of entitlement. Or you could be an honest, "
                        + "\nhard-working landowner who cares deeply about the "
                        + "\npeople who live and work on your land, keenly aware "
                        + "\nof your responsibility to them.";
            case 5:
                background = "Sage";
                story = "You spent years learning the lore of the multiverse. "
                        + "\nYou scoured manuscripts, studied scrolls, and "
                        + "\nlistened to the greatest experts on the subjects "
                        + "\nthat interest you. Your efforts have made you a "
                        + "\nmaster in your fields of study.";
            case 6:
                background = "Soldier";
                story = "War has been your life for as long as you care to "
                        + "\nremember. You trained as a youth, studied the use of "
                        + "\nweapons and armor, learned basic survival "
                        + "\ntechniques, including how to stay alive on the "
                        + "\nbattlefield. You might have been part of a standing "
                        + "\nnational army or a mercenary company, or perhaps a "
                        + "\nmember of a local militia who rose to prominence "
                        + "\nduring a recent war.";
        }
        
        return "Name: " + name + 
                "\n Profession/Class: " + getProfession() + 
                "\n Race:" + getRace() + 
                "\n Alignment: " + getAlignment() + 
                "\n Strength: " + this.Strength + 
                "\n Dexterity: " + this.Dexterity + 
                "\n Constitution: " + this.Constitution + 
                "\n Intelligence: " + this.Intelligence +
                "\n Wisdom: " + this.Wisdom + 
                "\n Charisma: " + this.Charisma + 
                "\n Background: " + background +
                "\n Story: \n" + story;
    }
}

/**
 *
 * @author Justin Creighton
 */
public class Program {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Keyboard = new BufferedReader(new InputStreamReader(System.in));
        RPGCharacter myChar = new RPGCharacter();
        int firstNumber = RPGCharacter.rollDice(12);
        int secondNumber = RPGCharacter.rollDice(9);
        int thirdNumber = RPGCharacter.rollDice(9);
        System.out.println("Enter your characters name (optional): ");
        String name = Keyboard.readLine();
        myChar.name = name;
        System.out.println("=====================================");
        System.out.println("             ROLL A DICE             ");
        System.out.println("=====================================");
        System.out.println("You rolled a : " + firstNumber + " for your Profession");
        myChar.chosenProfession(firstNumber);
        System.out.println("You rolled a : " + secondNumber + " for your Race");
        myChar.chosenRace(secondNumber);
        System.out.println("You rolled a : " + thirdNumber + " for you Alignment");
        myChar.chosenAlignment(thirdNumber);
        System.out.println("=====================================");
        System.out.println("    " + name.toUpperCase() + " CHARACTER SHEET");
        System.out.println("=====================================");
        myChar.setAttributes();
        System.out.println(myChar);
    }
}
