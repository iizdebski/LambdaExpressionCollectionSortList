package com.izdebski;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListString {

    /*
    public static List<String> sort(List<String> st){
        Collections.sort(st, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        return st;
    }
}
*/

    public static List<String> sort(List<String> st){
        Collections.sort(st, (a, b) -> a.compareTo(b));
        return st;
    }
}