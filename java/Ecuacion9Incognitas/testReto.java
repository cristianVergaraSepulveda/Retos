package minreto;

public class TestReto {

	
	static int[] arregloInt= new int[9];
	
	public static  void main(String[] args) {
		 TODO Auto-generated method stub
		
		iniciamos arregloInt
		for (int i = 0; i  arregloInt.length; i++) {
			arregloInt[i]=1+1;
		}
		int[] arregloCorrecto = new int[9];
		arregloCorrecto= permutar();
		
	}

	public static  boolean ecuacion(int[] arr){ 
		int a,b,c,d,e,f,g,h,i=0;
		a=arr[0];
		b=arr[1];
		c=arr[2];
		d=arr[3];
		e=arr[4];
		f=arr[5];
		g=arr[6];
		h=arr[7];
		i=arr[8];
			
		double num1=a(b+c);
		double num2=d(ef);
		double  num3=g(hi);
		
		double resultado = num1+num2+num3;
		if ( resultado==1){
			System.out.println(devuelve 1);
			return true;
		}else{
			return false;
		}
	}
	
	descubre orden de numeros para que ecuacion de 1 
	public static  int[] permutar(){
		realiza ordenamiento  y llama a funcion ecuacion
		int[] aux = arregloInt;
		de mi arreglo principal 1,2,3,4,5,6,7,8,9
		for (int i = 0; i  arregloInt.length; i++) {
			donde el primer elemento se debe mover 9 veces 
			1,2,3,...8,9
			2,1,3,4...8,9
			2,3,1,4...,9
			for (int j = 0; j  aux.length; j++) {
				
				int numAMover =aux[j];
					aux[j]=aux[j+1];
					aux[j+1]=numAMover;
				System.out.println(aux.toString().toCharArray().toString());
				if(ecuacion(aux)){
					return aux;
				}
			}
		}
		
		return aux;
	}
}
