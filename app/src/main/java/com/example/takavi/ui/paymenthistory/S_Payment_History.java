package com.example.takavi.ui.paymenthistory;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.takavi.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link S_Payment_History#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S_Payment_History extends Fragment {
    String date[]={"5-10-2021","10-12-2021", "11-12-2020","1-10-2021"};
    String tutorName[]={"Amit Js.","Cole S","Sara A","Anna Z"};
    String duration[]={"30", "40","20","50"};
    String amount[]={"54","50","55","70"};

    ListView paymentHistoryListView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public S_Payment_History() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment S_Payment_History.
     */
    // TODO: Rename and change types and number of parameters
    public static S_Payment_History newInstance(String param1, String param2) {
        S_Payment_History fragment = new S_Payment_History();
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
        View view =inflater.inflate(R.layout.fragment_s__payment__history, container, false);
        paymentHistoryListView=(ListView)view.findViewById(R.id.paymentHistoryList);
        MyAdapter listAdapter= new MyAdapter(getContext(),this.date, this.tutorName,this.duration,this.amount);
        paymentHistoryListView.setAdapter(listAdapter);
        return view;
    }
}

class MyAdapter extends ArrayAdapter<String>
{

    Context context;

    String duration[];

    String date[];


    String tutorName[];
   String amount[];
    public  MyAdapter(Context context,  String date[], String tutorName[],String duration[], String amount[])
    {
        super(context,R.layout.payment_history_row, R.id.tutorName, tutorName);
        this.context=context;
        this.tutorName=tutorName;
        this.amount=amount;
        this.date=date;
        this.duration=duration;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View converView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View tutor_row=layoutInflater.inflate(R.layout.payment_history_row, parent,false);

        TextView tutorName=tutor_row.findViewById(R.id.lblPHTutorName);
        TextView date=tutor_row.findViewById(R.id.lblPHSessionDate);
        TextView duration=tutor_row.findViewById(R.id.lblPHTimeDuration);
        TextView amount=tutor_row.findViewById(R.id.lblPHTutorFee);


        tutorName.setText(this.tutorName[position]);
        date.setText(this.date[position]);
        duration.setText(this.duration[position]);
        amount.setText(this.amount[position]);

        return tutor_row;
    }
}