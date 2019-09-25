package com.example.darkwhite.experiment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.darkwhite.experiment.R.string.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class MondayFragment extends Fragment {

    public MondayFragment() {
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
            titles.add(new Title(se,se1,b1,ss,cgm,cgm1,b2,ns,cd,cd1,b3,sb,mp,mp1,b4,mk,t10,t12,2));
            titles.add(new Title(se,se1,b12,ss,cgm,cgm1,b34,ns,t1230,t130,1));
            titles.add(new Title(ed,ed1,b12,np,sl,sl1,b34,js,t130,t330,1));

        }
        else {

            titles.add(new Title(se, se1, all, ag, t8, t9));
            titles.add(new Title(cd, cd1, all, sb, t9, t10));
            titles.add(new Title(sl, sl1, b12, rn, ed, ed1, b34, np, t10, t12, 1));
            titles.add(new Title(wt, wt1, b12, rn, itnm, itnm1, b34, js, t1230, t130, 1));
            titles.add(new Title(se, se1, b1, ag, cgm, cgm1, b2, ns, cd, cd1, b3, sb, mp, mp1, b4, pm, t130, t330, 2));

        }
        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
