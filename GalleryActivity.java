package hnfdm.com.recyclerviewfilm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started.");
        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        if  (   getIntent().hasExtra("image_url") &&
                getIntent().hasExtra("image_name") &&
                getIntent().hasExtra("image_snp") &&
                getIntent().hasExtra("image_rls")
            )
        {
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String synopsis = getIntent().getStringExtra("image_snp");
            String release = getIntent().getStringExtra("image_rls");
            setImage(imageUrl, imageName, synopsis, release);
        }
    }


    private void setImage(String imageUrl, String imageName, String synopsis, String release){
        Log.d(TAG, "setImage: setting te image and name to widgets.");
        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);
        TextView snp = findViewById(R.id.image_snp);
        snp.setText(synopsis);
        TextView rls = findViewById(R.id.image_rls);
        rls.setText(release);
        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}