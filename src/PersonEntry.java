
public class PersonEntry {

	public static void main(String[] args) {
		
		String input;
		PersonNode firstPerson = null;
		PersonNode lastPerson = null;
		
		do{
				
		input = TextIO.getln();
		Person p = new Person(input);		
		PersonNode current = new PersonNode(p); 
		 
		if(firstPerson == null){
			firstPerson = lastPerson = current;
		}else{
			lastPerson.setNext(current); 
			lastPerson = current;
		}
					
			
		}while(!input.equalsIgnoreCase("kraj"));
	
		PersonNode print = firstPerson ;
		
		while(print.getNext() != null){
			System.out.println(print.toString());
			print = print.getNext();
		}
	
	
	}
	
	

	
	
}
