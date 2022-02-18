import java.util.*;

public class StringCounter {


    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    public StringCounter(String[] stringArray){
        for (String str: stringArray){
            if (hashMap.containsKey(str)) {
                int i = hashMap.get(str);
                hashMap.put(str, i+1);
            } else {
                hashMap.put(str,1);
            }
        }
    }
    //ee
    
    public void countStrings(){
       int maxCount = 0;
       String result = "";
       int words = 1;
       Set<Map.Entry<String, Integer>> entries=hashMap.entrySet();
       for (Map.Entry ent:entries){
           if (((Integer) ent.getValue())>maxCount){
               maxCount = ((Integer) ent.getValue());
               result = ((String) ent.getKey());
           }
           
       }

       for (int i = 0; i<result.length(); i++){
           if(result.charAt(i)==' '){
               words++;
           }
       }
       System.out.println("The number of times the most common string have been detected is:"+ maxCount);
        System.out.println("The amount of words deceted within the most common string is:"+ words);
        System.out.println("The most common string is:"+ result);
    }
}
