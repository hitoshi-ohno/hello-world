package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// for文を記述し、1つ目の値が9以下ではなくなるまで繰り返し処理
		for (int num1 = 1; num1 <= 9; num1++) {

			// 1つ目の値を2桁で表示する為に、String.formatを使用
			String num1st = String.format("%02d", num1);

			// 1つ目の値が9以下ではなくなるまで繰り返し出力
			System.out.print(num1st + " * 01 = " + num1st + " || ");

			// for文を記述し、2つ目の値が9以下ではなくなるまで繰り返し処理
			for (int num2 = 1; num2 <= 9; num2++) {

				// 2つ目の値を2桁で表示する為に、String.formatを使用
				String num2nd = String.format("%02d", num2);

				// かけ算の計算結果を2桁で表示する為に、String.formatを使用
				String result = String.format("%02d", (num1 * num2));

				// if文を記述
				if (num2 == 9) {

					// 2つ目の値が9の場合に出力
					System.out.print(num1st + " * " + num2nd + " = " + result + "\n");

				} else if (num2 != 1) {

					// 2つ目の値が1以外の場合に出力
					System.out.print(num1st + " * " + num2nd + " = " + result + " || ");
				}

			}

		}

	}

}
