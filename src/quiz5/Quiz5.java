/*
 * 
 * Student Name: Nandini Nandini
 * Student ID: 99551096
 */
package quiz5;

import java.util.Scanner;




/**
 *
 * @author nandini
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
     System.out.println("Enter size of array list listA");
     
     int m=sc.nextInt(); //asking user to enter array size
      int c=0;
      int[] listA= new int[m];
     
      System.out.println("Enter size of array list listB");
      
       int n=sc.nextInt();
       int []listB=new int[n];
      System.out.println("Enter value of listA");
       for(int i=0;i<listA.length;i++)
       {
           listA[i]=sc.nextInt(); //values stored in listA
       }
        System.out.println("Enter value for listB");
         for(int i=0;i<listB.length;i++)
         {
             listB[i]=sc.nextInt(); // values stored in listB
         }
         if(listA.length==listB.length)
         {
             for(int i=0;i<listB.length;i++)
             {
         if(listA[i]!=listB[i]) //comparing lisTA and listB
         {  
          c++;
         }
             }
             if(c==0)
             {
               System.out.println("Two lists are identical");
             }
             else 
             {
                 System.out.println("Two lists are not identical");
             }
         }
    }
}

               
         
                 
  
         
        
      
  