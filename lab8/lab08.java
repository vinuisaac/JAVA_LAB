import java.util.*;

enum DayOfWeek {
	SUNDAY("SUN"),MONDAY("MON"),TUESDAY("TUE"),WEDNESDAY("WED"),THURSDAY("THURS"),FRIDAY("FRI"),SATURDAY("SAT");
	
	private String day;
	
	private DayOfWeek(String d) {
		day = d;
	}
	
	public String getme(){ 
		return day; 
	}

	boolean isWorkDay()
	{
		getme();
		if (day == "SUN" || day == "SAT")
			return false;
		else
			return true;
	}	
}

public class lab08{
	public static void main(String args[]){
	
		/*System.out.println("Is Sunday a workday ? " +DayOfWeek.SUNDAY.isWorkDay());*/
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the day of the week: ");
		String input = in.next().toUpperCase();
		
		try {

			DayOfWeek day = Enum.valueOf(DayOfWeek.class,input);
			System.out.println("Is "+input +" a workday ? " +day.isWorkDay());
		}

		catch(IllegalArgumentException e)
		{

			System.out.println("Wrong day please go see the calendar kthx bye : " + e );
		}
		
		/*System.out.println();
		for(DayOfWeek days : DayOfWeek.values())
		{
			System.out.println("Is "+days +" a workday ? " +days.isWorkDay());
		}*/
				
	}
}
