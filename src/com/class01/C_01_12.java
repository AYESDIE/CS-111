package com.class01;

public class C_01_12 {
    public static void main(String[] args) {
        double distance_miles = 24;
        double time_hr = 1;
        double time_min = 40;
        double time_sec = 35;
        double factor_miles_to_km = 1.6;
        double distance_km = distance_miles * factor_miles_to_km;
        double total_time_hr = time_hr + time_min / 60 + time_sec / (60 * 60);
        double speed_km_per_hour = distance_km / total_time_hr;
        System.out.println(speed_km_per_hour);
    }
}
