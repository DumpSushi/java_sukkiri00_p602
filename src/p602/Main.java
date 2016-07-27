package p602;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args)  throws Exception {
		final String readFile = "src/p602/test.txt";
		final String writeFile = "src/p602/out.txt";
		FileReader fr = new FileReader(readFile);
		FileWriter fw = new FileWriter(writeFile);
		while(true)
		{
			char[]	buf = new char[1024];
			int	readSize = fr.read(buf, 0, buf.length);
			if (readSize == -1)
			{
				break;
			}
			else
			{
				fw.write(buf, 0, readSize);
			}
		}
		fr.close();
		fw.close();
	}

}
