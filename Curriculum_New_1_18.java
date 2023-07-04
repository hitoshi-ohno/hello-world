package curriculum_New_question;

//java.util.Randomパッケージ利用の宣言
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// メソッドを作成
	public static void question1(String greeting, int num) {

		// mainメソッドで渡された値を元に出力
		System.out.println("「" + greeting + num + "」" + "\n");

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// メソッドを作成
	public static void question2_4(int num1, int num2) {

		// mainメソッドで渡された値を元に出力
		System.out.println((num1 * num2) + "\n");

	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// メソッドを作成
	public static void question3(int[] numbers) {

		// for文を記述し、受け取った値を順番にコンソールに出力
		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);

		}

		// 繰り返し処理が全て終わったら改行
		System.out.println();

	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// Q2のメソッドをオーバーロード
	public static void question2_4(double num1, double num2) {

		// mainメソッドで渡された値を元に出力
		System.out.println((num1 + num2) + "\n");

	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// メソッドを作成
	public static int[] question5(int num) {

		// Randomクラスのインスタンスを生成
		Random rnd = new Random();

		// 配列を宣言し、引数の値を要素数とする
		int[] value = new int[num];

		// for文を記述し、ランダムな数字を繰り返し出力
		for (int i = 0; i < num; i++) {

			// 配列に1～100までのランダムな数字を格納
			value[i] = rnd.nextInt(100) + 1;

			// 格納したランダムな数字を出力
			System.out.println(value[i]);

		}

		// 繰り返し処理が終わったら改行
		System.out.println();

		// 格納した値を返す
		return value;

	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// メソッドを作成
	public static double question6() {

		// 配列を宣言し、Q5のメソッドの返り値を格納
		int[] q5 = question5(3);

		// 倍精度浮動小数点数型変数を宣言し、合算した点数を格納
		double sum = 0d;

		// 整数型変数を宣言し、点数を合算した回数をカウント
		int count = 0;

		// for文を記述し、Q5のメソッドの値の数だけ繰り返し処理
		for (int i = 0; i < q5.length; i++) {

			// 点数を配列に格納して合算
			sum += q5[i];

			// 点数を合算した回数をカウント
			count++;

		}

		// 平均値を出力
		System.out.println(sum / count + "\n");

		// 平均値を返す
		return (sum / count);

	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	// メソッドを作成
	public static void question7() {

		// 倍精度浮動小数点数型変数を宣言し、Q6のメソッドの返り値を格納
		double q6 = question6();

		// ブーリアン型変数を宣言し、Q6のメソッドの返り値が50以上ならtrueを返す
		boolean result = (q6 >= 50);

		// ブーリアン型変数を出力
		System.out.println(result);

	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// Q1のメソッドの呼び出し
		question1("Hello JavaSE ", 11);

		// Q2のメソッドの呼び出し
		question2_4(2, 3);

		// Q3のメソッドの呼び出し
		int[] numbers = { 4, 5, 6 };
		question3(numbers);

		// Q4のメソッドの呼び出し
		question2_4(0.7, 0.8);

		// Q7のメソッドの呼び出し
		// Q5のメソッドの呼び出し→ランダムな数字の出力
		// Q6のメソッドの呼び出し→ランダムな数字の出力及び平均値の出力
		// Q5,Q6の返り値を使用する事で、Q7のメソッド呼び出しで一連の処理が可能
		question7();

	}
}