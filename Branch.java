import java.util.*; 
public class Branch {
	private String name;
	private ArrayList<Customer> customers;
	public Branch(String name) {
		this.name=name;
		this.customers=new ArrayList<Customer>();
	}
	public String getName() {
		return name;
	}
	public ArrayList<Customer> getCustomers(){
		return customers;
	}
	public boolean newCustomer(String customername,double initialamount) {
		if(findCustomer(customername)==null) {
			this.customers.add(new Customer(customername,initialamount));
		return true;
		}
		return false;
	}
	public boolean addCustomerTransaction(String customername,double amount)
	{
		Customer existingCustomer=findCustomer(customername);
		if(existingCustomer!=null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;
	}
	private Customer findCustomer(String customername) {
		for(int i=0;i<this.customers.size();i++) {
			Customer checkedCustomer=this.customers.get(i);
			if(checkedCustomer.getName().equals(customername)) {
				return checkedCustomer;
			}
		}
		return null;
	}
	
}
