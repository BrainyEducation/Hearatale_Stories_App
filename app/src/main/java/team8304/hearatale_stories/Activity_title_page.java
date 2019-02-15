package team8304.hearatale_stories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.res.Resources;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Activity_title_page extends AppCompatActivity {
    private Button back_button;
    private Button play_button;  //TODO
    private Button favourite_button; //TODO
    private TextView story_title;
    private TextView story_description;
    private ImageView story_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_page);


        // Set story title
        story_title = (TextView) findViewById(R.id.textView3);
        story_title.setMovementMethod(new ScrollingMovementMethod());
        story_title.setText(getIntent().getStringExtra("title"));
        // Set story description
        story_description = (TextView) findViewById(R.id.textView2);
        story_description.setMovementMethod(new ScrollingMovementMethod());
        story_description.setText(getIntent().getStringExtra("description"));
        // Set story image
        Resources res = getResources();
        story_image = findViewById(R.id.imageView2);
        String mDrawableName = getIntent().getStringExtra("image");
        int resID = res.getIdentifier(mDrawableName, "drawable", getPackageName());
        story_image.setImageResource(resID);


        String data = "";
        StringBuffer sbuffer_2 = new StringBuffer();

        back_button = findViewById(R.id.button3);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity_title_page.super.onBackPressed();
//                back_to_home_page();
            }
        });

//        favourite_button = (Button) findViewById(R.id.button5);
//        favourite_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                favourite_button.setBackgroundResource(R.drawable.favourite);
//            }
//        });
    }

    public void back_to_home_page () {
        Intent intent = new Intent(Activity_title_page.this, LibraryActivity.class);
//        startActivity(intent);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivityIfNeeded(intent, 0);
    }
}