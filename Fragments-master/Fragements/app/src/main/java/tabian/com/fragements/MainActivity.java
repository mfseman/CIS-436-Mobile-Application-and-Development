// Marco Seman
// CIS 436
// Professor John Baugh
// March 23, 2018

package tabian.com.fragements;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private WarriorPage mWarriorPage;
    //private MagePage mMagePage;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");

        mWarriorPage = new WarriorPage(getSupportFragmentManager());
      //  mMagePage = new MagePage(getSupportFragmentManager();

        mViewPager = (ViewPager) findViewById(R.id.containter);
        //setup the pager
        setupViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        WarriorPage adapter = new WarriorPage(getSupportFragmentManager());
//        MagePage adapter = new MagePage(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "Fragment1");
        viewPager.setAdapter(adapter);
    }


    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
