class Car{
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	//Engine engine = new Engine(120, 1.2, "Petrol", 16, 4);
	Engine engine1;

	Car(String brand, String model, String type, double price, int seatingCapacity, Engine engine1)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
		this.engine1 = engine1;
	} 	
	public void displayCar()
	{
		System.out.println("***** CAR DETAILS ******");
		System.out.println("Brand :" + this.brand);
		System.out.println("Model :" + this.model);
		System.out.println("Type :" + this.type);
		System.out.println("Price :" + this.price);
		System.out.println("SeatingCapacity :" + this.seatingCapacity);
	}
}

class Engine{
	double horsePower;
	double capacity;
	String engineType;
	double mileage;
	int noOfPistons;


	Engine(double horsePower, double capacity, String engineType, double mileage, int noOfPistons)
	{
	this.horsePower = horsePower;
	this.capacity = capacity;
	this.engineType = engineType;
	this.mileage = mileage;
	this.noOfPistons = noOfPistons;
	}

	public void displayEngine()
	{
	System.out.println();
	System.out.println("***** Engine Details ******");
	System.out.println("Horse Power : " + this.horsePower);
	System.out.println("Capacity : " + this.capacity);
	System.out.println("Engine Type : " + this.engineType);
	System.out.println("Mileage : " + this.mileage);
	System.out.println("No. of Pistons : " + this.noOfPistons);
	}
}

class CarDriver{
	public static void main(String[] args) {
		//Car obj = new Car("TATA", "NEXON", "XUV", 900000, 5);
		Car obj = new Car("NISSAN", "AUDI", "SUV", 700000, 4,(new Engine(150, 1.2, "EV", 18,6)));

		obj.displayCar();
		obj.engine1.displayEngine();
	}
}