package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    //Log Template
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject // Constructor Injection.
    // Now Dagger knows this is to be injected and initiated.
    // without this annotation it will give this error: -
    //cannot be provided without an @Inject constructor or an @Provides-annotated method.
    public Car(Engine engine, Wheels wheels)
    {
        this.engine= engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "driving.. ");
    }

}
