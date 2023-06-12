package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// for文を記述し、整数型変数iの値が9以下ではなくなるまで繰り返し処理
		for (int num1 = 1; num1 <= 9; num1++) {

			// 整数型変数iの値が9以下ではなくなるまで繰り返し出力
			System.out.print("0" + num1 + " * 01 = " + "0" + num1 + " || ");

			// for文を記述し、整数型変数jの値が9以下ではなくなるまで繰り返し処理
			for (int num2 = 1; num2 <= 9; num2++) {

				// if文を記述
				if (num2 == 9 && (num1 * num2) >= 10) {

					// jの値が9で、i*jの値が10以上の場合に出力
					System.out.print("0" + num1 + " * 0" + num2 +  " = "  + (num1 * num2));

				} else if (num2 == 9 && (num1 * num2) < 10){

					// jの値が9で、i*jの値が10未満の場合に出力
					System.out.print("0" + num1 + " * 0" + num2 +  " = "  + "0" + (num1 * num2));

				} else if ((num1 * num2) >= 10){

					// i*jの値が10以上の場合に出力
					System.out.print("0" + num1 + " * 0" + num2 +  " = "  + (num1 * num2) + " || ");

				} else if(num2 != 1 && (num1 * num2) < 10) {

					// jの値が9以外で、i*jの値が10未満の場合に出力
					System.out.print("0" + num1 + " * 0" + num2 +  " = "  + "0" + (num1 * num2) + " || ");
				}

			}

			// for文の処理が完了する度に改行
			System.out.println();

		}

	}

}
