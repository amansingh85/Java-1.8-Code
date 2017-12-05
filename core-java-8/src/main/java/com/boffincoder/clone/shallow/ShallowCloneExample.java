package com.boffincoder.clone.shallow;


/**
 * 
 * @author Singh, Amandeep 
 * 
 *
 */
public class ShallowCloneExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee(1, "Amandeep", new Address("Sector 37C", "Chandigarh", "India"));
		Employee shallowClone = employee.clone();
		employee.getAddress().setCity("Hoshiarpur");
		// should return false but returning true
		System.out.println(employee.getAddress().equals(shallowClone.getAddress()));
	}
}
