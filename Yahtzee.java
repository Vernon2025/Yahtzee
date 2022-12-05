
public class Yahtzee {
  private Die6 Die1;
  private Die6 Die2;
  private Die6 Die3;
  private Die6 Die4;
  private Die6 Die5;
  private String stringValue;
  private int getValue;
  public Yahtzee() {
    Die1 = new Die6();
    Die2 = new Die6();
    Die3 = new Die6();
    Die4 = new Die6();
    Die5 = new Die6();
  }
  public void roll(int dieNumber) {
    if (dieNumber == 1) {
        Die1.roll();
    }
    if (dieNumber == 2) {
        Die2.roll();
    }
    if (dieNumber == 3) {
        Die3.roll();
    }
    if (dieNumber == 4) {
        Die4.roll();
    }
    if (dieNumber == 5) {
        Die5.roll();
    }
  }
  public String toString() {
      stringValue = "Dice values: " + Die1.getValue() + " " + Die2.getValue() + " " + Die3.getValue() + " " + Die4.getValue() + " " + Die5.getValue();
      return stringValue;
  }
  public String summarize() {
      int[] score = {0, 0, 0, 0, 0, 0, 0};
      score[Die1.getValue()]++;
      score[Die2.getValue()]++;
      score[Die3.getValue()]++;
      score[Die4.getValue()]++;
      score[Die5.getValue()]++;
      return "1-" + score[1] + " , 2-" + score[2] + " , 3-" + score[3] + " , 4-" + score[4] + " , 5-" + score[5] + " , 6-" + score[6];
  }
}



