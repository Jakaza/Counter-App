package com.example.myapplication;


import static android.content.Context.MODE_PRIVATE;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileManager extends AppCompatActivity {

    public void writeToFile(String data, String filename){

        try {
            FileOutputStream fileout= openFileOutput(filename, MODE_PRIVATE);
//            OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
            fileout.write(data.getBytes());
            fileout.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
