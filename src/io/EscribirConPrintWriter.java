package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirConPrintWriter
{

    PrintWriter salida = null;

    public EscribirConPrintWriter(String path, String fileName) throws IOException
    {
	salida = new PrintWriter(new FileWriter(path + fileName));
    }

    public void Escribir(int[] vec)
    {
	int corte = vec.length - 1;
	
	for (int i = 0; i < corte ; i++)
	{
	    salida.println(vec[i]);
	}
	
	salida.print(vec[corte]);

	salida.close();
    }
}
