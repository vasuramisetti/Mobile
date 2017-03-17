//Method to get access Model property of Object


//Encapsulation 


public class Mobile {
	
	private String Manufacturer;
	private String operating_System;
	public String model;
	private int cost;
	
	
	public String getManufacturer() {
		return this.Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getOperating_System() {
		return this.operating_System;
	}
	public void setOperating_System(String operating_System) {
		this.operating_System = operating_System;
	}
	
	public int getCost() {
		return this.cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
	
	
	public Mobile(String manufacturer, String operating_System, String model, int cost) {
		Manufacturer = manufacturer;
		this.operating_System = operating_System;
		this.model = model;
		this.cost = cost;
	}
	
	
	
	
	
	public static void main(String[] args){
		
		
	Mobile details = new Mobile("Apple","IOS","6S",800);
	
	System.out.println("Cost In dollars:"+ " " +details.getCost());
	
	System.out.println("Model Is:"+ " " +details.model);
		
	}
	
	
	

}
