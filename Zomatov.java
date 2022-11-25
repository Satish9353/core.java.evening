class ZomatoFood{
        
		public static void findItem(String item){
		System.out.println("Start to findItem");
	
		if(item == "Biryani"){
			System.out.println("The price of item is 125");
			//return ;
		}
				if(item == "Puliogere"){
			System.out.println("The price of item is 90");
			return ;
		}	
		else{
			System.out.println("Item not available");
			
		}
		System.out.println("End of findItem");
             
			 return;
		}
			 
}