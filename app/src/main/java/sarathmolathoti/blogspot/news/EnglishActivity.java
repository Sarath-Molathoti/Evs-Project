package sarathmolathoti.blogspot.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnglishActivity extends AppCompatActivity {
    private Button hinduBtn,deccanBtn,toiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        deccanBtn = (Button) findViewById(R.id.deccan_btn);
        hinduBtn = (Button) findViewById(R.id.the_hindu_btn);
        toiBtn = (Button) findViewById(R.id.toi_btn);

        deccanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(EnglishActivity.this,DeccanActivity.class);
                startActivity(e);
            }
        });
        hinduBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(EnglishActivity.this,TheHinduActivity.class);
                startActivity(s);
            }
        });
        toiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(EnglishActivity.this,ToiActivity.class);
                startActivity(a);
            }
        });
    }
}
