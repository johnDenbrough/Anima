package basic;

public class Dice {
	public static int d100a() {
		int dado = (int) (Math.random() * 100 + 1);
		int tirada = dado;
		if (dado >= 90) {
			// System.out.print("Abierta! "+tirada);
			int abierta = 90;

			while (dado >= abierta || dado == 100) {
				abierta++;
				dado = (int) (Math.random() * 100 + 1);
				tirada += dado;
			}
		}
		return tirada;
	}

	public static int d100() {
		int dado = (int) (Math.random() * 100 + 1);

		return dado;
	}
	
	public static int d10() {
		int dado = (int) (Math.random() * 10 + 1);

		return dado;
	}

	public static int d6() {
		int dado = (int) (Math.random() * 6 + 1);
		return dado;
	}
	
	public static int d3() {
		int dado = (int) (Math.random() * 3 + 1);
		return dado;
	}
}
