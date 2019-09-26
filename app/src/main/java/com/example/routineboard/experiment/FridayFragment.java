package com.example.routineboard.experiment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.routineboard.experiment.R.*;
import static com.example.routineboard.experiment.R.string.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class FridayFragment extends Fragment {


    public FridayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(layout.activity_all, container, false);

        ArrayList<Title> titles = new ArrayList<Title>();

        if (FrontActivity.getSec() == 0) {

            titles.add(new Title(cgm,cgm1,b1,ns,cd,cd1,b2,sb,mp,mp1,b3,rj,se,se1,b4,ss,t8,t10,2));
            titles.add(new Title(cgm,cgm1,all,ns,t10,t11));
            titles.add(new Title(cd,cd1,all,sb,t11,t12));
            titles.add(new Title(itnm,itnm1,b12,js,cd,cd1,b34,sb,t1230,t130,1));
            titles.add(new Title(ed,ed1,b12,js,sl,sl1,b34,np,t130,t330,1));

        }
        else {

            titles.add(new Title(itnm, itnm1, all, js, t8, t9));
            titles.add(new Title(wt, wt1, all, rn, t9, t10));
            titles.add(new Title(se, se1, all, ag, t10, t11));
            titles.add(new Title(sprt, sprt, all, none, t11, t12));
            titles.add(new Title(cgm, cgm1, b12, ns, wt, wt1, b34, rn, t1230, t130, 1));
            titles.add(new Title(cgm, cgm1, b1, ns, cd, cd1, b2, sb, mp, mp1, b3, am, se, se1, b4, ag, t130, t330, 2));

        }

        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = (ListView) rootView.findViewById(id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
