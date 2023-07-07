package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。

	// フィールドに動物の名前の変数を定義
	public String shiba;

	// Q2：フィールドに動物の数の変数を定義してください。

	// フィールドに動物の数の変数を定義
	public int count;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。

	Dog(String shiba, int count) {

		// 変数に「犬」を代入するコンストラクタを作成
		this.shiba = "犬";

		// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。

		// 変数に引数を代入するコンストラクタを作成
		this.count = count;
	}

	// 動物の名前を出力するメソッドの記述
	public void name() {
		System.out.println(this.shiba + "\n");
	}

	// 動物の数を出力するメソッドの記述
	public void animal_count() {
		count = 2;
		System.out.println(this.count + "\n");
	}

}
