package javaSE;

public class demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean x = false;
		boolean y = true;
		
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		System.out.println(x^y);//��ͬΪfalse, ��ͬΪtrue //true
		
		System.out.println("=======================");
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//&& || ��·����
		boolean flag1 = a>b && b++<c; //true
		
		System.out.println(b);
		
		boolean flag2 = a<b || b++>c; //true
		
		System.out.println(b);
		

		System.out.println("=======================");
		//& | ����·
		
		int x1 = 200;
		int y1 = 300;
		int z1 = 400;
		
		
		boolean b1 = x1>y1 & y1++ <z1;
		
		System.out.println(y1);
		System.out.println(b1);
		
//��Ŀ�����
		char sex ='F';
		String str = sex == 'F'? "Ů" ��"��"��
				System.out.println(str);

	}

}
