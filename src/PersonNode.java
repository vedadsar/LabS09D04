
public class PersonNode {
	private Person value;
	private PersonNode next;

	public PersonNode(Person value){
		this.value = value;
	}
	
	public PersonNode getNext(){
		return next;
	}
	
	public void setNext(PersonNode next){
		this.next = next;
	}
	
	public Person getValue(){
		return value;
	}
	
	public void setValue(Person otherValue){
		this.value = otherValue;
	}

	@Override
	public String toString() {
		return "PersonNode [value=" + value + "]";
	}
	

}
