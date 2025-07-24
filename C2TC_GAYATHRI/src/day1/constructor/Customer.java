package day1.constructor;


public class Customer{
	private int id;
	private String name;
	private String city;
	//default constructor
	public Customer() {
		this.id = 101;
		this.name = "gayathri";
		this.city = "pondy";
		
	}
	public Customer (int id,String name,String city) {
		this.id = id;
		this.name = name;
		this.city = city;
		
	}
	public int getId() {
		return id;
		
	}

}
