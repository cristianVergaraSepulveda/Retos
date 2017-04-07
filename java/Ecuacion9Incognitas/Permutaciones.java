package resuelve.ecuacion;

import java.util.LinkedList;
		
public class Permutaciones {
	static int contador=1;
	public static void main(String[] args) {
        LinkedList<Character> conjunto =new LinkedList<Character>();
        conjunto.add('1');
        conjunto.add('2');
        conjunto.add('3');
        conjunto.add('4');
        conjunto.add('5');
        conjunto.add('6');
        conjunto.add('7');
        conjunto.add('8');
        conjunto.add('9');        
        escribe ("", conjunto);
    }

    public static void escribe(String a, LinkedList<Character> conjunto) {
    	
        if (conjunto.size()==1)
        {
            //System.out.println(a+conjunto.get(0));
        	String cadena = a+conjunto.get(0);
            ecuacion(cadena);
        }
        for (int i=0;i<conjunto.size();i++)
        {
            Character b = conjunto.remove(i);
            escribe (a+b, conjunto);
            conjunto.add(i,b);
        }
    }
    
    public static  boolean ecuacion(String cadena){ 
    	Double a,b,c,d,e,f,g,h,i=0.0;
		//System.out.println(cadena);
		
		a= Double.valueOf(cadena.substring(0, 1));
		b=Double.valueOf(cadena.substring(1, 2));		
		c=Double.valueOf(cadena.substring(2, 3));
		d=Double.valueOf(cadena.substring(3, 4));
		e=Double.valueOf(cadena.substring(4, 5));
		f=Double.valueOf(cadena.substring(5, 6));
		g=Double.valueOf(cadena.substring(6, 7));
		h=Double.valueOf(cadena.substring(7, 8));
		i=Double.valueOf(cadena.substring(8, 9));
		//	System.out.println("a,b,c,..k,i:"+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i);
		double num1=a/(b*c);
		double num2=d/(e*f);
		double  num3=g/(h*i);
		
		double resultado = num1+num2+num3;
		if ( resultado==1){
			System.out.println(contador+".-"+num1+"+"+num2+"+"+num3+"=1 ");
			System.out.println("a,b,c,d,e,f,g,h,i:"+a.intValue()+","+b.intValue()+","+c.intValue()+","+d.intValue()+","+e.intValue()+","+f.intValue()+","+g.intValue()+","+h.intValue()+","+i.intValue());
			contador++;
			return true;
		}else{
			//System.out.println("devuelve cualquier cosa:"+a+b+c+d+e+f+g+h+i );
			return false;			
		}
	}
}
