import java.util.Scanner;

public class EvanWorkplace {

    public static void main/*characterCreation*/(String[] args){
    	
    	String playerRace = "empty";
    	String playerClass = "empty";
    	String [] stats = {"Str", "Dex", "Con", "Int", "Wis", "Cha"};
    	int [] playerStats = {10, 10, 10, 10, 10, 10};

       // pickRace(playerRace, playerStats);
       // pickClass(playerClass);
        pickStats(playerStats, playerClass, stats);
        
        System.out.println("Race: " + playerRace);
        System.out.println("class: " + playerClass);
       for(int i = 0; i < 6; i++) {
    	   System.out.print(stats[i] + ": ");
    	   System.out.println(playerStats[i]);
       }
    }

    public static void pickRace(String playerRace, int playerStats[]){


        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Pick your characters race. >>>"
            		+ "\nDwarf: +2 Constitution, +2, Wisdom, -2 Charisma."
                    + "\nElf: +2 Dexterity, +2 Intelligence, -2 Constitution."
                    + "\nGnome: +2 Constitution, +2 Charisma, -2 Strength."
                    + "\nHalf-Elf: +2 Any Stat."
                    + "\nHalfling: +2 Dexterity, +2 Charisma, -2 Strength."
                    + "\nHalf-Orc: +2 Any Stat."
                    + "\nHuman: +2 Any Stat.");
            playerRace = input.next();
            
            if(playerRace.equalsIgnoreCase("dwarf")) {
            	playerRace = "Dwarf";
            	playerStats[2] = playerStats[2] + 2;
            	playerStats[4] = playerStats[4] + 2;
            	playerStats[5] = playerStats[5] - 2;
            }
            else if(playerRace.equalsIgnoreCase("elf")) {
            	playerRace = "Elf";
            	playerStats[1] = playerStats[1] + 2;
            	playerStats[3] = playerStats[3] + 2;
            	playerStats[2] = playerStats[2] - 2;
            }
            else if(playerRace.equalsIgnoreCase("gnome")) {
            	playerRace = "Gnome";
            	playerStats[2] = playerStats[2] + 2;
            	playerStats[5] = playerStats[5] + 2;
            	playerStats[0] = playerStats[0] - 2;
            }
            else if(playerRace.equalsIgnoreCase("half-elf")) {
            	playerRace = "Half-Elf";
            	pickRacialBonus(playerStats);
            }
            else if(playerRace.equalsIgnoreCase("halfling")) {
            	playerRace = "Halfling";
            	playerStats[1] = playerStats[1] + 2;
            	playerStats[5] = playerStats[5] + 2;
            	playerStats[0] = playerStats[0] - 2;
            }
            else if(playerRace.equalsIgnoreCase("half-orc")) {
            	playerRace = "Half-Orc";
            	pickRacialBonus(playerStats);
            }
            else if(playerRace.equalsIgnoreCase("human")) {
            	playerRace = "Human";
            	pickRacialBonus(playerStats);
            }
            else
            {
            	playerRace = "empty";
            	System.out.println("Invalid entry, Please try again");
            }

        }while(playerRace == "empty");
return;
    }

    public static void pickClass(String playerClass){
    	
    	Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Pick your characters Class. >>>"
            		+ "\nBarbarian:"
                    + "\nBard: "
                    + "\nCleric:"
                    + "\nFighter:"
                    + "\nMonk:"
                    + "\nPaladin:"
                    + "\nRouge:"
            		+ "\nSorcerer:"
            		+ "\nWizard:");
            playerClass = input.next();
            
            if(playerClass.equalsIgnoreCase("barbarian")) {
            	playerClass = "Barbarian";
            }
            else if(playerClass.equalsIgnoreCase("bard")) {
            	playerClass = "Bard";
            }
            else if(playerClass.equalsIgnoreCase("cleric")) {
            	playerClass = "Cleric";
            }
            else if(playerClass.equalsIgnoreCase("fighter")) {
            	playerClass = "Fighter";
            }
            else if(playerClass.equalsIgnoreCase("monk")) {
            	playerClass = "Monk";
            }
            else if(playerClass.equalsIgnoreCase("paladin")) {
            	playerClass = "Paladin";
            }
            else if(playerClass.equalsIgnoreCase("rouge")) {
            	playerClass = "Rouge";
            }
            else if(playerClass.equalsIgnoreCase("sorcerer")) {
            	playerClass = "Sorcerer";
            }
            else if(playerClass.equalsIgnoreCase("wizard")) {
            	playerClass = "Wizard";
            }
            else {
            	System.out.println("Invalid entry, Please try again");
            	playerClass = "empty";
            }

    }while(playerClass == "empty");
        
    }

    public static void pickStats(int playerStats[], String playerClass, String stats[]){
    	
    	Scanner input = new Scanner(System.in);
    	int playerPicker;
    	int statPoints = 20;
    	
    	System.out.println("pick your characters Stats. >>>"
    			+ "\nYou are able to increase a stat up to 18(not accounting for racial modifers) or "
    			+ "\ndecrease a stat down to 7(not accounting for racial modifers) to gain more points."
    			+ "\n\nStrength: affects your melee combat capacity and how much you can carry"
    			+ "\nDexterity: affects your ranged combat capactiy and reflexes when dodging attacks"
    			+ "\nConstitution: affects your hitpoints and improves fortitude"
    			+ "\nIntellignce: affects your capacity to identify enemeis anf their weaknesses"
    			+ "\nWisdom: affects your perception yo notice traps and improves will saves"
    			+ "\nCharisma: affects your influence on others for persuasion and intimidation\n");
    	
    	if(playerClass.equalsIgnoreCase("Barbarian")) {
    		System.out.println("Barbarians benefit from high Consitution and Strength.");
        }
        else if(playerClass.equalsIgnoreCase("Bard")) {
        	System.out.println("Bards benefit from high Charisma.");
        }
        else if(playerClass.equalsIgnoreCase("Cleric")) {
        	System.out.println("Clerics benefit from high Charisma and Wisdom.");
        }
        else if(playerClass.equalsIgnoreCase("Fighter")) {
        	System.out.println("Fighters benefit from Strength and Dexterity.");
        }
        else if(playerClass.equalsIgnoreCase("Monk")) {
        	System.out.println("Monk benefit from high Wisdom and Strength or Dexterity.");
        }
        else if(playerClass.equalsIgnoreCase("Paladin")) {
        	System.out.println("Paladins benefit from high Charisma.");
        }
        else if(playerClass.equalsIgnoreCase("Rouge")) {
        	System.out.println("Rouges benefit from high Dexterity and Intelligence.");
        }
        else if(playerClass.equalsIgnoreCase("Sorcerer")) {
        	System.out.println("Sorcerers benefit from high Charisma and Dexterity.");
        }
        else if(playerClass.equalsIgnoreCase("Wizard")) {
        	System.out.println("Wizards benefit from high Intelligence and Dexterity.");
        }
    	
    	do {
    		System.out.println("You have " + statPoints + " points to use for your stats and"
    				+ " your current stats are :");
    		for(int i = 0; i < 6; i++) {
    	    	   System.out.print(stats[i] + ": ");
    	    	   System.out.println(playerStats[i]);
    	       }
    		System.out.println("pick the stat you'd like to improve. >>>"
        			+ "\n1: Strength"
        			+ "\n2: Dexterity"
        			+ "\n3: Constitution"
        			+ "\n4: Intellignce"
        			+ "\n5: Wisdom"
        			+ "\n6: Charisma");
    		playerPicker = input.nextInt();
    		for(int i = 0; i < 6; i++) {
 	    	 if(playerPicker == i) {
 	    		System.out.println("what would you like to change your "+ stats[i - 1] + " to. >>>");
 	    		playerPicker = input.nextInt();
 	    		
 	    		if(playerPicker <= 18 || playerPicker >= 7) {
 	    			statPoints = statPoints + (playerStats[i-1] - playerPicker);
 	    			playerStats[i-1] = playerPicker;
 	    		}
 	    		else{
 	 	    		System.out.println("Invalid entry, Please try again");
 	 	    	 }
 	    	 }
 	    	 else if(playerPicker != 1 && playerPicker != 2 && playerPicker != 3 && playerPicker != 4 && playerPicker != 5 && playerPicker != 6) {
 	    		System.out.println("Invalid entry, Please try again");
 	    	 }
 	       }
    		
    	}while(statPoints != 0 && statPoints >= 0);
    	

    }

    public static void pickRacialBonus(int playerStats[]){
    	
    	Scanner input = new Scanner(System.in);
    	String playerChoice = "empty";
    	
    	do {
    	System.out.println("Pick the stat you'd like improved "
    			+ "\nStrength"
    			+ "\nDexterity"
    			+ "\nConstitution"
    			+ "\nIntelligence"
    			+ "\nWisdom"
    			+ "\nCharisma");
    	playerChoice = input.next();
    	
    	if(playerChoice.equalsIgnoreCase("strength") || playerChoice.equalsIgnoreCase("str")) {
        	playerStats[0] = playerStats[0] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("dexterity") || playerChoice.equalsIgnoreCase("dex")) {
        	playerStats[1] = playerStats[1] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("constitution") || playerChoice.equalsIgnoreCase("con")) {
        	playerStats[2] = playerStats[2] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("intelligence") || playerChoice.equalsIgnoreCase("int")) {
        	playerStats[3] = playerStats[3] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("wisdom") || playerChoice.equalsIgnoreCase("wis")) {
        	playerStats[4] = playerStats[4] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("charisma") || playerChoice.equalsIgnoreCase("cha")) {
        	playerStats[5] = playerStats[5] + 2;
        }
    	else {
    		System.out.println("Invalid entry, Please try again");
    		playerChoice = "empty";
    	}
    }while(playerChoice == "empty");
}
}