package com.wx.ten;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by weixiao on 2018/5/15.
 */
public class DirFilter implements FilenameFilter {
    String afn;
    DirFilter(String afn){
        this.afn=afn;
    }
    @Override
    public boolean accept(File dir, String name) {
       String f = new File(name).getName();
        return f.indexOf(afn) != -1;
    }
}
