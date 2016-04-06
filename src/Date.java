

class Date{

	private int day;

	private int month;

	private int year;

	public Date(){

	this.day=1;
	this.month=1;
	this.year=2000;
	}

	public Date(int day, int month, int year) throws DateException{
		
		StringBuffer msg=new StringBuffer();

		if((month<1)||(month>12)){

			error.append("Valor para mes no admitido\n");
		}
		if(day<1){

			error.append("No se admiten valores negativos para los días"
		}

		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if(day>31){
					error.append("Numero de día fuera del rango del mes\n");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11: if(day>30){
					error.append(" Numero de dia fuera del rango del mes\n")
				}
				break;

			case 2: if(day>28){
					error.append(" Numero de dia fuera del rango del mes\n")
					}
				}
				break;
		}

		if(error.length()!=0){

			throw new DateException(msg.toString());

		}else{
			this.day=day;
			this.month=month;
			this.year=year;
		}
	}

	public int getDay(){
	
	return this.day;
	}

	public int getMonth(){

	return this.month;
	}

	public int getYear(){

	return this.year;
	}



	public void setDay(int day){
	
		this.day=day;
	}

	public void setMonth(int month){

		this.month=month;
	}

	public void setYear(int year){

		this.year=year;
	}
	

	boolean isSameYear(Date otherDate){

		boolean isSameYear = false;

		if(this.year==otherDate.getYear()){

			isSameYear=true;
		}
	return isSameYear;
	}

	boolean isSameMonth(Date otherDate){

		boolean isSameMonth = false;

		if(this.month==otherDate.getMonth()){

			isSameMonth=true;
		}
	return isSameMonth;
	}

	boolean isSameDay(Date otherDate){

		boolean isSameDay = false;

		if(this.day==otherDate.getDay()){

			isSameDay=true;
		}
	return isSameDay;
	}


	boolean isSame(Date anotherDate){

		boolean isSame=false;

		if((isSameYear()==true)&&(isSameMonth()==true)&&(isSameDay()==true)){

			isSame=true;
		}
	return isSame;
	}

	String getMonthName(int month){

		String monthName;

		if(month==null){
			month=this.month;
		}

		switch(month){

			case 1: monthName="Enero";
				break;
			case 2: monthName="Febrero";
				break;
			case 3: monthName="Marzo";
				break;
			case 4: monthName="Abril";
				break;
			case 5: monthName="Mayo";
				break;
			case 6: monthName="Junio";
				break;
			case 7: monthName="Julio";
				break;
			case 8: monthName="Agosto";
				break;
			case 9: monthName="Septiembre";
				break;
			case 10: monthName="Octubre";
				break;
			case 11: monthName="Noviembre";
				break;
			case 12: monthName="Diciembre";
				break;
		}
	return monthName;
	}

	void correctDay(int day, int month){
	
		boolean correcto=false;
		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if((day>=1)&&(day<=31)){
					correcto=true;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11: if((day>=1)&&(day<=30)){
					correcto=true;
				}
				break;
			case 2: if((day>=1)&&(day<=28)){
					correcto=true;
				}
				break;
		}
	}

	String season(){

		String season;

		switch(this.month){

			case 1:
			case 2:	season="Invierno";
				break;

			case 3: if(this.day<21){
					season="Invierno";
				}else{
					season="Primavera";
				}
				break;
			case 4:
			case 5: season="Primavera";
				break;

			case 6:	if(this.day<20){
					season="Primavera";
				}else{
					season="Verano";
				}
				break;
			case 7:
			case 8: season="Verano";
				break;

			case 9: if(this.day<22){
					season="Verano";
				}else{
					season="Otoño";
				}
				break;
			case 10:
			case 11: season="Otoño";
				break;
			case 12:if(this.day<21){
					season="Otoño";
				}else{
					season="Invierno";
				}
				break;
		}
	}
		
	String monthsLeft(){

		StringBuffer monthsLeft=new StringBuffer();

		for(int i=this.month+1;i<=12;i++){

			monthsLeft.append(getMonthName(i)+" ");

		}
	return monthsLeft.toString();
	}

	String printDate(){

		StringBuffer printDate= new StringBuffer();

		printDate.append(this.day+" del "+getMonthName()+" de "+this.year);

	return printDate.toString();
	}

	int monthDays(int month){

		int monthDays;

		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: monthDays=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11: monthDays=30;
				break;
			case 2: monthDays=28;
				break;
		}
	return monthDays;
	}


	String printDateUntilEndMonth(){

		StringBuffer printDateUntil = new StringBuffer();

		for(int i=this.day+1;i<=monthDays(this.month);i++){

			printDateUntil.append(i +" del "+getMonthName()+" de "+this.year+"\n");

		}
	return printDateUntil.toString();
	}


	String printSameMonthDays(){

		StringBuffer printSameMonthDays = new StringBuffer();

		for(int i=1;i<=12,i++){

			if(monthDays(this.month)==monthDays(i)){
				
				 printSameMonthDays.append(getMonthName(i)+"\n");
			}
		}

	return printSameMonthDays.toString();
	}


	int daysSinceStart(){

		int days;
		
		for(int i=1;i<this.month;i++){
		
			days=days+monthDays(i);
		}
		days=days+this.day;

	return days;	
	}

	int numberAttemps(Date myDate){

		int randomMonth= Math.random()*12+1
		int randomDay= Math.random()*monthDays(randomMonth)+1;

		Date randomDate=new Date(randomDay,randomMonth,myDate.getYear());
		int numberAttemps;

		while(randomDate!=myDate){

			numberAttemps++;

		}
	return numberAttemps;
	}

	String dayWeek(Date givenDate){

		


	}
}
