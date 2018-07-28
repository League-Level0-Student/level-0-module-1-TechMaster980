
public class badger {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(" badger,");
			if (i == 9) {
				for (int i1 = 0; i1 < 2; i1++) {
					System.out.print(" mushroom,");
				}
			}
			for (int i1 = 0; i1 < 3; i1++) {
				System.out.print(" snake, ");
			}
		}
	}
}
