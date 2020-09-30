package janken00;

public class Janken {
  static String[] handList = {"グー","チョキ","パー"};

  static void startMessage() {
    System.out.println("--------------------");
    System.out.println("とりあえず！じゃんけんしよか？！10回勝負やで！");
  }

  static void endMessage() {
	  
    System.out.println("おおきに!また遊ぼな！");
    System.out.println("--------------------");
    
    
  }

  public static void main(String[] args) {
    Player player = new Player();
    CPU cpu = new CPU();
    Judge judge = new Judge();

    // 開始の挨拶
    startMessage();

    for (int i = 1; i <= 10; i++) {
     System.out.println("【" + i + "回戦目】");

     // CPUが手をランダムに作成
     cpu.setHand();
     // Playerが手を入力
     player.setHand();
     // Player,CPUの手を表示
     System.out.println("・あんたの手：" + handList[player.getHand()]);
     System.out.println("・CPUの手：" + handList[cpu.getHand()]);
     // 判定
     judge.judgement(cpu.getHand(), player.getHand());
    } // 繰り返し終わり
    // 結果を表示
    judge.result();
    // 終了の挨拶
    endMessage();
  }
}
