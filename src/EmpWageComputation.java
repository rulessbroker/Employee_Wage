
public class EmpWageComputation {
	public static void main(String[] args) {

		int wagePerHour = 20;
		int fullTimeHour = 8;

		System.out.println("***Welcome to Employee Wage Computation Program***\n");

		int check = (int) ((Math.random() * 10) % 2);

		if (check == 1) {
			System.out.println("Employee is Present");
			int dailyWage = wagePerHour * fullTimeHour;
			System.out.println("Daily wage of employee = " + dailyWage);
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
