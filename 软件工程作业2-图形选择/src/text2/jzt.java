package text2;

public class jzt {

	public static void main(String[] args) {
		Main dh=new Main();
		int x,y,z,i,j;
		x=dh.dhtext(1, 20, "金字塔","层数");
		y=dh.dhtext(1,8, "金字塔","高度");
		z=x*y;
		
		for(i=1;i<=z;i++){
		for(j=1;j<=i+z;j++){
		if((j>=z-i)&&(i+j-z-1)%(2*y)==0){
		System.out.print("/");
		}
		else if((j>z-i)&&((z+i-j)%(2*y))==0){
			System.out.print("\\");
	  }
	  else if((j>z-i)&&(j<z+i)&&(i%y==0)){
		  System.out.print("_");
	}
		else System.out.print(" ");
	 }
		System.out.println("");
}
		
	}

}
