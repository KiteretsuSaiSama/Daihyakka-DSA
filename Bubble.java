/*
Output:

Input list …

10      2       0       14      43      25      18      1       5       45

Sorted Element List …

0       1       2       5       10      14      18      25      43      45

Number of passes taken to sort the list:10*/

//Java Example
class Main {
public static void main(String[] args) {
   int pass = 0;
   int[] a = {10,-2,0,14,43,25,18,1,5,45};
   System.out.println("Input List...");
   for(int i=0;i<10;i++)
   {
      System.out.print(a[i] + " ");
   }
for(int i=0;i<10;i++)
   {
   for (int j=0;j<10;j++)
      {
         if(a[i]<a[j])
         {
            int temp = a[i];
            a[i]=a[j];
            a[j] = temp;
         }
      }
pass++;
}
  
System.out.println("\nSorted List ...");
for(int i=0;i<10;i++)
   {
      System.out.print(a[i] + " ");
   }
   System.out.println("\nNumber of passes taken to complete sort:" + pass);
}
}
