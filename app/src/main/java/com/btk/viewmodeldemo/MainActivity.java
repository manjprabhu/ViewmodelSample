package com.btk.viewmodeldemo;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    @BindView(R.id.textview)
    TextView textView;

    private com.btk.viewmodeldemo.CounterViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mViewModel = ViewModelProviders.of(this).get(com.btk.viewmodeldemo.CounterViewModel.class);
        textView.setText(String.valueOf(mViewModel.getCount()));
    }

    @OnClick(R.id.button)
    public void increamentCounter() {
       int count  =  mViewModel.getCount() + 1;

       mViewModel.setCount(count);
       textView.setText(String.valueOf(mViewModel.getCount()));
    }
}
