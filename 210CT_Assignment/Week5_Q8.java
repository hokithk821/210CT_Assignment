
/**
 * 在这里给出对类 Week5_Q8 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import java.util.*;
public class Week5_Q8{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("This is the array");
       int[] array = {9, 21, 32, 44, 66, 72, 90};
       System.out.println(Arrays.toString(array));
       System.out.println("Enter the number you want to search");
       int number = Integer.parseInt(myObj.nextLine());
       
        if (binarySearch(array,number) == true){
            System.out.println("i found it");
        }else{
            System.out.println("i cant found it");
        }
    }

    

    public static boolean binarySearch(int[] array,int x){
        int left = 0;
        int right = array.length -1;
        while (left <= right){
            int mid = left + ((right - left)/2);
            if (array[mid] == x){
                return true;
            } 
            else if (x < array[mid]){
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return false;
    }


}
