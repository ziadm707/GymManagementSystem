
public class Employee extends Person {

	public Employee(String id, String name, String phone, String address) {
		super(id, name, phone, address);
		// TODO Auto-generated constructor stub
	}
	
	public String displayEmployeeData() {
		return displayPersonData() ;
	}

}
