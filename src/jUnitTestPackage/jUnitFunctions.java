package jUnitTestPackage;

public class jUnitFunctions {
	
	void AddSum()
	{
	int n1 = 225, n2 = 115, sum;  
	sum = n1 + n2;  
	System.out.println("The sum of numbers is: "+sum);  
	}  
	void TestStringConcatenation1()
    {  
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);  
    }  
	public static void main(String args[])   
	{  
		jUnitFunctions ob = new jUnitFunctions();
		ob.AddSum();
		ob.TestStringConcatenation1();
		
	}
}