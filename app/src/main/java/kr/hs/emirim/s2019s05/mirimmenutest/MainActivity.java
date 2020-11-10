package kr.hs.emirim.s2019s05.mirimmenutest;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("옵션메뉴 만들기");
        baseLayout = findViewById(R.id.baseLayout);
        btn1 = findViewById(R.id.btn1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater mInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/
       switch (item.getItemId()){
           case R.id.itemRed:
               baseLayout.setBackgroundColor(Color.RED);
               break;
           case R.id.itemGreen:
               baseLayout.setBackgroundColor(Color.GREEN);
               break;
           case R.id.itemBlue:
               baseLayout.setBackgroundColor(Color.BLUE);
               break;
           case R.id.rotate_45:
               baseLayout.setRotation(45);
               break;
           case R.id.scale_2:
               baseLayout.setScaleX(2);
               break;
       }

        return super.onOptionsItemSelected(item);
    }
}