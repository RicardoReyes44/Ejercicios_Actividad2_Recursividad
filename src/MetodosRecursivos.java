
public class MetodosRecursivos {
	
	public static long factorial(long num) {
		if(num==1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}
	
    public static int divisores(int num, int div) {
		if(div==1) {
			return 1;
		}else {
			if(num%div==0) {
				System.out.println(div);
			}
			return divisores(num, div-1);
		}
	}

}
