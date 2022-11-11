
public class EmpWageComputation {
	public static void main(String[] args) {

		int wagePerHour = 20;
		int fullTimeHour = 8;
		int partTimeHour = 4;
		int workingDaysOfMonth = 20;

		System.out.println("***Welcome to Employee Wage Computation Program***\n");

		int check = (int) ((Math.random() * 10) % 3);

		int dailyWage = wagePerHour * fullTimeHour;
		int partTimeWage = wagePerHour * (fullTimeHour + partTimeHour);
		int wageForMonth = dailyWage * workingDaysOfMonth;

		switch (check) {
		case 1:
			System.out.println("Employee is Present");
			System.out.println("Daily wage of employee = " + dailyWage);
			System.out.println("Employee present full month and full month wage of employee = " + wageForMonth);
			break;
		case 2:
			System.out.println("Employee is Present on Part-Time");
			System.out.println("Part-Time wage os Employee = " + partTimeWage);
			System.out.println("Employee present full month part-time and total vage of employee = "
					+ (partTimeWage * workingDaysOfMonth));
			break;
		default:
			System.out.println("Employee is Absent");
		}
	}
}
