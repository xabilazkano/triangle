import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		boolean flag=true;
		while (flag) {
			System.out.println("Give me a number and I will print a triangle of this dimension");
			if (sc.hasNextInt()) {
				int number=sc.nextInt();
				for (int i=number;i>0;i--) {
				
					for (int e=i;e<=number;e++) {
						System.out.print("*");
						
					}
					System.out.println();
				}
				
				boolean flag2=true;
				while (flag2) {
					System.out.println("Do you want to play again? (1=Yes 0=No)");
					if (sc.hasNextInt()) {
						int num=sc.nextInt();
						if (num==1) {
							flag2=false;
						}
						else if (num==0) {
							flag=false;
							flag2=false;
						}
						else {
							System.out.println("Enter a valid option");
						}
						
				
						
					}
					else {
						System.out.println("Enter a valid option");
						sc.next();
					}
				}
			}
			else {
				System.out.println("You haven't entered a number");
				sc.next();
			}
		}

	}

}
