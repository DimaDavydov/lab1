public class LR1{
public static void main(String[] arg){
	long[]p = new long[9];
	for(int i = 0, j = 7; i < 9; i++, j+=2){
		p[i] = j;
		//System.out.println((i+1)+": "+p[i]);
	}
	float[]x = new float[16];
	//System.out.println();
	for(int i = 0; i < 15; ++i){
		x[i] = (float)(Math.random()*16-11);
		//System.out.println((i+1)+": "+x[i]);
	}
	double[][]d = new double[9][16];
	//System.out.println();
	for(int i = 0; i < 9; ++i){
		for(int j = 0; j < 15; j++){
			if(p[i]==11){
				d[i][j] = Math.pow((Math.cos(Math.asin((x[j]-3)/16))),((Math.atan(Math.exp(-Math.abs(x[j]))))*(1-Math.pow((1/3+Math.pow((4/(x[j]+1)),x[j])),3))));
				//System.out.print("bu");
			} else if(p[i]==7 | p[i]==13 | p[i]==19 | p[i]==21){
				d[i][j] = Math.tan(Math.tan(Math.pow((x[j]/Math.PI),x[j])));
				//System.out.print("be");
			} else {
				d[i][j] = Math.pow(Math.PI*Math.cbrt((2+Math.cos(x[j]))/Math.PI),2);
				//System.out.print(d[i][j]);
			}
			System.out.printf("%-10.5f",d[i][j]);
		}
		System.out.println();
	}
}
}
	
	