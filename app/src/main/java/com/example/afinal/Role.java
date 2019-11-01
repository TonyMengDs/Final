package com.example.afinal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Role extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

        int level=1;
        int PL=168;
        int Dai=0;
        String call = new String("无");
        String name = new String("小呆瓜");
        String type = new String("狂战士");
        String weapon = new String("小木剑");
        String jacket = new String("布甲");
        String shoulder = new String("布肩");
        String belt = new String("布带");
        String leg = new String("布腿");
        String shoes = new String("布鞋");
        String necklace = new String("布项链");
        String ring = new String("草戒指");
        String bracelet = new String("不锈钢手镯");
        String auxiliary = new String("破败的辅助装备");
        String earrings = new String("银质耳环");
        String sorcerer = new String("火魔法石");

        SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        level = sharedPreferences.getInt("level",1);
        PL = sharedPreferences.getInt("PL",168);
        Dai = sharedPreferences.getInt("Dai",0);
        call = sharedPreferences.getString("call","无");
        name = sharedPreferences.getString("name","小呆瓜");
        type = sharedPreferences.getString("type","狂战士");
        weapon = sharedPreferences.getString("weapon","小木剑");
        jacket = sharedPreferences.getString("jacket","布甲");
        shoulder = sharedPreferences.getString("shoulder","布肩");
        belt = sharedPreferences.getString("belt","布带");
        leg = sharedPreferences.getString("leg","布腿");
        shoes = sharedPreferences.getString("shoes","布鞋");
        necklace = sharedPreferences.getString("necklace","布项链");
        ring = sharedPreferences.getString("ring","草戒指");
        bracelet = sharedPreferences.getString("bracelet","不锈钢手镯");
        auxiliary = sharedPreferences.getString("auxiliary","破败的辅助装备");
        earrings = sharedPreferences.getString("earrings","银质耳环");
        sorcerer = sharedPreferences.getString("sorcerer","火魔法石");

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);/*第一个参数是指将哪个菜单资源文件创建出来，
                           第二个改菜单赋予哪个菜单对象、*/
        return true;//意思是显示出来
    }

    //为菜单项添加响应
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //通过item.getItemId()对不同选项进行不同的处理
        switch (item.getItemId())
        {
            case R.id.menu1_reset:
                Intent intent = new Intent(Role.this,Mychange.class);
                startActivity(intent);
                break;
            case R.id.menu1_person:
                Intent intent1 = new Intent(Role.this,Myperson.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        int PL;
        SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        PL = sharedPreferences.getInt("PL",168);
        switch (view.getId())
        {
            case R.id.button1:
                if(PL<=0){
                    Toast.makeText(Role.this,"勇士，您的PL值不够，请先前往休憩站休憩",Toast.LENGTH_SHORT).show();
                    break;
                }
                else{
                    Intent intent2 = new Intent(Role.this,hell.class);
                    startActivity(intent2);
                    break;
                }
            case R.id.button2:
                Intent intent3 = new Intent(Role.this,Myrest.class);
                startActivity(intent3);
                break;
            case R.id.button3:
                Intent intent4 = new Intent(Role.this,Dai.class);
                startActivity(intent4);
                break;
        }
    }
}
