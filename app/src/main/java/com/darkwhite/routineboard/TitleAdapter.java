package com.darkwhite.routineboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.darkwhite.routineboard.R;

import java.util.ArrayList;

/**
 * Created by main on 18/2/18.
 */

public class TitleAdapter extends ArrayAdapter<Title> {
    public TitleAdapter(Context context, ArrayList<Title> titles) {
        super(context, 0, titles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        Title currentTitle = getItem(position);

        if(currentTitle.getLtp() == 0) {
            //if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            //}

            TextView subject = (TextView) listItemView.findViewById(R.id.subject);
            subject.setText(currentTitle.getSubjectName());

            TextView desc = (TextView) listItemView.findViewById(R.id.desc);
            desc.setText(currentTitle.getDesc());

            TextView batch = (TextView) listItemView.findViewById(R.id.batch);
            batch.setText(currentTitle.getBatch());

            TextView faculty = (TextView) listItemView.findViewById(R.id.faculty);
            faculty.setText(currentTitle.getFacultyName());

            TextView startTime = (TextView) listItemView.findViewById(R.id.start_time);
            startTime.setText(currentTitle.getStartTime());

            TextView endTime = (TextView) listItemView.findViewById(R.id.end_time);
            endTime.setText(currentTitle.getEndTime());

            return listItemView;
        }



        else if(currentTitle.getLtp() == 1) {
            //if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_tutorial, parent, false);
            //}
            //1st block
            TextView subject1 = (TextView) listItemView.findViewById(R.id.subject_tut_1);
            subject1.setText(currentTitle.getSubjectName1());

            TextView desc1 = (TextView) listItemView.findViewById(R.id.desc_tut_1);
            desc1.setText(currentTitle.getDesc1());

            TextView batch12 = (TextView) listItemView.findViewById(R.id.batch12);
            batch12.setText(currentTitle.getBatch12());

            TextView faculty1 = (TextView) listItemView.findViewById(R.id.faculty_tut_1);
            faculty1.setText(currentTitle.getFacultyName1());

            //2nd block
            TextView subject2 = (TextView) listItemView.findViewById(R.id.subject_tut_2);
            subject2.setText(currentTitle.getSubjectName2());

            TextView desc2 = (TextView) listItemView.findViewById(R.id.desc_tut_2);
            desc2.setText(currentTitle.getDesc2());

            TextView batch34 = (TextView) listItemView.findViewById(R.id.batch34);
            batch34.setText(currentTitle.getBatch34());

            TextView faculty2 = (TextView) listItemView.findViewById(R.id.faculty_tut_2);
            faculty2.setText(currentTitle.getFacultyName2());

            TextView startTime = (TextView) listItemView.findViewById(R.id.start_time);
            startTime.setText(currentTitle.getStartTime());

            TextView endTime = (TextView) listItemView.findViewById(R.id.end_time);
            endTime.setText(currentTitle.getEndTime());

            return listItemView;
        }

        //if(listItemView == null && currentTitle.getLtp() == 2) {
        else {
            //if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_practical, parent, false);
            //}
            //1st block
            TextView subject1 = (TextView) listItemView.findViewById(R.id.subject_prac_1);
            subject1.setText(currentTitle.getSubjectName1());

            TextView desc1 = (TextView) listItemView.findViewById(R.id.desc_prac_1);
            desc1.setText(currentTitle.getDesc1());

            TextView batch1 = (TextView) listItemView.findViewById(R.id.batch1);
            batch1.setText(currentTitle.getBatch1());

            TextView faculty1 = (TextView) listItemView.findViewById(R.id.faculty_prac_1);
            faculty1.setText(currentTitle.getFacultyName1());

            //2nd block
            TextView subject2 = (TextView) listItemView.findViewById(R.id.subject_prac_2);
            subject2.setText(currentTitle.getSubjectName2());

            TextView desc2 = (TextView) listItemView.findViewById(R.id.desc_prac_2);
            desc2.setText(currentTitle.getDesc2());

            TextView batch2 = (TextView) listItemView.findViewById(R.id.batch2);
            batch2.setText(currentTitle.getBatch2());

            TextView faculty2 = (TextView) listItemView.findViewById(R.id.faculty_prac_2);
            faculty2.setText(currentTitle.getFacultyName2());

            //3rd block
            TextView subject3 = (TextView) listItemView.findViewById(R.id.subject_prac_3);
            subject3.setText(currentTitle.getSubjectName3());

            TextView desc3 = (TextView) listItemView.findViewById(R.id.desc_prac_3);
            desc3.setText(currentTitle.getDesc3());

            TextView batch3 = (TextView) listItemView.findViewById(R.id.batch3);
            batch3.setText(currentTitle.getBatch3());

            TextView faculty3 = (TextView) listItemView.findViewById(R.id.faculty_prac_3);
            faculty3.setText(currentTitle.getFacultyName3());

            //4th block
            TextView subject4 = (TextView) listItemView.findViewById(R.id.subject_prac_4);
            subject4.setText(currentTitle.getSubjectName4());

            TextView desc4 = (TextView) listItemView.findViewById(R.id.desc_prac_4);
            desc4.setText(currentTitle.getDesc4());

            TextView batch4 = (TextView) listItemView.findViewById(R.id.batch4);
            batch4.setText(currentTitle.getBatch4());

            TextView faculty4 = (TextView) listItemView.findViewById(R.id.faculty_prac_4);
            faculty4.setText(currentTitle.getFacultyName4());

            TextView startTime = (TextView) listItemView.findViewById(R.id.start_time);
            startTime.setText(currentTitle.getStartTime());

            TextView endTime = (TextView) listItemView.findViewById(R.id.end_time);
            endTime.setText(currentTitle.getEndTime());

            return listItemView;
        }
    }
}
