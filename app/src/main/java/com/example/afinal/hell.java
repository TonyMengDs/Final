package com.example.afinal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class hell extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer mediaPlayer1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hell);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.hundouluo);
        mediaPlayer1.start();
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        int level = 1;
        int PL = 168;
        int Dai = 0;
        String call = new String("无");
        String name = new String("小呆瓜");
        String type = new String("狂战士");
        final long l = System.currentTimeMillis();
        final int i = (int) (l % 100);

        SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        level = sharedPreferences.getInt("level", 1);
        PL = sharedPreferences.getInt("PL", 168);

        if (PL <= 0) {
            Toast.makeText(hell.this, "您的PL已不足，请去休憩站休憩", Toast.LENGTH_SHORT).show();
        } else {
            switch (view.getId()) {
                case R.id.button4:
                    PL = PL - 1;
                    level = level + 1;
                    editor.putInt("PL", PL);
                    editor.putInt("level", level);
                    editor.apply();
                    if (i >= 0 && i < 2) {
                        Toast.makeText(hell.this, "恭喜您获得‘妖刀村正'", Toast.LENGTH_SHORT).show();
                        String weapon = new String("妖刀村正");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+weapon).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String weapon = new String("妖刀村正");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("weapon", weapon);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();


                    } else if (i >= 2 && i < 4) {
                        Toast.makeText(hell.this, "恭喜您获得‘星辰命运上衣'", Toast.LENGTH_SHORT).show();
                        String jacket = new String("星辰命运上衣");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+jacket).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String jacket = new String("星辰命运上衣");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("jacket", jacket);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 4 && i < 6) {
                        Toast.makeText(hell.this, "恭喜您获得‘星辰命运护肩'", Toast.LENGTH_SHORT).show();
                        String shoulder = new String("星辰命运护肩");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoulder).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoulder = new String("星辰命运护肩");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoulder", shoulder);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 6 && i < 8) {
                        Toast.makeText(hell.this, "恭喜您获得‘星辰命运腰带'", Toast.LENGTH_SHORT).show();
                        String belt = new String("星辰命运腰带");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+belt).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String belt = new String("星辰命运腰带");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("belt", belt);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 8 && i < 10) {
                        Toast.makeText(hell.this, "恭喜您获得‘星辰命运护腿'", Toast.LENGTH_SHORT).show();
                        String leg = new String("星辰命运护腿");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+leg).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String leg = new String("星辰命运护腿");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("leg", leg);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 10 && i < 12) {
                        Toast.makeText(hell.this, "恭喜您获得‘星辰命运战靴'", Toast.LENGTH_SHORT).show();
                        String shoes = new String("星辰命运战靴");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoes).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoes = new String("星辰命运战靴");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoes", shoes);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 12 && i < 14) {
                        Toast.makeText(hell.this, "恭喜您获得‘混沌魔石项链'", Toast.LENGTH_SHORT).show();
                        String necklace = new String("混沌魔石项链");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+necklace).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String necklace = new String("混沌魔石项链");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("necklace", necklace);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 14 && i < 16) {
                        Toast.makeText(hell.this, "恭喜您获得‘遗忘魔石戒指'", Toast.LENGTH_SHORT).show();
                        String ring = new String("遗忘魔石戒指");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+ring).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String ring = new String("遗忘魔石戒指");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("ring", ring);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 16 && i < 18) {
                        Toast.makeText(hell.this, "恭喜您获得‘毁伤魔石手环'", Toast.LENGTH_SHORT).show();
                        String bracelet = new String("毁伤魔石手环");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+bracelet).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String bracelet = new String("毁伤魔石手环");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("bracelet", bracelet);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 18 && i < 20) {
                        Toast.makeText(hell.this, "恭喜您获得‘名将之兵书'", Toast.LENGTH_SHORT).show();
                        String auxiliary = new String("名将之兵书");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+auxiliary).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String auxiliary = new String("名将之兵书");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("auxiliary", auxiliary);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 20 && i < 22) {
                        Toast.makeText(hell.this, "恭喜您获得‘英雄王的象征'", Toast.LENGTH_SHORT).show();
                        String earrings = new String("英雄王的象征");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+earrings).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String earrings = new String("英雄王的象征");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("earrings", earrings);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 22 && i < 24) {
                        Toast.makeText(hell.this, "恭喜您获得‘罗塞塔石碑'", Toast.LENGTH_SHORT).show();
                        String sorcerer = new String("罗塞塔石碑");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+sorcerer).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sorcerer = new String("罗塞塔石碑");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("sorcerer", sorcerer);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else {
                        Toast.makeText(hell.this, "恭喜您等级提升", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.button5:
                    PL = PL - 2;
                    level = level + 2;
                    editor.putInt("PL", PL);
                    editor.putInt("level", level);
                    editor.apply();
                    if (i >= 0 && i < 2) {
                        Toast.makeText(hell.this, "恭喜您获得‘世界的支点'", Toast.LENGTH_SHORT).show();
                        String weapon = new String("世界的支点");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+weapon).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String weapon = new String("世界的支点");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("weapon", weapon);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 2 && i < 4) {
                        Toast.makeText(hell.this, "恭喜您获得‘费诺的愤怒之勇'", Toast.LENGTH_SHORT).show();
                        String jacket = new String("费诺的愤怒之勇");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+jacket).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String jacket = new String("费诺的愤怒之勇");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("jacket", jacket);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 4 && i < 6) {
                        Toast.makeText(hell.this, "恭喜您获得‘伊露维塔的创生'", Toast.LENGTH_SHORT).show();
                        String shoulder = new String("伊露维塔的创生");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoulder).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoulder = new String("伊露维塔的创生");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoulder", shoulder);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 6 && i < 8) {
                        Toast.makeText(hell.this, "恭喜您获得‘梵雅的绝世容颜'", Toast.LENGTH_SHORT).show();
                        String belt = new String("梵雅的绝世容颜");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+belt).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String belt = new String("梵雅的绝世容颜");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("belt", belt);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 8 && i < 10) {
                        Toast.makeText(hell.this, "恭喜您获得‘凯兰崔尔的决断'", Toast.LENGTH_SHORT).show();
                        String leg = new String("凯兰崔尔的决断");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+leg).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String leg = new String("凯兰崔尔的决断");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("leg", leg);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 10 && i < 12) {
                        Toast.makeText(hell.this, "恭喜您获得‘维拉的光明净化'", Toast.LENGTH_SHORT).show();
                        String shoes = new String("维拉的光明净化");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoes).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoes = new String("维拉的光明净化");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoes", shoes);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 12 && i < 14) {
                        Toast.makeText(hell.this, "恭喜您获得‘冰雪公主的霜语项链'", Toast.LENGTH_SHORT).show();
                        String necklace = new String("冰雪公主的霜语项链");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+necklace).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String necklace = new String("冰雪公主的霜语项链");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("necklace", necklace);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 14 && i < 16) {
                        Toast.makeText(hell.this, "恭喜您获得‘冰雪公主的霜语戒指'", Toast.LENGTH_SHORT).show();
                        String ring = new String("冰雪公主的霜语戒指");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+ring).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String ring = new String("冰雪公主的霜语戒指");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("ring", ring);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 16 && i < 18) {
                        Toast.makeText(hell.this, "恭喜您获得‘冰雪公主的霜语手镯'", Toast.LENGTH_SHORT).show();
                        String bracelet = new String("冰雪公主的霜语手镯");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+bracelet).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String bracelet = new String("冰雪公主的霜语手镯");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("bracelet", bracelet);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 18 && i < 20) {
                        Toast.makeText(hell.this, "恭喜您获得‘时间旅行者的随身怀表'", Toast.LENGTH_SHORT).show();
                        String auxiliary = new String("时间旅行者的随身怀表");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+auxiliary).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String auxiliary = new String("时间旅行者的随身怀表");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("auxiliary", auxiliary);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 20 && i < 22) {
                        Toast.makeText(hell.this, "恭喜您获得‘金色漩涡'", Toast.LENGTH_SHORT).show();
                        String earrings = new String("金色漩涡");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+earrings).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String earrings = new String("金色漩涡");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("earrings", earrings);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 22 && i < 24) {
                        Toast.makeText(hell.this, "恭喜您获得‘非缄默之石'", Toast.LENGTH_SHORT).show();
                        String sorcerer = new String("非缄默之石");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+sorcerer).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sorcerer = new String("非缄默之石");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("sorcerer", sorcerer);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else {
                        Toast.makeText(hell.this, "恭喜您等级提升", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.button6:
                    PL = PL - 3;
                    level = level + 3;
                    editor.putInt("PL", PL);
                    editor.putInt("level", level);
                    editor.apply();
                    if (i >= 0 && i < 2) {
                        Toast.makeText(hell.this, "恭喜您获得‘圣剑：王者之剑'", Toast.LENGTH_SHORT).show();
                        String weapon = new String("圣剑：王者之剑");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+weapon).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String weapon = new String("圣剑：王者之剑");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("weapon", weapon);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 2 && i < 4) {
                        Toast.makeText(hell.this, "恭喜您获得‘海豚座的羞涩'", Toast.LENGTH_SHORT).show();
                        String jacket = new String("海豚座的羞涩");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+jacket).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String jacket = new String("海豚座的羞涩");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("jacket", jacket);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 4 && i < 6) {
                        Toast.makeText(hell.this, "恭喜您获得‘天鹅座的朦胧'", Toast.LENGTH_SHORT).show();
                        String shoulder = new String("天鹅座的朦胧");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoulder).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoulder = new String("天鹅座的朦胧");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoulder", shoulder);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 6 && i < 8) {
                        Toast.makeText(hell.this, "恭喜您获得‘北极星的魅力'", Toast.LENGTH_SHORT).show();
                        String belt = new String("北极星的魅力");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+belt).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String belt = new String("北极星的魅力");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("belt", belt);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 8 && i < 10) {
                        Toast.makeText(hell.this, "恭喜您获得‘织女星的凝望'", Toast.LENGTH_SHORT).show();
                        String leg = new String("织女星的凝望");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+leg).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String leg = new String("织女星的凝望");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("leg", leg);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 10 && i < 12) {
                        Toast.makeText(hell.this, "恭喜您获得‘天琴座的高洁'", Toast.LENGTH_SHORT).show();
                        String shoes = new String("天琴座的高洁");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoes).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoes = new String("天琴座的高洁");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoes", shoes);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 12 && i < 14) {
                        Toast.makeText(hell.this, "恭喜您获得‘氤氲之息'", Toast.LENGTH_SHORT).show();
                        String necklace = new String("氤氲之息");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+necklace).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String necklace = new String("氤氲之息");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("necklace", necklace);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 14 && i < 16) {
                        Toast.makeText(hell.this, "恭喜您获得‘清泉流响'", Toast.LENGTH_SHORT).show();
                        String ring = new String("清泉流响");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+ring).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String ring = new String("清泉流响");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("ring", ring);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 16 && i < 18) {
                        Toast.makeText(hell.this, "恭喜您获得‘启明星的指引'", Toast.LENGTH_SHORT).show();
                        String bracelet = new String("启明星的指引");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+bracelet).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String bracelet = new String("启明星的指引");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("bracelet", bracelet);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 18 && i < 20) {
                        Toast.makeText(hell.this, "恭喜您获得‘鱼雕坠饰'", Toast.LENGTH_SHORT).show();
                        String auxiliary = new String("鱼雕坠饰");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+auxiliary).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String auxiliary = new String("鱼雕坠饰");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("auxiliary", auxiliary);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 20 && i < 22) {
                        Toast.makeText(hell.this, "恭喜您获得‘缘定三生'", Toast.LENGTH_SHORT).show();
                        String earrings = new String("缘定三生");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+earrings).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String earrings = new String("缘定三生");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("earrings", earrings);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 22 && i < 24) {
                        Toast.makeText(hell.this, "恭喜您获得‘源助力-艾格尼丝'", Toast.LENGTH_SHORT).show();
                        String sorcerer = new String("源助力-艾格尼丝");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+sorcerer).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sorcerer = new String("源助力-艾格尼丝");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("sorcerer", sorcerer);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else {
                        Toast.makeText(hell.this, "恭喜您等级提升", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.button7:
                    PL = PL - 4;
                    level = level + 4;
                    editor.putInt("PL", PL);
                    editor.putInt("level", level);
                    editor.apply();
                    if (i >= 0 && i < 2) {
                        Toast.makeText(hell.this, "恭喜您获得‘别云剑：无用'", Toast.LENGTH_SHORT).show();
                        String weapon = new String("别云剑：无用");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+weapon).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String weapon = new String("别云剑：无用");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("weapon", weapon);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 2 && i < 4) {
                        Toast.makeText(hell.this, "恭喜您获得‘苍天之幕：卷层云'", Toast.LENGTH_SHORT).show();
                        String jacket = new String("苍天之幕：卷层云");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+jacket).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String jacket = new String("苍天之幕：卷层云");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("jacket", jacket);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 4 && i < 6) {
                        Toast.makeText(hell.this, "恭喜您获得‘苍天之隙：高积云'", Toast.LENGTH_SHORT).show();
                        String shoulder = new String("苍天之隙：高积云");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoulder).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoulder = new String("苍天之隙：高积云");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoulder", shoulder);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 6 && i < 8) {
                        Toast.makeText(hell.this, "恭喜您获得‘苍天之碧：卷云'", Toast.LENGTH_SHORT).show();
                        String belt = new String("苍天之碧：卷云");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+belt).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String belt = new String("苍天之碧：卷云");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("belt", belt);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 8 && i < 10) {
                        Toast.makeText(hell.this, "恭喜您获得‘苍天之流：层云'", Toast.LENGTH_SHORT).show();
                        String leg = new String("苍天之流：层云");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+leg).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String leg = new String("苍天之流：层云");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("leg", leg);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 10 && i < 12) {
                        Toast.makeText(hell.this, "恭喜您获得‘苍天之岭：积云'", Toast.LENGTH_SHORT).show();
                        String shoes = new String("苍天之岭：积云");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoes).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoes = new String("苍天之岭：积云");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoes", shoes);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 12 && i < 14) {
                        Toast.makeText(hell.this, "恭喜您获得‘贪食之影'", Toast.LENGTH_SHORT).show();
                        String necklace = new String("贪食之影");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+necklace).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String necklace = new String("贪食之影");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("necklace", necklace);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 14 && i < 16) {
                        Toast.makeText(hell.this, "恭喜您获得‘贪食之殇'", Toast.LENGTH_SHORT).show();
                        String ring = new String("贪食之殇");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+ring).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String ring = new String("贪食之殇");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("ring", ring);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 16 && i < 18) {
                        Toast.makeText(hell.this, "恭喜您获得‘贪食之力'", Toast.LENGTH_SHORT).show();
                        String bracelet = new String("贪食之力");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+bracelet).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String bracelet = new String("贪食之力");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("bracelet", bracelet);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 18 && i < 20) {
                        Toast.makeText(hell.this, "恭喜您获得‘黑白境界-假面'", Toast.LENGTH_SHORT).show();
                        String auxiliary = new String("黑白境界-假面");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+auxiliary).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String auxiliary = new String("黑白境界-假面");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("auxiliary", auxiliary);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 20 && i < 22) {
                        Toast.makeText(hell.this, "恭喜您获得‘黑白境界-混沌'", Toast.LENGTH_SHORT).show();
                        String earrings = new String("黑白境界-混沌");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+earrings).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String earrings = new String("黑白境界-混沌");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("earrings", earrings);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 22 && i < 24) {
                        Toast.makeText(hell.this, "恭喜您获得‘空城泪-旧王愁'", Toast.LENGTH_SHORT).show();
                        String sorcerer = new String("空城泪-旧王愁");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+sorcerer).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sorcerer = new String("空城泪-旧王愁");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("sorcerer", sorcerer);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else {
                        Toast.makeText(hell.this, "恭喜您等级提升", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.button8:
                    PL = PL - 5;
                    level = level + 5;
                    editor.putInt("PL", PL);
                    editor.putInt("level", level);
                    editor.apply();
                    if (i >= 0 && i < 2) {
                        Toast.makeText(hell.this, "恭喜您获得‘星际毁灭'", Toast.LENGTH_SHORT).show();
                        String weapon = new String("星际毁灭");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+weapon).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String weapon = new String("星际毁灭");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("weapon", weapon);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 2 && i < 4) {
                        Toast.makeText(hell.this, "恭喜您获得‘梦纤石的牵绊'", Toast.LENGTH_SHORT).show();
                        String jacket = new String("梦纤石的牵绊");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+jacket).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String jacket = new String("梦纤石的牵绊");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("jacket", jacket);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 4 && i < 6) {
                        Toast.makeText(hell.this, "恭喜您获得‘诛璃石的断杀'", Toast.LENGTH_SHORT).show();
                        String shoulder = new String("诛璃石的断杀");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoulder).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoulder = new String("诛璃石的断杀");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoulder", shoulder);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 6 && i < 8) {
                        Toast.makeText(hell.this, "恭喜您获得‘君清石的思念'", Toast.LENGTH_SHORT).show();
                        String belt = new String("君清石的思念");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+belt).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String belt = new String("君清石的思念");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("belt", belt);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 8 && i < 10) {
                        Toast.makeText(hell.this, "恭喜您获得‘凤瞳石的轻鸣'", Toast.LENGTH_SHORT).show();
                        String leg = new String("凤瞳石的轻鸣");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+leg).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String leg = new String("凤瞳石的轻鸣");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("leg", leg);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 10 && i < 12) {
                        Toast.makeText(hell.this, "恭喜您获得‘琥冥石的乖戾'", Toast.LENGTH_SHORT).show();
                        String shoes = new String("琥冥石的乖戾");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+shoes).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String shoes = new String("琥冥石的乖戾");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("shoes", shoes);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 12 && i < 14) {
                        Toast.makeText(hell.this, "恭喜您获得‘天空的灯塔-王良四'", Toast.LENGTH_SHORT).show();
                        String necklace = new String("天空的灯塔-王良四");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+necklace).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String necklace = new String("天空的灯塔-王良四");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("necklace", necklace);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 14 && i < 16) {
                        Toast.makeText(hell.this, "恭喜您获得‘天空的里程碑-阁道三'", Toast.LENGTH_SHORT).show();
                        String ring = new String("天空的里程碑-阁道三");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+ring).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String ring = new String("天空的里程碑-阁道三");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("ring", ring);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 16 && i < 18) {
                        Toast.makeText(hell.this, "恭喜您获得‘天空的引路人-王良一'", Toast.LENGTH_SHORT).show();
                        String bracelet = new String("天空的引路人-王良一");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+bracelet).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String bracelet = new String("天空的引路人-王良一");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("bracelet", bracelet);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 18 && i < 20) {
                        Toast.makeText(hell.this, "恭喜您获得‘波利斯的黄金杯'", Toast.LENGTH_SHORT).show();
                        String auxiliary = new String("波利斯的黄金杯");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+auxiliary).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String auxiliary = new String("波利斯的黄金杯");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("auxiliary", auxiliary);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 20 && i < 22) {
                        Toast.makeText(hell.this, "恭喜您获得‘黑暗祭礼'", Toast.LENGTH_SHORT).show();
                        String earrings = new String("黑暗祭礼");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+earrings).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String earrings = new String("黑暗祭礼");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("earrings", earrings);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else if (i >= 22 && i < 24) {
                        Toast.makeText(hell.this, "恭喜您获得‘无尽贪食之源'", Toast.LENGTH_SHORT).show();
                        String sorcerer = new String("无尽贪食之源");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("提示").setMessage("请确认是否穿戴装备:"+sorcerer).setPositiveButton("是", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sorcerer = new String("无尽贪食之源");
                                SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("sorcerer", sorcerer);
                                editor.apply();
                            }
                        }).setNegativeButton("否",null);
                        builder.create().show();
                    } else {
                        Toast.makeText(hell.this, "恭喜您等级提升", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
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
                Intent intent = new Intent(hell.this,Myperson.class);
                startActivity(intent);
                break;
            case R.id.menu_back:
                mediaPlayer1.stop();
                Intent intent1 = new Intent(hell.this,Role.class);
                startActivity(intent1);
                break;
            case R.id.menu_reset:
                mediaPlayer1.stop();
                Intent intent2 = new Intent(hell.this,Mychange.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        return true;
    }

}
