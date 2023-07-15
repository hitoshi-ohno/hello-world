package process;

import java.util.Scanner;

// スーパークラス
public class Qes25_2 {

	/*
	 
	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
			 スーパークラスを使用してください
			 getterとsetterを使用してください
			 packageを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください
	
		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24
	
		さあ冒険に出かけよう！
	 
	 */

	// フィールドに名前の変数を宣言
	private String name;

	// 名前のgetterメソッド
	public String getName() {
		return name;
	}

	// 名前のsetterメソッド
	public void setName(String name) {
		this.name = name;
	}

	// 変数に指定の値を代入するコンストラクタを作成
	public Qes25_2() {

		// Scannerクラスのインスタンスscanを生成
		Scanner scan = new Scanner(System.in);

		// nextLineメソッドを使用
		this.name = scan.nextLine();

		// closeメソッドを使用してScannerを閉じる
		scan.close();

	}

	// メソッドの記述
	public void my_name() {
		System.out.println("こんにちは 「 " + this.name + " 」 さん");
	}

}
