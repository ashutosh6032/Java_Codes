//use toString Metood for print the user defined class data which is stored in the arraylist 
//we have to override the toStirng method in our class 
//in the toString method we have to only write the ruturn statement



import java.util.*;
class CricPlayer {
	int jerNo = 0;
	String Pname = null;

	CricPlayer(int jerNo,String Pname) {
		this.jerNo = jerNo;
		this.Pname = Pname;
	}

	public String toString() {             //without using toString method sop(al) it print only address not the data 
		return jerNo + ":" +Pname;
	}
}

class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(new CricPlayer(18,"Virat"));
		al.add(new CricPlayer(07,"Dhoni"));
		al.add(new CricPlayer(45,"Rohit"));

		System.out.println(al);
	}
}
