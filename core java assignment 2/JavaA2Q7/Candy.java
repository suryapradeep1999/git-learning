package JavaA2Q7;

public class Candy extends Dessertitems{
	float quantity;
	public Candy(float q) {
		quantity=q;
	}
     public float getcost() {
    	 float cost=quantity*2f*60;
    	 float taxamount=(5f/100f)*cost;
    	 float totalcost=cost+taxamount;
    	 return totalcost;
     }
}
