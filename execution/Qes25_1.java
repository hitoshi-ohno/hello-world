package execution;

import java.util.Scanner;

import process.Qes25_3;

//実行用
public class Qes25_1 {

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

	public static void main(String[] args) {

		// クラスを呼び出し、値を代入
		Qes25_3 adventure = new Qes25_3();

		// Scannerクラスのインスタンスscanを生成
		Scanner scan = new Scanner(System.in);

		// 名前のsetterメソッドに入力した値を渡す
		adventure.setName(scan.nextLine());

		// 名前を出力
		adventure.my_name();

		// ステータスを出力
		adventure.my_status();

		// closeメソッドを使用してScannerを閉じる
		scan.close();

	}

}
