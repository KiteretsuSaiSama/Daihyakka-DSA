public class Selection_Sort{

 // Time Complexity -- Worst Case O(n^2)
    
 static void selection_sort(int[]array) {
    int n = array.length;
    
    for(int i  = 0;i<n-1;i++) {   // We need to do n-2 passes 
        
        // assume the i is the min element 
        int min = i ;
        for(int j = i+1;j<n;j++) {
            
            // at each iteration find the real min element 
            if(array[j]<array[min])
                min = j;
        }
        
        /// then replace the i index element with the min element beacause it deserves that position 
        
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
    
}
    
    public static void main(String[] args) {
        int[]array = {2,7,4,1,5,3};

        selection_sort(array);

        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}