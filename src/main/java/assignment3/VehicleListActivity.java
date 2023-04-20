package assignment3;
import android.os.Bundle;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import assignment3.beans.Vehicle;
import com.example.comp1011android.R;


import java.util.List;


    public class VehicleListActivity extends AppCompatActivity {

        private RecyclerView recyclerView;
        private VehicleListAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_vehicle);

            recyclerView = findViewById(R.id.recycler_view);

            List<Vehicle> vehicle = loadVehicles(); // Implement this method to load the vehicles from the app-specific files
            adapter = new VehicleListAdapter(vehicle);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
        }

        private List<Vehicle> loadVehicles() {
            // Implement this method to load the vehicles from the app-specific files
            // For now, return an empty list to avoid a compilation error.
            // Replace this with the actual implementation later.
            return new ArrayList<>();
        }
    }

