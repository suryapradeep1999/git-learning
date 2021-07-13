package JavaA3;
import java.util.HashMap;
import java.util.Map;
public class Question4 {

	public static void main(String[] args) {
		Dates empdob1=new Dates(9,8,1999);
		Dates empdob2=new Dates(8,6,1985);
		Dates empdob3=new Dates(9,8,1999);
		Dates empdob4=new Dates(26,11,1985);
		Map<Dates,String >  EmpdobMap = new HashMap<>();
		EmpdobMap.putIfAbsent(empdob1,"durga");	
		EmpdobMap.putIfAbsent(empdob2,"amar");	
		EmpdobMap.putIfAbsent(empdob3,"agbar");	
		EmpdobMap.putIfAbsent(empdob4,"antony");	
		System.out.println(EmpdobMap);

	}

	}


	


