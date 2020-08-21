/*
*
* */
public class RoomWinner {
    public static void main(String[] args) {

        LotteryCard one,two,three;

        one=new LotteryCard();
        two=new LotteryCard();
        three=new LotteryCard();

        one.spin();
        two.spin();
        three.spin();
        System.out.println("winning card combinations:");
        System.out.println("1 - red;2 - green;3 - blue");
        System.out.println(" ");

        System.out.println("         color    "+"\t"+"number");
        System.out.println("Card1:    "+      one.getColor()+    "\t           "+one.getNumber());
        System.out.println("Card2:    "+      two.getColor()+    "\t           "+two.getNumber());
        System.out.println("Card3:    "+      three.getColor()+  "\t           "+three.getNumber());
    }
}
