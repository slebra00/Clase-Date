package es.unileon.prg1.Date;


public class MainDate{

 public static void main(String[] args) {

	try{
	Date date=new Date(3,4,2016);
	Date otherDate=new Date(27,4,2016);
	
	System.out.println(date.dayWeek(otherDate,5));
	/*System.out.println(date.isSameYear(otherDate));
	System.out.println(date.isSame(otherDate));
	System.out.println(date.getMonthName(4));
	System.out.println(date.correctDay(29,2));
	System.out.println(date.season(date));
	System.out.println(date.monthsLeft());
	System.out.println(date.printDateUntilEndMonth());
	System.out.println(date.daysSinceStart());
	System.out.println(date.numberAttemps(otherDate));
	System.out.println(date.printSameMonthDays(otherDate));
	System.out.println(date.printDate());
	System.out.println();*/

	}catch(DateException ex){
		System.err.println(ex);
	}

 
 }

}
