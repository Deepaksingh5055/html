package com.company;

import java.util.ArrayList;
import java.util.Scanner;
class myGeneric<T1>{
    int val=344;
    private T1 t1;

    public myGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class cwh_110_generics {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));
        int a=(int)arrayList.get(2);
//        System.out.println(a);
       myGeneric<String> g1=new myGeneric(23,"Deepak");
      String str= g1.getT1();
        System.out.println(str);
    }
}
