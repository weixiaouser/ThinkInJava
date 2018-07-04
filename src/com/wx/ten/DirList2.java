package com.wx.ten;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by weixiao on 2018/5/16.
 */
public class DirList2 {

    public static FilenameFilter filter (final String afn){
        return new FilenameFilter() {
            String fn = afn;
            @Override
            public boolean accept(File dir, String name) {
                String f = new File(name).getName();
                return f.indexOf(fn)!=-1;
            }
        };
    }




    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length == 0){
            list = path.list();
        }else{
            list = path.list(filter(args[0]));
        }
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
