
public class EmpWageComputation {
	public static void main(String[] args) {

		System.out.println("***Welcome to Employee Wage Computation Program***\n");

		int check = (int) ((Math.random() * 10) % 2);

		if (check == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
