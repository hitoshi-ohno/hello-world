package Curriculum_1_31;

public class Person {

	// フィールドに名前の変数を定義
	public String name;

	// フィールドに年齢の変数を定義
	public int age;

	// フィールドに身長の変数を定義
	public double height;

	// フィールドに体重の変数を定義
	public double weight;

	// フィールドに人数をカウントする為の変数を定義
	public int count;

	// 指定の引数でコンストラクタを定義
	Person(String name, int age, double height, double weight) {

		// 名前の変数に値をセット
		this.name = name;

		// 年齢の変数に値をセット
		this.age = age;

		// 身長の変数に値をセット
		this.height = height;

		// 体重の変数に値をセット
		this.weight = weight;

		// 人数をカウントする為の変数に値をセット
		this.count++;

	}

	public double bmi() {

		// 文字列型変数にBMIの計算を代入し、桁数を指定
		String BMI_cal = String.format("%.1f", (weight / height / height));

		// 文字列型変数を倍精度浮動小数点数型変数に型変換
		double BMI = Double.parseDouble(BMI_cal);

		// 戻り値を返す
		return BMI;

	}

	public void print() {

		System.out.println("「名前は" + this.name + "です」");
		System.out.println("「年は" + this.age + "です」");
		System.out.println("「BMIは" + bmi() + "です」");

		System.out.println("「合計" + this.count + "人です」");

	}

	// 問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	public void buy(Car car) {

		// 問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
		car.setOwner(this.name);

		// 問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
		System.out.println(car.getOwner() + "が購入しました");

	}

	// 問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	public void buy(Bicycle bicycle) {

		// buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセット
		bicycle.setOwner(this.name);

		// 「〇〇が購入しました」と出力する処理を追加
		System.out.println(bicycle.getOwner() + "が購入しました");

	}

}
