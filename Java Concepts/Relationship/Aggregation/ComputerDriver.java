class Computer
{
	String type;
	int storageCapacity;
	Cpu cpu ;
	Keyboard keyboard;
	Mouse mouse;
	Monitor monitor;

	Computer(String type,int storageCapacity,Cpu cpu)
	{
		this.type = type;
		this.storageCapacity = storageCapacity;
		this.cpu = cpu;
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.monitor = monitor;
	}
	public void dispalyComputer()
	{
		System.out.println();
		System.out.println(" **** Computer Details **** ");
		System.out.println(" type : "+this. type);
		System.out.println(" Storage Capacity :" +this.storageCapacity+ "GB");
		System.out.println();
	}
	public void createInstanceOfKeyboard(String type,int noOfKeys)
	{
     this.keyboard = new Keyboard(type,noOfKeys);
	}
	public void createInstanceOfMouse(String brand,String type,boolean scroll,int button)
	{
		this.mouse = new Mouse(brand,type,scroll,button);
	}
	public void createInstanceOfMonitor(String displayType,double size,String resolution)
	{
		this.monitor = new Monitor(displayType,size,resolution);
	}

}
class Cpu
{
	int ram;
	int rom;
	String processor;

	Cpu(int ram,int rom,String processor)
	 {  
	 	this.ram = ram;
	 	this.rom = rom;
	 	this.processor = processor;
	 }
	 public void dispalyCpu()
	 {
	 	System.out.println();
	 	System.out.println("**** CPU Details ****");
	 	System.out.println("Ram :"+this.ram);
	 	System.out.println("Rom :"+this.rom);
	 	System.out.println("Processor :"+this.processor);
	 	System.out.println();
	 }
}
class Keyboard
{
	String type;
	int noOfKeys;

	Keyboard(String type,int noOfKeys)
	{
		this.type = type;
		this.noOfKeys =  noOfKeys;
	}
	public void displayKeyboard()
	{
		System.out.println();
		System.out.println(" **** Keyboard Details ****");
		System.out.println("Type :"+this.type);
		System.out.println("Number of keys :"+this.noOfKeys);
		System.out.println();
	}

}
class Mouse 
{
	String brand;
	String type;
	boolean scroll;
	int button;

	Mouse(String brand,String type,boolean scroll,int button)
	{
		this.brand = brand;
		this.type = type;
		this.scroll = scroll;
		this.button = button;
	}
	public void displayMouse()
	{
		System.out.println();
		System.out.println(" **** Mouse Details **** ");
		System.out.println("Brand :"+this.brand);
		System.out.println("Type :"+this.type);
		System.out.println("Scroll :"+this.scroll);
		System.out.println(" Button :"+this.button);
		System.out.println();
	}
}
class Monitor
{
	String displayType;
	double size;
	String resolution;

	Monitor(String displayType,double size,String resolution)
	{
		this.displayType = displayType;
		this.size = size;
		this.resolution = resolution;
	}
	public void displayMonitor()
	{
		System.out.println();
		System.out.println(" **** Monitor Details **** ");
		System.out.println(" Display type :"+ this.displayType);
		System.out.println(" Size :"+this.size);
		System.out.println(" resolution :"+this.resolution);
		System.out.println();
	}
}
class ComputerDriver
{
	public static void main(String[] args) 
	{
		Computer obj = new Computer("Supercomputers" , 500, (new Cpu (8,8 , "Intel core")));
		obj.dispalyComputer();
		obj.cpu.dispalyCpu();
		obj.createInstanceOfMouse("Dell MS116","wireless",true,3);
		obj.mouse.displayMouse();
		obj.createInstanceOfMonitor("CRT",21,"1920*1080");
		obj.monitor.displayMonitor();
		obj.createInstanceOfKeyboard("Membrane",104);
		obj.keyboard.displayKeyboard();
	}
}