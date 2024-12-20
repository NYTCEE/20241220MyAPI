package com.example.MyAPI;

public class Data {
    Result result;

    class Result {
        Results[] results;

        class Results {
            String Station;
            String Destination;
        }
    }
}
