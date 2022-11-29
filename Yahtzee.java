
public class Yahtzee extends Die6 {
  private int value;
  private Die6 Die1;
  private Die6 Die2;
  private Die6 Die3;
  private Die6 Die4;
  private Die6 Die5;
  public Yahtzee() {
    Die1 = new Die6();
    Die2 = new Die6();
    Die3 = new Die6();
    Die4 = new Die6();
    Die5 = new Die6();
  }
   public void roll() {
    
  }
  public void roll(int dieNumber) {
    Die1.roll();
    Die2.roll();
    Die3.roll();
    Die4.roll();
    Die5.roll();
  }
  public void summarize() {
      
  }
  public void toString() {
      
  }
}


