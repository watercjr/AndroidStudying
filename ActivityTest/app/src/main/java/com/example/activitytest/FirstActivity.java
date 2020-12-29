package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 加载layout
        setContentView(R.layout.first_layout);
        // 注册button点击事件
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // toast的使用
                Toast.makeText(FirstActivity.this, "You clicked Button1 and Start SecondActivity!", Toast.LENGTH_SHORT).show();
                // 显式intent的使用
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // 隐式intent的使用
//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                startActivity(intent);
            }
        });

        // 注册button点击事件
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // toast的使用
                Toast.makeText(FirstActivity.this, "You clicked Button2 and Start SecondActivity!", Toast.LENGTH_SHORT).show();
                // 隐式intent的使用
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                startActivity(intent);
            }
        });

        // 注册button点击事件
        Button button_browser = (Button) findViewById(R.id.button_browser);
        button_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // toast的使用
                Toast.makeText(FirstActivity.this, "You clicked Button Browser and Start Browser!", Toast.LENGTH_SHORT).show();
                // 隐式intent的使用
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

        // 注册button点击事件
        Button button_dial = (Button) findViewById(R.id.button_dial);
        button_dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // toast的使用
                Toast.makeText(FirstActivity.this, "You clicked Button Browser and Start Dial!", Toast.LENGTH_SHORT).show();
                // 隐式intent的使用
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });
    }

    // 使用menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
