import java.util.*;

public class ElectricityBill 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		float unit=1.20f;
		float finalprice=0.0f;
		//float price;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elecricty units consumed:- ");
		int units=sc.nextInt();
		if (units<100)
		{
			finalprice = unit*units;
		}
		else if(units<=300 && units>=100) 
		{
            float price1 = unit * 100;
            float price2 = 2 * (units - 100);
            finalprice=price1 + price2;
        } 
		else if (units>300) 
        {
                float price1 = unit * 100;
                float price2 = 2 * 200;
                float price3 = 3 * (units - 300);
                finalprice = price1 + price2 + price3;
        }
		System.out.println("Final electricity bill : " + finalprice);
    }
}
