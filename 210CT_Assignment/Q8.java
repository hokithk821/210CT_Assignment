import java.util.*;
class Q8{  
    //recursive method for binary search
    public static int binary_Search(int intArray[], int low, int high, int key){  
        //if array is in order then perform binary search on the array
        if (high>=low){  
            //calculate mid
            int mid = low + (high - low)/2;  
            //if key =intArray[mid] return mid
            if (intArray[mid] == key){  
            return mid;  
            }  
            //if intArray[mid] > key then key is in left half of array
            if (intArray[mid] > key){  
            return binary_Search(intArray, low, mid-1, key);//recursively search for key  
            }else       //key is in right half of the array
            {  
            return binary_Search(intArray, mid+1, high, key);//recursively search for key 
            }  
        }  
        return -1;  
    }
        public static void main(String args[]){  
        //define array and key
        int intArray[] = {1,10,20,30,40,50,60,70,80}; 
        System.out.println("Input List: " + Arrays.toString(intArray));
        int key = 30;  
        System.out.println("\nThe key to be searched:" + key);
        int high=intArray.length-1;
        //call binary search method 
        int result = binary_Search(intArray,0,high,key);  
        //print the result
        if (result == -1)  
            System.out.println("\nKey not found in given list!");  
        else 
            System.out.println("\nKey is found at location: "+result + " in the list");  
    }  
}