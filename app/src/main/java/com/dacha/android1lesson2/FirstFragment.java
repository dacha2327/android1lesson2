package com.dacha.android1lesson2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    private Button btn_plus;
    private TextView tv_result;
    private Boolean isOperationClick;
    private  Integer oldNumber;
    private Button btn_minus;
    private String operator;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn_plus = view.findViewById(R.id.btn_plus);
        btn_minus = view.findViewById(R.id.btn_minus);
        tv_result = view.findViewById(R.id.tv_result);
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldNumber = Integer.parseInt(tv_result.getText().toString());
                switch (view.getId()){
                    case R.id.btn_plus:
                        if (isOperationClick = false){
                            setNumber("1");
                        }else if(isOperationClick =true){
                            oldNumber = Integer.parseInt(tv_result.getText().toString());
                            Integer result = oldNumber + 1;
                            tv_result.setText(result.toString());}
                }
                isOperationClick = true;
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldNumber = Integer.parseInt(tv_result.getText().toString());
                switch (view.getId()){
                    case R.id.btn_minus:
                        if (isOperationClick = true){
                            oldNumber = Integer.parseInt(tv_result.getText().toString());
                            Integer result = oldNumber - 1;
                            tv_result.setText(result.toString());
                        }
                }
                isOperationClick = true;
            }
        });


    }
    private void setNumber(String number) {
        if (tv_result.getText().toString().equals("0")) {
            tv_result.setText(number);
        } else if (isOperationClick
        ) {
            tv_result.setText(number);
        } else {
            tv_result.append(number);
        }
        isOperationClick = false;
    }

}