package javaSE;

public class shiyan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		给定一个任意的大写字母A~Z，转换为小写字母。
		char a = 'A';
		char b = (char)(a + 32);
		System.out.println(b);
		//在进行强制转换时，char类型与int类型之间属于同种类型，可以强行转换。
		//浮点类型与hint类型不是同种兼容类型，所以不能转换
		
		
		
		int x=6,y=8;
		boolean b1;

		b1=x>y&&++x==--y;
		System.out.println(b1);
		System.out.println(x);
		System.out.println(y);
		
		//if语句中后面的括号内只能填写判断语句
		int n = 7 ;
		if (n%2 != 0) {
			System.out.println(n+"是一个偶数");			
			}
		else{
			System.out.println(n+"是一个奇数");
		}
		
		//判断是否是闰年
		int nian = 2000;
		if (nian%400 == 0){
		System.out.println("是闰年");
		}
		else if ( nian%4 ==0 && nian %100!=0){
			System.out.println("是闰年");
			
		}
		else{
			System.out.println("不是闰年");
		}
		
		//等值匹配
		//遇到break停止
		int day = 0;
		
		switch (day){
		case 0 :
			System.out.println("星期日");
		break;
		case 1 :
			
		System.out.println("星期一");
		
		if (nian%400 == 0){
			System.out.println("是闰年");
			}
			else if ( nian%4 ==0 && nian %100!=0){
				System.out.println("是闰年");
				
			}
			else{
				System.out.println("不是闰年");
			}
		//break不能写在括号内
		break ;
		//....
		case 6 :
			System.out.println("星期六");
		default  :
			System.out.println("星期日");
			
		}
		
		int score = 89;
		if(score<0 || score>100)
		{
			System.out.println("输入不合法");
			return;//结束方法			
		}

		switch (score / 10){
		case 10:
		case 9:
			System.out.println("成绩优秀");
        break;
		default :
			System.out.println("buhege");
			break;
		}
		
		
		double sum = 0;
		double i = 1;
		while (i<=100){
			sum+=1/i;
			i++;
		}
		System.out.println("sum"+sum);
		
		//4%利息，存10000存三年
		int money = 10000;
		
		int i1 = 1;
		while (i<=3){
			money*=1.04;
			i1++;
		}
		System.out.println("现金"+money);
		
		int v = 0;
		for(int w = 1  ;w <= 5 ; w++){
			v += w;
		}
		System.out.println("v"+v);
		
		
	}
}

