package JavaA3;

import JavaA3.Persons;

public class Persons implements Comparable<Persons> {
	int weight,height;
	String name;
	public Persons(int weight,int height,String name) {
		this.weight=weight;
		this.height=height;
		this.name=name;
	}
	public int compareTo(Persons p) {
		if(weight>=p.weight) {
			return -1;
		}
		else {
			return 0;
		}
	} 
}

