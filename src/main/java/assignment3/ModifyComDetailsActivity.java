package assignment3;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import com.example.comp1011android.R;

public class ModifyComDetailsActivity extends AppCompatActivity
{
    private ImageView imgLogo;
    private EditText etCompanyName;
    private EditText etCompanyAddress;
    private EditText etCompanyPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_details);

        imgLogo = findViewById(R.id.img_logo);
        etCompanyName = findViewById(R.id.et_company_name);
        etCompanyAddress = findViewById(R.id.et_company_address);
        etCompanyPhone = findViewById(R.id.et_company_phone);

        Button btnUploadLogo = findViewById(R.id.btn_upload_logo);
        Button btnSaveChanges = findViewById(R.id.btn_save_changes);


        btnUploadLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        btnSaveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
