
public class EmpWageBuilderObject {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private int noOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderObject() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		companyEmpWageArray[noOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
				maxHrsPerMonth);
		noOfCompany++;
	}

	private void computeEmpWage() {
		for (int i = 0; i < noOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		}

	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, countPresent = 0, countPartTime = 0, countAbsent = 0;

		while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays) {

			totalWorkingDays++;

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				countPartTime++;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				countPresent++;
				break;
			default:
				empHrs = 0;
				countAbsent++;
				break;
			}
			totalEmpHrs += empHrs;

		}
		System.out.println("Employee Present Days: " + countPresent);
		System.out.println("Employee PartTime Days: " + countPartTime);
		System.out.println("Employee Absent Days: " + countAbsent);
		int TotalWage = totalEmpHrs * companyEmpWage.empRatePerHour;

		System.out.println("Totalwage for  " + companyEmpWage.company + " is " + TotalWage);
		System.out.println("---------------------------------------------------------------");

		return (totalEmpHrs * companyEmpWage.empRatePerHour);

	}

	public static void main(String[] args) {
		EmpWageBuilderObject empWageBuilder = new EmpWageBuilderObject();
		empWageBuilder.addCompanyEmpWage("Ferrari", 80, 15, 100);
		empWageBuilder.addCompanyEmpWage("Roll-Royals", 100, 20, 120);
		empWageBuilder.addCompanyEmpWage("Chervolet", 90, 18, 90);
		empWageBuilder.computeEmpWage();

	}
}
