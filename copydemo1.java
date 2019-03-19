
import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.OutputStream;
	public class copydemo1 {
		public String path=System.getProperty("user.dir");
	/**
	* @param args
	* @throws IOException
	*/
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub	
	String fromPath = (System.getProperty("user.dir")+"\\dataFreeSpins\\leena.txt"); //Local folder path

	String toPath=("\\\\10.115.3.36\\C$\\MGS_TestData\\abc.txt");//remote server ip and sharing folder name
	//String toPath="F:\\data\\copy.txt";//remote server ip and sharing folder name

	copydemo1 cf=new copydemo1();
	cf.copyFolder(new File(fromPath),new File(toPath));

	}

	public void copyFolder(File src, File dest) throws IOException {

	if (src.isDirectory()) {

	if (!dest.exists()) {
	dest.mkdir();

	}

	String files[] = src.list();

	for (String file : files) {

	File srcFile = new File(src, file);
	File destFile = new File(dest, file);
	copyFolder(srcFile, destFile);
	}

	} else {
	InputStream in = new FileInputStream(src);
	OutputStream out = new FileOutputStream(dest);
	byte[] buffer = new byte[1024];

	int length;
	while ((length = in.read(buffer)) > 0) {
	out.write(buffer, 0, length);
	}
	in.close();
	out.close();

	}

	}
	}
