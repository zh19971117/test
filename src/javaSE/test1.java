package javaSE;

public class test1 {
public static void main(String[] args) {
	
	/*
	 * 0-9��  ʮ����48
	 * A-Z��  ʮ����65
	 * a-z: ʮ����97
	 * */
	 //ʮ����
    int a =10;//10
    //ʮ������
    int b = 0x10;//16
    //�˽���
    int c = 010;//8
    //������
    int d = 0B100;//4
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
	//ʮ����ת������������
	System.out.println(Integer.toBinaryString(100));
    System.out.println(Integer.toHexString(100));
    System.out.println(Integer.toOctalString(100));
    
    //����������ʽת����������double����ֱ��ת���� float
   //float y = 31.4;
    //���������㲻׼ȷ
    double q = 3.14;
    double w = 314.0;
    double e = .314;
    double r = 3.14e2;//314
    double t = 3.14e-1;//0.314
    //����븡����������Ծ�ȷ��BigDecimal
    
    char u = 'a';
    char i = '��';
    char o = '\u4E01';
    System.out.println(u);
    System.out.println(o);
    
    System.out.println("\\bchar");
    System.out.println("escape\\tchar");
    System.out.println("escape\\rchar");
    System.out.println("escape\\nchar");
    System.out.println("\\����б����\\");
    System.out.println("\'���ڵ�������\'");
    System.out.println("\\��û�е�����\\");
    System.out.println("\"����˫������\"");
    System.out.println("��û��˫����");
    
    //����ѧ����ʱҲ���������͵�ת��
    int kk = 97;
    char cc = (char)kk;
System.out.println(cc);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
