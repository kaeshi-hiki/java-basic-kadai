package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class J_C {
	//Scannerは複数回生成してしまうと入力が正しく出力されないのでフィールドで1回生成。さらに１度閉じるとサイド開けないので処理の最終で閉じる。
	private final Scanner input = new Scanner(System.in);
	//マップも複数回生成する必要はない
	private final HashMap<String,String> hands = new HashMap<String,String>();
	//コンストラクタでその他の1度だけで良い初期処理もまとめておく
	public J_C() {
		hands.put("r","グー");
		hands.put("p","パー");
		hands.put("s","チョキ");
		System.out.println("じゃん、けん、ほい！");
	}
	//自分の手を入力するメソッド
	public String getMychoice() {
		while(true) {
			String choice = input.nextLine();
			if(choice.equals("r")||choice.equals("p")||choice.equals("s")) {
				return choice;
			} else {
				System.out.println("error じゃん、けん、ほい！");
			}
		}
	}
	//乱数を呼んでコンピュータ側の手を決めるメソッド
	public String getRandom() {
		String[] choice2 = {"r","p","s"};
		int i = (int)Math.floor(Math.random()*3);	
		return choice2[i]; //フィールドで定義したiを呼ぶだけで乱数生成してくれる
	}
	//上記の2つのメソッドを呼び出して実行し、そこからさらにあいこ、勝ち、負けの結果を返すメソッド
	public String playGame() {
		String[] r = {"d", "w", "l"} ;
		//まさかのここで呼んだ段階で上記メソッドが実行されるという、、なので実行クラスではplayGameとcloseメソッドだけ実行で良い。笑
		String me = getMychoice();
		String com = getRandom();
		System.out.println(hands.get(me)+"vs"+hands.get(com));
		if(me.equals(com)) {
			System.out.println("あいこで、しょ！");
			return r[0];
		} else if((me.equals("r") && com.equals("s"))||(me.equals("p") && com.equals("r"))||(me.equals("s") && com.equals("p"))) {
			System.out.println("勝った！");
			return r[1];
		} else {
			System.out.println("負けた、、");
			return r[2];
		}
	}
	//最後にScannerを終了させるメソッド
	public void close() {
		input.close();
	}
	
}
