package com.wqj;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List l = new ArrayList();
        while(s.hasNext()){
            String ss = s.next();
            if(ss.toString().equals("end")){
                break;
            }else{
                l.add(ss);
            }
        }
        int count = 0;
        for(int i=0;i<l.size();i++){
            String ss = l.get(i).toString();
            count += Integer.parseInt(ss);

        }
        System.out.println(count);
    }

}