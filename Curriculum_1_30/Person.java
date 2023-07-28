package Curriculum_1_30;

public class Person {

	// インスタンスフィールドを定義
	// 問題1：インスタンスフィールドを定義してください

	// フィールドに名前の変数を定義
	public String name;

	// フィールドに年齢の変数を定義
	public int age;

	// フィールドに身長の変数を定義
	public double height;

	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	// フィールドに体重の変数を定義
	public double weight;

	// フィールドに人数をカウントする為の変数を定義
	public int count;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	// 問題2：コンストラクタを定義してください（下記それぞれの引数）
	// name,age,height

	// 指定の引数でコンストラクタを定義
	Person(String name, int age, double height, double weight) {

		// 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください

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

	// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	public double bmi() {

		// 文字列型変数にBMIの計算を代入し、桁数を指定
		String BMI_cal = String.format("%.1f", (weight / height / height));

		// 文字列型変数を倍精度浮動小数点数型変数に型変換
		double BMI = Double.parseDouble(BMI_cal);

		// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
		// 戻り値を返す
		return BMI;

	}

	// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	public void print() {
		
		// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		System.out.println("「名前は" + this.name + "です」");
		System.out.println("「年は" + this.age + "です」");
		System.out.println("「BMIは" + bmi() + "です」");
		
		// 問題10：人数の合計を「合計○人です」と出力してください。
		System.out.println("「合計" + this.count + "人です」");

	}

}
