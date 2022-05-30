package com.example.takavi.ui.favourite_tutors;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.takavi.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link s_favourite_tutors#newInstance} factory method to
 * create an instance of this fragment.
 */
public class s_favourite_tutors extends Fragment {

    int images[]={R.drawable.ic_launcher_foreground, R.drawable.myavatar};
    String hourlyRateforOnline[]={"40","30"};
    String hourlyRateforInPerson[]={"55", "60"};

    String exp[]={"3","5"};
    String universityName[]={"Georgia State University","Georgia State University"};
    String tutorName[]={"Amit Js.","Waqar H."};
    ListView favouriteTutorsList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public s_favourite_tutors() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment s_favourite_tutors.
     */
    // TODO: Rename and change types and number of parameters
    public static s_favourite_tutors newInstance(String param1, String param2) {
        s_favourite_tutors fragment = new s_favourite_tutors();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_s_favourite_tutors, container, false);
        favouriteTutorsList=(ListView) view.findViewById(R.id.favoriteTutorsList);
        MyAdapter listAdapter= new MyAdapter(getContext(), this.tutorName,this.hourlyRateforOnline, this.hourlyRateforInPerson, this.exp, this.universityName, this.images);
        favouriteTutorsList.setAdapter(listAdapter);
        return view;

    }
}
class MyAdapter extends ArrayAdapter<String>
{

    Context context;
    int images[];
    String hourlyRateforOnline[];
    String hourlyRateforInPerson[];

    String exp[];
    String universityName[];
    String tutorName[];

    public  MyAdapter(Context context, String tutorName[], String hourlyRateforOnline[], String hourlyRateforInPerson[], String exp[], String universityName[], int images[])
    {
        super(context,R.layout.tutor_search_row, R.id.tutorName, tutorName);
        this.context=context;
        this.tutorName=tutorName;
        this.exp=exp;
        this.hourlyRateforOnline=hourlyRateforOnline;
        this.hourlyRateforInPerson=hourlyRateforInPerson;
        this.universityName=universityName;
        this.images=images;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View converView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View tutor_row=layoutInflater.inflate(R.layout.favorite_tutors_row, parent,false);

        ImageView tutorImg= tutor_row.findViewById(R.id.tutorImg);
        TextView tutorName= tutor_row.findViewById(R.id.lblFTutorName);
        TextView exp= tutor_row.findViewById(R.id.lblFTutorExperience);
        TextView hourlyRateforOnline= tutor_row.findViewById(R.id.lblFTutorHourlyRate);
        TextView hourlyRateforInPerson= tutor_row.findViewById(R.id.lblFTutorHourlyRateForInPerson);
        TextView universityName=tutor_row.findViewById(R.id.lblFTutorUniversityName);


        tutorName.setText(this.tutorName[position]);
        hourlyRateforOnline.setText(this.hourlyRateforOnline[position]);
        tutorImg.setImageResource(this.images[position]);
        hourlyRateforInPerson.setText(this.hourlyRateforInPerson[position]);
        exp.setText(this.exp[position]);
        universityName.setText(this.universityName[position]);
        return tutor_row;




    }
}