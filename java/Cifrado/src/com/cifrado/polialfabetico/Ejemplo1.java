package com.cifrado.polialfabetico;

public class Ejemplo1 {

	String textoCifrado="";
	int llaveIndex=0;
	int[][] tablaVigenere = null;
	String textoPlano;
	String llave;
	 
	public void Ejemplo(){}
	
	public String cifrar(  ) {
		for (int ptextIndex = 0; ptextIndex < textoPlano.length(); ptextIndex++) {
			char pChar = textoPlano.charAt(ptextIndex);
			int asciiVal = (int) pChar;
			if (pChar == ' ') {
				textoCifrado += pChar;
				continue;
			}
			if (asciiVal < 65 || asciiVal > 90) {
				textoCifrado += pChar;
				continue;
			}

			int basicPlainTextValue = ((int) pChar) - 65;

			char kChar = llave.charAt(llaveIndex);
			int basicLlaveValue = ((int) kChar) - 65;
			
			int tableEntry = tablaVigenere[basicPlainTextValue][basicLlaveValue];
			char cChar = (char) (tableEntry + 65);
			textoCifrado += cChar;
			llaveIndex++;
			if (llaveIndex == llave.length()) {
				llaveIndex = 0;
			}
		}
		return textoCifrado;
	}
	
	public String decifrar(String textoCifrado ){
		
		for (int ctextIndex = 0; ctextIndex < textoCifrado.length(); ctextIndex++)
		{
		    char cChar = textoCifrado.charAt(ctextIndex);
		    int asciiVal = (int) cChar;
		    if (cChar == ' ')
		    {
		        textoPlano += cChar;
		        continue;
		    }
		    if (asciiVal < 65 || asciiVal > 90)
		    {
		        textoPlano += cChar;
		        continue;
		    }

		    int basictextoCifradoValue = ((int) cChar) - 65;
		    char kChar = llave.charAt(llaveIndex);
		    int basicKeyValue = ((int) kChar) - 65;

		    for (int pIndex = 0; pIndex < TamañoColumnaTabla; pIndex++)
		    {
		        if (tablaVigenere[basicKeyValue][pIndex] == basictextoCifradoValue)
		        {
		            char potcChar = (char) (tablaVigenere[basicKeyValue][pIndex] + 65);
		            char potpChar = (char) (pIndex + 65);
		            textoPlano += potpChar;
		        }
		    }
		    llaveIndex++;
		    if (llaveIndex == llave.length())
		    {
		        llaveIndex = 0;
		    }
		}
	}
	
}
