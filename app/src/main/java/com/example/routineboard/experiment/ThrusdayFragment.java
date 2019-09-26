package com.example.routineboard.experiment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import static com.example.routineboard.experiment.R.string.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThrusdayFragment extends Fragment {


    public ThrusdayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_all, container, false);

        ArrayList<Title> titles = new ArrayList<Title>();

        if (FrontActivity.getSec() == 0) {

            titles.add(new Title(cgm,cgm1,all,ns,t8,t9));
            titles.add(new Title(itnm,itnm1,all,js,t9,t10));
            titles.add(new Title(wt,wt1,all,rn,t10,t11));
            titles.add(new Title(cd,cd1,all,sb,t11,t12));
            titles.add(new Title(cd,cd1,b12,sb,se,se1,b34,ss,t1230,t130,1));
            titles.add(new Title(sprt,sprt,all,none,t130,t230));
            titles.add(new Title(se,se1,all,ss,t230,t330));

        }
        else {

            titles.add(new Title(cd, cd1, all, sb, t8, t9));
            titles.add(new Title(cgm, cgm1, all, ns, t9, t10));
            titles.add(new Title(se, se1, all, ag, t10, t11));
            titles.add(new Title(itnm, itnm1, all, js, t11, t12));
            titles.add(new Title(itnm, itnm1, b12, js, cgm, cgm1, b34, ns, t1230, t130, 1));
            titles.add(new Title(wt, wt1, all, rn, t130, t230));
            titles.add(new Title(sprt, sprt, all, none, t230, t330));

        }

        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
