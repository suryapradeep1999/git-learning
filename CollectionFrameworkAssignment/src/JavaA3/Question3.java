package JavaA3;
import java.util.ArrayList;
import java.util.ListIterator;
public class Question3 {
	public static void main(String args[]) {
		ArrayList<Object> a1=new ArrayList<>();
		a1.add("Java");
		a1.add("Python");
		a1.add(7989389071l);
		a1.add('$');
		a1.add(67789.05f);
		ListIterator<Object> l1=a1.listIterator();
		System.out.println("Forward Direction");
		while(l1.hasNext()==true)
		{
			System.out.println(l1.next());
		}
		System.out.println("Backward Direction");
		while(l1.hasPrevious()==true)
		{
			System.out.println(l1.previous());
		}
	}
}
