package kadai_015;

public class Car_Chapter15 {
	private int gear=1; //1速から５速へ
	private int speed=10; //ギアチェンジ後の速度
	
	public void changeGear (int afterGear) { //速度を変える
		this.gear = afterGear;
		switch(afterGear){
			case 2,3,4,5 -> this.speed = afterGear*10;
			default -> this.speed = 10;
		};
		System.out.println("ギアを1から"+this.gear+"に切り替えました");
	}
	public void run() { //ギアチェンジ後の速度を表示する
		System.out.println("速度は時速"+this.speed+"kmです");
	}
}
