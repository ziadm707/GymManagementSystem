
public class Branch {

    private Address address;
    private  String branch_id = "b"  ;
    private static int branches_number ;
    
    

    

    

	public Branch(Address address) {
		 	branches_number++;
	        this.address = address;
	        this.branch_id += branches_number;  
    }
	
	
	public String getBranch_id() {
		return branch_id;
	}



	public Address getAddress() {
		return address;
	}


	public String Display_Branch_Data() {
        return "Adress : " + this.address + "\nBranch Number" + this.branch_id;
    }

}
