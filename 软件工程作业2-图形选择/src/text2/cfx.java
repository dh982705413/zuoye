package text2;

public class cfx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Main dh=new Main();
		y = dh.dhtext(2, 120, "长方形","长");
		x = dh.dhtext(2,y,"长方形","宽");
		for(int i = 0 ; i<x ; i++){
            System.out.print("*");
            for(int j = 0 ;j<y-2; j++){
                if( i==0 | i== (x-1) ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("*");
        }
    }


}
