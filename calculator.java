//package myproject01;

import javax.swing.JOptionPane;

class Clc
{
   public static void main (String ar[])  
   {
	
	 	String s1,s2,s3,s4=" ",s5;     Float a,b, r=0f;       int n,v;      char ch;
		
try{
						s1= JOptionPane.showInputDialog(null, "What do you want to do ? \n 1.Addition \n 2. Substraction \n 3.Multiplication \n 4.Division ");                        
	
	 				n= Integer.parseInt(s1);

		switch (n)
		{
			case 1: 

		
					s2=JOptionPane.showInputDialog(" You Choose addtion \n \n Enter number for Addtion  " );

							r= Float.parseFloat(s2);
							
			do{
							s3=JOptionPane.showInputDialog(" Enter Another Number for Addtion  " );
							b= Float.parseFloat(s3);
								r=r+b;

							//JOptionPane.showMessageDialog(null, "Sum is " +r  );
																					
s3=JOptionPane.showInputDialog("Sum is " +r+ "\nEnter number to Add more  : Y  \n  To end Calculator : E " );

								ch = s3.charAt(0);
				if (ch == 'E' ||ch== 'e' )
				{
					JOptionPane.showMessageDialog(null," ThankYou for Using Calculator  \n \n Program end   " );
					
							break;
				}
				else
				{
					continue;
				}

				
						
					
		             }while(ch == 'Y'||ch == 'y');
					
									break;


			case 2:
				s2=JOptionPane.showInputDialog(" You Choose SubStraction \n \n Enter number for Substraction  " );

							r= Float.parseFloat(s2);
				
					
			do{
							s3=JOptionPane.showInputDialog(" Enter Another Number for Substraction  " );
							b= Float.parseFloat(s3);
								r=r-b;

							JOptionPane.showMessageDialog(null, "Substraction is " +r  );
																					
s3=JOptionPane.showInputDialog("Want to Substract More Numbers in Same result : Y  \n  To end Calculator : Press Any other Key " );

								ch = s3.charAt(0);
				if (ch == 'Y' ||ch== 'y' )
				{
					continue;
				}
				else
				{
					JOptionPane.showMessageDialog(null," ThankYou for Using Calculator  \n \n Program end   " );
					break;
				}

			}while(ch == 'Y'||ch == 'y');
							
								break;

						

			case 3:

				s2=JOptionPane.showInputDialog(" You Choose Multiplication \n \n Enter number for Multiplication  " );

							r= Float.parseFloat(s2);
				
					
			do{
							s3=JOptionPane.showInputDialog(" Enter Another Number for Multiplication  " );
							b= Float.parseFloat(s3);
								r=r*b;

							JOptionPane.showMessageDialog(null, "Product is " +r  );
																					
s3=JOptionPane.showInputDialog("Want to Multiply More Numbers in Same Product : Y  \n  To end Calculator : Press Any other Key " );

								ch = s3.charAt(0);
				if (ch == 'Y' ||ch== 'y' )
				{
					continue;
				}
				else
				{
					JOptionPane.showMessageDialog(null," ThankYou for Using Calculator  \n \n Program end   " );
					break;
				}

			}while(ch == 'Y'||ch == 'y');
							
								break;
			
			case 4:
				s2=JOptionPane.showInputDialog(" You Choose Division \n \n Enter number for Division  " );

							r= Float.parseFloat(s2);
				
					
			do{
							s3=JOptionPane.showInputDialog(" Enter Another Number for Division  " );
							b= Float.parseFloat(s3);
								r=r/b;

							JOptionPane.showMessageDialog(null, "Answer is " +r  );
																					
s3=JOptionPane.showInputDialog("Want to Divide More Numbers in Same result : Y  \n  To end Calculator : Press Any other Key " );

								ch = s3.charAt(0);
				if (ch == 'Y' ||ch== 'y' )
				{
					continue;
				}
				else
				{
					JOptionPane.showMessageDialog(null," ThankYou for Using Calculator  \n \n Program end   " );
					
					break;
				}

			}while(ch == 'Y'||ch == 'y');
							
								break;
	
		}
}
catch (Exception ob)
{
		JOptionPane.showMessageDialog(null," Some Problem   " );


   }

	

}

}