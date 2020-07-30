package javaSE;

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
      int a= 1;
      int b= 2;
      int c;
      c=a;
      a=b;
      b=c;
    	System.out.println('a'+a);	
    	System.out.println('b'+b);	  
      
   
//		给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
        int a1 = 123;
        int b1 = a1 %10;
        int c1 = (a1-b1) %100; 
        int d1 = (a1-c1-b1)%1000;
        System.out.println(b1+c1+d1);
        
        //a=数/相对位%10   就可以得出相对位上的数字。
        int a4 = 1234;
       int b4 = a4/1000%10;
        
        
    	
//		华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
 double a5 = 32.5;
 double b5 = 
		 //给定一个任意的大写字母A~Z，转换为小写字母。
			 char aw = 'A';
			char bw = (char)(a + 32);
			System.out.println(b);
			//在进行强制转换时，char类型与int类型之间属于同种类型，可以强行转换。
			//浮点类型与int类型不是同种兼容类型，所以不能转换
        
        
	}

}
