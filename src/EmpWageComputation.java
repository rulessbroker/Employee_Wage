
public class EmpWageComputation {

	private static final int WAGEPERHOURS = 20;
	private static final int FULLTIMEHOURS = 8;
	private static final int PARTTIMEHOURS = 4;
	static int workingDaysOfMonth = 0;
	static int totalHour = 0;
	static int totalDailyWage = 0;
	static int presentDay = 0;
	static int absentDay = 0;
	static int partTimeDay = 0;

	public static void main(String[] args) {

		System.out.println("***Welcome to Employee Wage Computation Program***\n");

		EmpWageComputation company = new EmpWageComputation();

		EmpWageComputation newCompany = new EmpWageComputation();

		company.wageComputation("Ferrari", 100, 20);

		newCompany.wageComputation("Bugati", 80, 18);

	}

	public void wageComputation(String name, int workingHours, int workingDays) {

		while (totalHour <= workingHours && workingDaysOfMonth < workingDays) {
			int check = (int) ((Math.random() * 10) % 3);

			workingDaysOfMonth++;

			switch (check) {
			case 1:
				totalHour = totalHour + FULLTIMEHOURS;
				totalDailyWage = totalDailyWage + FULLTIMEHOURS * WAGEPERHOURS;
				presentDay++;
				break;
			case 2:
				totalHour = totalHour + PARTTIMEHOURS;
				totalDailyWage = totalDailyWage + PARTTIMEHOURS * WAGEPERHOURS;
				partTimeDay++;
				break;
			default:
				absentDay++;
			}
		}
		System.out.println("Employee Present Days: " + presentDay);
		System.out.println("Employee PartTime Days: " + partTimeDay);
		System.out.println("Employee Absent Days: " + absentDay);
		System.out.println(
				"In Company of " + name + " Employees Working Day is: " + workingDaysOfMonth + " Hours: " + totalHour);
		System.out.println("Employee total wage for month is: " + totalDailyWage
				+ "\n -----------------------------------------------------------------------------");

	}
}
