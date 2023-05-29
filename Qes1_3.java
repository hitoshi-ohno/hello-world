package curriculum_B;

// java.util.Randomパッケージ利用の宣言。
import java.util.Random;
// java.util.Scannerパッケージ利用の宣言。
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

		
		// Scannerクラスのインスタンスscanを生成。
		Scanner scan = new Scanner(System.in);
		
		// 文字列型変数strを宣言し、初期値を代入して初期化。
		String str = null;
    
		 // while文を記述。
		 while(true) {
			// 整数型変数registを宣言。
			int regist = 0;
		
			// 変数strでnextLineメソッドを使用。
	        str = scan.nextLine();
        
	        // 整数型変数numを宣言し、lengthメソッドを使用して変数strの文字数を取得。
	        int num = str.length();

	        // if文を記述。
	        if (num >= 11) {
	        	// 変数strの文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力。
	        	System.out.println("「名前を10文字以内にしてください」");
	        } else if (str.isEmpty() || str == null) {
	        	// 変数strが0文字以下もしくはnullの場合「名前を入力してください」と出力。
	        	System.out.println("「名前を入力してください」");
	        } else if (str.matches("^[a-zA-Z0-9]+$")){
	        	// 変数strが正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力。
	        	System.out.println("「ユーザー名「 " + str + " 」を登録しました」");
	        	// 変数strが正常な値だった場合、変数registを+1する。
	        	regist += 1;
	        } else {
	        	// 変数strが半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力。
	        	System.out.println("「半角英数字のみで名前を入力してください」");
	        }

	        // if文を記述。
	        if(regist == 1) {
	        	// 変数registが1の場合、処理を終了させる。
	        	break;
	        }
		}
		 
		 
		 // Scannerクラスのインスタンスjankenを生成。
		 Scanner janken = new Scanner(System.in);

		 // 整数型変数janken_numを宣言。
		 int janken_num = 0;
		 
		 // 整数型変数win_numを宣言。
		 int win_num = 0;
		 
		 // 文字列型変数jankenTeを宣言し、初期値を代入して初期化。
		 String jankenTe = null;

		 // while文を記述。
		 while(true) {
			// 処理を繰り返す毎に、変数janken_numを＋1する。
        	janken_num++;
        	
        	// 文字列型変数inputでnextLineメソッドを使用。
            String input = janken.nextLine();
            
            // if文を記述。
            if (input.equals("0")) {
            	// 変数inputが0の場合、変数jankenTeに"グー"を代入。
            	jankenTe = "グー";
            } else if (input.equals("1")) {
            	// 変数inputが1の場合、変数jankenTeに"チョキ"を代入。
            	jankenTe = "チョキ";
            } else if (input.equals("2")) {
            	// 変数inputが2の場合、変数jankenTeに"パー"を代入。
            	jankenTe = "パー";
            } else {
            	// 変数inputが0～2以外の場合、「0～2の数字を入力してください」と出力。
            	System.out.println("「0～2の数字を入力してください」");
            }
            
            // 文字列型変数cpuTeを宣言し、初期値を代入して初期化。
            String cpuTe = null;
            // 文字列型変数jankenCpuを宣言し、初期値を代入して初期化。
            String jankenCpu = null;
            
            // if文を記述。
            if (jankenTe == null) {
            	// 変数jankenTeに値が無い場合、処理を終了。
            	System.exit(-1);
            } else {
            	// 0～2の範囲で、変数cpuTeの値をランダムで代入。
            	cpuTe = String.valueOf(new Random().nextInt(2));
            }

            // if文を記述。
            if (cpuTe.equals("0")) {
            	// ランダムで代入された値が0の場合、変数jankenCpuに"グー"を代入。
            	jankenCpu = "グー";
            } else if (cpuTe.equals("1")) {
            	// ランダムで代入された値が1の場合、変数jankenCpuに"チョキ"を代入。
            	jankenCpu = "チョキ";
            } else if (cpuTe.equals("2")) {
            	// ランダムで代入された値が2の場合、変数jankenCpuに"パー"を代入。
            	jankenCpu = "パー";
            }
            
            // 自身の手を出力。
            System.out.println(str + "の手は「" + jankenTe + "」" );
            // 相手の手を出力。
            System.out.println("相手の手は「" + jankenCpu + "」"  + "\n");

            // 文字列型変数hanteiを宣言し、変数inputと変数cpuTeの値を代入。
            String hantei = input + cpuTe;

            // if文を記述。
            if (hantei.equals("01")) {
            	// 自身の手が "グー"、相手の手が "チョキ"の場合に出力。
            	System.out.println("やるやん。");
            	System.out.println("次は俺にリベンジさせて" + "\n");
            	// 変数win_numを+1。
            	win_num++;
            } else if (hantei.equals("12")) {
            	// 自身の手が "チョキ"、相手の手が "パー"の場合に出力。
            	System.out.println("やるやん。");
            	System.out.println("次は俺にリベンジさせて" + "\n");
            	// 変数win_numを+1。
            	win_num++;
            } else if (hantei.equals("20")) {
            	// 自身の手が "パー"、相手の手が "グー"の場合に出力。
            	System.out.println("やるやん。");
            	System.out.println("次は俺にリベンジさせて" + "\n");
            	// 変数win_numを+1。
            	win_num++;
            } else if (hantei.equals("00")) {
            	// 自身の手が "グー"、相手の手が "グー"の場合に出力。
            	System.out.println("DRAW あいこ もう一回しましょう！");
            } else if (hantei.equals("11")) {
            	// 自身の手が "チョキ"、相手の手が "チョキ"の場合に出力。
            	System.out.println("DRAW あいこ もう一回しましょう！");
            } else if (hantei.equals("22")) {
            	// 自身の手が "パー"、相手の手が "パー"の場合に出力。
            	System.out.println("DRAW あいこ もう一回しましょう！");
            } else if (hantei.equals("02")) {
            	// 自身の手が "グー"、相手の手が "パー"の場合に出力。
            	System.out.println("俺の勝ち！");
            	System.out.println("なんで負けたか、明日まで考えといてください。");
            	System.out.println("そしたら何かが見えてくるはずです");
            } else if (hantei.equals("10")) {
            	// 自身の手が "チョキ"、相手の手が "グー"の場合に出力。
            	System.out.println("俺の勝ち！");
            	System.out.println("負けは次につながるチャンスです！");
            	System.out.println("ネバーギブアップ！");
            } else if (hantei.equals("21")) {
            	// 自身の手が "パー"、相手の手が "チョキ"の場合に出力。
            	System.out.println("俺の勝ち！");
            	System.out.println("たかがじゃんけん、そう思ってないですか？");
            	System.out.println("それやったら次も、俺が勝ちますよ");
            }

            // if文を記述。
            if (win_num == 1) {
            	// 変数win_numが1の場合、処理を終了させる。
            	break;
            }
		 }
		 
		 // 勝つまでにかかった合計回数を出力。
		 System.out.println("勝つまでにかかった合計回数は" + janken_num + "です");
        
	}

}
