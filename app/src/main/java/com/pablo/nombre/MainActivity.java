package com.pablo.nombre;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static String TAG= "ActivityName";

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");

        final EditText editText =(EditText) findViewById(R.id.editText);
        CharSequence text = editText.getText();
        outState.putCharSequence(SavedText", texto");
    }
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }
    //Almacena el texto que ingreso el usuario





    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");


        final TextView texView = (TextView) findViewById(R.id.editText);
        CharSequence savedText = SavedInstanceState.getCharSequence("savedText");
                texView.setText(savedText);
    }
}
