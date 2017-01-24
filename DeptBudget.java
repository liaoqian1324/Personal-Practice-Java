package SampleProject;

public class DeptBudget {

	public static void main(String[] args) {
		
		Employee alex =new Employee("Alex Rod");
		Employee linda = new Employee("Linda Berry");
		Employee john = new Employee("John Doe");
		Employee sara = new Employee("Sara Time");
		Employee james = new Employee("James Doe");
		
		Dept sales = new Dept("XYZ Sales");
		Dept it = new Dept("IT");
		
		alex.empBudget(6);
		System.out.println(alex.empBudget(6));
		


	}

}
