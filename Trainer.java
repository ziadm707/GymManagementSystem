
public class Trainer extends Person {
	private double salary ;  
	
	   

	public Trainer(String id, String name, String phone, String address, double salary) {
		super(id, name, phone, address);
		this.salary = salary;
	}


	
	
	public double getSalary() {
		return salary;
	}
	
	
	
	  





	public String displayTrainerData() {
		return displayPersonData() + "	salary" + salary;
	}




	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	
}
