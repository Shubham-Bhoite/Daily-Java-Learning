class University
{
	String name;
	String unicode;
	long noOfColleges;
	String type;
	int estabilishedYear;
	int courseCount;
	College college ;

	University(String name,String unicode,long noOfColleges,String type,int estabilishedYear,int courseCount)
	{
		this.name = name;
		this.unicode = unicode;
		this.noOfColleges = noOfColleges;
		this.type = type;
		this.estabilishedYear = estabilishedYear;
		this.courseCount = courseCount;
		this.college = college;
	}

	public void displayUniversity()
	{
		System.out.println();
		System.out.println("**** University Details ****");
		System.out.println("Name :"+this.name);
		System.out.println("unicode:"+this.unicode);
		System.out.println(" No of colleges :"+this.noOfColleges);
		System.out.println(" type :"+ this.type);
		System.out.println(" Estabilished year :"+this.estabilishedYear);
		System.out.println("Course count :"+this.courseCount);
		System.out.println();
	}

	public void createInstanceOfCollege(String name,String collegeCode,String address,int noOfDept,char grade,int staffCount)
	{
		this.college = new College(name, collegeCode, address, noOfDept, grade, staffCount);
	}
}
 class College
 {
 	String name;
 	String collegeCode;
 	String address;
 	int noOfDept;
 	char grade;
 	int staffCount;
 	Department department;

 	College(String name,String collegeCode,String address,int noOfDept,char grade,int staffCount)
 	{
 		this.name = name;
 		this.collegeCode = collegeCode;
 		this.address = address;
 		this.noOfDept = noOfDept;
 		this.grade = grade;
 		this.staffCount= staffCount;
 		this.department = department;
 	}

 	public void displayCollege()
 	{
 		System.out.println();
 		System.out.println(" **** College Details **** ");
 		System.out.println(" Name :"+ this.name);
 		System.out.println("College code :"+this.collegeCode);
 		System.out.println("Address :"+this.address);
 		System.out.println("Number of department :"+this.noOfDept);
 		System.out.println("Grade :"+this.grade);
 		System.out.println("Staff count :"+this.staffCount);
 		System.out.println();
 	}
 	public void createInstanceOfDepartment(String name,String hod,int classRoom,int staff,int subject)
 	{
     this.department = new Department(name,hod,classRoom,staff,subject);
 	}

 }
    class Department
    {
    	String name;
    	String hod;
    	int classRoom;
    	int staff;
    	int subject;
    	Teacher teacher;

    	Department(String name,String hod,int classRoom,int staff,int subject)
    	{
    		this.name = name;
    		this.hod = hod;
    		this.classRoom= classRoom;
    		this.staff= staff;
    		this. subject= subject;
    		this.teacher = teacher;
    	}

    	public void displayDepartment()
    	{
    		System.out.println();
    		System.out.println("**** Department Details **** ");
    		System.out.println("Name :"+this.name);
    		System.out.println("HOD :"+this.hod);
    		System.out.println("Class rooms :"+this.classRoom);
    		System.out.println("Staff :"+this.staff);
    		System.out.println("Subjects :"+this.subject);
    		System.out.println();
    	}
    	public void createInstanceOfTeacher(String name,String subject,int phoneNumber,String qualification,double experience)
    	{
    		this.teacher = new Teacher(name,subject,phoneNumber,qualification,experience);
    	}
    }
    class Teacher
    {
    	String name;
    	String subject;
    	int phoneNumber;
    	String qualification;
    	double experience;

    	Teacher(String name,String subject,int phoneNumber,String qualification,double experience)
    	{
    		this.name = name;
    		this.subject = subject;
    		this.phoneNumber = phoneNumber;
    		this.qualification = qualification;
    		this.experience = experience;
    	}

    	public void displayTeacher()
    	{
    		System.out.println();
    		System.out.println("**** Teacher Details **** ");
    		System.out.println("Name :"+this.name);
    		System.out.println("Subject :"+this.subject);
    		System.out.println("Phone Number :"+this.phoneNumber);
    		System.out.println("qualification :"+this.qualification);
    		System.out.println("Experience :"+this.experience+"years");
    		System.out.println();
    	}
    }

    class StudentDriver
    {
    	public static void main(String[] args) 
    	{
    		University obj = new University("SPPU","Spppu123",1000,"Government",1950,400);
    		obj.displayUniversity();
    		obj.createInstanceOfCollege("Parikrama","P123","kashti,nagar",10,'A',110);
    		obj.college.displayCollege();
    		obj.college .createInstanceOfDepartment("computer","Hiranwale",20,43,48);
    		obj.college.department.displayDepartment();
    		obj.college.department.createInstanceOfTeacher("SWATI","Deep learning",1234567890,"Mtech",3.5);
    		obj.college.department.teacher.displayTeacher();

    	}
    }