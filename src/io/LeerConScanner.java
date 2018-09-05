package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LeerConScanner
{
    Scanner sc = null;
    private int[] vec = null;

    public LeerConScanner(String path, String fileName) throws FileNotFoundException
    {
	File archivo = new File(path + fileName);
	sc = new Scanner(archivo);
	sc.useLocale(Locale.ENGLISH);
    }

    public int[] LeerInt()
    {
	vec = new int[sc.nextInt()];

	for (int i = 0; i < vec.length; i++)
	{
	    vec[i] = sc.nextInt();
	}

	sc.close();
	return vec;
    }
}
