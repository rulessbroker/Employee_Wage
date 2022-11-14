
public class EmpWageBuilderObject {

	private static String company;
	private static int wagePerHours;
	private static int workingHours;
	private static int workingDays;

	EmpWageBuilderObject(String company, int workingHours, int workingDays, int wagePerHours) {
		this.company = company;
		this.workingHours = workingHours;
		this.workingDays = workingDays;
		this.wagePerHours = wagePerHours;
	}

	public static void wageComputation() {

		int fullTimeHours = 8;
		int partTimeHours = 4;
		int presentDay = 0;
		int absentDay = 0;
		int partTimeDay = 0;
		int workingDaysOfMonth = 0;
		int totalHour = 0;
		int totalDailyWage = 0;

		while (totalHour < workingHours && workingDaysOfMonth < workingDays) {

			int check = (int) ((Math.random() * 10) % 3);

			workingDaysOfMonth++;

			switch (check) {
			case 1:
				totalHour = totalHour + fullTimeHours;
				totalDailyWage = totalDailyWage + fullTimeHours * wagePerHours;
				presentDay++;

				break;
			case 2:
				totalHour = totalHour + partTimeHours;
				totalDailyWage = totalDailyWage + partTimeHours * wagePerHours;
				partTimeDay++;
				break;
			default:
				absentDay++;
			}

		}
		System.out.println("Employee Present Days: " + presentDay);
		System.out.println("Employee PartTime Days: " + partTimeDay);
		System.out.println("Employee Absent Days: " + absentDay);
		System.out.println("In Company of " + company + " Employees Working Day is: " + workingDaysOfMonth + " Hours: "
				+ totalHour);
		System.out.println("Employee total wage for month is: " + totalDailyWage
				+ "\n -----------------------------------------------------------------------------");

	}

	@Override
	public String toString() {
		return "EmpWageComputation [company=" + company + ", wagePerHours=" + wagePerHours + ", workingHours="
				+ workingHours + ", workingDays=" + workingDays + "]";
	}

	public static void main(String[] args) {

		System.out.println("***Welcome to Employee Wage Computation Program***\n");

		EmpWageBuilderObject ferrari = new EmpWageBuilderObject("Ferrari", 100, 20, 20);

		EmpWageBuilderObject bugati = new EmpWageBuilderObject("Bugati", 80, 18, 25);

		ferrari.wageComputation();

		bugati.wageComputation();

	}
}
