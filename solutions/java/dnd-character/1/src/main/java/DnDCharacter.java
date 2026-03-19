import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

  private final int strength;
  private final int dexterity;
  private final int constitution;
  private final int intelligence;
  private final int wisdom;
  private final int charisma;
  private final int hitpoints;

  public DnDCharacter() {
    this.strength = ability(rollDice());
    this.dexterity = ability(rollDice());
    this.constitution = ability(rollDice());
    this.intelligence = ability(rollDice());
    this.wisdom = ability(rollDice());
    this.charisma = ability(rollDice());
    this.hitpoints = 10 + modifier(this.constitution);
  }

  int ability(List<Integer> scores) {
      return scores.stream()
          .sorted()
          .skip(1)
          .mapToInt(i -> i)
          .sum();
    }

    List<Integer> rollDice() {
      List<Integer> diceResults = new ArrayList<>();
      Random randomNum = new Random();
      for (int i = 0; i < 4; i++) {
//        messed up here - added the random too early so all numbers were essentially same
        diceResults.add(randomNum.nextInt(1, 7));
      }
      return diceResults;
    }

    int modifier(int input) {
//      int mod = 0;
//      if (input <= 3) {
//        mod = -4;
//      } else if (input <= 5) {
//        mod = -3;
//      } else if (input <= 7) {
//        mod = -2;
//      } else if (input <= 9) {
//        mod = -1;
//      } else if (input <= 11) {
//        mod = 0;
//      } else if (input <= 13) {
//        mod = 1;
//      } else if (input <= 15) {
//        mod = 2;
//      } else if (input <= 17) {
//        mod = 3;
//      } else if (input == 18) {
//        mod = 4;
//      }
//      return mod;
      return Math.floorDiv(input - 10, 2);
//    division between two integers rounded down. Apparently this does it...
    }

    int getStrength() {
      return this.strength;
    }

    int getDexterity() {
    return this.dexterity;
    }

    int getConstitution() {
    return this.constitution;
    }

    int getIntelligence() {
    return this.intelligence;
    }

    int getWisdom() {
    return this.wisdom;
    }

    int getCharisma() {
    return this.charisma;
    }

    int getHitpoints() {
    return this.hitpoints;
    }
}
