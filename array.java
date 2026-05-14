public class array{
    public static void main(String[] args){
     double[] numberss={12.3,433.4,43.3,7.8,67.2};
     int[] age={12,4,5};
    for(int i=0;i<numberss.length;i++){
           System.out.println(numberss[i]);
    }
    System.out.println(numberss[0]);
      for(int a : age) {      System.out.println(a);    } 


     int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};    
     int sum = 0;   
     Double average;    
     for (int number: numbers) 
    {      sum += number;    }    
   int arrayLength = numbers.length;   
   average =  ((double)sum / (double)arrayLength);    
   System.out.println("Sum = " + sum);    
   System.out.println("Average = " + average); 
      


   int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };     
    System.out.println("Array before reverse:");         
      for (int i = 0; i < num.length; i++) 
        {          System.out.print(num[i] + "\n");       } 
      
             for (int i = 0; i < num.length / 2; i++) 
                {        int temp = num[i];    
                         num[i] = num[num.length - 1 - i];  
                                num[num.length - 1 - i] = temp;    }      
                                
                                System.out.println("\nArray after reverse:");     
                                for (int i = 0; i < num.length; i++) 
                                    {         System.out.print(num[i] + " ");     }   





































    }
}