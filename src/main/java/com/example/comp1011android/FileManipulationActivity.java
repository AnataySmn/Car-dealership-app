package com.example.comp1011android;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileManipulationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_file_manipulation);


       // private void readFileContents() throws Exception{
       //     EditText output = fileViewById(R.id.fileContens);

            StringBuilder sb = new StringBuilder();

          //  FileInputStream fis = openFileInput(fileName);

        //    Scanner in = new Scanner(fis);

       //     while(in.hasNext())
            {
          //      sb.append(in.nextLine().append("\n"));

            }

     //       output.setText(sb.toString());


        }
        private void writeFileContents(String content) throws Exception
        {
        //    FileOutputStream fos = getApplicationContext().openFileOutput(fileName, Context.A)
            //        fos.write(content.getBytes());
        }

        private void onSaveClick(View view)
        {
           // EditText content = findViewById(R.id.file)
        }
    }
//}