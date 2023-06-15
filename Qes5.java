package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {

		// for文を記述し、2つ目の値が9以下ではなくなるまで繰り返し処理
		for (int num2 = 1; num2 <= 9; num2++) {

			// 2つ目の値を3桁で表示する為に、String.formatを使用
			String num2nd = String.format("%03d", num2);

			// for文を記述し、1つ目の値が20以下ではなくなるまで繰り返し処理
			for (int num1 = 1; num1 <= 20; num1++) {

				// 1つ目の値を3桁で表示する為に、String.formatを使用
				String num1st = String.format("%03d", num1);

				// かけ算の計算結果を3桁で表示する為に、String.formatを使用
				String result = String.format("%03d", (num1 * num2));

				// if文を記述
				if (num1 == 20) {

					// 1つ目の値が20の場合に出力
					System.out.print(num1st + " * " + num2nd + " = " + result + "\n");

				} else if (num1 <= 19) {

					// 1つ目の値が19以下の場合に出力
					System.out.print(num1st + " * " + num2nd + " = " + result + " || ");

				}

			}

		}

	}

}
