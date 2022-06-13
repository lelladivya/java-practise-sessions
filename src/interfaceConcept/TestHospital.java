package interfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		//we cant create an object for interfaces;
		ApolloHospital ah=new ApolloHospital();
		ah.orthoServices();
		ah.pediaServices();
		ah.neuroServices();
		ah.dentalServices();
		//UKServices uk=new UKServices ();down casting not allowed in java.
		
		//top casting is possible for interfaces
		UKServices uk=new ApolloHospital ();
		USServices us=new ApolloHospital ();
		uk.dentalServices();
		uk.pediaServices();
		us.orthoServices();
		us.neuroServices();
		
	}

}
