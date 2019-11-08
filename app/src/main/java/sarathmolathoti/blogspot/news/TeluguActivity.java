package sarathmolathoti.blogspot.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeluguActivity extends AppCompatActivity {

    private Button eenaduBtn,sakshiBtn,ajBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu);

        eenaduBtn = (Button) findViewById(R.id.eenadu_btn);
        sakshiBtn = (Button) findViewById(R.id.sakshi_btn);
        ajBtn = (Button) findViewById(R.id.andhra_jyothi_btn);

        eenaduBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(TeluguActivity.this,EenaduActivity.class);
                startActivity(e);
            }
        });
        sakshiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(TeluguActivity.this,SakshiActivity.class);
                startActivity(s);
            }
        });
        ajBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(TeluguActivity.this,AndhraJyothiActivity.class);
                startActivity(a);
            }
        });
    }
}
