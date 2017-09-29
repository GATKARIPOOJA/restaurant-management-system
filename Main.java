import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer C=new Customer();
		Fooditems FI=new Fooditems();
		Bill B=new Bill();
		C.getCno();
		System.out.println("the customer number is:"+C.getCno());
		C.getCname();
		System.out.println("the customer name is:"+C.getCname());
		C.getFeedback();
		System.out.println("feedback:"+C.getFeedback());
		FI.getitemId();
		System.out.println("the itemid is:"+FI.getitemId());
		FI.getitemName();
		System.out.println("the item name is:"+FI.getitemName());
		FI.getprice();
		System.out.println("the total price of an item is:"+FI.getprice());
		B.getCost();
		System.out.println("the cost of the item is:"+B.getCost());
		B.getBill();
		System.out.println("the total bill is:"+B.getBill());
		
		
	}

}
