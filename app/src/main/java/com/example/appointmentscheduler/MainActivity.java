package com.example.appointmentscheduler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.widget.DatePicker;
import java.util.Calendar;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // request code for notification permission
    private static final int NOTIFICATION_PERMISSION_CODE = 123;
    private TextView dateTextView;
    private Button pickDateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout main_layout = findViewById(R.id.main_layout);



    }
}