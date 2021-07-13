package JavaA3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class FailFast {

	public static void main(String[] args) {
		 Map<String,String> premiumPhone = new HashMap<String,String>();
	        premiumPhone.put("Realme", "xt");
	        premiumPhone.put("samsung", "s6");
	        premiumPhone.put("honor","9lite");
	        
	        Iterator<String> iterator = premiumPhone.keySet().iterator();
	        
	        while (iterator.hasNext())
	        {
	            System.out.println(premiumPhone.get(iterator.next()));
	            premiumPhone.put("Sony", "Xperia Z");
	        }

	}

	}


