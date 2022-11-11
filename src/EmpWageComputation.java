
public class EmpWageComputation {
	public static void main(String[] args) {

		int wagePerHour = 20;
		int fullTimeHour = 8;
		int partTimeHour = 4;

		System.out.println("***Welcome to Employee Wage Computation Program***\n");

		int check = (int) ((Math.random() * 10) % 3);

		int dailyWage = wagePerHour * fullTimeHour;
		int partTimeWage = wagePerHour * (fullTimeHour + partTimeHour);

		switch (check) {
		case 1:
			System.out.println("Employee is Present");
			System.out.println("Daily wage of employee = " + dailyWage);
			break;
		case 2:
			System.out.println("Employee is Present on Part-Time");
			System.out.println("Part-Time wage os Employee = " + partTimeWage);
			break;
		default:
			System.out.println("Employee is Absent");
		}
	}
}
