package day5;

//Final class can not be inherited
public final class PCat {

	// You can not change the definition of a final variable
	final String color = "red";

	public void Color() {

		// color = "black";

		System.out.println("Cat has color " + color);

	}

	// You can not override a final method
	public final void Height() {
		System.out.println("Cat has height 154 cm");
	}

	public void eyes() {
		System.out.println("Cat has 2 eyes");
	}

}
