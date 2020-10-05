public class Bubble_Sort{

    // TIme Complexity  --- O(n^2) 
    static public void bubble_sort(int[]array){

        int n = array.length;  // length of the array 

        // first loop goes from 1 to length -1  
        for(int i = 1;i<n;i++){

            // this loop goes from 0 to n-2  
            for(int j =0;j<n-1;j++ ){
                
                // at each iteration if the first element is smaller than next element just swap the two element  

                if(array[j]>array[j+1]){
                	
                	// swapping is done here !!!! 
                	
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp ;
        
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[]array = {2,7,4,1,5,3};

        bubble_sort(array);

        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
