

class Date{

	private int day;

	private int month;

	private int year;

	public Date(int day, int month, int year){
		
		this.year=year;

		if((month>=1)&&(month<=12)){
			this.month=month;
		}else{
			 
		}
		
		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if((day>=1)&&(day<=31)){
					this.day=day;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11: if((day>=1)&&(day<=30)){
					this.day=day;
				}
				break;
			case 2: if(this.year%4==0){
					if((day>=1)&&(day<=29)){
						this.day=day;
					}
				}else{
					if((day>=1)&&(day<=28)){
						this.day=day;
					}
				}
				break;
	
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

		if(this.month==otherDate.getMonthr()){

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

	String getMonthName(){

		String monthName;

		switch(this.month){

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

	void d(){
	
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
			case 2: if(this.year%4==0){
					if((day>=1)&&(day<=29)){
						correcto=true;
					}
				}else{
					if((day>=1)&&(day<=28)){
						correcto=true;
					}
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

}
