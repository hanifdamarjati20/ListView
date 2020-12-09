package hnfdm.com.recyclerviewfilm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mSynopsis = new ArrayList<>();
    private ArrayList<String> mRelease = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.electricaura.net/wp-content/uploads/2020/05/netflix-extraction-movie-trailer-out-2020.jpg");
        mNames.add("Extraction");
        mSynopsis.add("Extraction is a fun 2020 American action film by Sam Hargrave and written by Joe Russo, based on the graphic novel Ciudad by Ande Parks, Joe Russo, Anthony Russo, Fernando León González, and Eric Skillman.");
        mRelease.add("24 April 2020");

        mImageUrls.add("https://images.hdqwalls.com/wallpapers/harley-quinn-birds-of-prey-2020-4k-poster-v3.jpg");
        mNames.add("Birds of Prey");
        mSynopsis.add("After parting ways with the Joker, Harley Quinn (Margot Robbie) joins Black Canary (Jurnee Smollett-Bell), Huntress (Mary Elizabeth Winstead) and Renee Montoya (Rosie Perez) to save a young girl named Cassandra Cain (Ella Jay Basco) from the figure of lord of crime known as Black Mask (Ewan McGregor).");
        mRelease.add("5 February 2020");

        mImageUrls.add("https://photos.hancinema.net/photos/photo1149761.jpg");
        mNames.add("Time to Hunt");
        mSynopsis.add("Time to Hunt is a fun South Korean crime film written and directed by Yoon Sung-hyun that will be released on Netflix on April 10, 2020.");
        mRelease.add("22 February 2020");

        mImageUrls.add("https://miro.medium.com/max/700/1*k58voxSpf9Mhzt7plCNB3A.jpeg");
        mNames.add("Bloodshot");
        mSynopsis.add("Based on the best-selling comic book, it stars Vin Diesel as Ray Garrison, a soldier who is killed in his duties and brought back to life as a superhero by the company RST. With an army of nanotechnology in his veins, the power was stronger than before and was able to heal wounds very quickly.");
        mRelease.add("29 Mei 2020");

        mImageUrls.add("https://wallpapercave.com/wp/wp5291591.jpg");
        mNames.add("Bad Boys For Life");
        mSynopsis.add("The third series of Bad Boys films will tell about the actions of detective Mike Lowrey (Will Smith) and detective Marcus Burnett (Martin Lawrence). The two of them return to action for the last time to eradicate a very heinous criminal.");
        mRelease.add("17 January 2020");

        mImageUrls.add("https://www.pixel4k.com/wp-content/uploads/2020/01/black-widow-movie-art-2020_1579647996-1536x864.jpg");
        mNames.add("Black Widow");
        mSynopsis.add("Black Widow is a 2020 American superhero film based on the Marvel Comics character of the same name. This film is produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures. This film is the 24th film of the Marvel Cinematic Universe.");
        mRelease.add("29 April 2021");

        mImageUrls.add("https://images.wallpapersden.com/image/download/the-new-mutants-poster_bGdsamaUmZqaraWkpJRmbmdlrWZlbWU.jpg");
        mNames.add("The New Mutants");
        mSynopsis.add("Twentieth Century Studios and Marvel Entertainment present The New Mutants, a horror thriller film set in a remote hospital where a group of teenage mutants are detained for psychiatric monitoring. Strange events begin to occur that will test both their mutant abilities and their friendship as they struggle to escape safely.");
        mRelease.add("26 August 2020");

        mImageUrls.add("https://cdn.akurat.co/images/uploads/images/akurat_20200523113430_9213Yi.jpg");
        mNames.add("WW 1984");
        mSynopsis.add("Wonder Woman 1984 is a 2020 American superhero film based on the DC Comics character Wonder Woman. This film is the sequel to Wonder Woman and the ninth film of the DC Extended Universe. The film was directed by Patty Jenkins from a script she also worked on with Geoff Johns and David Callaham.");
        mRelease.add("16 December 2020");

        mImageUrls.add("https://image.freepik.com/free-vector/underwater-life-background-light-poster_1284-18529.jpg");
        mNames.add("Underwater");
        mSynopsis.add("The water research crew is working to find something to save them after an earthquake destroys their underground laboratory. But the crew began to realize that there was something more terrifying at the bottom of the sea.");
        mRelease.add("8 January 2020");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mSynopsis, mRelease);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
