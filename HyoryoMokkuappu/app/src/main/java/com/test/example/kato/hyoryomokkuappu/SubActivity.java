package com.test.example.kato.hyoryomokkuappu;

/**画面遷移練習。上手くいけばモックアップに
 * Created by kato on 2016/01/31.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //前の画面に戻るボタン.アクティビティを終了させている
        Button returnButton = (Button) findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //次の画面へ進むボタン.
        Button to_ratio_activity_button = (Button) findViewById(R.id.to_ratio_activity_button);
        to_ratio_activity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ratio_activity.class);
                startActivity(intent);
            }
        });
    }
}

