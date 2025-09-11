package kadai_021;
import java.util.ArrayList;
public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//辞書クラスからインスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		//検索単語リスト作成
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grape");
		fruitList.add("orange");
		//メソッドを引数指定で呼び出し
		dictionary.search(fruitList);
	}

}
