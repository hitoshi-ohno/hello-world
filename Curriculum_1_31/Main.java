package Curriculum_1_31;

public class Main {

	public static void main(String[] args) {

		// Personクラスを呼び出し、指定の値を代入
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田花子", 22, 1.5, 40);

		// 問題4：MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、
		// Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。
		// Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。

		// carクラス、bicycleクラスを呼び出し
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// setOwnerを用いて、それぞれのインスタンスに所有者の設定
		// Personクラスのインスタンスから名前を取得し、ownerにセット
		car.setOwner(person1.name);
		bicycle.setOwner(person2.name);

		// 問題5：セットできたら、ownerをコンソールに出力してください。

		// それぞれのownerをコンソール出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// 問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。

		// 「person1」がcarを購入
		person1.buy(car);

		// 「person2」がbicycleを購入
		person2.buy(bicycle);

	}

}
