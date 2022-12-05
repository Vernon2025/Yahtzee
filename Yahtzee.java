
public class Yahtzee {
  private Die6 die1;
  private Die6 die2;
  private Die6 die3;
  private Die6 die4;
  private Die6 die5;
  private String stringValue;
  private int getValue;
  public Yahtzee() {
    die1 = new Die6();
    die2 = new Die6();
    die3 = new Die6();
    die4 = new Die6();
    die5 = new Die6();
  }
  public void roll(int dieNumber) {
    if (dieNumber == 1) {
        die1.roll();
    }
    if (dieNumber == 2) {
        die2.roll();
    }
    if (dieNumber == 3) {
        die3.roll();
    }
    if (dieNumber == 4) {
        die4.roll();
    }
    if (dieNumber == 5) {
        die5.roll();
    }
  }
  public String toString() {
      stringValue = "Dice values: " + die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
      return stringValue;
  }
  public String summarize() {
      int[] score = {0, 0, 0, 0, 0, 0, 0};
      score[die1.getValue()]++;
      score[die2.getValue()]++;
      score[die3.getValue()]++;
      score[die4.getValue()]++;
      score[die5.getValue()]++;
      return "1-" + score[1] + " , 2-" + score[2] + " , 3-" + score[3] + " , 4-" + score[4] + " , 5-" + score[5] + " , 6-" + score[6];
  }
}



