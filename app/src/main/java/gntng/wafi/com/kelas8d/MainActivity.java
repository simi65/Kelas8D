package gntng.wafi.com.kelas8d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
        @Override
        public void run() {
          startActivity(new Intent(MainActivity.this,Home.class));
          finish();
        }
    },2000L);


        listView = findViewById(R.id.listDelapan);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, " POSISI YANG DITEKAN = " + position, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,DetailActivity.class)
                        .putExtra("KEY_ID", position));
            }
        });
    }
}
