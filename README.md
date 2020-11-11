# InterfaceExperiment
### 计 G202 刘凯丽 2020322095
## 实验报告
### 一、实验目的
> 实现接口应用
>> * 掌握java中抽象类和抽象方法的定义。<br/>
>> * 掌握java中接口的定义，熟练掌握接口的定义形式以及接口的实验方法。<br/>
>> * 了解异常的使用方法，并在程序中根据输入情况做异常处理。<br/>    
### 二、实验要求
* 1.在**博士研究生**类中实现各个接口定义的抽象方法；
* 2.对年学费和年收入进行统计，用 入减去学费，求得纳税额；
* 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static 、 final 修饰定义；
* 4.实例化**研究生**类时，可采用运行时通过main方法的参数args一次性赋值，也可以采用Scanner类实现运行时交互式输入；
* 5.根据输入情况，要在程序中做异常处理；
### 三、实验内容
1.新建接口Student和Teacher，并且在接口中分别定义方法Fee()用来存放用户输入的学费、selectFee()查询学费和方法Pay()用来存放用户输入的每月薪水、selectPay()查询薪水。<br/>

    public interface Student {
    public interface Teacher {
   > * 这两个接口是为了定义博士研究生类分别作为Student和助教Teacher所具有的属性。

2.新建DoctoralCandidate类实现两个接口（使用关键字implement，注意两个接口之间用逗号' ，'隔开）。此类中定义博士研究生的姓名、性别、年龄、**月薪**、**每学期**学费等属性。<br/>

    class DoctoralCandidate implements Student,Teacher
    
3.新建Test类，在此类中实例化**博士研究生**类DoctoralCandidate的两个对象dc1和dc2,并且实例化此Test类的一个对象T，通过T调用方法输出纳税额。<br/>

    DoctoralCandidate dc1=new DoctoralCandidate();
		DoctoralCandidate dc2=new DoctoralCandidate();
  		Test T=new Test();
      
      T.exPeriment(dc1);
      T.exPeriment(dc2);
      
 ### 四、核心代码
      
1.在Test类中定义计算年薪的方法yearPay()、计算每年学费的方法yearFee()和计算研究生每年总收益的方法earnings()以及计算每年纳税额的方法tax()。<br/>

    float earnings(float yp,float yf){
		float z;
		z=yp-yf;
		return z;
	} 
   > * 年薪减去每年需支付的学费得到每年总收益
   
    static final float standard=5000; 
  
      if(sum<=standard){
			m=0;
		}else if(sum>standard&&sum<=8000){
			m=standard*0.03;
   > * 根据国家最新纳税标准通过使用if()else{}语句实现算法，并且将标准工资定义为static final类型   
2.在Test类中定义方法exPeriment(DoctoralCandidate DC)，参数为**博士研究生**类的一个对象。此方法实现获取用户的基本信息。使用Scanner类实现扫描控制台，通过XX.nextXX()读取控制台输入的内容。最后通过System.outXXX输出语句调用yearPay()、yearFee()、earnings()和tax()输出基本信息和纳税额。<br/>

    Scanner sc=new Scanner(System.in);
    
    DC.name=sc.next();
    DC.age=sc.nextInt();
    DC.sex=sc.next();
    DC.pay=sc.nextFloat();
    DC.fee=sc.nextFloat();
   > * 需要注意的是读取年薪pay和每年学费fee时需要nextFloat，否则键盘输入float型数字，Scanner读取控制台内容时会出错。因为接口中定义的年薪和学费为float类型。<br/>
3.由于键盘键入信息时，属性有数据类型的限制，所以main方法中使用try()catch(){}语句进行异常捕获。将实例化的两个对象通过参数传值给对象T调用的exPeriment()方法。<br/>

    try{
			T.exPeriment(dc1);
			System.out.println("~ ~ ~以上为您的纳税信息~ ~ ~");
			T.exPeriment(dc2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("格式错误！请重新输入");
		}
    
### 五、系统运行截图
