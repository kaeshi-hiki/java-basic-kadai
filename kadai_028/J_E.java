package kadai_028;

public class J_E {

	public static void main(String[] args) {
		
		J_C janken = new J_C ();
		/*playGameメソッドが条件のための勝敗を返すメソッドでありつつ、
		内部でじゃんけんの一連のメソッドを実行してしまってる仕様なので、実際の実行処理は空欄で良い。Scannerが二重ループみたいになる*/
		while(janken.playGame().equals("d")){}
		
		janken.close();
	}
}
