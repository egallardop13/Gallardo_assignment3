

public class SavingAccountTest extends SavingAccount {
       public static void main (String[] args) {
	   SavingAccount saver1 = new SavingAccount();
       SavingAccount saver2 = new SavingAccount();
       saver1.setSaving(2000.00);
       saver2.setSaving(3000.00);
       modifyInterestRate(0.04);
       
       
       System.out.printf("   saver1\n");
	   System.out.printf("Month \t Balance\n");
       for(int i = 1; i < 13 ;i++) {  
    	   System.out.printf(" %d \t %.2f\n", i, saver1.calculateMonthlyInterest());
       }
       System.out.printf("\n\n   saver2\n");
	   System.out.printf("Month \t Balance\n");
	   for(int i = 1; i < 13 ;i++) {  
	   System.out.printf(" %d \t %.2f\n", i, saver2.calculateMonthlyInterest());
	   }
	   
       modifyInterestRate(0.05);
       
	   
	   System.out.printf("\n\nThe monthly balance with the new interest for saver1 is %.2f\n", saver1.calculateMonthlyInterest());
	   System.out.printf("The monthly balance with the new interest for saver2 is %.2f\n", saver2.calculateMonthlyInterest());
       
       }

}
