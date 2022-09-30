
import java.util.ArrayList;

public class Practical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder account1 = new AccountHolder();
		AccountHolder account2 = new AccountHolder();
		AccountHolder account3 = new AccountHolder();
		AccountHolder account4 = new AccountHolder();
		AccountHolder account5 = new AccountHolder();
		
		account1.setAge(22);
		account1.setName("Almas");
		account1.setSalary(20000);
		account1.setExperience(2);
		account1.setCitizenship("Indian");
		
		account2.setAge(19);
		account2.setName("Keval");
		account2.setSalary(19000);
		account2.setExperience(1);
		account2.setCitizenship("Indian");
		
		account3.setAge(21);
		account3.setName("Shashank");
		account3.setSalary(15000);
		account3.setExperience(1);
		account3.setCitizenship("Nepalian");
		
		account4.setAge(15);
		account4.setName("Nitant");
		account4.setSalary(28000);
		account4.setExperience(2);
		account4.setCitizenship("American");
		
		account5.setAge(22);
		account5.setName("Shivang");
		account5.setSalary(20000);
		account5.setExperience(3);
		account5.setCitizenship("Indian");

		ArrayList<AccountHolder> accountHolders = new ArrayList<AccountHolder>();
		accountHolders.add(account1);
		accountHolders.add(account2);
		accountHolders.add(account3);
		accountHolders.add(account4);
		accountHolders.add(account5);
		
		for (AccountHolder a : accountHolders) {
			if ((a.getAge() >= 21 && a.getAge() <= 60) && a.getSalary() >= 15000 && a.getExperience() >= 1 && a.getCitizenship().equals("Indian")) {
				System.out.println("Eligible for Loan : \n"+a);
			}
		}
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
	}

}