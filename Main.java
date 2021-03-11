package kz.aitu.oop.assignment_add;

public class Main {

    public static void main(String[] args) {
		Builder houseBuilder = new Builder();
		Director director = new Director(houseBuilder);
		director.Mansion();
		House newHouse = houseBuilder.getProduct();
		System.out.println("Your house consists of");
		System.out.println("Floor: " + isAvailable(newHouse.isFloor()));
		System.out.println("Pool: " + isAvailable(newHouse.isPool()));
		System.out.println("Windows: " + isAvailable(newHouse.isWindows()));
		System.out.println("Garden: " + isAvailable(newHouse.isGarden()));
		System.out.println("Garage: " + isAvailable(newHouse.isGarage()));
		director.Brick();
		House AnotherHouse = houseBuilder.getProduct();
		System.out.println("Your house consists of");
		System.out.println("Floor: " + isAvailable(AnotherHouse.isFloor()));
		System.out.println("Pool: " + isAvailable(AnotherHouse.isPool()));
		System.out.println("Windows: " + isAvailable(AnotherHouse.isWindows()));
		System.out.println("Garden: " + isAvailable(AnotherHouse.isGarden()));
		System.out.println("Garage: " + isAvailable(AnotherHouse.isGarage()));
	}

	public static String isAvailable(boolean available) {
		if (available)
			return "Yes";
		else
			return "No";
	}
}
