package interfac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class deserial {
 //if you want send data in hidden format then use serializable.
//if you want send data in readable format then use Deserializable.
// if you change data in file then it will say data is corrupted and no execution will happen.	
	public static void main(String[] args) {
		try {
			System.out.println("network data to readable data");
			FileInputStream fs= new FileInputStream("E:\\file reader\\java material/srisri.txt");
			ObjectInputStream os= new ObjectInputStream(fs);
			emplyee7 ee= (emplyee7)os.readObject();
			System.out.println(ee);
			System.out.println("deserialization completed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
