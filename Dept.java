
public class Dept {
	
	private int budget;
	private String deptName;
	
	private Employee[] emps = new Employee[5];
	private int count = 0;
	
	public Dept(String name){
		this.budget = 50000;
		this.deptName = name;
		
	}
	
	public void addEmployee(Employee obj){
		emps[count] = obj;
		count++;
		
		if(obj.getGrade() >= 5){
			this.budget += 150000;
		}else{
			this.budget += 100000;
		}
		
	}
	
	public void print(){
		System.out.println(this.budget);
	}
	
	
	
	
	
}


