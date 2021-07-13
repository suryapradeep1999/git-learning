package JavaA3;
import java.util.HashMap;
public class Question5 {

	public static void main(String[] args) {
		HashMap<Employee,String> empTable = new HashMap<>();
        empTable.put(new Employee(2),"surya");
        empTable.put(new Employee(3),"amar");
        empTable.put(new Employee(4),"jony");
        empTable.put(new Employee(5),"prathap");
        
        for (Employee i : empTable.keySet()){
            System.out.println(empTable.get(i));
	}
  }
	}


