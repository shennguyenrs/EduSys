package src.FlowClass;

import java.io.*;
import java.util.Scanner;

public class Welcome
{
   private static final String filename = "src/banner.txt";

   public void main() throws Exception
   {
       File file = new File(filename).getAbsoluteFile();

       BufferedReader in = new BufferedReader(new FileReader(file));
       String line;
       
       System.out.println("========================================================");
       System.out.println();

       while((line = in.readLine()) != null)
       {
           System.out.println(line);
       }

       in.close();

       System.out.println("               Welcome to Education System              ");
       System.out.println("========================================================");
       System.out.println();

       System.out.println("1 - Login");
       System.out.println("2 - Search course information");
       System.out.println("3 - View opening courses");
       System.out.println("0 - Exit");
       System.out.println("-----------------------------");

       Scanner input = new Scanner(System.in);
       System.out.println("Enter your choose:");
       String option;

       while((option = input.nextLine()) != null)
       {
           try 
           {
               int choose = Integer.valueOf(option);

                if(choose == 1 || choose == 2 || choose == 3 || choose == 0)
                {
                    System.exit(0); // Exit without errors
                }
                else 
                {
                    System.out.println("Your enter the wrong choose! Please try again!");
                }
           }
           catch (Exception e)
           {
               System.exit(1); // Exit when occurs errors
           }
       }

       input.close();
   } 
}
