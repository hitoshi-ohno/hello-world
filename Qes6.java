package curriculum_B;

//java.util.Randomパッケージ利用の宣言
import java.util.Random;
//java.util.Scannerパッケージ利用の宣言
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		// Scannerクラスのインスタンスscanを生成
		Scanner scan = new Scanner(System.in);

		// 文字列型変数に入力した値を代入
		String input = scan.nextLine();

		// 配列を宣言し、入力した値を“、”で区切って格納
		String[] product = input.split("、");

		// Randomクラスのインスタンスrandを生成
		Random rand = new Random();

		// 整数型変数を宣言し、配列の要素を出力する際に使用
		int num = 0;

		// 整数型変数を宣言し、nextIntメソッドを使用して0以上12未満の乱数を取得
		// テレビの台数をカウントする為の変数として使用
		int tv = rand.nextInt(12);

		// 拡張for文を記述
		for (String test : product) {

			// 整数型変数を宣言し、nextIntメソッドを使用して0以上12未満の乱数を取得
			int cpuInput = rand.nextInt(12);

			// switch文を記述
			switch (product[num]) {

			// 入力した値が“パソコン”の場合の処理を記述
			case "パソコン":
				System.out.println(product[num] + "の残り台数は" + cpuInput + "台です");
				num++;
				break;

			// 入力した値が“冷蔵庫”の場合の処理を記述
			case "冷蔵庫":
				System.out.println(product[num] + "の残り台数は" + cpuInput + "台です");
				num++;
				break;

			// 入力した値が“扇風機”の場合の処理を記述
			case "扇風機":
				System.out.println(product[num] + "の残り台数は" + cpuInput + "台です");
				num++;
				break;

			// 入力した値が“洗濯機”の場合の処理を記述
			case "洗濯機":
				System.out.println(product[num] + "の残り台数は" + cpuInput + "台です");
				num++;
				break;

			// 入力した値が“加湿器”の場合の処理を記述
			case "加湿器":
				System.out.println(product[num] + "の残り台数は" + cpuInput + "台です");
				num++;
				break;

			// 入力した値が“テレビ”の場合の処理を記述
			case "テレビ":
				System.out.println(product[num] + "の残り台数は" + tv + "台です");
				num++;
				break;

			// 入力した値が“ディスプレイ”の場合の処理を記述
			case "ディスプレイ":
				System.out.println(product[num] + "の残り台数は" + (11 - tv) + "台です");
				num++;
				break;

			// 入力した値が上記以外の場合の処理を記述
			default:
				System.out.println("『" + product[num] + "』は指定の商品ではありません");
				num++;
				
			}

		}

	}

}
