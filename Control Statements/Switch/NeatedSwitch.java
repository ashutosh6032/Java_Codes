//Write a program for a nested switch




  class SwitchDemo{
	  public static void main(String[] args) {
		  String str="Netflix";

		  switch(str){
			  case"Prime":
				  {					
					  String str1="Movies";
					  
					  switch(str1){
						  case"Movies":
							  System.out.println("Movies");
							  break;
						  case"TvShows":
							  System.out.println("TvShows");
							  break;
					  }
					  break;
				  }
			  case"Netflix":
				   {
	                                   String str1="Series";

					   switch(str1){
						   case"Movies":
							   System.out.println("Movies");
							   break;
					           case"Series":
							   System.out.println("Series");
							   break;
					   }
					   break;
			  }
		  }
	  }
  }
