import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> iminja;
		iminja = new ArrayList<String>();
		iminja.add("Fatih");
		iminja.add("Mehmed");
		iminja.add("Arif");
		iminja.add("Zudi");
		iminja.stream()
			.filter( x -> x.length()<=5 )
			.forEach( x -> System.out.println(x) );                  
	}

}
