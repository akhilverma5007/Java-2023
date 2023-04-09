/*
Find the minimum element ib the array
arr = [18,12,-7,14,28]
 */
public class LinearSearchProblem2 {
    public static void main(String[] args) {

        int[] arr = {18,12,-7,14,28};
        System.out.println(linearSearch(arr));
    }

    static int linearSearch(int[] arr){
        int ans = arr[0];
        for(int index = 1; index < arr.length; index++){

            if(arr[index] < ans){
                ans = arr[index];
            }
        }
        return ans;
    }
}
