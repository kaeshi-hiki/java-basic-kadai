package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Janken_Chapter28 {
	private Scanner myChoice = new Scanner(System.in);
	/*じゃんけんの手を入力する*/
	public String getMychoice() {
		while(true){
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			String myHand = myChoice.nextLine();
			if((myHand.equals("r"))||(myHand.equals("p"))||(myHand.equals("s"))) {
				return myHand;
			} else {
				System.out.println("正しい入力ではありません。再度入力してください。");
			}
		}	
	}
	//相手の手を乱数で選ぶ
	public String getRandom() {
		String[] hands = {"r","s","p"};
		int index = (int)Math.floor(Math.random()*3);
		return hands[index];
	}
	/*じゃんけんを行う
	自分の手はパー,対戦相手の手はグー
	自分の勝ちです*/
	public void playGame(String choice, String raivalChoice) {
		HashMap<String, String> handsMap = new HashMap<String, String>();
		handsMap.put("r","グー");
		handsMap.put("c","チョキ");
		handsMap.put("p","パー");
		
		System.out.println("自分の手は"+handsMap.get(choice)+",対戦相手の手は"+handsMap.get(raivalChoice));
		if(choice.equals(raivalChoice)) {
			System.out.println("あいこです");
		} else if (
			(choice.equals("r") && raivalChoice.equals("c"))||
			(choice.equals("c") && raivalChoice.equals("p"))||
			(choice.equals("p") && raivalChoice.equals("r"))
			) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
