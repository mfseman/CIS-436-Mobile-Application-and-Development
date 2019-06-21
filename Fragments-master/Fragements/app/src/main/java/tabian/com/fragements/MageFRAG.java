package tabian.com.fragements;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RatingBar;
import android.widget.TextView;


public class MageFRAG extends AppCompatActivity {
    private static final String TAG = "MageFRAG";

    float str_rating = 0;
    float int_rating = 0;
    float wis_rating = 0;
    float dex_rating = 0;
    float num_rating = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mage_fragment);

        Log.d(TAG, "onCreate: started.");



// i was only able to disable the rating bar after reaching 10, but i couldnt figure out how to decrement the rating bar
        // to set it back to 10. on the internet, couldnt find out how to make the ratingbar editable after reaching 10 nor could i find anything else to use
        RatingBar strbar = (RatingBar)findViewById(R.id.strbar);
        strbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                TextView numText = (TextView)findViewById(R.id.numtxt);
/*
                if(num_rating >= 10)
                {
                    ratingBar.setEnabled(false);
                }
*/
                str_rating = rating;
                num_rating = rating + int_rating + wis_rating + dex_rating;
                numText.setText("" + num_rating + "/10");
            }
        });

        RatingBar intbar = (RatingBar)findViewById(R.id.intbar);
        intbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                TextView numText = (TextView)findViewById(R.id.numtxt);
                /*
                if(num_rating >= 10)
                {
                    ratingBar.setEnabled(false);
                }
*/
                int_rating = rating;
                num_rating = rating + str_rating + wis_rating + dex_rating;
                numText.setText("" + num_rating + "/10");
            }
        });

        RatingBar wisbar = (RatingBar)findViewById(R.id.wisbar);
        wisbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                TextView numText = (TextView)findViewById(R.id.numtxt);
                /*if(num_rating >= 10)
                {
                    ratingBar.setEnabled(false);
                }
*/
                wis_rating = rating;
                num_rating = rating + str_rating + int_rating + dex_rating;
                numText.setText("" + num_rating + "/10");
            }
        });

        RatingBar dexbar = (RatingBar)findViewById(R.id.dexbar);
        dexbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                TextView numText = (TextView)findViewById(R.id.numtxt);
               /*
                if(num_rating >= 10)
                {
                    ratingBar.setEnabled(false);
                }
*/
                dex_rating = rating;
                num_rating = rating + str_rating + int_rating + wis_rating;
                numText.setText("" + num_rating + "/10");
            }
        });

    }
}
