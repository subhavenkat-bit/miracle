
public class Main {
	public static void main(String[] args) {
Bank bank =new Bank("Indian Overseas Bank");
bank.addBranch("Adayar");
bank.addCustomer("Adayar","Subha",11000.0);
bank.addCustomer("Adayar", "Ponni",20000.00);
bank.addCustomer("Adayar", "Ajay",15000.00);
bank.addBranch("Thambaram");
bank.addCustomer("Thambaram", "kavi", 5000.00);
bank.addCustomerTransaction("Adayar", "Subha", 30000.00);
bank.addCustomerTransaction("Adayar", "Subha", 35000.00);
bank.addCustomerTransaction("Adayar", "Ponni", 15000.00);
bank.listCustomers("Thambaram", true);
bank.listCustomers("Adayar", false);
bank.listCustomers("Adayar", true);
if(!bank.addBranch("Adayar")) {
	System.out.println("This branch already exist");
}
if(!bank.addCustomerTransaction("Adayar", "Devi", 5000.00))
		{
	System.out.println("Customer doesn't exist");
		}
if(!bank.addCustomer("Tenkasi", "Tamil", 500.00))
		{
	System.out.println("Branch doesn't exist");
		}
}
	}
