package com.example.zert2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroupPhoto;
    private ImageView imageViewPhoto;
    private TextView textView;
    private String result;

    private Integer []photos = {R.drawable.item1,R.drawable.item2,R.drawable.item3
            ,R.drawable.item4,R.drawable.item5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView = findViewById(R.id.resultView);
        this.imageViewPhoto = (ImageView) findViewById(R.id.imageView);
        this.radioGroupPhoto = findViewById(R.id.RadioGroupPhoto);

        RadioButton defaultRadioButton = findViewById(R.id.item1);
        defaultRadioButton.setChecked(true);
        int defaultIndex = radioGroupPhoto.indexOfChild(defaultRadioButton);
        imageViewPhoto.setImageResource(photos[defaultIndex]);


        this.radioGroupPhoto.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = radioGroup.findViewById(i);
                int index = radioGroup.indexOfChild(radioButton);
                switch (index){
                    case 0:
                        result = "11500 тг";
                        break;
                    case 1:
                        result = "10000 тг";
                        break;
                    case 2:
                        result = "9000 тг";
                        break;
                    case 3 :
                        result = "8000 тг";
                        break;
                    case 4:
                        result = "7000 тг";
                        break;
                }

                textView.setText(result);
                imageViewPhoto.setImageResource(photos[index]);
            }
        });

    }
}