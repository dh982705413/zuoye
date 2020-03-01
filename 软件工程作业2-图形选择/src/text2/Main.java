package text2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("1.等腰直角三角形    2.正方形    3.长方形    4.金字塔        0.退出");
	System.out.print("请输入序号：");
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
		System.out.println("退出选择！！！ ");
		break;
	default:System.out.println("请正确输入！！！");
	
	} 
}
	

    public int dhtext(int low, int high, String str1,String str2){
    	int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入" + str1 + "的"+str2+"(大小限制" + low + "-" + high + "):");
		temp = scanner.nextInt();
		while (temp == 0 || temp < low || temp > high) {
			System.out.println(str1 +"的"+str2+ "必须大于等于" + low + ",小于等于" + high + ",请重新输入：");
			temp = scanner.nextInt();
		}
	   return temp;
	}

}
