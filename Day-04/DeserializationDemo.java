
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

class Details implements Serializable {
    int id;
    String name;

    Details(int id, String name) {
        this.id = id;
        this.name = name;

    }

}

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            Details st = new Details(101, "komal");

            FileOutputStream fOS = new FileOutputStream("Student.ser");

            ObjectOutputStream oOS = new ObjectOutputStream(fOS);

            oOS.writeObject(st);
            oOS.close();
            fOS.close();

            System.out.println("Object serialized successfully!!!!!!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
