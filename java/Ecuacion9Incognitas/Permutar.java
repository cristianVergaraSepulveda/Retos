package minreto;

public class Permutacion {
	public static void main(String[] args){
		int[] numeros = {1,2,3,4,5,6,7,8,9};
		int n = numeros.length;
	     Perm1(numeros, "loop:", n, n);
	}
	
	 private static void Perm1(int[] elem, String act, int n, int r) {
		 if (n == 0) {
	            System.out.println(act);
	        }else{
				for(int i = 0; i < r; i++) {
	            	int[] temp = elem;
	            	for (int j = 0; j < temp.length; j++) {            		
	            		System.out.print(temp[j]);	
					}
	            	int numAMover =temp[i];
	            	temp[i]=temp[i+1];
	            	temp[i+1]=numAMover;
	            	Perm1(elem, act + elem[i] , n - 1, r);
	            }
	        }
	 }
}
