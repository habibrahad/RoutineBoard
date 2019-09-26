package com.example.routineboard.experiment;



public class Title {

    private int mLtp;
    private Integer mSubjectName;
    private Integer mbatch;
    private Integer mDesc;
    private Integer mFacultyName;
    private Integer mStartTime;
    private Integer mEndTime;

    private Integer mSubjectName1;
    private Integer mDesc1;
    private Integer mbatch1;
    private Integer mFacultyName1;

    private Integer mSubjectName2;
    private Integer mDesc2;
    private Integer mbatch2;
    private Integer mFacultyName2;

    private Integer mSubjectName3;
    private Integer mDesc3;
    private Integer mbatch3;
    private Integer mFacultyName3;

    private Integer mSubjectName4;
    private Integer mDesc4;
    private Integer mbatch4;
    private Integer mFacultyName4;

    private Integer mbatch12;
    private Integer mbatch34;

    public Title(Integer subjectName, Integer desc, int batch, Integer facultyName, Integer startTime, Integer endTime) {
        mSubjectName=subjectName;
        mbatch = batch;
        mDesc=desc;
        mFacultyName=facultyName;

        mStartTime=startTime;
        mEndTime=endTime;
        mLtp=0;
    }

    public Title(Integer subjectName1, Integer desc1, int batch12, Integer facultyName1,Integer subjectName2, Integer desc2,int batch34, Integer facultyName2, Integer startTime, Integer endTime,int ltp) {
        mSubjectName1=subjectName1;
        mDesc1=desc1;
        mbatch12=batch12;
        mFacultyName1=facultyName1;

        mSubjectName2=subjectName2;
        mDesc2=desc2;
        mbatch34=batch34;
        mFacultyName2=facultyName2;

        mStartTime=startTime;
        mEndTime=endTime;
        mLtp=ltp;
    }

    public Title(Integer subjectName1, Integer desc1,int batch1 ,Integer facultyName1, Integer subjectName2, Integer desc2,int batch2 , Integer facultyName2, Integer subjectName3, Integer desc3, int batch3, Integer facultyName3, Integer subjectName4, Integer desc4,int batch4 , Integer facultyName4, Integer startTime, Integer endTime, int ltp) {
        mSubjectName1=subjectName1;
        mDesc1=desc1;
        mbatch1=batch1;
        mFacultyName1=facultyName1;

        mSubjectName2=subjectName2;
        mDesc2=desc2;
        mbatch2=batch2;
        mFacultyName2=facultyName2;

        mSubjectName3=subjectName3;
        mDesc3=desc3;
        mbatch3=batch3;
        mFacultyName3=facultyName3;

        mSubjectName4=subjectName4;
        mDesc4=desc4;
        mbatch4=batch4;
        mFacultyName4=facultyName4;

        mStartTime=startTime;
        mEndTime=endTime;
        mLtp=ltp;
    }

    public Integer getSubjectName() {return mSubjectName;}
    public Integer getDesc() {return mDesc;}
    public Integer getBatch(){return mbatch;}
    public Integer getFacultyName() {return mFacultyName;}

    public Integer getBatch12(){return mbatch12;}
    public Integer getBatch34(){return mbatch34;}
    public Integer getBatch1(){return mbatch1;}
    public Integer getBatch2(){return mbatch2;}
    public Integer getBatch3(){return mbatch3;}
    public Integer getBatch4(){return mbatch4;}

    public Integer getSubjectName1() {return mSubjectName1;}
    public Integer getSubjectName2() {return mSubjectName2;}
    public Integer getSubjectName3() {return mSubjectName3;}
    public Integer getSubjectName4() {return mSubjectName4;}

    public Integer getDesc1() {return mDesc1;}
    public Integer getDesc2() {return mDesc2;}
    public Integer getDesc3() {return mDesc3;}
    public Integer getDesc4() {return mDesc4;}

    public Integer getFacultyName1() {return mFacultyName1;}
    public Integer getFacultyName2() {return mFacultyName2;}
    public Integer getFacultyName3() {return mFacultyName3;}
    public Integer getFacultyName4() {return mFacultyName4;}

    public Integer getStartTime() {return mStartTime;}
    public Integer getEndTime() {return mEndTime;}

    public int getLtp() {return mLtp;}
}
