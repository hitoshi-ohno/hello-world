package process;

public class Qes22_2 {

	/*
	 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です
	
	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
	*/

	// 処理用

	// フィールドに国名の変数を宣言
	public String country;

	//	フィールドに食べ物の変数を宣言
	public String food;

	//	フィールドに食べ物の種別の変数を宣言
	public String meal;

	// 変数に指定の値を代入するコンストラクタを作成
	public Qes22_2(String japan, String food, String meal) {

		// 変数に国名を代入するコンストラクタを作成
		this.country = "日本";

		// nullチェックの際には変数にnullを代入
		// this.country = null;

		// 変数に食べ物を代入するコンストラクタを作成
		this.food = "寿司";

		// nullチェックの際には変数にnullを代入
		// this.food = null;

		// 変数に食べ物の種別を代入するコンストラクタを作成
		this.meal = "和食";

		// nullチェックの際には変数にnullを代入
		// this.meal = null;

	}

	// 国名を出力するメソッドの記述
	public void my_country() {
		System.out.println("こんにちは！ここは" + this.country + "です！");
	}

	// 食べ物を出力するメソッドの記述
	public void like_food() {
		System.out.println("この" + this.food + "はうまい");
	}

	// 食べ物の種別を出力するメソッドの記述
	public void kind_meal() {
		System.out.println(this.food + "は" + this.meal + "です");
	}

}
