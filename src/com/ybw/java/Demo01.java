package com.ybw.java;

/**
 * @author Niubility-Wen
 * @create 2020-10-19-1:04
 **/
//测试
public class Demo01 {
//    模板六：prsf
    private static final int test = 0;
//    变形：psfi
    public static final int test1 = 1;
//    变形：
    public static final int test2 = 2;
//    psfs
    public static final String test3 = "psfs";
    
    public static final int a = 1;
    public static final String s = "s";
    
//    模板一 ： psvm
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
//    模板二 ：sout
        System.out.println("sout");        
//    变形：soutp / soutm /soutv / xxx.out
        System.out.println("args = [" + args + "]");
        System.out.println("Demo01.main");
        int m =0;
        System.out.println("m = " + m);
        System.out.println(m);
        
//        模板三 ：fori
        String[] arr = {"tom", "jerry", "lufy", "xoa"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//       变形 ：iter
        for (String s : arr) {
            System.out.println(s);
        }
//        变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
    }
    
//    自定义模板
    public void testUpdate(){
        
    }
    
    
}
