
public class Yahtzee extends Die6 {
  private int value;
  private Die6 Die1;
  private Die6 Die2;
  private Die6 Die3;
  private Die6 Die4;
  private Die6 Die5;
  public Yahtzee() {
    Die1.roll();
    Die2.roll();
    Die3.roll();
    Die4.roll();
    Die5.roll();
  }
  public void roll(int dieNumber) {
      
  }
  public int getValue() {
    return value;
  }
  public void roll() {
    this.value = (int)(Math.random() * 6) + 1;
  }
  public int rollAndGetValue() {
    roll();
    return getValue();
  }
}


