import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Gym {
	private final String gym_name = null;
	private LinkedList branch_list;
	private LinkedList trainer_list;
	private LinkedList trainee_list;
	private LinkedList employee_list;

	public Gym() {
		branch_list = new LinkedList();
		trainer_list = new LinkedList();
		trainee_list = new LinkedList();
		employee_list = new LinkedList();

		// read();
		 writeTrainee();
		 writeTrainer();
		/*
		 * 1,ahmed,011500000,nozha,1000 2,ah,011500000,nozha,2000
		 * 3,ahm,011500000,nozha,3000 4,ahmed,011500000,nozha,6000
		 */
	}

	public void writeTrainer() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("trainer.txt");
			for (int i = 0; i < trainer_list.size(); i++) {
				writer.println(((Trainer) trainer_list.get(i)).getId() + "," + ((Trainer) trainer_list.get(i)).getName()
						+ "," + ((Trainer) trainer_list.get(i)).getPhone() + ","
						+ ((Trainer) trainer_list.get(i)).getAddress() + ","
						+ ((Trainer) trainer_list.get(i)).getSalary());
				//System.out.println("en");
			}

			writer.close();
		} catch (FileNotFoundException ex) {

		}
	}

	public void writeTrainee() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("trainee.txt");
			for (int i = 0; i < trainee_list.size(); i++) {
				writer.println(((Trainee) trainee_list.get(i)).getId() 
						+ "," + ((Trainee) trainee_list.get(i)).getName()
						+ "," + ((Trainee) trainee_list.get(i)).getPhone() 
						+ ","+ ((Trainee) trainee_list.get(i)).getAddress() 
						+ ","+ ((Trainee) trainee_list.get(i)).getHight()
						+ ","+ ((Trainee) trainee_list.get(i)).getWeight());
				//System.out.println("en");
			}

			writer.close();
		} catch (FileNotFoundException ex) {

		}
	}

//	public void read() {
//
//		BufferedReader bfr;
//		try {
//			File file = new File("trainer.txt");
//			if (file.exists()) {
//				bfr = new BufferedReader(new FileReader("trainer.txt"));
//				String line = "";
//				String id;
//				String name;
//				String phone;
//				String address;
//				double salary;
//				
//				while (line != null) {
//					line = bfr.readLine();
//					if (line != null) {
//						String[] data = line.split(",");
//						id = data[0];
//						name = data[1];
//						phone = data[2];
//						address = data[3];
//						salary = Double.parseDouble(data[4]);
//						Trainer trainer = new Trainer(id, name, phone, address, salary);
//						trainer_list.add(trainer);
//						System.out.println(id + " " + name + " " + phone + " " + address + " " + salary);
//					}
//				}
//				bfr.close();
//			}
//
//		} catch (IOException e) {

//		}
//	}

//-----------------------------------------------------------------------------------------------------------------	

	public void addTrainer(String id, String name, String phone, String address, double salary) {
		Trainer trainer = new Trainer(id, name, phone, address, salary);
		trainer_list.add(trainer);
		writeTrainer();
	}

	public void searchTrainer(String name) {

		for (int i = 0; i < trainer_list.size(); i++) {
			if (name.equalsIgnoreCase(((Trainer) trainer_list.get(i)).getName())) {
				System.out.println((((Trainer) trainer_list.get(i)).displayTrainerData()));
			}

		}
	}

	public void deleteTrainer(String ID) {
		for (int i = 0; i < trainer_list.size(); i++) {

			if (ID.equalsIgnoreCase(((Trainer) trainer_list.get(i)).getId())) {

				trainer_list.remove(i);
				break;

			}
		}
	}

//----------------------------------------------------------------------------------------------------------------

	public void addTrainee(double hight, double weight, Payments payments, String id, String name, String phone,
			String address) {
		Trainee trainee = new Trainee(hight, weight, id, name, phone, address);
		trainee_list.add(trainee);
		writeTrainee();
	}

	public void searchTrainee(String name) {

		for (int i = 0; i < trainee_list.size(); i++) {
			if (name.equalsIgnoreCase(((Trainee) trainee_list.get(i)).getName())) {
				System.out.println((((Trainee) trainee_list.get(i)).displayTraineeData()));
			}

		}
	}

	public void deleteTrainee(String ID) {
		for (int i = 0; i < trainee_list.size(); i++) {

			if (ID.equalsIgnoreCase(((Trainer) trainee_list.get(i)).getId())) {

				trainee_list.remove(i);
				break;

			}
		}
	}

//-------------------------------------------------------------------------------------------------------------------------------

	public void addEmpolyee(String id, String name, String phone, String address) {
		Employee employee = new Employee(id, name, phone, address);
		employee_list.add(employee);
		write();
	}

	public void searchEmployee(String name) {

		for (int i = 0; i < employee_list.size(); i++) {
			if (name.equalsIgnoreCase(((Employee) employee_list.get(i)).getName())) {
				System.out.println((((Employee) employee_list.get(i)).displayEmployeeData()));
			}

		}
	}

	public void deleteEmployee(String ID) {
		for (int i = 0; i < employee_list.size(); i++) {

			if (ID.equalsIgnoreCase(((Employee) employee_list.get(i)).getId())) {

				employee_list.remove(i);
				break;

			}
		}
	}

//--------------------------------------------------------------------------------------------------------------------------------
	public void addBranch(Address address) {
		Branch branch = new Branch(address);
		branch_list.add(branch);
		write();
	}

	public void deleteBrnach(String ID) {
		for (int i = 0; i < branch_list.size(); i++) {

			if (ID.equalsIgnoreCase(((Branch) branch_list.get(i)).getBranch_id())) {

				branch_list.remove(i);
				break;

			}
		}
	}

}
