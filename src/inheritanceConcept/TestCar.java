package inheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autopark();
		System.out.println(b.wheels);
		// top casting:
		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();
		//c.autopark();
		//down casting:
		//will get class cast exception: 
		//BMW a = (BMW) new Car();
		

	}

}
