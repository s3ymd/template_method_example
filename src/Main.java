

import java.util.LinkedList;
import java.util.List;

// メールを表すクラス
abstract class Mail {
	protected String title;
	protected List<String> body = new LinkedList<>();
	protected String sender;

	public void setTitle(String title) {
		this.title = title;
	}
	public void addBody(String line) {
		body.add(line);
	}
	public void setSender(String sender) {
		this.sender = sender;
	}

	// タイトルを出力する処理（サブクラスで実装）
	protected abstract void printTitle();
	// 本文を出力する処理（サブクラスで実装）
	protected abstract void printBody();
	// 送信者を出力する処理（サブクラスで実装）
	protected abstract void printSender();

	// テンプレートメソッド
	public void print() {
		printTitle();
		printBody();
		printSender();
	}
}

class PlainTextMail extends Mail {

}
class HTMLMail extends Mail {

}

public class Main {
	public static void main(String[] args) {
		Mail mail = new PlainTextMail();
		mail.setTitle("新春セールのお知らせ");
		mail.addBody("今年も1年よろしくお願いします！の気持ちを込めて、お得な初売りセール情報をお届けします！");
		mail.addBody("ウルトラハイエンドゲームパソコン　特価　100,000円");
		mail.addBody("スリムノートパソコン　特価　40,000円");
		mail.addBody("27インチモニタ　特価　10,000円");
		mail.addBody("SO-DIMM PC3200 32GB 2枚組　特価　5,000円");
		mail.addBody("ぜひお越しください！");
		mail.setSender("ドスパラ秋葉原店 店長 山田太郎");
	}
}
