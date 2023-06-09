package curriculum_B;

//java.util.Objectsパッケージ利用の宣言
import java.util.Objects;
// java.util.Randomパッケージ利用の宣言
import java.util.Random;
// java.util.Scannerパッケージ利用の宣言
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// Q1 ログイン時の入力チェックシステムを下記条件で作成してください
		// ・コンソールにユーザー名を入力できるようにしてください
		// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		// ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		// ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		
		// Q2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください

		// Q3 じゃんけんのシステムを下記の条件で作成してください
		// ・「0はグー、1：チョキ、2：パー」とすること
		// ・じゃんけんに勝つまでループすること
		// ・一回ごとに自分の手と相手の手を下記の通り出力してください
		//	ユーザー名「name」を登録しました
		//	nameの手は「パー」
		//	相手の手は「グー」
		//
		// ・条件分岐の設定
		// ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
		//	やるやん。
		//	次は俺にリベンジさせて
		//
		// ・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
		//	俺の勝ち！
		//	負けは次につながるチャンスです！
		//	ネバーギブアップ！
		//
		// ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
		//	俺の勝ち！
		//	たかがじゃんけん、そう思ってないですか？
		//	それやったら次も、俺が勝ちますよ
		//
		// ・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
		//	俺の勝ち！
		//	なんで負けたか、明日まで考えといてください。
		//	そしたら何かが見えてくるはずです
		//
		// ・あいこの場合、下記が出力されるようにしてください
		//	DRAW あいこ もう一回しましょう！
		//
		// じゃんけんを行った回数を表示してください
		// 勝つまでにかかった合計回数は1回です
		//
		// ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください

		
		// Scannerクラスのインスタンスscanを生成
		Scanner scan = new Scanner(System.in);
		
		// 文字列型変数を宣言し、初期化
		String name = null;
		
		// ユーザー名の登録確認の為に整数型変数を宣言し、初期化
		int regist = 0;
    
		 // while文を記述
		 while(regist < 1) {
			
			 // nextLineメソッドを使用
			 name = scan.nextLine();
			 			 
			 // if文を記述
			 if (Objects.isNull(name) || name.isEmpty()) {

				// 入力した文字が0文字以下もしくはnullの場合「名前を入力してください」と出力
				 System.out.println("「名前を入力してください」");

			 } else if (name.length() >= 11) {

				// 入力した文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
				 System.out.println("「名前を10文字以内にしてください」");

			 } else if (name.matches("^[a-zA-Z0-9]+$")){

				 // 入力した文字が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
				 System.out.println("「ユーザー名「 " + name + " 」を登録しました」");

				 // 入力した文字が正常な値だった場合、ユーザー名の登録確認の変数を+1する
				 regist += 1;

			 } else {

				 // 入力した文字が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
				 System.out.println("「半角英数字のみで名前を入力してください」");
			 }

		 }
		 
		 // Scannerクラスのインスタンスjankenを生成
		 Scanner janken = new Scanner(System.in);

		 // じゃんけんの回数をカウントする為に整数型変数を宣言し、初期化
		 int janken_num = 0;
		 
		 // じゃんけんの勝利判定をする為に整数型変数を宣言し、初期化
		 int win_num = 0;

		 // じゃんけんの手を判定する為に整数型変数を宣言し、初期化
		 int input = 0;

		 
		 // while文を記述
		 while(win_num < 1) {
			
        	// nextIntメソッドを使用
            input = janken.nextInt();
            
            // 配列を宣言し、自身とcpuそれぞれの"グー","チョキ","パー"を格納
   		 	String[] myHand = {name +"の手は「グー」",name +"の手は「チョキ」",name +"の手は「パー」"};
   		 	String[] cpuHand = {"相手の手は「グー」" + "\n","相手の手は「チョキ」" + "\n","相手の手は「パー」" + "\n"};
   		 	
   		 	// if文を記述
   		 	if(input < 3) {
   		 		
   		 		// 入力した数字が0～2であれば自身の手を出力
   		 		System.out.println(myHand[input]);
   		 		
   		 	} else {
   		 		
   		 		// 入力した数字が0～2以外であれば"0～2の値を入力してください"と出力し、再度数字入力に戻る
   		 		System.out.println("0～2の値を入力してください");
   		 		continue;
   		 	}
   		 

            // 処理を繰り返す毎に、じゃんけんの回数をカウントする変数の値を＋1する
            janken_num++;
            
            // Randomクラスのインスタンスを初期化
            Random cpu = new Random();
            
            // 整数型変換を宣言し、nextIntメソッドを使用して0以上3未満の乱数を取得
            int cpuInput = cpu.nextInt(3);
            
            // ランダムな数字に応じてcpuの手を出力
            System.out.println(cpuHand[cpuInput]);
		 
            
            // if文を記述
            if (input == 0 && cpuInput == 0 || input == 1 && cpuInput == 1 || input == 2 && cpuInput == 2) {
            	
            	// あいこの場合に出力
            	System.out.println("DRAW あいこ もう一回しましょう！");
            	
            } else if (input == 0 && cpuInput == 2) {
            	
            	// 自身の手が "グー"、相手の手が "パー"の場合に出力
            	System.out.println("俺の勝ち！");
            	System.out.println("なんで負けたか、明日まで考えといてください。");
            	System.out.println("そしたら何かが見えてくるはずです");
            	
            } else if (input == 1 && cpuInput == 0) {
            	
            	// 自身の手が "チョキ"、相手の手が "グー"の場合に出力
            	System.out.println("俺の勝ち！");
            	System.out.println("負けは次につながるチャンスです！");
            	System.out.println("ネバーギブアップ！");
            	
            } else if (input == 2 && cpuInput == 1) {
            	
            	// 自身の手が "パー"、相手の手が "チョキ"の場合に出力
            	System.out.println("俺の勝ち！");
            	System.out.println("たかがじゃんけん、そう思ってないですか？");
            	System.out.println("それやったら次も、俺が勝ちますよ");
            	
            } else {
            	
            	// じゃんけんに勝った場合に出力
            	System.out.println("やるやん。");
            	System.out.println("次は俺にリベンジさせて" + "\n");
            	
            	// じゃんけんの勝利判定の変数の値を+1
            	win_num++;
            }
            
		 }

		 // 勝つまでにかかった合計回数を出力
		 System.out.println("勝つまでにかかった合計回数は" + janken_num + "回です");
        
	}

}

