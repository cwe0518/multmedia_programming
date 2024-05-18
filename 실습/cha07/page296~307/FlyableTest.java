package cha07_exercise;

interface Flyable {
	void speed();

	void height();
}

public class FlyableTest {

	public static void main(String[] args) {
		Flyable f = new Flyable() {
			public void speed() {
				System.out.println("�ӵ�");
			}

			public void height() {
				System.out.println("����");
			}
		};

		f.speed();
		f.height();

	}

}
