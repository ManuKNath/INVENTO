package com.example.sebinvincent.invento;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag_general_events extends Fragment {

    ImageView competitions;
    ImageView talks;
    ImageView workshops;


    public frag_general_events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;

        view=inflater.inflate(R.layout.frag_general_events, container, false);

        competitions=(ImageView)view.findViewById(R.id.general_comp);
        talks=(ImageView)view.findViewById(R.id.general_talksndshow);


        competitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_general_comp_list generalcomp =new frag_general_comp_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,generalcomp,generalcomp.getTag()).addToBackStack("").commit();




            }
        });
        talks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_general_talk_list generaltalk =new frag_general_talk_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,generaltalk,generaltalk.getTag()).addToBackStack("").commit();


            }
        });



        return view;
    }








}
