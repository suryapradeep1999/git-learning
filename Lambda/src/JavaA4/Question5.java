package JavaA4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question5 {
	
    public static void main(String[] args) {
		
    	List<String> list = new ArrayList<>();
        list.add("somania");
        list.add("umerica");
        list.add("rietnam");
        list.add("yndia");
        list.add("aaiwan");
        list.add("jthiopia");
        list.add("aamaica");
        list.add("vntarctica");
        list.add("ahop");
       
        Consumer<List<String>> firstLetter = a -> {
            StringBuilder s = new StringBuilder();

            a.forEach(firs -> s.append(firs.charAt(0)));
            System.out.println(s);
        };
        firstLetter.accept(list);
		

	}

}


	


