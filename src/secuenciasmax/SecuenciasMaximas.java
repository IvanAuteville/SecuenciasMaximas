package secuenciasmax;

public class SecuenciasMaximas
{
    public static int[] secuencias(int[] input)
    {
	int valoresValidos = 0;
	int secuenciaMax = 0;
	int secuenciaAux = 0;
	int[] output = null;

	for (int n = 0; n < input.length; n++)
	{
	    if (esValido(input[n]))
	    {
		valoresValidos++;
		secuenciaAux++;

		if (secuenciaMax < secuenciaAux)
		{
		    secuenciaMax = secuenciaAux;
		}

	    } else
	    {
		secuenciaAux = 0;
	    }
	}

	if (valoresValidos == 0)
	{
	    output = new int[1];
	    output[0] = 0;
	} else
	{
	    output = new int[2];
	    output[0] = valoresValidos;
	    output[1] = secuenciaMax;
	}

	return output;
    }

    private static boolean esValido(int i)
    {
	if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
	{
	    return true;
	}

	return false;
    }
}
