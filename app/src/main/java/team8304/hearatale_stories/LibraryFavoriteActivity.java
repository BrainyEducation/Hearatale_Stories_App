package team8304.hearatale_stories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class LibraryFavoriteActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<Class> mClasses = new ArrayList<>();
    private ArrayList<String> mDotUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_favorite);

        Button btn1 = (Button) findViewById(R.id.classicButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LibraryFavoriteActivity.this, LibraryActivity.class));
            }
        });
        Button btn2 = (Button) findViewById(R.id.imagineButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LibraryFavoriteActivity.this, LibraryImagineActivity.class));
            }
        });

        getImages();
    }

    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 1");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 2");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 3");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 4");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 5");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 6");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 7");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 8");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        mImageUrls.add("http://hearatale.com/images/star-blank.png");
        mNames.add("Favorite 9");
        mDotUrls.add("http://hearatale.com/images/target_audience/B.png");
        mClasses.add(Activity_title_page.class); //replace with correct class

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDotUrls, mClasses);
        recyclerView.setAdapter(adapter);
    }
}