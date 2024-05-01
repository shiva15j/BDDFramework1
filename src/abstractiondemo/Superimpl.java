package abstractiondemo;

public class Superimpl extends Car implements SuperCar, Racingcar {

	@Override
	public void speed() {
		System.out.println("The Speed of the Supercar is = 300 km/h");

	}

	@Override
	public void headlight() {
		System.out.println("The Headlight of the Supercar is = 4");

	}

	@Override
	public void wheels() {
		System.out.println("The Racing car has alloy wheels");

	}

	@Override
	public void seat() {
		System.out.println("The Racing car has 2 seat");

	}

	@Override
	public void breaks() {
		System.out.println("Car has break");

	}

	@Override
	public void acceerator() {
		System.out.println("Car has accelerator");

	}

	@Override
	public void clutch() {
		System.out.println("Car has clutch");

	}

}
