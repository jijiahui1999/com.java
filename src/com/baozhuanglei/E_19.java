package com.baozhuanglei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class E_19 {

	public static void main(String[] args) throws ParseException {
		Date date1=new Date();
		System.out.println(date1);
		
		Date date2=new Date(System.currentTimeMillis()+1000);
		System.out.println(date2);
		//���ڸ�ʽ����
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy��mm��dd��HHʱmm��ss��E");
		System.out.println(sdf.format(date1));
		
		//Calendar��
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(calendar.YEAR);
		int month=calendar.get(calendar.MONTH)+1;
		int date=calendar.get(calendar.DATE);
		
		int hour=calendar.get(calendar.HOUR);
		int minute=calendar.get(calendar.MINUTE);
		int second=calendar.get(calendar.SECOND);
		System.out.println("��ǰʱ��Ϊ"+year+"��"+month+"��"+date+"��"+hour+
				"ʱ"+minute+"��"+second+"��");
		
		calendar.set(2019,10,15);
		calendar.add(calendar.DATE, 100);
		year=calendar.get(Calendar.YEAR);
		month=calendar.get(Calendar.MONDAY);
		date=calendar.get(Calendar.DATE);
		 
		hour=calendar.get(Calendar.HOUR);
		minute=calendar.get(Calendar.MINUTE);
		second=calendar.get(Calendar.SECOND);
		
		System.out.println("100���Ժ�ʱ��Ϊ"+year+"��"+month+"��"+date+"��"+hour+
				"ʱ"+minute+"��"+second+"��");
		
		LocalDate localDate=LocalDate.now();
		System.out.println("100���Ժ���"+localDate.plusDays(100));
				
		LocalDate rt=LocalDate.now();
		LocalDate times=rt.plusDays(100);
		System.out.println(times);
		
		/*SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		String f=times.toString();	
		Date date_100=sdf.parse(f);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println("100���Ժ���"+sdf1.format(date_100));*/
		
		
	}

}
