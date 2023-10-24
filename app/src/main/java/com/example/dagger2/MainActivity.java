package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private Car carr;

    @Inject  Car car; // This is known as Field injection or Member injection Method. -
    // -It needs not to be private or else it will give this error
    //error: Dagger does not support injection into private fields
    // The benefit of Field inject is you can add multiple member variable.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // This is normal Dagger Injection method
        CarComponent carComponent = DaggerCarComponent.create();
        carr = carComponent.getCar(); //Commented to show the Field injection method.
//        carr.drive();
        // \\


        CarComponent component = DaggerCarComponent.create();
        component.inject(this); // Field Injection..


        car.drive();

    }
}