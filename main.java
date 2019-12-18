import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// -----------------------------------
		Scanner sc = new Scanner(System.in);
		Gym gym = new Gym();
		String trainer_id, trainer_name, trainer_phone, trainer_address, trainer_deleted_ID;
		String trainee_id, trainee_name, trainee_phone, trainee_address, trainee_deleted_ID;
		String employee_id, employee_name, employee_phone, employee_address, employee_deleted_ID ;
		String street_name,  building_num,  level,  region_name,  governorate_name;
		double salary;
		double trainee_hight;
		double trainee_weight;
		// ---------------------------------
		while (true) {
			chooseOption();
			int x, y;
			x = sc.nextInt();
			Partition(x);
			y = sc.nextInt();

			if (x == 1) {

				switch (y) {
				case 1:
					System.out.println("Enter ID");
					trainer_id = sc.next();
					System.out.println("Enter Name");
					trainer_name = sc.next();
					System.out.println("Enter Phone");
					trainer_phone = sc.next();
					System.out.println("Enter Addess");
					trainer_address = sc.next();
					System.out.println("Enter Salary");
					salary = sc.nextDouble();
					gym.addTrainer(trainer_id, trainer_name, trainer_phone, trainer_address, salary);

					break;

				case 2:

					System.out.println("Enter Name you want to search");
					trainer_name = sc.next();
					gym.searchTrainer(trainer_name);
					break;

				case 3:
					System.out.println("Enter ID you want to delete");
					trainer_deleted_ID = sc.next();
					gym.searchTrainer(trainer_deleted_ID);

					break;

				case 4:

					break;

				default:
					System.out.println("Invalid Input");
					break;
				}

			} else if (x == 2) {
				switch (y) {
				case 1:
					System.out.println("Enter ID");
					trainee_id = sc.next();
					System.out.println("Enter Name");
					trainer_name = sc.next();
					System.out.println("Enter Phone");
					trainee_phone = sc.next();
					System.out.println("Enter Addess");
					trainee_address = sc.next();
					System.out.println("Enter Hight");
					trainee_hight= sc.nextDouble();
					System.out.println("Enter Weight");
					trainee_weight = sc.nextDouble();
					
					
					gym.addTrainee(trainee_hight, trainee_weight , null, trainee_id, trainer_name, trainee_phone, trainee_address);
					
					break;

				case 2:

					System.out.println("Enter Name you want to search");
					trainer_name = sc.next();
					gym.searchTrainer(trainer_name);
					break;

				case 3:
					System.out.println("Enter ID you want to delete");
					trainee_deleted_ID = sc.next();
					gym.searchTrainer(trainee_deleted_ID);

					break;

				case 4:

					break;

				default:
					System.out.println("Invalid Input");
					break;
				}
			}
				else if (x == 3) { switch (y) {
				case 1:
					System.out.println("Enter ID");
					employee_id = sc.next();
					System.out.println("Enter Name");
					employee_name = sc.next();
					System.out.println("Enter Phone");
					employee_phone = sc.next();
					System.out.println("Enter Addess");
					employee_address = sc.next();
					gym.addEmpolyee(employee_id, employee_name, employee_phone, employee_address);

					break;

				case 2:

					System.out.println("Enter Name you want to search");
					employee_deleted_ID = sc.next();
					gym.searchTrainer(employee_deleted_ID);
					break;

				case 3:
					System.out.println("Enter ID you want to delete");
					employee_id = sc.next();
					gym.searchTrainer(employee_id);

					break;

				case 4:

					break;

				default:
					System.out.println("Invalid Input");
					break;
				}
				}
				else if (x == 4) { switch (y) {
				case 1:
					System.out.println("Enter Street name ");
					street_name = sc.next();
					System.out.println("Enter Buildind number ");
					building_num= sc.next();
					System.out.println("Enter Level ");
					level = sc.next();
					System.out.println("Enter Region name ");
					region_name = sc.next();
					System.out.println("Enter governorat name ");
					governorate_name = sc.next();
					
					
					Address address =new Address(street_name, building_num, level, region_name, governorate_name);
					
					gym.addBranch(address);

					break;

				case 2:

					System.out.println("Enter Name you want to search");
					employee_name = sc.next();
					gym.searchTrainer(employee_name);
					break;

				
				case 3:

					break;

				default:
					System.out.println("Invalid Input");
					break;
				}
				}

			}
			
		
//		String 

//		gym1.addTrainer("500", "ahmed mohamed", "010", "add", 12231111);
//		
//		/*
//		gym1.searchTrainer("ahmed");
//		
//		gym1.deleteTrainer("3");
//		gym1.searchTrainer("ahmed");
//		*/

	}

	public static void chooseOption() {
		System.out.println("_______________________");
		System.out.println("Choose the partition   ");
		System.out.println("-----------------------");
		System.out.println("1 - Trainer Partition  ");
		System.out.println("2 - Trainee Partition  ");
		System.out.println("3 - Employee Partition ");
		System.out.println("4 - Branches Partition ");
		System.out.println("-----------------------");
		System.out.print(">>>");

	}

	public static void Partition(int p) {
		switch (p) {
		case 1:
			System.out.println("-----------------------");
			System.out.println("1 - Add trainer    ");
			System.out.println("2 - Search trainer ");
			System.out.println("3 - Delete trainer ");
			System.out.println("4 - Back ");
			System.out.println("-----------------------");
			System.out.print(">>>");

			break;

		case 2:
			System.out.println("-----------------------");
			System.out.println("1 - Add trainee    ");
			System.out.println("2 - Search trainee ");
			System.out.println("3 - Delete trainee ");
			System.out.println("4 - Back ");
			System.out.println("-----------------------");
			System.out.print(">>>");
			break;

		case 3:
			System.out.println("-----------------------");
			System.out.println("1 - Add employee    ");
			System.out.println("2 - Search employee ");
			System.out.println("3 - Delete employee ");
			System.out.println("4 - Back ");
			System.out.println("-----------------------");
			System.out.print(">>>");
			break;

		case 4:
			System.out.println("-----------------------");
			System.out.println("1 - Add branch    ");
			System.out.println("2 - Delete trainer ");
			System.out.println("3 - Back ");
			System.out.println("-----------------------");
			System.out.print(">>>");
			break;

		default:
			System.out.println("dddd");
			break;
		}

	}

}
