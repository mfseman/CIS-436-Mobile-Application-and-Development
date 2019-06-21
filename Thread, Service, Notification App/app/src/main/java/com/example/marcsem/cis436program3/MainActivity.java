// Marco Seman
// Program Assignment #3
// Professor John Baugh
// CIS 436 Mobile Application and Development
// April 9, 2019



package com.example.marcsem.cis436program3;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import java.lang.String;
import android.app.Notification;

public class MainActivity extends AppCompatActivity{

    private NotificationManager mManager;
    private Button setCountDown;
    private Button StartCountDown;
    private EditText setCount;
    private EditText setMessage;
    private EditText setHighEdit;

    private static final int uniqueID = 45612;
    NotificationCompat.Builder notification;

   // String message = setMessage.getText().toString();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCountDown = (Button) findViewById(R.id.setCountbtn);
        StartCountDown = (Button) findViewById(R.id.startbtn);
        setCount = (EditText) findViewById(R.id.setEdit);
        setMessage = (EditText) findViewById(R.id.NotificationEdit);
        setHighEdit = (EditText) findViewById(R.id.highedit);

        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);

// set all values as text boxes as false
        //setMessage.setEnabled(false);
        setHighEdit.setEnabled(false);
        StartCountDown.setEnabled(false);

      //
        // for count down button once its true
        StartCountDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = setCount.getText().toString();

               // String message = setMessage.getText().toString();


                // default for when user starts countdown
                setHighEdit.setText("Countdown has been started");
                //setMessage.setText("Countdown has been started");

                if (!text.equalsIgnoreCase(""))
                {
                    int seconds = Integer.valueOf(text);

                    // start of the countdown
                    CountDownTimer countDownTimer = new CountDownTimer(seconds * 1000, 1000) {
                        @Override
                        public void onTick(long millis) {
                            setCount.setText("Seconds: " + (int) (millis / 1000));

                            // beginning of the if statemtns once they reach a certain number
                            // set message if number drops to according number
                            //if(millis/1000 == 119) { setHighEdit.setText("Countdown has been started");}
                            if(millis/1000 == 90) {
                                notificationcall();
                                setHighEdit.setText("90 seconds until Happy New Year");
                            }
                            if(millis/1000 == 60) {
                                notificationcall1();
                                setHighEdit.setText("60 seconds until Happy New Year");}
                            if(millis/1000 == 30) {
                                notificationcall2();
                                setHighEdit.setText("30 seconds until Happy New Year");}
                            if(millis/1000 == 20) {
                                notificationcall3();
                                setHighEdit.setText("20 seconds until Happy New Year");}
                            if(millis/1000 == 10) {
                                notificationcall4();
                                setHighEdit.setText("10 seconds until Happy New Year");}
                            if(millis/1000 == 5) {
                                notificationcall5();
                                setHighEdit.setText("5 seconds until Happy New Year");}
                            if(millis/1000 == 1) { setHighEdit.setText("1 second until Happy New Year");}
                          //  if(millis/1000 == 0) { setHighEdit.setText("Time for: Happy New Year");}
                        }


                        @Override
                        public void onFinish() {

                            // this occurs when timer hits zero
                            // set other defaults as empty except for the message
                            notificationcall6();
                            setCount.setText(" ");
                            setHighEdit.setText(" ");
                            setMessage.setText("Time for: Happy New Year");
                        }
                    }.start();
                }
            }
        });

        // set count down button
        setCountDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the user's entry as i
                int i = Integer.parseInt(setCount.getText().toString());

                // value entered by user cannot exceed 120
                // value must be divisable by
                // set the start button as true if they follow such prerequsits
               if (i < 120 && i % 5 == 0)
               {
                   StartCountDown.setEnabled(true);
                   //setMessage.setEnabled(false);
               }

            }
        });
    }

   // @Override
    public void notificationcall()
    {
        // step 1
        int icon = R.drawable.notifyico;
        CharSequence tickerText = "Updated news";
        CharSequence contentTitle = getText(R.string.app_name);
        CharSequence contentText = "90 Seconds until New Years ";

        // step 2
       // Notification notification = new NotificationCompat.Builder(this)
        notification.setSmallIcon(icon);
        notification.setTicker(tickerText);
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(contentTitle);
        notification.setContentText(contentText);

        Intent i = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());
    }

    public void notificationcall1()
    {
        // step 1
        int icon = R.drawable.notifyico;
        CharSequence tickerText = "Updated news";
        CharSequence contentTitle = getText(R.string.app_name);
        CharSequence contentText = "60 Seconds until New Years ";

        // step 2
        // Notification notification = new NotificationCompat.Builder(this)
        notification.setSmallIcon(icon);
        notification.setTicker(tickerText);
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(contentTitle);
        notification.setContentText(contentText);

        Intent i = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());
    }

    public void notificationcall2()
    {
        // step 1
        int icon = R.drawable.notifyico;
        CharSequence tickerText = "Updated news";
        CharSequence contentTitle = getText(R.string.app_name);
        CharSequence contentText = "30 Seconds until New Years ";

        // step 2
        // Notification notification = new NotificationCompat.Builder(this)
        notification.setSmallIcon(icon);
        notification.setTicker(tickerText);
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(contentTitle);
        notification.setContentText(contentText);

        Intent i = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());
    }
    public void notificationcall3() {
        // step 1
        int icon = R.drawable.notifyico;
        CharSequence tickerText = "Updated news";
        CharSequence contentTitle = getText(R.string.app_name);
        CharSequence contentText = "20 Seconds until New Years ";

        // step 2
        // Notification notification = new NotificationCompat.Builder(this)
        notification.setSmallIcon(icon);
        notification.setTicker(tickerText);
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(contentTitle);
        notification.setContentText(contentText);

        Intent i = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());

    }
    public void notificationcall4() {
        // step 1
        int icon = R.drawable.notifyico;
        CharSequence tickerText = "Updated news";
        CharSequence contentTitle = getText(R.string.app_name);
        CharSequence contentText = "10 Seconds until New Years ";

        // step 2
        // Notification notification = new NotificationCompat.Builder(this)
        notification.setSmallIcon(icon);
        notification.setTicker(tickerText);
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(contentTitle);
        notification.setContentText(contentText);

        Intent i = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());

    }
    public void notificationcall5() {
        // step 1
        int icon = R.drawable.notifyico;
        CharSequence tickerText = "Updated news";
        CharSequence contentTitle = getText(R.string.app_name);
        CharSequence contentText = "5 Seconds until New Years ";

        // step 2
        // Notification notification = new NotificationCompat.Builder(this)
        notification.setSmallIcon(icon);
        notification.setTicker(tickerText);
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(contentTitle);
        notification.setContentText(contentText);

        Intent i = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());

    }
    public void notificationcall6() {
        // step 1
        int icon = R.drawable.notifyico;
        CharSequence tickerText = "Updated news";
        CharSequence contentTitle = getText(R.string.app_name);
        CharSequence contentText = setMessage.getText().toString();

        // step 2
        // Notification notification = new NotificationCompat.Builder(this)
        notification.setSmallIcon(icon);
        notification.setTicker(tickerText);
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(contentTitle);
        notification.setContentText(contentText);

        Intent i = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());

    }
}