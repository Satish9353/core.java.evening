class Flipkart{
   public static double findItem(String item ){
   
   System.out.println("Start findItem");
   if(item == "iphone"){
	  
      return 149999.00;	  
	      
   }
   else{
	   System.out.println("stock is not available ");
   }
       
	   System.out.println("End findItem");
   
        return 0.0;
   }
}