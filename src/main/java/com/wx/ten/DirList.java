package com.wx.ten;

import java.io.File;

/**
 * Created by weixiao on 2018/5/15.
 */
public class DirList {
    public static void main(String[] args){
        File path = new File(".");
        String[] list;
        if(args.length == 0){
            list = path.list();
        }else{
            list = path.list(new DirFilter(args[0]));
        }

        for(int i=0;i<list.length;i++){
            System.out.println("i="+list[i]);
        }
    }


}
