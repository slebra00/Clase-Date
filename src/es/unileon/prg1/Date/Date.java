package es.unileon.prg1.Date;

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

			msg.append("Valor para mes no admitido:"+month+"\n");
		}
		if(day<1){

			msg.append("No se admiten valores negativos para los días:"+day+"\n");
		}

		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if(day>31){
					msg.append("Numero de día fuera del rango del mes"+day+"\n");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11: if(day>30){
					msg.append(" Numero de dia fuera del rango del mes"+day+"\n");
				}
				break;

			case 2: if(day>28){
					msg.append(" Numero de dia fuera del rango del mes:"+day+"\n");
				}
				break;
		}

		if(msg.length()!=0){

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



	public void setDay(int day)throws DateException{

		StringBuffer msg=new StringBuffer();

		if(day<1){

			msg.append("No se admiten valores negativos para los días:"+day+"\n");
		}

		switch(this.month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if(day>31){
					msg.append("Numero de día fuera del rango del mes: "+day+"\n");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11: if(day>30){
					msg.append(" Numero de dia fuera del rango del mes: "+day+"\n");
				}
				break;

			case 2: if(day>28){
					msg.append(" Numero de dia fuera del rango del mes: "+day+"\n");
				}
				break;
		}
		
		if(msg.length()!=0){

			throw new DateException(msg.toString());

		}else{
		this.day=day;
		}
	}

	public void setMonth(int month)throws DateException{

		StringBuffer msg=new StringBuffer();

			if((month<1)||(month>12)){

				msg.append("Valor para mes no admitido:"+month+"\n");
			}
		if(msg.length()!=0){

			throw new DateException(msg.toString());

		}else{
		this.month=month;
		}
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


	boolean isSame(Date otherDate){

		boolean isSame=false;

		if((isSameYear(otherDate)==true)&&(isSameMonth(otherDate)==true)&&(isSameDay(otherDate)==true)){

			isSame=true;
		}
	return isSame;
	}

	String getMonthName(int month){

		String monthName="";

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

	boolean correctDay(int day, int month){
	
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
	return correcto;
	}

	String season(Date date){

		String season="";

		switch(date.getMonth()){

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
	return season;
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

		printDate.append(this.day+" de "+getMonthName(this.month)+" del "+this.year);

	return printDate.toString();
	}

	int monthDays(int month){

		int monthDays=0;

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

			printDateUntil.append(i +" de "+ getMonthName(this.month)+" del "+this.year+"\n");

		}
	return printDateUntil.toString();
	}


	String printSameMonthDays(Date date){

		StringBuffer printSameMonthDays = new StringBuffer();

		for(int i=1;i<=12;i++){

			if(monthDays(date.getMonth())==monthDays(i)){
				
				 printSameMonthDays.append(getMonthName(i)+"\n");
			}
		}

	return printSameMonthDays.toString();
	}


	int daysSinceStart(){

		int days=0;
		
		for(int i=1;i<this.month;i++){
		
			days=days+monthDays(i);
		}
		days=days+this.day;

	return days;	
	}

	int numberAttemps(Date myDate){

		int randomMonth= (int)(Math.random()*12+1);
		int randomDay=(int) (Math.random()*monthDays(randomMonth)+1);
		
		int numberAttemps=1;

		while((randomMonth!=myDate.getMonth())&&(randomDay!=myDate.getDay())){

			randomMonth= (int)(Math.random()*12+1);
			randomDay=(int) (Math.random()*monthDays(randomMonth)+1);

			numberAttemps++;

		}
	return numberAttemps;
	}

	String dayWeek(Date givenDate, int firstDayMonth){

		StringBuffer dayWeek= new StringBuffer();
		int contador=0;
	
	
		contador=((firstDayMonth+givenDate.getDay())-1)%7;

		
		switch(contador){

				case 0: dayWeek.append("Domingo");
					break;
				case 1: dayWeek.append("Lunes");
					break;
				case 2: dayWeek.append("Martes");
					break;
				case 3: dayWeek.append("Miércoles");
					break;
				case 4: dayWeek.append("Jueves");
					break;
				case 5: dayWeek.append("Viernes");
					break;
				case 6: dayWeek.append("Sabado");
					break;
			}
		
	return	dayWeek.toString();
	}
}
