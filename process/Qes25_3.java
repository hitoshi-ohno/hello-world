package process;

import java.util.Random;

// サブクラス
public class Qes25_3 extends Qes25_2 {

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

	// フィールドにHPの能力値の変数を宣言
	private int hp_parameter;

	// フィールドにMPの能力値の変数を宣言
	private int mp_parameter;

	// フィールドに攻撃力の能力値の変数を宣言
	private int attack_parameter;

	// フィールドに素早さの能力値の変数を宣言
	private int speed_parameter;

	// フィールドに防御力の能力値の変数を宣言
	private int defense_parameter;

	// 変数に指定の値を代入するコンストラクタを作成
	public Qes25_3() {

		// Randomクラスのインスタンスcpuを生成
		Random rand = new Random();

		// nextIntメソッドを使用し、HPの能力値の変数に乱数を代入するコンストラクタを作成
		this.hp_parameter = rand.nextInt(1000) + 1;

		// nextIntメソッドを使用し、MPの能力値の変数に乱数を代入するコンストラクタを作成
		this.mp_parameter = rand.nextInt(1000) + 1;

		// nextIntメソッドを使用し、攻撃力の能力値の変数に乱数を代入するコンストラクタを作成
		this.attack_parameter = rand.nextInt(1000) + 1;

		// nextIntメソッドを使用し、素早さの能力値の変数に乱数を代入するコンストラクタを作成
		this.speed_parameter = rand.nextInt(1000) + 1;

		// nextIntメソッドを使用し、防御力の能力値の変数に乱数を代入するコンストラクタを作成
		this.defense_parameter = rand.nextInt(1000) + 1;

	}

	// メソッドの記述
	public void my_status() {

		System.out.println("ステータス");

		// HPを出力
		System.out.println("HP：" + this.hp_parameter);

		// MPを出力
		System.out.println("MP：" + this.mp_parameter);

		// 攻撃力を出力
		System.out.println("攻撃力：" + this.attack_parameter);

		// 素早さを出力
		System.out.println("素早さ：" + this.speed_parameter);

		// 防御力を出力
		System.out.println("防御力：" + this.defense_parameter + "\n");

		System.out.println("さあ冒険に出かけよう！");

	}

}
