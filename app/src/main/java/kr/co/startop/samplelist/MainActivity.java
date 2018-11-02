package kr.co.startop.samplelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //    ArrayAdapter<String> mAdapter;
    MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        mAdapter = new MyAdapter();
//        mAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, mAdapter.getItemAtPosition(i).name, Toast.LENGTH_SHORT).show();
            }
        });
        init();
    }

    private void init() {
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.age = 20 + i;
            person.name = "leejihun" + i;
            mAdapter.add(person);
        }
    }
}
