package com.lkl;

public  class DoctoralCandidate implements Student,Teacher{
	String name;
    String sex;
    int age;
    float fee;
    float pay;
//	
//	public void Fee(float f){
//		f=f;
//	}
//	public void selectFee(float f){
//		System.out.println("每学期的学费为："+f);
//	}
//	public void Pay(float p){
//		p=p;
//	}
//	public void selectPay(float p){
//		System.out.println("每月的薪水为："+p);
//		
//	}
	public void Pay(Float p) {
		// TODO Auto-generated method stub
		this.pay=p;
	}
	public void selectPay(Float p) {
		// TODO Auto-generated method stub
		this.pay=p;
	}
	public void Fee(Float f) {
		// TODO Auto-generated method stub
		this.fee=f;
	}
	public void selectFee(Float f) {
		// TODO Auto-generated method stub
	   this.fee=f;
	}
	

}
