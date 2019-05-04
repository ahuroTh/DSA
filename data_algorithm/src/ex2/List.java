package ex2;

public class List {

	static List head; // 先頭セルを格納する変数
	List next; // セルのポインタ部
	int data; // セルのデータ部

	// 新しいセルの挿入（挿入位置はセル p の直後）
	static void insert_cell(List p, int d) {
		List new_cell = new List();
		new_cell.data = d;
		new_cell.next = p.next;
		p.next = new_cell;
	}

	// 新しいセルの挿入（挿入位置はリストの先頭）
	static void insert_cell_top(int d) {
		List new_cell = new List();
		new_cell.data = d;
		new_cell.next = head;
		head = new_cell;
	}

	// セルの削除（削除されるのはセル p の直後のセル）
	static void delete_cell(List p) {
		if (p.next == null) { // 直後のセルが存在しない場合
			return;
		} else {
			//List q = new List();
			//q = p.next;
			p.next = p.next.next;
		}
	}

	// セルの削除（削除されるのはリストの先頭セル）
	static void delete_cell_top() {
		List q = new List();
		q = head;
		head = q.next;
	}

	// リストの要素の表示
	static void display() {
		List pos = head;
		while (true) {
			System.out.print(pos.data + "-->");
			if (pos.next == null) {
				System.out.println("null");
				break;
			}
			pos = pos.next;
		}
	}

	// main メソッド
	public static void main(String[] args) {

		insert_cell_top(1);//セルをリストの先頭に挿入
		display();
		insert_cell(head, 3);//セルをリストの指定した位置に挿入
		display();
		insert_cell(head, 2);//セルをリストの指定した位置に挿入
		display();

		delete_cell(head);//指定したセルの直後を削除
		display();

		delete_cell_top();//先頭のセルを削除
		display();
	}
}
