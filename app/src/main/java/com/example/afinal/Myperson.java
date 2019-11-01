package com.example.afinal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class Myperson extends AppCompatActivity {

    private View view1,view2;
    private ViewPager viewPager;
    private List<View> viewList;

    TextView nameText;
    TextView typeText;
    TextView weaponText;
    TextView jacketText;
    TextView shoulderText;
    TextView beltText;
    TextView legText;
    TextView shoesText;
    TextView necklaceText;
    TextView ringText;
    TextView braceletText;
    TextView auxiliaryText;
    TextView earringsText;
    TextView sorcererText;
    TextView callText;
    TextView levelText;
    TextView PLText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myperson);

//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        LayoutInflater inflater = getLayoutInflater();
//        view1 = inflater.inflate(R.layout.activity_myperson,null);
//        view2 = inflater.inflate(R.layout.activity_myperson1,null);
//        viewList = new ArrayList<View>();
//        viewList.add(view1);
//        viewList.add(view2);
//
//        PagerAdapter pagerAdapter = new PagerAdapter() {
//
//            @Override
//            public boolean isViewFromObject(View arg0,Object arg1) {
//                return arg0 == arg1;
//            }
//
//            @Override
//            public int getCount() {
//                return viewList.size();
//            }
//
//
//            @Override
//            public void destroyItem(ViewGroup container,int position,Object object)
//            {
//                container.removeView(viewList.get(position));
//            }
//            @Override
//            public Object instantiateItem(ViewGroup container,int position)
//            {
//                container.addView(viewList.get(position));
//                return viewList.get(position);
//            }
//        };



        int level;
        int PL;
        int Dai;
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
        String auxiliary = new String("辅助装备");
        String earrings = new String("耳环");
        String sorcerer = new String("魔法石");

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

        nameText = findViewById(R.id.textView17);
        weaponText = findViewById(R.id.textView18);
        shoulderText = findViewById(R.id.textView19);
        legText = findViewById(R.id.textView20);
        necklaceText = findViewById(R.id.textView21);
        braceletText = findViewById(R.id.textView22);
        earringsText = findViewById(R.id.textView23);
        callText = findViewById(R.id.textView24);
        jacketText = findViewById(R.id.textView25);
        beltText = findViewById(R.id.textView26);
        shoesText = findViewById(R.id.textView27);
        ringText = findViewById(R.id.textView28);
        auxiliaryText = findViewById(R.id.textView29);
        sorcererText = findViewById(R.id.textView30);
        levelText = findViewById(R.id.textView31);
        typeText = findViewById(R.id.textView32);

        nameText.setText(name);
        weaponText.setText(weapon);
        shoulderText.setText(shoulder);
        legText.setText(leg);
        necklaceText.setText(necklace);
        braceletText.setText(bracelet);
        earringsText.setText(earrings);
        callText.setText(call);
        jacketText.setText(jacket);
        beltText.setText(belt);
        shoesText.setText(shoes);
        ringText.setText(ring);
        auxiliaryText.setText(auxiliary);
        sorcererText.setText(sorcerer);
        levelText.setText(level+"级");
        typeText.setText(type);

//        viewPager.setAdapter(pagerAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2,menu);/*第一个参数是指将哪个菜单资源文件创建出来，
                           第二个改菜单赋予哪个菜单对象、*/
        return true;//意思是显示出来
    }

    //为菜单项添加响应
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //通过item.getItemId()对不同选项进行不同的处理
        switch (item.getItemId())
        {
            case R.id.menu2_reset:
                Intent intent = new Intent(Myperson.this,Mychange.class);
                startActivity(intent);
                break;
            case R.id.menu2_back:
                Intent intent1 = new Intent(Myperson.this,Role.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
        return true;
    }
}
