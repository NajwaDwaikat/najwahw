package najwasoft;



import java.util.ArrayList;

public class book {
	
	public static int price=0;

	
	
	
	 public static ArrayList<Integer>arrayList=new ArrayList<Integer>();
	 
	 public static void price(int bookprice) {
		 arrayList.add(bookprice);
		 price+=bookprice;
		
		
	
}
 
	 public static int count() {
		 
		return arrayList.size();
		
	
}
}


