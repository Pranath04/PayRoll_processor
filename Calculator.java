package calculator;
class Employeepay{
	 void CalculatePay(String name,double salary) {
		 System.out.println(name+" "+salary);
		
	}
	 void CalculatePay(String name,double hourlyrate,double hoursworked) {
		 System.out.print(name+" "+hourlyrate*hoursworked);
	 }
	
}
public class Calculator{
	public static void main(String []args) {
		Employeepay salary= new Employeepay();
		salary.CalculatePay("papa rao",9000.0);
		salary.CalculatePay("pula rao",9000.0,10.0);

	}
}