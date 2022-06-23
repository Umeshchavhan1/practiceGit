package FaceBook;

public class StringbufferandBuilder {
	
	public static void main(String[] args) {
		
		//String s =new String("Velocity");
	
	StringBuffer sb= new StringBuffer("katraj");  //mutable 
	
	//StringBuilder sbb=new StringBuilder("pune");  //immutable

	//s.concat(" pune ");
	
	sb.append(" pune");
	
	//sbb.append("Maharashtra");
	
	System.out.println(s); //velocity
    System.out.println(sb);
  //  System.out.println(sbb);
    sb.reverse();
    System.out.println(sb);
	}
}
