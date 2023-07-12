package curriculum_Question;

public class Curriculum_1_23 {

	/*
		
		下記がコンソールに出力されるように作成してください
		※thisとsetterとgetterとフィールドを使ってください
		
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		
	*/

	// フィールドに動物名の変数を宣言
	private String animal;

	// フィールドに体長の変数を宣言
	private double bodyLength;

	// フィールドに速度の変数を宣言
	private int speed;

	// 動物名のgetterメソッド
	public String getanimal() {

		return this.animal;

	}

	// 体長のgetterメソッド
	public double getbodyLength() {

		return bodyLength;

	}

	// 速度のgetterメソッド
	public int getspeed() {

		return speed;

	}

	// 動物名のsetterメソッド
	public void setanimal(String animal) {

		this.animal = animal;

	}

	// 体長のsetterメソッド
	public void setbodyLength(double bodyLength) {

		this.bodyLength = bodyLength;

	}

	// 速度のsetterメソッド
	public void setspeed(int speed) {

		this.speed = speed;

	}

	public static void main(String[] args) {

		// クラスの呼び出し
		Curriculum_1_23 lion = new Curriculum_1_23();

		// 動物名のsetterメソッドに値を渡す
		lion.setanimal("ライオン");

		// 体長のsetterメソッドに値を渡す
		lion.setbodyLength(2.1);

		// 速度のsetterメソッドに値を渡す
		lion.setspeed(80);

		// getterメソッドでsetterでセットした値を取得し出力する
		System.out.println("動物名：" + lion.getanimal());

		System.out.println("体長：" + lion.getbodyLength() + "m");

		System.out.println("速度：" + lion.getspeed() + "km/h");

	}

}
