package com.learm.oops;

public class TV {
    String brand;
    String modelname;
    Integer screensize;
    Integer price;
    String color;
    String displaytype;
    void insertdata(String b,String mn,Integer ss,Integer p,String c,String dt) {
    	brand=b;modelname=mn;screensize=ss;price=p;color=c;displaytype=dt;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV lg=new TV();
		TV Samsung=new TV();
		lg.brand="LG";
		lg.modelname="4k oled";
		lg.price=600000;
		lg.screensize=55;
		lg.color="Black";
		lg.displaytype="oled";
		System.out.println(lg.brand+" "+lg.modelname);

	}

}
