package pl.n0taku;

import java.util.*;

public class WeightSort {

    public static String orderWeight(String strng) {
        Map<Long, List<String>> map = new TreeMap<>();
        Scanner sc = new Scanner(strng);
        while(sc.hasNext()){
            String n = sc.next();
            Long sum=0l;
            for(Long i=Long.valueOf(n.replaceAll("[\\D]", ""));i!=0;i/=10){
                sum+=i%10;
            }
            if(!map.containsKey(sum))
                map.put(sum,new ArrayList<>());
            map.get(sum).add(n);

        }
        List<String> list = new ArrayList<>();
        for(Long l:map.keySet()){
            Collections.sort(map.get(l));
            for(String s: map.get(l))
            list.add(s);
        }
        return String.join(" ",list);
    }
}
