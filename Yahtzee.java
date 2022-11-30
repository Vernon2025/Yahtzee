
public class Yahtzee {
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
  public void roll(int dieNumber) {
    if (dieNumber == 1) {
      Die1.roll();
    } else if (dieNumber == 2) {
      Die1.roll();
      Die2.roll();
    }   
  }
  public void summarize() {
      
  }
}



