package Curriculum_1_30;

public class Main {

	public static void main(String[] args) {

		// 問題5：Main.javaの引数にweightの60を入れてください
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// System.out.println(person1.name);
		// System.out.println(person1.age);
		// System.out.println(person1.height);

		// printメソッドを使用して、問題9の指定の情報を出力
		person1.print();
	}

}
