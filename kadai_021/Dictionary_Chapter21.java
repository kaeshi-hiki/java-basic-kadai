package kadai_021;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//辞書fruitの作成
	HashMap<String,String> fruitMap = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {	
		fruitMap.put("apple","りんご");
		fruitMap.put("peach","桃");
		fruitMap.put("banana","バナナ");
		fruitMap.put("lemon","レモン");
		fruitMap.put("pear","梨");
		fruitMap.put("kiwi","キウィ");
		fruitMap.put("strawberry","いちご");
		fruitMap.put("grape","ぶどう");
		fruitMap.put("muscat","マスカット");
		fruitMap.put("cherry","さくらんぼ");
	}
	
	//辞書内検索、判定、結果出力を単語リスの数だけ繰り返すメソッド作成
	//containsKey(引数)はマップ内に引数がキーで存在しているかをtrue/falseで返す
	public void search(ArrayList<String> words) {
		for(String fruit:words) {
			if(fruitMap.containsKey(fruit)) {
				System.out.println(fruit+"の意味は"+fruitMap.get(fruit));
			}else {
				System.out.println(fruit+"辞書に存在しません");
			}
		}
	}
	
}
