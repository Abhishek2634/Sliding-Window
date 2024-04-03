public class MaximumSubarraySumOfSizeK{
    public static void main(String[] args) {
        int k = 4;
        int arr[] = {2,5,1,8,2,9,1};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int j = 0;
        int i  = 0;
        
        while(j < arr.length){
            sum += arr[j];
            if(j - i + 1 == k){
                max = Math.max(sum , max);
                sum -= arr[i];
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(max);
    }
}