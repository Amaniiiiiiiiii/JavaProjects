package com.lumen.training;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Hello\t");
       int x=90;
       int y=90;
       System.out.println("Sum "+(x+y)+"\n");
       System.out.println(" \'Welcome to Java\' ");
       //upcasting  ctrl+frwd slash shortcut to comment
       byte a=10;
       int b=a*2;
       long num=a+b;
       System.out.println(num);
       
       int num1=(int)num;
       float amount=num*num1;
       double result=amount+10.8;
       
       float data =(float)result;
       int c=(int)data;
       System.out.println(data);
       System.out.println(c);
       byte b1=10;
       byte b2=20;
       byte b3=(byte)(b1+b2);//or
       int b4=b1+b2;  //--> complete reference
       
       int x1=100;
       int x2=200;
       byte x3=(byte)(x1+x2);
       System.out.println(x3);//figure out why 44 (300-256)
       System.out.println(b4);
       System.out.println(b3);
       
       
       
       
	}

}
