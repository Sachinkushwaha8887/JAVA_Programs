import java.util.*;

public class Week{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number of the day of the week:");

		int number=scan.nextInt();
        scan.close();

		switch(number){
		case 1: System.out.println("The day of the week is Monday");
			    break;
	    case 2: System.out.println("The day of the week is Tuesday");
                break;
        case 3: System.out.println("The day of the week is Wednesday");
        	    break;
        case 4: System.out.println("The day of the week is Thursday");
                break;
        case 5: System.out.println("The day of the week is Friday");
                break;
        case 6: System.out.println("The dfay of the  week is Saturday");
                break;
        case 7: System.out.println("The day of the week is Sunday");
                break;                	   
		}
	}
}