package ir.mtajik.collapsingtoolbardemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setTitle("www.mahditajik.ir");

        System.out.println("jenkins test");
        fillData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void fillData() {

//        View contentView = findViewById(R.id.content);
        RecyclerView listView = (RecyclerView)findViewById(R.id.recycleView);
        LinearLayoutManager lm = new LinearLayoutManager(getBaseContext(), LinearLayoutManager
                .VERTICAL, false);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("number " + i);
        }

        MyAdapter adapter = new MyAdapter(getBaseContext(), list);
        listView.setLayoutManager(lm);
        listView.setAdapter(adapter);


    }
}
