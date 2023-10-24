package com.example.dagger2;

import dagger.Component;

@Component // this the access point without it the Dagger will not work.
public interface CarComponent {

    Car getCar();// This is normal Dagger Injection method
    // Now it is connected to the Constructor of the Car class.
    // It is the provision method


    void inject(MainActivity mainActivity); // for Field injection or Member injection Method.

}
