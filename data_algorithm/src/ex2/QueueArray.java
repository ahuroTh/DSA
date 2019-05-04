package ex2;

public class QueueArray {
	int length; //
	int front;//取り出し口
	int rear;//入り口
	int[] queue;

	// 指定された長さの配列を生成するコンストラクタ
	QueueArray(int len) {
		front = 0;
		rear = 0;
		length = len;
		queue = new int[len];
	}

	// データのエンキュー、キューに整数を格納
	void enqueue(int val) {
		if (rear > queue.length - 1) {
			System.out.println("queue overflow");
		} else {
			rear = val;
			rear = rear + 1;
		}
	}

	// データのデキュー、キューから整数を取り出す
	int dequeue() {
		if (front == rear) {//一つも格納されていない
			System.out.println("queue overflow");
		}
		front = front + 1;
		return queue[front - 1];
	}

	// キューの要素の表示、順に出力
	void display() {
		for (int i = 0; i < queue.length; i++) {
			System.out.println(queue[i]);
		}
	}

	// main メソッド
	public static void main(String[] args) {
		QueueArray queue = new QueueArray(10);

		queue.enqueue(1);//１を追加
		queue.enqueue(2);//２を追加
		queue.display();//１、２を表示

		System.out.println(queue.dequeue());//１を削除
		System.out.println(queue.dequeue());//２を削除
	}
}