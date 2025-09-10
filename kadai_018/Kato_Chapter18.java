package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";
	public String address = "東京都中野区〇×︎";
	public String givenName;
	
	public Kato_Chapter18(){}
	
	//共通の紹介をする
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	//個別の紹介をする
	abstract public void eachIntroduce();
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	};
	
}
