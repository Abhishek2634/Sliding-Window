import java.util.*;
public class FirstNegativeNo {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {-8,2,3,-6,10};
        int k = 2; // window size;

        int ans[] = ok(n,arr,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] ok(int n,int arr[],int k){
        int res []= new int[n - k + 1];
        ArrayList<Integer>ans = new ArrayList<>();
        int i = 0;
        int r = 0,l = 0;
        while(l < arr.length){
            if(arr[l] < 0) ans.add(l);
            if(l - r == k - 1){
                if(ans.isEmpty()) res[i++] = 0;
                else res[i++] = arr[ans.get(0)];
                if(!ans.isEmpty() && ans.get(0) == r) ans.remove(0);
                r++;
            }
            l++;
        }
        return res;
    }
}
