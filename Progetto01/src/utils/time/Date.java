package utils.time;		//dichiaro il package utils perchè sono nella cartella utils

public class Date{
	private int day;
	private int month;
	private int year;

	public Date(int day,int month,int year){
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	@Override
	public String toString() {
		return "("+day+","+month+","+year+")";
	}	
	
	public void setDay(int day){
		int maximumDays=getMaxDays(this.month,this.year);
		if(day<1)
			day=1;
		else if(day>maximumDays)
			day=maximumDays;
		this.day=day;	//ora il parametro è corretto e lo scrivo nell'attributo
	}
	public int getDay(){
		return this.day;
	}

	public void setMonth(int month){
		if(month>12)
			month=12;
		else if(month<1)
			month=1;		
		this.month=month;
		this.setDay(this.day); //rifà il controllo sul giorno in modo che uno non possa cambiare il mese rendendo non valido il giorno che già c'era
	}
	public int getMonth(){
		return this.month;
	}

	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return this.year;
	}

	public static int getMaxDays(int month, int year){	//l'ho fatta public perchè non danneggia la classe, può essere utilizzata esternamente		static: metodo/attributo condiviso per tutte le istanze di quella classe (ce n'è solo uno ed è fisso per la classe)
		int maximumDays=31;
		switch (month) {
			case 4: case 6: case 9:	case 11:	
				maximumDays=30;	
			case 2: if(isLeapYear(year))
					maximumDays=29;
				else
					maximumDays=28;
				break;
			default:	
		}
		return maximumDays;
	}
	public static boolean isLeapYear(int year){
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}
}
