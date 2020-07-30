package javaSE;

public class test1 {
public static void main(String[] args) {
	
	/*
	 * 0-9：  十进制48
	 * A-Z：  十进制65
	 * a-z: 十进制97
	 * */
	 //十进制
    int a =10;//10
    //十六进制
    int b = 0x10;//16
    //八进制
    int c = 010;//8
    //二进制
    int d = 0B100;//4
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
	//十进制转换成其他进制
	System.out.println(Integer.toBinaryString(100));
    System.out.println(Integer.toHexString(100));
    System.out.println(Integer.toOctalString(100));
    
    //整数可以隐式转换，浮点数double不能直接转换成 float
   //float y = 31.4;
    //浮点数运算不准确
    double q = 3.14;
    double w = 314.0;
    double e = .314;
    double r = 3.14e2;//314
    double t = 3.14e-1;//0.314
    //如果想浮点数计算绝对精确，BigDecimal
    
    char u = 'a';
    char i = '中';
    char o = '\u4E01';
    System.out.println(u);
    System.out.println(o);
    
    System.out.println("\\bchar");
    System.out.println("escape\\tchar");
    System.out.println("escape\\rchar");
    System.out.println("escape\\nchar");
    System.out.println("\\我在斜线里\\");
    System.out.println("\'我在单引号里\'");
    System.out.println("\\我没有单引号\\");
    System.out.println("\"我在双引号里\"");
    System.out.println("我没有双引号");
    
    //在数学运算时也有数据类型的转换
    int kk = 97;
    char cc = (char)kk;
System.out.println(cc);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
