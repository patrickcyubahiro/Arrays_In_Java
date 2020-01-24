/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryit;

import java.util.Scanner;

/**
 *
 * @author Patrick CYUBAHIRO
 */
public class Tryit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Sum_Of_The_Units=0, average=0;
        //int temp = 0;
        // TODO code application logic here
        Scanner input = new Scanner(System.in);	
        int []mygrades = new int [7];
        
        //assign first element of an array to largest and smallest
                int smallest_mark = mygrades[0];
		int largest_mark = mygrades[0];   
                int range = 0; 
                System.out.println("The seven subjects are: \n");
                System.out.println("Math, English, Chemistry, Biology, Computer, Physics and Geography\n");
        for (int b=0; b<mygrades.length; b++)
                {
                System.out.println("Enter the marks of subject "+(b+1)+": ");
                mygrades[b] = (int) input.nextDouble();
              
                if((mygrades[b]) < (largest_mark))
                {
		smallest_mark = mygrades[b];
                }
		else if ((mygrades[b]) > (smallest_mark))
                {
		largest_mark = mygrades[b];
                }
               
                
                Sum_Of_The_Units += mygrades[b];
                average= Sum_Of_The_Units/7;
                range = largest_mark - smallest_mark;
                }
                if ((largest_mark>=70)&&(largest_mark<=100))
                {
                System.out.println("The maximum grade of this student is A ");
                }
                
                
                else if ((largest_mark>=60)&&(largest_mark<=69))
                {
                System.out.println("The maximum grade of this student is B ");
                }
                
                else if ((largest_mark>=50)&&(largest_mark<=59))
                {
                System.out.println("The maximum grade of this student is C ");
                }
                
                else if ((largest_mark>=0)&&(largest_mark<50))
                {
                System.out.println("You Failded. You Maximum grade is below 50%");
                }
                
                else
                {
                System.out.println("Invalid Mark. Please ensure that you have the correct details and try again");
                }
                
                if ((smallest_mark>=70)&&(smallest_mark<=100))
                {
                System.out.println("The Minimum grade of this student is A ");
                }
                
                else if ((smallest_mark>=60)&&(smallest_mark<=69))
                {
                System.out.println("The Minimum grade of this student is B ");
                }
                
                else if ((smallest_mark>=50)&&(smallest_mark<=59))
                {
                System.out.println("The Minimum grade of this student is C ");
                }
                
                else if ((smallest_mark>=0)&&(smallest_mark<50))
                {
                System.out.println("You Failded. You minimum grade is below 50%");
                }
                
                else
                {
                System.out.println("Invalid Mark. Please ensure that you have the correct details and try again");
                }
                
                System.out.println("The Sum of all the marks entered is: "+Sum_Of_The_Units);
                System.out.println("The average of all the marks entered is: "+average);
            
                System.out.println("Largest Mark is : " +largest_mark);
		System.out.println("Smallest Mark is : " +smallest_mark);
                System.out.println("The range is : " +range);
                
                if((average>=70)&&(average<=100))
                {
                System.out.println("Dear Student, your grade is A. You are qualified to move to the next class.");
                }
                else if((average>=60)&&(average<=69))
                {
                System.out.println("Dear Student, your grade is B. You are qualified to move to the next class.");
                }
                else if((average>=50)&&(average<=59))
                {
                System.out.println("Grade is C. You are not qualified to move to the next class.");
                }
                else if((average>100)||(average<0))
                {
                System.out.println("Invalid Input. Please Ensure that your input corresponds to the reality...");
                }
                else
                {
                System.out.println("You Failed. You are not qualified to move to the next class.");
                }
    }
}
