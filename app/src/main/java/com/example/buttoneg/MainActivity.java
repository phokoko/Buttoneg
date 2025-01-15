package com.example.buttoneg;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTexta;
    private EditText editTextp, editTextf, editTexti;
    private TextView textView;
    private Button button;
    private Boolean puts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTexta = findViewById(R.id.editAge);
        editTextp = findViewById(R.id.editpound);
        editTextf = findViewById(R.id.editfeet);
        editTexti = findViewById(R.id.editinches);
        button = findViewById(R.id.btncal);
        textView = findViewById(R.id.resultt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int age = Integer.parseInt(editTexta.getText().toString());
                double pound = Double.parseDouble(editTextp.getText().toString());
                double feet = Double.parseDouble(editTextf.getText().toString());
                double inches = Double.parseDouble(editTexti.getText().toString());
                double height = (feet * 12) + inches;
                double height2 = height * height;
                double bmi = pound / height2 * 703;
                if (bmi <= 25) {
                    textView.setText("သင်၏ကိုယ်အလေးချိန်ပြညွှန်းကိန်းမှာ-------" + bmi + "ဖြစ်သည်။ သတ်မှတ်ချက်နှင်ကိုက်ညီပါသည်။");

                } else {
                    textView.setText("သင်၏ကိုယ်အလေးချိန်ပြညွှန်းကိန်းမှာ-------" + bmi + "ဖြစ်သည်။ သတ်မှတ်ချက်နှင်မကိုက်ညီပါ");
                }
            }
        });
    }
}
