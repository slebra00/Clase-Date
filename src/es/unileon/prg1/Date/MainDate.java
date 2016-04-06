package es.unileon.prg1.Date;


public class MainDate{

 public static void main(String[] args) {

	try{
	Date date=new Date(-7,-3,2016);
	

	System.out.println(date.printDate());
	}catch(DateException ex){}

 
 }

}
