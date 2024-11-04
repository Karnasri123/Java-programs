package interfac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serial {

//serializable is a interface it does not have any method like unimplemented methods
// serializable hepls to convert object data to network data which is not understand by reader

public static void main(String[]args)
{
	emplyee7 ee=new emplyee7();
	ee.setEid(1);
	ee.setEname("sriram");
	ee.setEsal(89.8);
	ee.setEdesg("se");
	ee.setEloc("bang");
	
	try {
		System.out.println("object converting to network");
		FileOutputStream fs= new FileOutputStream("E:\\file reader\\java material/srisri.txt");
		ObjectOutputStream os= new ObjectOutputStream(fs);
		os.writeObject(ee);// writing data in file
		System.out.println("serialization completed");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
