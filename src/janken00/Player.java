package janken00;
import java.util.Scanner;

public class Player {
  int hand;

  public void setHand() {
    System.out.print("ほな！「グー」「チョキ」「パー」のどれか入力して見て( ・∇・)／");
    Scanner scan = new Scanner(System.in);
    String inputHand = scan.nextLine();

    switch(inputHand) {
      case "グー":
        hand = 0;
        break;
      case "チョキ":
        hand = 1;
        break;
      case "パー":
        hand = 2;
        break;
      default:
    	  
        System.out.println("間違えたから次！行ってみよぉ〜٩( ᐛ )و…。");
    }
  }

  public int getHand() {
    return hand;
  }
}