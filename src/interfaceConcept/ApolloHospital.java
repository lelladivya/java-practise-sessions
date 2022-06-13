package interfaceConcept;

public class ApolloHospital implements USServices, UKServices {

	@Override
	public void dentalServices() {
		System.out.println("dental services...UK");
		
		
	}

	@Override
	public void pediaServices() {
		System.out.println("pedia services...UK");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("ortho services...US");
		
		
	}

	@Override
	public void neuroServices() {
		System.out.println("neuro services...US");
		
		
	}
	

}
