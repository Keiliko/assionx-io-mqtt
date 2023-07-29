package com.assionx.io.commons.utils;

/**
 * @author assionx
 * @date 2023-07-16
 **/
public class StringUtils {

    public static boolean isBlank(String str){
        if(str==null){
            return true;
        }if(str.isEmpty()){
            return true;
        }if(str.equals("")){
            return true;
        }
        return false;
    }

    public static boolean isNull(String str){
        return  str==null;
    }

    public static boolean isEmpty(String str){
        if(str==null){
            return true;
        }
        return str.isEmpty();
    }





   
}
