package curriculum_B;

// java.util.Scannerパッケージ利用の宣言
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// Scannerクラスのインスタンスscanを生成
		Scanner scan = new Scanner(System.in);

		// "生徒の人数を入力してください(2以上)："と出力
		System.out.print("生徒の人数を入力してください(2以上)：");

		// 整数型変数を宣言し、nextIntメソッドを使用
		int student = scan.nextInt();

		// while文を記述し、入力した数値が2未満の場合は再入力
		while (student < 2) {

			// 2以上の数値が入力されるまで入力を繰り返す
			System.out.print("2以上の数値を入力してください：");
			student = scan.nextInt();

		}

		// 配列を宣言し、"英語",  "数学",  "理科", "社会"を格納
		String[] subject = { "英語", "数学", "理科", "社会" };

		// 2次元配列を宣言
		// 配列の数は科目数、各配列の要素数は入力した生徒数とする
		int[][] score = new int[subject.length][student];

		// for文を記述し、生徒の数だけ処理を繰り返す
		for (int num_student = 0; num_student < student; num_student++) {

			// for文を記述し、4科目の点数を入力するまで処理を繰り返す
			for (int num_subject = 0; num_subject < subject.length; num_subject++) {

				// 1科目の点数を入力する度に2次元配列に格納
				System.out.print((num_student + 1) + "人目の『" + subject[num_subject] + "』の点数を入力してください：");
				score[num_subject][num_student] = scan.nextInt();

				// if文を記述し、4科目の点数入力が完了する度に改行
				if (num_subject >= (subject.length - 1)) {

					System.out.println();

				}

			}

		}

		// for文を記述し、生徒の平均点を1人ずつ出力
		for (int num_student = 0; num_student < student; num_student++) {

			// 整数型変数を宣言し、点数を合算した回数をカウント
			int count = 0;

			// 倍精度浮動小数点数型変数を宣言し、合算した点数を格納
			double sum = 0d;

			// for文を記述し、生徒の4科目の点数を合算
			for (int num_subject = 0; num_subject < subject.length; num_subject++) {

				// 点数を配列に格納して合算
				sum += score[num_subject][num_student];

				// 点数を合算した回数をカウント
				count++;

				// if文を記述し、4科目の点数の合算が終わる度に平均点を出力
				if (num_subject >= (subject.length - 1)) {

					System.out.println((num_student + 1) + "人目の平均点は" + String.format("%.2f", sum / count) + "点です。");

				}

			}

		}

		// 全員分の平均点が出力し終わったら改行
		System.out.println();

		// 科目の数だけ繰り返し処理
		for (int num_subject = 0; num_subject < subject.length; num_subject++) {

			// 整数型変数を宣言し、点数を合算した回数をカウント
			int count = 0;

			// 倍精度浮動小数点数型変数を宣言し、合算した点数を格納
			double sum_subject = 0;

			// 生徒の数だけ繰り返し処理
			for (int num_student = 0; num_student < score[num_subject].length; num_student++) {

				// 点数を配列に格納して合算
				sum_subject += score[num_subject][num_student];

				// 点数を合算した回数をカウント
				count++;

				// if文を記述し、全生徒の1科目の合算が終わる度に平均点を出力
				if (num_student >= (score[num_subject].length - 1)) {

					// 平均点を出力
					System.out.println(
							subject[num_subject] + "の平均点は" + String.format("%.2f", sum_subject / count) + "点です。");

				}

			}

		}

		// 整数型変数を宣言し、全体の点数を合算
		int count = 0;

		// 倍精度浮動小数点数型変数を宣言し、合算した点数を格納
		double sum = 0d;

		// for文を記述し、4科目の点数を合算
		for (int total_score = 0; total_score < score.length; total_score++) {

			// for文を記述し、全生徒の点数を合算
			for (int total_student = 0; total_student < score[total_score].length; total_student++) {

				// 点数を配列に格納して合算
				sum += score[total_score][total_student];

				// 点数を合算した回数をカウント
				count++;

			}

		}

		// 全体の平均点を出力
		System.out.println("全体の平均点は" + String.format("%.2f", sum / count) + "点です。");

		// closeメソッドを使用してScannerを閉じる
		scan.close();

	}

}
