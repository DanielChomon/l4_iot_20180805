package com.example.l4_iot_20180805.fragmentos.navigation;

import static android.content.Context.SENSOR_SERVICE;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.hardware.Sensor;
import android.util.Log;

import com.example.l4_iot_20180805.SensorAccListener;
import com.example.lab4_iot_20180805.databinding.FragmentClimaBinding;
import com.example.lab4_iot_20180805.R;

import java.util.List;

public class FragmentClima extends Fragment {

    FragmentClimaBinding binding;

    SensorManager mSensorManager;
    SensorAccListener listener = new SensorAccListener();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentClimaBinding.inflate(inflater, container, false);

        binding.buttonToClima.setOnClickListener(view -> {

            NavController navController = NavHostFragment.findNavController(FragmentClima.this);
            navController.navigate(R.id.action_fragmentB_to_fragmentA);
            //navController.navigate(FragmentCDirections.actionFragmentCToFragmentA());
        });
        return binding.getRoot();

    }}
/*
        super.onCreate(savedInstanceState);
        binding = FragmentClimaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        if(mSensorManager != null){ //validar si tengo sensores

            Sensor acelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);


            List<Sensor> sensorList = mSensorManager.getSensorList(Sensor.TYPE_ALL);
            for(Sensor sensor : sensorList){
                Log.d("msg-test-sensorList","sensorName: " + sensor.getName());
            }

        }

        //location services
        return null;
    }

    private Object getSystemService(String sensorService) {
        return null;
    }

    private void setContentView(ConstraintLayout root) {
    }

    @Override
    public void onResume() {
        super.onResume();

        Sensor mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(listener,mAccelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        //mSensorManager.registerListener(listener,mAcc,20000000);

        //Sensor mGyr = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        //mSensorManager.registerListener(listener,mGyr,SensorManager.SENSOR_DELAY_UI);
    }
*/
