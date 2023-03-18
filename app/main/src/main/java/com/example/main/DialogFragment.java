package com.example.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DialogFragment extends android.fragment.app.DialogFragment {
    @Nullable
    @Override
    protected void onCreateView(@Nullable LayoutInflater, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.dialog_fragment,container,false);
        =
    }
}