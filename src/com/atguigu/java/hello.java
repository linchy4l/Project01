package com.atguigu.java;

import com.sun.prism.impl.PrismSettings;
import sun.tracing.PrintStreamProviderFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxin
 * @date 2018/11/4 - 12:29
 */
public class hello {
    //这是单行注释
    //模板一:psvm
    public static void main(String[] args) {
        //模板二
        System.out.println("hello");//sout
        System.out.println("args = [" + args + "]");//soutp
        System.out.println("hello.main");//soutm\
        System.out.println("args = " + args);//soutv
        int num=0;
        System.out.println("num = " + num);//soutv
        //模板三
        String[] arr=new String[]{"张三","李思思","礼拜"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);


        }

        //模板四
        List<String> list= new ArrayList<String>();
        list.add("你好");
        list.add("中国");
        list.add("china");
        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(s);
        }
        if (list == null) {

        }
        if (list != null) {

        }





    }
