/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Memo
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String s ="abcac";
        //s contains 5 numbers ;
        int count=0;
int n =10;
String infinte="abcacabcacabcacabcacabcac";
       char [] Character =infinte.substring(0, n).toCharArray();
for (int i=0;i<Character.length;i++){
    if (Character[i]=='a'){
        count++;
        System.out.println("true");
}else
System.out.println("false");
      
}
        System.out.println(count);
    }   
}
