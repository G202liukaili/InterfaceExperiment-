package com.lkl;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	static final float standard=5000; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoctoralCandidate dc1=new DoctoralCandidate();
		DoctoralCandidate dc2=new DoctoralCandidate();
  		Test T=new Test();
		
		try{
			T.exPeriment(dc1);
			System.out.println("~ ~ ~以上为您的纳税信息~ ~ ~");
			T.exPeriment(dc2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("格式错误！请重新输入");
		}
		
	}
	float yearPay(float pay){
		return pay*12;
	}
	float yearFee(float fee){
		return fee*2;
	}
	float earnings(float yp,float yf){
		float z;
		z=yp-yf;
		return z;
	}
	float tax(float sum){
		double m;
		if(sum<=standard){
			m=0;
		}else if(sum>standard&&sum<=8000){
			m=standard*0.03;
		}else if(sum>8000&&sum<=17000){
			m=standard*0.1;
		}else if(sum>17000&&sum<=30000){
			m=standard*0.2;
		}else{
			m=standard*0.3;
		}
		return (float) m;
		
	}
	void exPeriment(DoctoralCandidate DC){
		Test T=new Test();
		float n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名：");
		DC.name=sc.next();
		System.out.println("请输入年龄：");
		DC.age=sc.nextInt();
		System.out.println("请输入性别：");
		DC.sex=sc.next();
		System.out.println("请输入每月薪水：");
		DC.pay=sc.nextInt();
		System.out.println("请输入每学期学费：");
		DC.fee=sc.nextInt();
		n=T.earnings(DC.pay, DC.fee);
		System.out.println(n);
		System.out.println(T.tax(n));
//		y=t.Stu((float) dc.tu);//强制转换
//        z=t.Ssum(t.Ssal((float) dc.sal),t.Stu((float) dc.tu));
		System.out.println(DC.name+"的年龄为"+DC.age+",性别为："+DC.sex+",年薪水为："+T.yearPay(DC.pay)
				+",每年学费为："+T.yearFee(DC.fee)+",每年纳税额为："+T.tax(n));
			}

}
