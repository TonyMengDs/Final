package com.example.afinal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Mychange extends AppCompatActivity implements View.OnClickListener{
    //private EditText editText2;
    private EditText editText1;
    private Spinner spinner;
    private List<String> data_list;
    private ArrayAdapter<String> arr_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mychange);

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);

        editText1 = (EditText)findViewById(R.id.editText1);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setPrompt("请选择更换的职业：");
        data_list = new ArrayList<String >();
        data_list = new ArrayList<String>();
        data_list.add("狂战士");
        data_list.add("阿修罗");
        data_list.add("剑魂");
        data_list.add("鬼泣");
        data_list.add("黑暗武士");
        data_list.add("驱魔师");
        data_list.add("龙斗士");
        data_list.add("神思者");
        data_list.add("南拳");
        data_list.add("化魔者");
        //适配器
        //arr_adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data_list);
        arr_adapter= new ArrayAdapter<String>(this, R.layout.spinner_item, data_list);
        //设置样式
        //arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arr_adapter.setDropDownViewResource(R.layout.dropdown_style);
        //加载适配器
        spinner.setAdapter(arr_adapter);

        String name = new String("小呆瓜");
        SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        name = sharedPreferences.getString("name","小呆瓜");
        editText1.setText(name);
        //editText2 = (EditText)findViewById(R.id.editText2);
        //editText2.setOnFocusChangeListener(this);  //对edit 进行焦点监听
        //editText2.setFocusable(false);
        //editText2.setFocusableInTouchMode(false);
    }

    @Override
    public void onClick(View view) {

        String name = editText1.getText()+"";
        String type = (String) spinner.getSelectedItem();

        if(name.equals(""))
        {
            editText1.setHint("请输入名字，不能为空");
            return;
        }
        //String type = editText2.getText()+"";
        if(type.equals(""))
        {
            spinner.setPrompt("请输入职业，不能为空");
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name",name);
        editor.putString("type",type);
        editor.apply();
        Toast.makeText(Mychange.this,"勇士，您已更改角色信息",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Mychange.this,Role.class);
        startActivity(intent);
    }

  /*  @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus) {
            showListPopulWindow(); //调用显示PopuWindow 函数
        }
    }
    private void showListPopulWindow() {
        final String[] list = {"狂战士", "阿修罗", "剑魂","鬼泣","黑暗武士","驱魔师","龙斗士","神思者","南拳","化魔者"};//要填充的数据
        final ListPopupWindow listPopupWindow;
        listPopupWindow = new ListPopupWindow(this);
        listPopupWindow.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list));//用android内置布局，或设计自己的样式
        listPopupWindow.setAnchorView(editText2);//以哪个控件为基准，在该处以mEditText为基准
        listPopupWindow.setModal(true);

        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {//设置项点击监听
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editText2.setText(list[i]);//把选择的选项内容展示在EditText上
                listPopupWindow.dismiss();//如果已经选择了，隐藏起来
            }
        });
        listPopupWindow.show();//把ListPopWindow展示出来
    }
*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu3,menu);/*第一个参数是指将哪个菜单资源文件创建出来，
                           第二个改菜单赋予哪个菜单对象、*/
        return true;//意思是显示出来
    }

    //为菜单项添加响应
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //通过item.getItemId()对不同选项进行不同的处理
        switch (item.getItemId())
        {
            case R.id.menu3_person:
                Intent intent = new Intent(Mychange.this,Myperson.class);
                startActivity(intent);
                break;
            case R.id.menu3_back:
                Intent intent1 = new Intent(Mychange.this,Role.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
        return true;
    }
}
