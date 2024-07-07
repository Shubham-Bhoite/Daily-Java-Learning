import java.util.*;
class ProgrammingLanguage
{
	String type;
	String level;
	int inventedName;
	String founderName;
	double latestVersion;
	String extension;

	ProgrammingLanguage(String type, String level, int inventedName, String founderName, double latestVersion, String extension)
	{
		super();
		this.type = type;
		this.level = level;
		this.inventedName = inventedName;
		this.founderName = founderName;
		this.latestVersion = latestVersion;
		this.extension = extension;
	}
	public void displayProgrammingLanguage()
	{
		System.out.println("**** ProgrammingLanguage ****");
		System.out.println("Type : " + this.type);
		System.out.println("Level : " + this.level);
		System.out.println("Invented Name : " + this.inventedName);
		System.out.println("Founder Name : " + this.founderName);
		System.out.println("Latest Version : " + this.latestVersion);
		System.out.println("Extension : " + this.extension);
	}
}

class Java extends ProgrammingLanguage{
	String [] features;
	boolean platformIndependent;

	Java(String [] features, boolean platformIndependent,String type, String level, int inventedName, String founderName, double latestVersion, String extension)
	{
		super(type,level, inventedName,founderName,latestVersion, extension);
		this.features = features;
		this.platformIndependent = platformIndependent;
	}

	public void displayJava()
	{
		System.out.println();
		System.out.println("*** JAVA ***");
		System.out.println("Is it is platform Independent : " + this.platformIndependent);
		System.out.println("Feartures of JAVA :" + Arrays.toString(this.features));
	}
}
class SingleLevelInheritance
{
	public static void main(String[] args) {
		String[] features = {"1.Multithreaded","2.Secure & Robust","3.Portable","4.Dynamic(Strong memory management)"};
		Java obj = new Java(features,true,"Object Oriented", "High Level",1991,"James Gosling",21,".java");
		obj.displayProgrammingLanguage();
		obj.displayJava();
	}
}