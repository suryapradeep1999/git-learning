package JavaA3;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class FailSafe {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String> premiumPhone = 
                new ConcurrentHashMap<String,String>();
premiumPhone.put("Realme", "xt");
premiumPhone.put("samsung", "s9");
premiumPhone.put("honor","play");

Iterator<String> iterator = premiumPhone.keySet().iterator();

while (iterator.hasNext())
{
System.out.println(premiumPhone.get(iterator.next()));
premiumPhone.put("Sony", "Xperia Z");
}
	}

}
