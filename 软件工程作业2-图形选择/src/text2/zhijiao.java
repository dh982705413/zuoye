package text2;

public class zhijiao {

	public static void main(String[] args) {
		Main dh=new Main();
		int tempa, thickness, i, j;
		tempa = dh.dhtext(2, 120, "等腰直角三角形","底长");
		thickness = dh.dhtext(1,tempa,"等腰直角三角形","厚度");
        
		for (i = 1; i <= tempa; i++) {
			if (i <= thickness) {
				for (j = 1; j <= thickness; j++)
					System.out.print("#");
			} else if (i > tempa - thickness) {
				for (j = 1; j <= i; j++)
					System.out.print("#");
			} else {
				for (j = 1; j <= i; j++) {
					if (j < thickness + 1)
						System.out.print("#");
					else if (j > i - thickness)
						System.out.print("#");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}

}
