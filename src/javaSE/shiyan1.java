package javaSE;

public class shiyan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
		char a = 'A';
		char b = (char)(a + 32);
		System.out.println(b);
		//�ڽ���ǿ��ת��ʱ��char������int����֮������ͬ�����ͣ�����ǿ��ת����
		//����������hint���Ͳ���ͬ�ּ������ͣ����Բ���ת��
		
		
		
		int x=6,y=8;
		boolean b1;

		b1=x>y&&++x==--y;
		System.out.println(b1);
		System.out.println(x);
		System.out.println(y);
		
		//if����к����������ֻ����д�ж����
		int n = 7 ;
		if (n%2 != 0) {
			System.out.println(n+"��һ��ż��");			
			}
		else{
			System.out.println(n+"��һ������");
		}
		
		//�ж��Ƿ�������
		int nian = 2000;
		if (nian%400 == 0){
		System.out.println("������");
		}
		else if ( nian%4 ==0 && nian %100!=0){
			System.out.println("������");
			
		}
		else{
			System.out.println("��������");
		}
		
		//��ֵƥ��
		//����breakֹͣ
		int day = 0;
		
		switch (day){
		case 0 :
			System.out.println("������");
		break;
		case 1 :
			
		System.out.println("����һ");
		
		if (nian%400 == 0){
			System.out.println("������");
			}
			else if ( nian%4 ==0 && nian %100!=0){
				System.out.println("������");
				
			}
			else{
				System.out.println("��������");
			}
		//break����д��������
		break ;
		//....
		case 6 :
			System.out.println("������");
		default  :
			System.out.println("������");
			
		}
		
		int score = 89;
		if(score<0 || score>100)
		{
			System.out.println("���벻�Ϸ�");
			return;//��������			
		}

		switch (score / 10){
		case 10:
		case 9:
			System.out.println("�ɼ�����");
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
		
		//4%��Ϣ����10000������
		int money = 10000;
		
		int i1 = 1;
		while (i<=3){
			money*=1.04;
			i1++;
		}
		System.out.println("�ֽ�"+money);
		
		int v = 0;
		for(int w = 1  ;w <= 5 ; w++){
			v += w;
		}
		System.out.println("v"+v);
		
		
	}
}

