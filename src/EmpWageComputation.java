
public class EmpWageComputation {
	public static void main(String[] args) {

		int wagePerHour = 20;
		int fullTimeHour = 8;
		int partTimeHour = 4;
		int workingDaysOfMonth = 0;
		int totalHour = 0;
		int totalDailyWage = 0;

		System.out.println("***Welcome to Employee Wage Computation Program***\n");

		while (totalHour < 80 && workingDaysOfMonth < 20) {
			int check = (int) ((Math.random() * 10) % 3);

			workingDaysOfMonth++;

			switch (check) {
			case 1:
				totalHour = totalHour + fullTimeHour;
				totalDailyWage = totalDailyWage + fullTimeHour * wagePerHour;
				System.out.println("Employee is present full time: " + totalDailyWage);
				break;
			case 2:
				totalHour = totalHour + partTimeHour;
				totalDailyWage = totalDailyWage + partTimeHour * wagePerHour;
				System.out.println("Employee is present half time: " + totalDailyWage);
				break;
			default:
				System.out.println();
				System.out.println("Employee is absent: " + totalDailyWage);
			}
			System.out.println();
			System.out.println("Working Days is: " + workingDaysOfMonth + " Hours: " + totalHour);
		}
		System.out.println();
		System.out.println("Employee total wage for month is: " + totalDailyWage);
	}
}
