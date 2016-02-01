package com.test.example.kato.hyoryomokkuappu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = (Button) findViewById(R.id.send_button);
        sendButton.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent intent = new Intent(getApplication(), SubActivity.class);
                                              startActivity(intent);
                                          }
                                      });

        //ボタンを設定しました
        Button buttonA = (Button) findViewById(R.id.buttonA);

        //TextViewの設定
        textView = (TextView) findViewById(R.id.textViewA);

        // リスナーをボタンに登録
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                // counterを2で割った余りが0の時
                if (counter % 2 == 0) {
                    textView.setText("Hello");
                }
                // counterを2で割った余りが0以外、つまり1の時
                else {
                    textView.setText("World");
                }
            }
        });
    }
}