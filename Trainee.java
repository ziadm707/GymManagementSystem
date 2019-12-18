
public class Trainee extends Person{
    private double hight;
    private double weight;
    private Payments payments;
    public Trainee(double hight, double weight,  String ID, String name, String phone, String address) {
        super(ID, name, phone, address);
        this.hight = hight;
        this.weight = weight;
       

    }
        public double getHight() {
            return hight;
        }

       
        public double getWeight() {
            return weight;
        }

    public void Edit_Hight(double hight){
        this.hight = hight;
    }

    public void Edit_Weight(double Weight){
        this.weight = Weight;
    }
	public String displayTraineeData() {
		return displayPersonData() + "	hight" + hight + "	weight"+weight;
	}

    }

