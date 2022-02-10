package restAPIProject5;

import java.util.Scanner;

public class aarmstrong {



		public static void main(String[] args) {
			int num , a, s=0,rem=0;
			Scanner user_input= new Scanner(System.in);
			System.out.println("enter the no");
			num=user_input.nextInt();
			
			a=num;
			while(a!=0)
					{
						rem =  a% 10;
						s = s + (rem*rem*rem);
						a = a% 10;
					}
							
					if (s == num)
						System.out.println(  "number is armstrong no");
						
					else
						System.out.println("no is not armstrong no");
				}
			}

		

