package assignment3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Intent;
import assignment3.beans.Vehicle;
import com.example.comp1011android.R;



import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VehicleListAdapter extends RecyclerView.Adapter<VehicleListAdapter.VehicleViewHolder> {

    private List<Vehicle> vehicle;
    private List<Vehicle> filteredVehicles;

    public VehicleListAdapter(List<Vehicle> vehicles) {
        this.vehicle = vehicle;
        this.filteredVehicles = new ArrayList<>(vehicles);
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_items, parent, false);
        return new VehicleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder holder, int position) {
        Vehicle vehicle = filteredVehicles.get(position);
        holder.tvVehicleName.setText(vehicle.getMake() + " " + vehicle.getModel());
        holder.tvVehicleDetails.setText(vehicle.getYear() + ", " + vehicle.getColor() + ", " + vehicle.getPrice());
    }

    @Override
    public int getItemCount() {
        return filteredVehicles.size();
    }

    public void filterAvailable() {
        List<Vehicle> newFilteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicle) {
            if (vehicle.getDateSold() == null) {
                newFilteredVehicles.add(vehicle);
            }
        }
        filteredVehicles = newFilteredVehicles;
        notifyDataSetChanged();
    }

    public void filterSold() {
        List<Vehicle> newFilteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicle) {
            if (vehicle.getDateSold() != null) {
                newFilteredVehicles.add(vehicle);
            }
        }
        filteredVehicles = newFilteredVehicles;
        notifyDataSetChanged();
    }

    public class VehicleViewHolder extends RecyclerView.ViewHolder {

        TextView tvVehicleName;
        TextView tvVehicleDetails;

        public VehicleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvVehicleName = itemView.findViewById(R.id.tv_vehicle_name);
            tvVehicleDetails = itemView.findViewById(R.id.tv_vehicle_details);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        Vehicle vehicles = filteredVehicles.get(position);
                        Intent intent = new Intent(itemView.getContext(), VehDetailsActivity.class);
                        //intent.putExtra("Vehicles", Vehicles);
                        itemView.getContext().startActivity(intent);

                    }
                }
            });
        }

    }
}
