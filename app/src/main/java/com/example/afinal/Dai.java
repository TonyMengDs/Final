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

public class Dai extends AppCompatActivity {
    MediaPlayer mediaPlayer1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dai);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.wenzi);
        mediaPlayer1.start();
        int Dai;
        SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        Dai = sharedPreferences.getInt("Dai",0);
        Dai = Dai +1;

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("Dai",Dai);
        editor.apply();

        Toast.makeText(Dai.this,"勇士，您看起来很无聊，您的无聊值+1",Toast.LENGTH_SHORT).show();
        if(Dai==3){
            Toast.makeText(Dai.this,"勇士，恭喜您获得'无聊达人'称号",Toast.LENGTH_SHORT).show();
            String call = new String("无聊达人");
            editor.putString("call",call);
            editor.apply();
        }
        else if(Dai==50){
            Toast.makeText(Dai.this,"勇士，恭喜您获得'无聊强者'称号",Toast.LENGTH_SHORT).show();
            String call = new String("无聊强者");
            editor.putString("call",call);
            editor.apply();
        }
        else if(Dai==100){
            Toast.makeText(Dai.this,"勇士，恭喜您获得'无聊至尊'称号",Toast.LENGTH_SHORT).show();
            String call = new String("无聊至尊");
            editor.putString("call",call);
            editor.apply();
        }
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
                Intent intent = new Intent(Dai.this,Myperson.class);
                startActivity(intent);
                break;
            case R.id.menu_back:
                mediaPlayer1.stop();
                Intent intent1 = new Intent(Dai.this,Role.class);
                startActivity(intent1);
                break;
            case R.id.menu_reset:
                mediaPlayer1.stop();
                Intent intent2 = new Intent(Dai.this,Mychange.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        return true;
    }
}
