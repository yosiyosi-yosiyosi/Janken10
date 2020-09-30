package janken00;

public class Judge {
  int judge;
  int win;
  int lose;
  int even;

  public void judgement(int cpuHand, int playerHand) {
    judge = (cpuHand - playerHand + 3 ) % 3;

    switch(judge) {
      case 0:
        System.out.println("あいこやわ！");
        even++;
        break;
      case 1:
        System.out.println("あんたの勝ちやで！");
        win++;
        break;
      case 2:
        System.out.println("あんたの負けぇ！");
        lose++;
        break;
      default:
    }
    System.out.println("--------------------");
  }

  public void result() {
    System.out.println("【勝敗の結果】");
    System.out.println("勝ち：" + win + "回");
    System.out.println("負け：" + lose + "回");
    System.out.println("あいこ：" + even + "回");
    System.out.println("");
    if (win == 0) {
      System.out.println("逆に全敗はすごいおめでとう...かも！");
    } else if (win == 1-3) {
      System.out.println("君ならもう少しいけたはずやなぁ〜！");
    } else  if (win == 4-7) {
      System.out.println("中々ええ感じやん！この調子かも〜〜");
    } else  if (win == 8-9) {
      System.out.println("すごい！今日はめっちゃいい日になりそうかも〜！");
    } else if (win == 10) {
      System.out.println("君は神の領域に踏み入れてしまったようだ…");
    }
  }
}