package com.example.sebinvincent.invento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class acti_dprt_ece extends AppCompatActivity {

    public int occurence_time=0;
    TextView dprt_heading;
    ImageView menu;

    android.support.v4.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dprt_ece);

        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.Container,new frag_ece_events());
        fragmentTransaction.commit();

        dprt_heading=(TextView)findViewById(R.id.ece_head);
        menu=(ImageView)findViewById(R.id.menu_ece);



        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (occurence_time==0){
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.setCustomAnimations(R.anim.enter_from_top,R.anim.exit_to_top,R.anim.enter_from_top,R.anim.exit_to_top);
                    fragmentTransaction.add(R.id.Container,new frag_menu());
                    fragmentTransaction.addToBackStack("");
                    fragmentTransaction.commit();
                    occurence_time=1;
                }
                else {
                    getSupportFragmentManager().popBackStack();
                    occurence_time=0;
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        occurence_time=0;
    }
}
