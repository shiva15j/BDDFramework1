package abstractiondemo;

public class Carimpl extends Car {

	@Override
	public void breaks() {
		System.out.println("Disc break");

	}

	@Override
	public void acceerator() {
		System.out.println("Smooth");

	}

	@Override
	public void clutch() {
		System.out.println("Nice");

	}

}
