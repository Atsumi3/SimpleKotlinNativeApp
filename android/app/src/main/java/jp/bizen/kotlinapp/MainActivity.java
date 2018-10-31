package jp.bizen.kotlinapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        setContentView(textView);

        // 中央表示
        textView.setGravity(Gravity.CENTER);

        // Kotlin側のコード呼び出し
        textView.setText(CommonKt.createApplicationScreenMessage());
    }
}
