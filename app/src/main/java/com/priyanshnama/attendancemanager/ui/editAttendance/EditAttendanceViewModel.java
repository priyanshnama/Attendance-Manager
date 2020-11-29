package com.priyanshnama.attendancemanager.ui.editAttendance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EditAttendanceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EditAttendanceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Edit Attendance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}