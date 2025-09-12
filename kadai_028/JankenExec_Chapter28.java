package kadai_028;

public class JankenExec_Chapter28 {
	public static void main(String[] args) {
		//インスタンス作成
		Janken_Chapter28 janken = new Janken_Chapter28();
		//手を入力
		String mine = janken.getMychoice();
		//乱数出力
		String your = janken.getRandom();
		//結果出力
		janken.playGame(mine,your);
	}
}
