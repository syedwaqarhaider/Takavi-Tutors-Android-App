package com.example.takavi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class S_Tutors_Search extends AppCompatActivity {


    int images[]={R.drawable.ic_launcher_foreground, R.drawable.myavatar};
    String hourlyRate[]={"40","30"};
    String rating[]={"3.5","4.5"};
    String tuotorFee[]={"3","5"};
    String universityName[]={"Georgia State University-Economics Major, History Miner","Georgia State University-Economics Major, History Miner"};
    String tutorName[]={"Amit Js.","Waqar H."};
    ListView searchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s__tutors__search);
        searchList=(ListView)findViewById(R.id.searchList);
        MyAdapter listAdapter= new MyAdapter(this, this.tutorName,this.hourlyRate, this.rating, this.tuotorFee, this.universityName, this.images);
       searchList.setAdapter(listAdapter);
    }





}
class MyAdapter extends ArrayAdapter<String>
{

    Context context;
    int images[];
    String hourlyRate[];
    String rating[];
    String exp[];
    String universityName[];
    String tutorName[];

    public  MyAdapter(Context context, String tutorName[], String hourlyRate[], String rating[], String exp[], String universityName[], int images[])
    {
        super(context,R.layout.tutor_search_row, R.id.tutorName, tutorName);
        this.context=context;
        this.tutorName=tutorName;
        this.exp=exp;
        this.hourlyRate=hourlyRate;
        this.universityName=universityName;
        this.rating=rating;
        this.images=images;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View converView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View tutor_row=layoutInflater.inflate(R.layout.tutor_search_row, parent,false);
        
        ImageView tutorImg= tutor_row.findViewById(R.id.imgTutor);
        TextView tutorName= tutor_row.findViewById(R.id.tutorName);
        TextView exp= tutor_row.findViewById(R.id.lblExperience);
        TextView hourlyRate= tutor_row.findViewById(R.id.hourlyRate);
        TextView universityName=tutor_row.findViewById(R.id.lblUniversityName);
        TextView rating= tutor_row.findViewById(R.id.rating);

        tutorName.setText(this.tutorName[position]);
        hourlyRate.setText(this.hourlyRate[position]);
        tutorImg.setImageResource(this.images[position]);
        rating.setText(this.rating[position]);
        exp.setText(this.exp[position]);
        universityName.setText(this.universityName[position]);
        return tutor_row;
    }
}