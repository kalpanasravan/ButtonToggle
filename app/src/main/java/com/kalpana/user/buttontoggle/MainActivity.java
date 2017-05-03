package com.kalpana.user.buttontoggle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton;
    private TextView textView;
    private CompoundButton buttonView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView) findViewById(R.id.imageView1);
        ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) imageView.getLayoutParams();
        params.width = 120;
        params.height=150;
        imageView.setLayoutParams(params);

        toggleButton=(ToggleButton)findViewById(R.id.toggleButton1);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    Toast.makeText(MainActivity.this,"Compound button checked",Toast.LENGTH_SHORT).show();

                    imageView.setVisibility(View.INVISIBLE);

                }


                else
                {
                    Toast.makeText(MainActivity.this,"Compound button not checked",Toast.LENGTH_SHORT).show();
                    imageView.setVisibility(View.VISIBLE);
                }
            }
        });

        }


}
