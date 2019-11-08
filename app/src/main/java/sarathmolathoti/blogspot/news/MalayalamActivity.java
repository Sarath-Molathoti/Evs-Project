package sarathmolathoti.blogspot.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MalayalamActivity extends AppCompatActivity {
    private Button manoramaBtn,kaumudiBtn,mathrubhumiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malayalam);

        manoramaBtn = (Button) findViewById(R.id.manorama_btn);
        kaumudiBtn = (Button) findViewById(R.id.kaumudi_btn);
        mathrubhumiBtn = (Button) findViewById(R.id.mathrubhumi_btn);

        manoramaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MalayalamActivity.this,ManoramaActivity.class);
                startActivity(e);
            }
        });
        kaumudiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MalayalamActivity.this,KaumudiActivity.class);
                startActivity(s);
            }
        });
        mathrubhumiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MalayalamActivity.this,MathrubhumiActivity.class);
                startActivity(a);
            }
        });
    }
}
