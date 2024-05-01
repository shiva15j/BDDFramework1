package abstractiondemo;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Carimpl();

		cc.acceerator();
		cc.breaks();
		cc.clutch();
		cc.price();

		System.out.println(" ");

		SuperCar sc = new Superimpl();
		sc.speed();
		sc.headlight();

		System.out.println(" ");

		Superimpl sd = new Superimpl();
		sd.acceerator();
		sd.breaks();
		sd.clutch();
		sd.speed();
		sd.headlight();
		sd.seat();
		sd.wheels();

	}

}
