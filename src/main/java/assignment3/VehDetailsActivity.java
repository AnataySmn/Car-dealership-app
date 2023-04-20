package assignment3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import assignment3.beans.Vehicle;
import com.example.comp1011android.R;

public class VehDetailsActivity extends AppCompatActivity {

    private TextView tvMakeModel;
    private TextView tvYear;
    private TextView tvColor;
    private TextView tvPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_vehicle);

        tvMakeModel = findViewById(R.id.tv_make_model);
        tvYear = findViewById(R.id.tv_year);
        tvColor = findViewById(R.id.tv_color);
        tvPrice = findViewById(R.id.tv_price);

        Vehicle vehicle = getIntent().getParcelableExtra("vehicle");

        if (vehicle != null) {
            tvMakeModel.setText(vehicle.getMake() + " " + vehicle.getModel());
            tvYear.setText(String.valueOf(vehicle.getYear()));
            tvColor.setText(vehicle.getColor());
            tvPrice.setText(String.valueOf(vehicle.getPrice()));
        }
    }
}
