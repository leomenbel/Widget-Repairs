//When a widget breaks, it is sent to the widget repair shop, which is capable of repairing at most numPerDay widgets per day. 
//Given a record of the number of widgets that arrive at the shop each morning, your task is to determine how many days the shop 
//must operate to repair all the widgets, not counting any days the shop spends entirely idle.
//
//For example, suppose the shop is capable of repairing at most 8 widgets per day, and over a stretch of 5 days, 
//it receives 10, 0, 0, 4, and 20 widgets, respectively. The shop would operate on days 1 and 2, sit idle on day 3, and operate again 
//on days 4 through 7. In total, the shop would operate for 6 days to repair all the widgets.
//
//Create a class WidgetRepairs containing a method days that takes a sequence of arrival counts arrivals (of type ) 
//and an numPerDay, and calculates the number of days of operation.


public class WidgetRepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x= {10,0,0,4,20,15,0,5};
		int y = 8;
		
		System.out.println(days(x,y));
		

	}
	
	public static int days(int[] arrivals, int numPerDay)
	{
		int numOfDays = 0;
		
		for (int i = 0; i < arrivals.length ; i++)
		{
			if (arrivals[i] > numPerDay){
				int extraWidgets = arrivals[i] - numPerDay;
				if(i == arrivals.length - 1){
					
					double extraDays = Math.ceil((double)arrivals[i]/(double)numPerDay);
					numOfDays += extraDays;
				}else{
					arrivals[i+1] += extraWidgets;
					numOfDays++;
				}
			}
			if (arrivals[i] <= numPerDay && arrivals[i] > 0){
				numOfDays++;
			}
	
			
		}
		
		
		return numOfDays;
		
	}
	
	

}
