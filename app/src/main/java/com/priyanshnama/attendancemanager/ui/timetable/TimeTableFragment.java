package com.priyanshnama.attendancemanager.ui.timetable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.priyanshnama.attendancemanager.R;

public class TimeTableFragment extends Fragment {

    private TimeTableViewModel timetableViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        timetableViewModel =
                new ViewModelProvider(this).get(TimeTableViewModel.class);
        View root = inflater.inflate(R.layout.fragment_timetable, container, false);
        final TextView textView = root.findViewById(R.id.text_timetable);
        timetableViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}