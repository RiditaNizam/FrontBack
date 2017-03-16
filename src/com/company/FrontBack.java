package com.company;

/**
 * Created by ridita on 3/16/17.
 */
public class FrontBack {
    public String frontBack(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) +
                    str.charAt(0);
        }
    }

}
