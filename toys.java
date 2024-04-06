import java.util.*;
public class toys {
    public static void main(String[] args) {
        String a = "abaccab";
        // you can only pick two type of toys no but with max number in a line of String.
        HashMap<Character,Integer> map = new HashMap<>();

        int s = 0,e = 0,ans = 0;
        while(s < a.length()){
            map.put(a.charAt(s),map.getOrDefault(a.charAt(s),0)+1);
            if(map.size() > 2){
                while(map.size() > 2){
                    map.put(a.charAt(e),map.get(a.charAt(e))-1);
                    if(map.get(a.charAt(e)) == 0){
                        map.remove(a.charAt(e));
                    }
                    e++;
                }
            }
            if(map.size() == 2){
                ans = Math.max(ans,s - e + 1);
            }
            s++;
        }
        System.out.println(ans);
    }
}
