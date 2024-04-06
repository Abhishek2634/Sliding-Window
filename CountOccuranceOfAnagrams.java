import java.util.Arrays;

public class CountOccuranceOfAnagrams {
    public static void main(String[] args) {
       String a = "abab";
       String b = "abababbcdaabba";

      int arr[] = new int[26],arr1[] = new int[26];
      int r =0,l = 0,ans =0;

      for(int i = 0; i < a.length();i++){
        arr[a.charAt(i) -'a']++;
      }

      while(r < b.length()){
        arr1[b.charAt(r) - 'a']++;
        if(r - l + 1 == a.length()){
            if(Arrays.equals(arr, arr1)) ans ++;
            arr1[b.charAt(l++) - 'a'] --;
        }
        r++;
      }
      System.out.println(ans);
    }
}
