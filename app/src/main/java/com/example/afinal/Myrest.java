package com.example.afinal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Myrest extends AppCompatActivity {
    MediaPlayer mediaPlayer1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myrest);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.xiuqizhan);
        mediaPlayer1.start();
        int PL=168;
        SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("PL",PL);
        editor.apply();

        Toast.makeText(Myrest.this,"勇士，您已休憩完毕，PL已满",Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);/*第一个参数是指将哪个菜单资源文件创建出来，
                           第二个改菜单赋予哪个菜单对象、*/
        return true;//意思是显示出来
    }

    //为菜单项添加响应
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //通过item.getItemId()对不同选项进行不同的处理
        switch (item.getItemId())
        {
            case R.id.menu_person:
                mediaPlayer1.stop();
                Intent intent = new Intent(Myrest.this,Myperson.class);
                startActivity(intent);
                break;
            case R.id.menu_back:
                mediaPlayer1.stop();
                Intent intent1 = new Intent(Myrest.this,Role.class);
                startActivity(intent1);
                break;
            case R.id.menu_reset:
                mediaPlayer1.stop();
                Intent intent2 = new Intent(Myrest.this,Mychange.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        return true;
    }
}
