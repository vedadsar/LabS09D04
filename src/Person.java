
public class Person {

	private String value;
	
	
	public Person(String value){
		this.value = value;		
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "" + value;
	}
		 
	
	
}
