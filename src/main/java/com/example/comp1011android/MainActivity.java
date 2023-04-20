package com.example.comp1011android;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        ImageView calc = findViewById(R.id.imageView_calc);
//        ImageView pro = findViewById(R.id.imageView_pro);
//        ImageView fm = findViewById(R.id.imageView_fm);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             //   Toast.makeText(getApplicationContext(), "Clicked from " + view.getId(), Toast.LENGTH_LONG).show();

                Intent intent;

                switch (view.getId())
                {
                 //   case R.id.imageView_calc:
                      //  intent = new Intent(getApplicationContext(), CalculatorActivity.class);
                }
            }
        };

//        calc.setOnClickListener(onClickListener);
//        pro.setOnClickListener(onClickListener);
//        fm.setOnClickListener(onClickListener);

    }
}