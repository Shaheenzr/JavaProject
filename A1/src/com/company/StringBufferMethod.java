package com.company;

public class StringBufferMethod {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Lets check out");
        sb.insert(5,"this");
        System.out.println("String insert: " + sb);
        sb.insert(9,84.26F);
        System.out.println("Float insert: " + sb);
        char[] ch = { ' ','f','o','r',' '};
        sb.insert( 9, ch );
        System.out.println("character array insert: " + sb);

        StringBuffer sb1 = new StringBuffer("I Java!");
        sb1.insert(2,"Like");
        System.out.println(sb1);

        StringBuffer ap = new StringBuffer("I Love my country ");
        char[] name = {'I','n','d','i','a'};
        ap.append(name);
        System.out.println(ap);

        StringBuffer del = new StringBuffer("I dont Love my country ");
        del.delete(2,6);
        System.out.println(del);

        StringBuffer rep = new StringBuffer("I dont Love my country ");
        rep.replace(2,6,"really");
        System.out.println(rep);


    }
}
