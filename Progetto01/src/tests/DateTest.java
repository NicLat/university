package tests;

import utils.time.Date;

public class DateTest{

	public static void main(String[] args) {

		System.out.println("Test di utils.Date");
		
		Date date=new Date(24,34,2014);
		System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
		System.out.println();
		date.setDay(-8);
		System.out.println(date.getDay());
		date.setMonth(-4);
		System.out.println(date.getMonth());

		System.out.println();

		Date date2=new Date(31,01,2016);	// testo il fatto che cambio il mese e ricontrolla che giorno sia nel suo dominio
		System.out.println(date2.getDay());
		System.out.println(date2.getMonth());
		date2.setMonth(2);
		System.out.println(date2.getDay());
		System.out.println(date2.getMonth());


	}

}
