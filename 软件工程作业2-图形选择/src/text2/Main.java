package text2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("1.����ֱ��������    2.������    3.������    4.������        0.�˳�");
	System.out.print("��������ţ�");
	int n=0;
    Scanner nScanner=new Scanner(System.in);
    n=nScanner.nextInt();
    switch (n) {
	case 1:
	   zhijiao zj=new zhijiao();
	   zj.main(args);
		break;
	case 2:
	    zfx zfx=new zfx();
	    zfx.main(args);
		break;
	case 3:
		cfx cfx=new cfx();
		cfx.main(args);
		break;
	case 4:
		jzt jzt=new jzt();
		jzt.main(args);
		break;
	case 0:
		System.out.println("�˳�ѡ�񣡣��� ");
		break;
	default:System.out.println("����ȷ���룡����");
	
	} 
}
	

    public int dhtext(int low, int high, String str1,String str2){
    	int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������" + str1 + "��"+str2+"(��С����" + low + "-" + high + "):");
		temp = scanner.nextInt();
		while (temp == 0 || temp < low || temp > high) {
			System.out.println(str1 +"��"+str2+ "������ڵ���" + low + ",С�ڵ���" + high + ",���������룺");
			temp = scanner.nextInt();
		}
	   return temp;
	}

}
