package assignment3;

import android.content.Context;
import assignment3.beans.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleManager
{
        private static final String VEHICLE_FILE_NAME = "vehicle_data.txt";

        public static List<Vehicle> getAllVehicles(Context context) {
            List<Vehicle> vehicles = new ArrayList<>();
            try {
                FileInputStream fis = context.openFileInput(VEHICLE_FILE_NAME);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line = br.readLine()) != null) {
                    Vehicle vehicle = parseVehicle(line);
                    vehicles.add(vehicle);
                }
                br.close();
                isr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return vehicles;
        }

        private static Vehicle parseVehicle(String line) {
            String[] parts = line.split(",");
            String make = parts[0];
            String model = parts[1];
            int year = Integer.parseInt(parts[2]);
            String color = parts[3];
            String soldDate = parts[4];
            String thumbnailImage = parts[5];
            String fullSizeImage = parts[6];
            boolean isSold = Boolean.parseBoolean(parts[7]);
           return new Vehicle(make,model, year, color, soldDate);
        }

        public static void saveVehicle(Context context, Vehicle vehicle) {
            try {
                FileOutputStream fos = context.openFileOutput(VEHICLE_FILE_NAME, Context.MODE_APPEND);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.newLine();
                bw.close();
                osw.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        private static void saveAllVehicles(Context context, List<Vehicle> vehicles) {
            try {
                FileOutputStream fos = context.openFileOutput(VEHICLE_FILE_NAME, Context.MODE_PRIVATE);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                for (Vehicle vehicle : vehicles) {
                    bw.newLine();
                }
                bw.close();
                osw.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        }


