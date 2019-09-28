package com.darkwhite.routineboard;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.darkwhite.routineboard.R;

import java.util.ArrayList;

import static com.darkwhite.routineboard.R.string.*;

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

            titles.add(new Title(sub_1,crs_1,b_1_2,sir_1,t8,t9));
            titles.add(new Title(sub_2,crs_2,b_3_4,sir_2,t9,t10));
            titles.add(new Title(sub_3,crs_3,b1,sir_3,sub_4,crs_4,b2,sir_4,sub_5,crs_5,b3,sir_5,sub_6,crs_6,b4,sir_6,t10,t12,2));
            titles.add(new Title(sub_7,crs_7,b_1_3,sir_7,sub_8,crs_8,b_2_4,sir_8,t1230,t130,1));
            titles.add(new Title(sub_9,crs_9,b_1_4,sir_9,sub_10,crs_10,b_2_3,sir_10,t130,t330,1));

        }
        else if (FrontActivity.getSec() == 1) {

            titles.add(new Title(sub_10, crs_10, b_1_4, sir_10, t8, t9));
            titles.add(new Title(sub_9, crs_9, b_2_3, sir_9, t9, t10));
            titles.add(new Title(sub_8, crs_8, b_1_3, sir_8, sub_7, crs_7, b_2_4, sir_7, t10, t12, 1));
            titles.add(new Title(sub_6, crs_6, b_3_4, sir_6, sub_5, crs_5, b_1_2, sir_5, t1230, t130, 1));
            titles.add(new Title(sub_4, crs_4, b4, sir_4, sub_3, crs_3, b3, sir_3, sub_2, crs_2, b2, sir_2, sub_1, crs_1, b1, sir_1, t130, t330, 2));

        }

        else {
            titles.add(new Title(sub_10, crs_10, b_2_3, sir_10, sub_9, crs_9, b_1_4, sir_9,  t8, t9, 1));
            titles.add(new Title(sub_8, crs_8, b_2_4, sir_8, sub_7, crs_7, b_1_3, sir_7, t9, t10, 1));
            titles.add(new Title(sub_6, crs_6, b4, sir_6, sub_5, crs_5, b3, sir_5, sub_4, crs_4, b2, sir_4, sub_3, crs_3, b1, sir_3, t10, t12, 2));
            titles.add(new Title(sub_2, crs_2, b_3_4, sir_2, t1230, t130));
            titles.add(new Title(sub_1, crs_1, b_1_2, sir_1, t130, t330));

        }


        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
