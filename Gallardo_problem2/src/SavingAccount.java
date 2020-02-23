
public class SavingAccount {
private static double annualInterestRate;
private double savingBalance;

  public double calculateMonthlyInterest() {
	  double rate = (getSaving()*annualInterestRate)/12;
	  setSaving(getSaving()+rate);
	  return getSaving();
  }
  public double getSaving() {
	  return savingBalance;
  }
  public void setSaving(double savingBalance) {
	  this.savingBalance = savingBalance;
  }
  public static void modifyInterestRate(double x) {
	  annualInterestRate = x;
  }
}
