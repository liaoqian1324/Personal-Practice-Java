package SampleProject;

public class Employee {
	
	private String empName;
	private int budget;
	
	
	public Employee(String name){
		this.empName = name;
		this.budget = 0;

		}
	
	public String getName(){
		return this.empName;
	}
	
	public int empBudget(int grade){
		if(grade >= 5){
			this.budget = 150000;
		}
		return this.budget;
	}

}
