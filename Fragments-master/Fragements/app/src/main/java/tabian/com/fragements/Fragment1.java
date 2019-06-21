package tabian.com.fragements;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    private static final String TAG = "Fragment1";

    //private Button btnNavFrag1;
    //private Button btnNavFrag2;
    //private Button btnNavFrag3;
    private Button Warriorbtn;
    private Button magebtn;
    private Button healerbtn;
    private Button hunterbtn;
    private Button paladinbtn;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_main, container, false);

        Warriorbtn = (Button) view.findViewById(R.id.btnwarrior);
        magebtn = (Button) view.findViewById(R.id.btnmage);
        healerbtn = (Button) view.findViewById(R.id.btnhealer);
        hunterbtn = (Button) view.findViewById(R.id.btnhunter);
        paladinbtn = (Button) view.findViewById(R.id.btnpaladin);

        Log.d(TAG, "onCreateView: started.");

        Warriorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Warrior", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), WarriorFRAG.class);
                startActivity(intent);
            }
        });

        magebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Mage", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getActivity(), MageFRAG.class);
                startActivity(intent1);
            }
        });
        healerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Healer", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getActivity(), HealerFRAG.class);
                startActivity(intent1);
            }
        });

        hunterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Hunter", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getActivity(), HunterFRAG.class);
                startActivity(intent1);
            }
        });

        paladinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to Paladin", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getActivity(), PaladinFRAG.class);
                startActivity(intent1);
            }
        });

        return view;
    }
}
