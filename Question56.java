public class Tv {

	public static void main(String[] args) { 
 
	Television tv1 = new Television();
	tv1.setBrand("Samsung");
	tv1.setPrice(9999.99);

	
	Television tv2 = new Television();
	tv2.setBrand("Samsung");
	tv2.setPrice(9999.99);

    	Television tv3 = new Television();
	tv3.setBrand("ROKU");
	tv3.setPrice(500);


     System.out.println(tv1.toString());	
     System.out.println("Are tv1 and tv2 from the same brand? " + tv1.equals(tv2));
     System.out.println("Are tv1 and tv3 from the same brand? " + tv1.equals(tv3));
    
	
 }
	
}
