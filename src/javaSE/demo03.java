package javaSE;

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
      int a= 1;
      int b= 2;
      int c;
      c=a;
      a=b;
      b=c;
    	System.out.println('a'+a);	
    	System.out.println('b'+b);	  
      
   
//		����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
        int a1 = 123;
        int b1 = a1 %10;
        int c1 = (a1-b1) %100; 
        int d1 = (a1-c1-b1)%1000;
        System.out.println(b1+c1+d1);
        
        //a=��/���λ%10   �Ϳ��Եó����λ�ϵ����֡�
        int a4 = 1234;
       int b4 = a4/1000%10;
        
        
    	
//		�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�
 double a5 = 32.5;
 double b5 = 
		 //����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
			 char aw = 'A';
			char bw = (char)(a + 32);
			System.out.println(b);
			//�ڽ���ǿ��ת��ʱ��char������int����֮������ͬ�����ͣ�����ǿ��ת����
			//����������int���Ͳ���ͬ�ּ������ͣ����Բ���ת��
        
        
	}

}
