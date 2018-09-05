package secuenciasmax;

import io.EscribirConPrintWriter;
import io.LeerConScanner;
import java.io.IOException;
import org.junit.Test;

public class SecuenciasMaximasTest
{
    @Test
    public void prueba1()
    {
	LeerConScanner scanner = null;
	EscribirConPrintWriter escritor = null;

	try
	{
	    scanner = new LeerConScanner("", "secmax.in");
	    escritor = new EscribirConPrintWriter("", "secmax.out");
	} catch (IOException e)
	{
	}

	if (scanner != null)
	{
	    int[] input = scanner.LeerInt();

	    for (int i = 0; i < input.length; i++)
	    {
		System.out.println(input[i]);
	    }

	    // Procesar y escribir

	    if (escritor != null)
	    {
		escritor.Escribir(SecuenciasMaximas.secuencias(input));
	    }
	}

    }

}
