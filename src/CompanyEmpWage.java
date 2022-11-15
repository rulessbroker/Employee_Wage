
public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHrsPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDay, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDay;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}

	@Override
	public String toString() {
		return "Total wage for company " + company + " is " + totalEmpWage;
	}

	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

}
