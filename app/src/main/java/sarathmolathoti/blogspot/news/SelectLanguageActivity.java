package sarathmolathoti.blogspot.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectLanguageActivity extends AppCompatActivity {

    private Button teluguBtn, englishBtn, hindiBtn, malayalamBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);

        teluguBtn = (Button) findViewById(R.id.telugu_btn);
        englishBtn = (Button) findViewById(R.id.english_btn);
        hindiBtn = (Button) findViewById(R.id.hindi_btn);
        malayalamBtn = (Button) findViewById(R.id.malayalam_btn);


        teluguBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(SelectLanguageActivity.this,TeluguActivity.class);
                startActivity(t);
                //finish();
            }
        });
        hindiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(SelectLanguageActivity.this,HindiActivity.class);
                startActivity(h);
                //finish();
            }
        });
        englishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(SelectLanguageActivity.this,EnglishActivity.class);
                startActivity(e);
                //finish();
            }
        });
        malayalamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ma = new Intent(SelectLanguageActivity.this,MalayalamActivity.class);
                startActivity(ma);
                //finish();
            }
        });



    }
}
