package assignment3;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import assignment3.beans.Vehicle;
import com.example.comp1011android.MainActivity;
import com.example.comp1011android.R;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class BaseActivity extends AppCompatActivity
{
    ListView vehicleList;
    ArrayList<Vehicle> vehicleData = new ArrayList<>();
    final String db_file = "myappdata";

    final String  FILE_DIR = Environment.getExternalStorageDirectory().getAbsolutePath() +  "/";

    public static final int to_locate = 100;
    public static final int retrieve_images = 900;
    Random random = new Random();




    public String randomStringGenerator(int limit){
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(limit)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();


    }

    protected void readFileContents() throws Exception{

        FileInputStream fileInputStream = openFileInput(db_file);

        Scanner scanner = new Scanner(fileInputStream);




        while(scanner.hasNext()){
            String content = scanner.nextLine();
            Vehicle vehicle = new Vehicle();
            String[] data = content.split(",");
            vehicle.setFullSizeImage(data[0]);
            vehicle.setColor(data[1]);
            vehicle.setMake(data[2]);
            vehicle.setCondition(data[3]);
            vehicleData.add(vehicle);
        }
    }

    protected void writeFileContents(String content) throws Exception{

        FileOutputStream fileOutputStream = openFileOutput(db_file, Context.MODE_APPEND);

        fileOutputStream.write(content.getBytes());

    }
    protected void clearContents() throws Exception{

        FileOutputStream fileOutputStream = openFileOutput(db_file, Context.MODE_PRIVATE);

        fileOutputStream.write("".getBytes());

    }





    public void disableEditText(EditText editText) {
        editText.setFocusable(false);
        editText.setEnabled(false);
        editText.setCursorVisible(false);
        editText.setKeyListener(null);
        editText.setBackgroundColor(Color.TRANSPARENT);
    }
}
