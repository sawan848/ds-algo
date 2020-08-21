import java.util.Random;

/*
*
*
* */
public class LotteryCard {
  private static final int MAX_NUMBER=15;
  private static final int MIN_NUMBER=10;
  private static final int NO_NUMBER=0;
  private static final int MAX_COLOR=3;
  private static final int MIN_COLOR=1;
  private static final int NO_COLOR=0;
  private              int number;
  private              int color;
  private Random random;

    public LotteryCard() {
        number = NO_NUMBER;
        color = NO_COLOR;
        random = new Random();
    }
    //spin the card
    public void  spin(){
        number=random.nextInt(MAX_NUMBER-MIN_NUMBER+1)+MIN_NUMBER;
        color=random.nextInt(MAX_COLOR-MIN_COLOR+1)+MAX_COLOR;
    }
    public int getNumber(){ return number;}

    public int getColor() {return color;}
}
