/*
 * プログラム名：書籍管理システムWeb版Ver.2.0
 * プログラムの説明：書籍の管理を行なうプログラム。
 * 					登録した書籍の一覧、新規書籍の登録、書籍詳細確認、書籍データの削除
 * 					登録書籍のデータの変更、書籍の検索機能を持っている。
 *					Ver.1.0から書籍の購入、購入確認のメール送信、購入状況の確認機能を追加
 * 作成者：南里悠介
 * 作成日付：2022年06月06日
 */

package bean;

public class Book {
	//書籍情報を管理するフィールド変数
	private String isbn;
	private String title;
	private int price;

	public Book() {//コンストラクタ
		isbn = null;
		title = null;
		price = 0;
	}
	//これ以降各フィールド変数のアクセサメソッド

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public String getTitle() {
		return this.title;
	}

	public int getPrice() {
		return this.price;
	}

}
