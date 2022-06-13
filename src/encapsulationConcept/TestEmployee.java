package encapsulationConcept;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e= new Employee("Divya",32,55000);
		System.out.println(e.getSalary());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		
	}

}
