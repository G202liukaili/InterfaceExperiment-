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
			System.out.println("~ ~ ~����Ϊ������˰��Ϣ~ ~ ~");
			T.exPeriment(dc2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("��ʽ��������������");
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
		System.out.println("������������");
		DC.name=sc.next();
		System.out.println("���������䣺");
		DC.age=sc.nextInt();
		System.out.println("�������Ա�");
		DC.sex=sc.next();
		System.out.println("������ÿ��нˮ��");
		DC.pay=sc.nextInt();
		System.out.println("������ÿѧ��ѧ�ѣ�");
		DC.fee=sc.nextInt();
		n=T.earnings(DC.pay, DC.fee);
		System.out.println(n);
		System.out.println(T.tax(n));
//		y=t.Stu((float) dc.tu);//ǿ��ת��
//        z=t.Ssum(t.Ssal((float) dc.sal),t.Stu((float) dc.tu));
		System.out.println(DC.name+"������Ϊ"+DC.age+",�Ա�Ϊ��"+DC.sex+",��нˮΪ��"+T.yearPay(DC.pay)
				+",ÿ��ѧ��Ϊ��"+T.yearFee(DC.fee)+",ÿ����˰��Ϊ��"+T.tax(n));
			}

}
