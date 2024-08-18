 // Calcualte profit or loss 
 // Write a program that takes the cost price and selling price and calculates its profut or loss
  
  class ProfitLoss {
	  public static void main(String[] args) {
		  double costprice = 1000;
		  double sellingprice = 1200;
                  double a;

		if(sellingprice > costprice) {
			 a = sellingprice - costprice;
			System.out.println( "profit of "+a);
		}else if(costprice > sellingprice) {
			a = costprice - sellingprice;
			System.out.println( "loss of "+a);
		}else if(costprice == sellingprice) {
			System.out.println("No profit no loss" );
		}
	  }
  }
