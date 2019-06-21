// Marco Seman
// CIS 436 Mobile Application and Development
// Professor J.P Bizzy
// February 22, 2018
// Description: Create a slot machine where the user is able to set the value they want to bet and also be able to start a new game

package com.example.marco.slot_machine_cis436;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import java.io.*;
import java.util.*;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.lang.String;

public class MainActivity extends AppCompatActivity implements OnClickListener
{
    //Button Leverbtn;
    private Button leverbtn;
    private TextView slot1;
    private TextView slot2;
    private TextView slot3;
    private EditText Amount1;
    private TextView txtBank;
    private Button newgamebtn;
    private Button setValuebtn;

    int bank = 0;
    //int value;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //empty window, load xml file
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the pull lever
        //Leverbtn = (Button) findViewById(R.id.pullLever);

        // mainactivity.this is a current class reference context
        //Leverbtn.setOnClickListener(this);
       // References to the widgets

        // calling the functions to make them accessable
        setContentView(R.layout.activity_main);
        leverbtn = (Button) findViewById(R.id.pullLever);
        leverbtn.setOnClickListener(this);

        slot1 = (TextView) findViewById(R.id.slot1Result);
        slot1.setOnClickListener(this);

        slot2 = (TextView) findViewById(R.id.slot2Result);
        slot2.setOnClickListener(this);

        slot3 = (TextView) findViewById(R.id.slot3Result);
        slot3.setOnClickListener(this);

        Amount1 = (EditText) findViewById(R.id.userAmount);
        Amount1.setOnClickListener(this);

        txtBank = (TextView) findViewById(R.id.bankAmount);
        txtBank.setOnClickListener(this);

        newgamebtn = (Button) findViewById(R.id.newGame);
        newgamebtn.setOnClickListener(this);

        setValuebtn = (Button) findViewById(R.id.setValue);
        setValuebtn.setOnClickListener(this);

        leverbtn.setEnabled(false);
    }

    @Override
    public void onClick (View v) {

        // new game button
        // all values and texts are reset
        // pull lever becomes shaded out
        if (v == newgamebtn) {
            bank = 0;
            txtBank.setText("$" + bank);
            slot1.setText("#");
            slot2.setText("#");
            slot3.setText("#");
            Amount1.setText("");
            leverbtn.setEnabled(false);
        }

        // set value button
        if (v == setValuebtn)
        {
            // obtain the number entered by the user
            bank = Integer.parseInt( Amount1.getText().toString() );
            //Amount1.getText().toString();
            // user must enter between 100 and 500
            if (bank >= 100 && bank <= 500)
            {
                txtBank.setText("$" + bank);
                leverbtn.setEnabled(true);
            }
            else
            {
                Amount1.setText("TOAST Error");
            }

        }
// pull lever button
        if (v == leverbtn) {

            leverbtn.setText("Lever Pulled");
// random for slot 1
            // SLOT 1
            int randomSlot1 = 0;
            Random rand = new Random();
            randomSlot1 = rand.nextInt(8) + 1; // generate numbers 1 - 9
            //TextView slot1 = (TextView) findViewById(R.id.slot1Result);
            slot1.setText("" + randomSlot1);
            //((TextView) findViewById(R.id.slot1Result)).setText("HEYOOO");

            // SLOT 2
            int randomSlot2 = 0;
            randomSlot2 = rand.nextInt(8) + 1; // Generate 1 - 9
            //TextView slot2 = (TextView) findViewById(R.id.slot2Result);
            //slot1.setText(randomSlot2);
            slot2.setText("" + randomSlot2);
            //((TextView)findViewById(R.id.slot2Result)).setText(randomSlot2);


            // SLOT 3
            int randomSlot3 = 0;
            randomSlot3 = rand.nextInt(8) + 1; // Generate 1 - 9
            slot3.setText("" + randomSlot3);
            //TextView slot3 = (TextView) findViewById(R.id.slot3Result);
            //slot1.setText(randomSlot3);
            //((TextView)findViewById(R.id.slot3Result)).setText(randomSlot3);


            // All scenarios for 1
            if ((randomSlot1 == 1 && (randomSlot2 == 1 || randomSlot3 == 1)) ||
                    (randomSlot2 == 1 && (randomSlot1 == 1 || randomSlot3 == 1)) ||
                    (randomSlot3 == 1 && (randomSlot1 == 1 || randomSlot2 == 1))) {
                bank = bank + 10;
            }
            // All scenarios for 2
            if ((randomSlot1 == 2 && (randomSlot2 == 2 || randomSlot3 == 2)) ||
                    (randomSlot2 == 2 && (randomSlot1 == 2 || randomSlot3 == 2)) ||
                    (randomSlot3 == 2 && (randomSlot1 == 2 || randomSlot2 == 2))) {
                bank = bank + 10;
            }
            // All scenarios for 3
            if ((randomSlot1 == 3 && (randomSlot2 == 3 || randomSlot3 == 3)) ||
                    (randomSlot2 == 3 && (randomSlot1 == 3 || randomSlot3 == 3)) ||
                    (randomSlot3 == 3 && (randomSlot1 == 3 || randomSlot2 == 3))) {
                bank = bank + 10;
            }
            // All scenarios for 4
            if ((randomSlot1 == 4 && (randomSlot2 == 4 || randomSlot3 == 4)) ||
                    (randomSlot2 == 4 && (randomSlot1 == 4 || randomSlot3 == 4)) ||
                    (randomSlot3 == 4 && (randomSlot1 == 4 || randomSlot2 == 4))) {
                bank = bank + 10;
            }
            // All scenarios for 5
            if ((randomSlot1 == 5 && (randomSlot2 == 5 || randomSlot3 == 5)) ||
                    (randomSlot2 == 5 && (randomSlot1 == 5 || randomSlot3 == 5)) ||
                    (randomSlot3 == 5 && (randomSlot1 == 5 || randomSlot2 == 5))) {
                bank = bank + 10;
            }
            // All scenarios for 6
            if ((randomSlot1 == 6 && (randomSlot2 == 6 || randomSlot3 == 6)) ||
                    (randomSlot2 == 6 && (randomSlot1 == 6 || randomSlot3 == 6)) ||
                    (randomSlot3 == 6 && (randomSlot1 == 6 || randomSlot2 == 6))) {
                bank = bank + 10;
            }
            // All scenarios for 7
            if ((randomSlot1 == 7 && (randomSlot2 == 7 || randomSlot3 == 7)) ||
                    (randomSlot2 == 7 && (randomSlot1 == 7 || randomSlot3 == 7)) ||
                    (randomSlot3 == 7 && (randomSlot1 == 7 || randomSlot2 == 7))) {
                bank = bank + 10;
            }
            // All scenarios for 8
            if ((randomSlot1 == 8 && (randomSlot2 == 8 || randomSlot3 == 8)) ||
                    (randomSlot2 == 8 && (randomSlot1 == 8 || randomSlot3 == 8)) ||
                    (randomSlot3 == 8 && (randomSlot1 == 8 || randomSlot2 == 8))) {
                bank = bank + 10;
            }
            // All scenarios for 9
            if ((randomSlot1 == 9 && (randomSlot2 == 9 || randomSlot3 == 9)) ||
                    (randomSlot2 == 9 && (randomSlot1 == 9 || randomSlot3 == 9)) ||
                    (randomSlot3 == 9 && (randomSlot1 == 9 || randomSlot2 == 9))) {
                bank = bank + 10;
            }

            // If all are 1
            if (randomSlot1 == 1 && randomSlot2 == 1 && randomSlot3 == 1) {
                //System.out.print("PASS");
                bank = bank + 40;
            }

            // If all are 2
            if (randomSlot1 == 2 && randomSlot2 == 2 && randomSlot3 == 2) {
                //System.out.print("PASS");
                bank = bank + 40;
            }

            // If all are 3
            if (randomSlot1 == 3 && randomSlot2 == 3 && randomSlot3 == 3) {
                //System.out.print("PASS");
                bank = bank + 40;
            }

            // If all are 4
            if (randomSlot1 == 4 && randomSlot2 == 4 && randomSlot3 == 4) {
                //System.out.print("PASS");
                bank = bank + 40;
            }

            // If all are 5
            if (randomSlot1 == 5 && randomSlot2 == 5 && randomSlot3 == 5) {
                //System.out.print("PASS");
                bank = bank + 100;
            }

            // If all are 6
            if (randomSlot1 == 6 && randomSlot2 == 6 && randomSlot3 == 6) {
                //System.out.print("PASS");
                bank = bank + 100;
            }

            // If all are 7
            if (randomSlot1 == 7 && randomSlot2 == 7 && randomSlot3 == 7) {
                //System.out.print("PASS");
                bank = bank + 100;
            }

            // If all are 8
            if (randomSlot1 == 8 && randomSlot2 == 8 && randomSlot3 == 8) {
                //System.out.print("PASS");
                bank = bank + 100;
            }

            // If all are 9
            if (randomSlot1 == 9 && randomSlot2 == 9 && randomSlot3 == 9) {
                //System.out.print("PASS");
                bank = bank + 1000;
            }
            // when user reaches 1000
            if (bank >= 1000)
            {
                txtBank.setText("TOAST");
                Amount1.setText("TOAST YOU WIN!!!");
                leverbtn.setEnabled(false);
            }
// when user hits zero
            if (bank == 0)
            {
                txtBank.setText("You Lose");
                Amount1.setText("TOAST YOU LOST!!!");
                leverbtn.setEnabled(false);
            }
// lose $5 after every pull
            bank = bank - 5;
            txtBank.setText("$" + bank);
        }
    }
}