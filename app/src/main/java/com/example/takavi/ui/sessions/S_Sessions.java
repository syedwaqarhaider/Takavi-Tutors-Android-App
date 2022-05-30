package com.example.takavi.ui.sessions;

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
 * Use the {@link S_Sessions#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S_Sessions extends Fragment {
    String duration[]={"30", "40"};
    String sessionFee[]={"54","54"};
    String date[]={"5-10-2021","10-12-2021"};
    String tuotorFee[]={"50","50"};
    String serviceFee[]={"8","8"};
    String tutorName[]={"Amit Js.","Waqar H."};
    String sessionSubject[]={"Algebra 1", "AP Phiscs 1"};
    String startingTime[]={"9:30","12:30"};
    String meetingLink[]={"Your tutor has not created a meeting link yet. Please contact via chat.","Your tutor has not created a meeting link yet. Please contact via chat."};

    ListView sessionList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public S_Sessions() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment S_Sessions.
     */
    // TODO: Rename and change types and number of parameters
    public static S_Sessions newInstance(String param1, String param2) {
        S_Sessions fragment = new S_Sessions();
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
        View view =inflater.inflate(R.layout.fragment_s__sessions, container, false);
        sessionList =(ListView)view.findViewById(R.id.listAllSessions);
        MyAdapter listAdapter= new MyAdapter(getContext(), this.tutorName,this.tuotorFee, this.serviceFee, this.sessionFee, this.sessionSubject, this.date,this.startingTime, this.duration, this.meetingLink);
        sessionList.setAdapter(listAdapter);

        return view;
    }
}
class MyAdapter extends ArrayAdapter<String>
{

    Context context;

    String duration[];
    String sessionFee[];
    String date[];
    String tuotorFee[];
    String serviceFee[];
    String tutorName[];
    String sessionSubject[];
    String startingTime[];
    String meetingLink[];
    public  MyAdapter(Context context, String tutorName[],String tuotorFee[],String serviceFee[], String sessionFee[],String sessionSubject[], String date[], String startingTime[],String duration[], String meetingLink[] )
    {
        super(context,R.layout.session_row, R.id.tutorName, tutorName);
         this.context=context;
         this.tutorName=tutorName;
         this.tuotorFee=tuotorFee;
         this.serviceFee=serviceFee;
         this.sessionFee=sessionFee;
         this.sessionSubject=sessionSubject;
         this.date=date;
         this.startingTime=startingTime;
         this.duration=duration;
         this.meetingLink=meetingLink;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View converView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View tutor_row=layoutInflater.inflate(R.layout.session_row, parent,false);

       TextView tutorName=tutor_row.findViewById(R.id.lblSTutorName);
        TextView tutorFee=tutor_row.findViewById(R.id.lblSTutorFee);
        TextView serviceFee=tutor_row.findViewById(R.id.lblServiceFee);
        TextView sessionFee=tutor_row.findViewById(R.id.lblSSessionFee);
        TextView subject=tutor_row.findViewById(R.id.lblSessionSubjectName);
        TextView date=tutor_row.findViewById(R.id.lblSessionDate);
        TextView startingTime=tutor_row.findViewById(R.id.lblSessionStartingTime);
        TextView duration=tutor_row.findViewById(R.id.lblSessionDuration);
        TextView link=tutor_row.findViewById(R.id.lblMeetingLink);

        tutorName.setText(this.tutorName[position]);
        tutorFee.setText(this.tuotorFee[position]);
        serviceFee.setText(this.serviceFee[position]);
        sessionFee.setText(this.sessionFee[position]);
        subject.setText(this.sessionSubject[position]);
        date.setText(this.date[position]);
        startingTime.setText(this.startingTime[position]);
        duration.setText(this.duration[position]);
        link.setText(this.meetingLink[position]);

        return tutor_row;
    }
}