import java.util.*;
import java.text.SimpleDateFormat;
class CalendarExample{
	public static void main(String args[]){
		
		//Format 1(yyyy-MM-dd)
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1= new Date();

		Calendar calendar1 = Calendar.getInstance();
		calendar1.add(calendar1.YEAR,+4);
		calendar1.add(calendar1.MONTH,+1);
		calendar1.add(calendar1.DATE,+2);

		Date modifiedDate = calendar1.getTime();
		String sformat1 = sdf1.format(modifiedDate);
		System.out.println(sformat1);


		//Format 2(dd/MM/yyyy)
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		Date date2= new Date();

		Calendar calendar2 = Calendar.getInstance();
		
		String sformat2 = sdf2.format(modifiedDate);
		System.out.println(sformat2);


		//Format 3(dd-MMM-yyyy)
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMM-yyyy");
		Date date3= new Date();

		Calendar calendar3 = Calendar.getInstance();

		String sformat3 = sdf3.format(modifiedDate);
		System.out.println(sformat3);


		//Format 4(E, MMM dd yyyy)
		SimpleDateFormat sdf4 = new SimpleDateFormat("E, MMM dd yyyy");
		Date date4=new Date();

		Calendar calendar4 = Calendar.getInstance();

		String sformat4 = sdf4.format(modifiedDate);
		System.out.println(sformat4);
	}
}
