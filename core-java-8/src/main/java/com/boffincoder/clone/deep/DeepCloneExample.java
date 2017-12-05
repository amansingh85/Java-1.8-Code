package com.boffincoder.clone.deep;

public class DeepCloneExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee(1, "Amandeep", new Address("Sector 37C", "Chandigarh", "India"));
		Employee deepClone = employee.clone();
		employee.getAddress().setCity("Hoshiarpur");
		// should return false
		System.out.println(employee.getAddress().equals(deepClone.getAddress()));
	}
}
