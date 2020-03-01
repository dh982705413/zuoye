package text2;

public class zfx {
public static void main(String[] args) {
	Main dh=new Main();
	int size;
	size = dh.dhtext(2, 120, "正方形","边长");
	
	 for (int c = 1; c <= size; c++) {
         System.out.print("*");
         for (int d = 1; d <= size; d++) {
             if (c == 1 || c == size || d == 0 || d == size)
                 System.out.print("*");
             else {
                 System.out.print(" ");
             }
         }
         System.out.println();

	 }
}
}
