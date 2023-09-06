package mypack;
import java.util.Scanner;
public class Maincls {
	public static void main(String[] args) {
			StudentInfo sf=new StudentInfo();
			String StdName="STUDENT";
			//String StdName =new String("welcome");
			int stdID =23456;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter student name:");
			String s=obj.nextLine();
			System.out.println("Enter student id");
			int id=obj.nextInt();
			if((StdName.equals(s))&&(stdID==id))
			{
				System.out.println("Student");
				while(true)
				{
					System.out.println("1.ViewCourse\n 2.ViewStatus\n 3.ViewBalance\n 4.paidfee");
					System.out.println("Enter your choice");
					int n=obj.nextInt();
					if(n==1)
					{
						sf.Viewcourses();
					}
					else if(n==2)
					{
						System.out.println("Student Status");
						System.out.println("name:"+s);
						System.out.println("id:"+id);
						//System.out.println("name:"+name);
						//System.out.println("Balance:"+"Balance");
						sf.ViewStatus();
						
					}
				}
			}
//			else {
//				System.out.println("Students details not found");
//				System.exit(0);
//			}
//			

		}

	}

	

