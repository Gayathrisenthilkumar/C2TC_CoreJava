package ASSIGNMENT3;

class Student {

	public Student() {
		System.out.println("Student object is created");
	}
}

class Commission {
	private String name;
	private String address;
	private String phone;
	private double salesAmount;
	
	//constructor
	/*
	 * public Commission(String name, String address, String phone, double
	 * salesAmount) { super(); this.name = name; this.address = address; this.phone
	 * = phone; this.salesAmount = salesAmount; }
	 */
	
	//Method to accept details of sales employee
	public void acceptDetails(String name, String address, String phone, double salesAmount) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.salesAmount = salesAmount;
	}
	
	//Method to calculate Commission
	public double calCommision() {
		if(salesAmount >= 100000)
			return salesAmount * 0.10; //10%
		else if(salesAmount >= 50000 && salesAmount < 100000)
			return salesAmount * 0.05; //5%
		else if(salesAmount >= 30000 && salesAmount < 50000)
			return salesAmount * 0.03; //3%
		else
			return 0;
	}
}
//main class
class Demo{
	public static void main(String[] args) {
		Student stu = new Student();
		
		//Commission com = new Commission("Rahul", "Chennai", "8756942586", 65000);
		Commission com = new Commission();
		com.acceptDetails("Sham", "Chennai", "5863259", 65000);
		double commision = com.calCommision();
		
		System.out.println("Commision = "+commision);
	}
}