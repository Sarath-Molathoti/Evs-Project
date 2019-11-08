package sarathmolathoti.blogspot.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HindiActivity extends AppCompatActivity {

    private Button djBtn,dbBtn,amarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);

        djBtn = (Button) findViewById(R.id.dj_btn);
        dbBtn = (Button) findViewById(R.id.db_btn);
        amarBtn = (Button) findViewById(R.id.au_btn);

        djBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(HindiActivity.this,DjActivity.class);
                startActivity(e);
            }
        });
        dbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(HindiActivity.this,DbActivity.class);
                startActivity(s);
            }
        });
        amarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(HindiActivity.this,AmarUjalaActivity.class);
                startActivity(a);
            }
        });
    }
}
