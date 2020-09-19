package com.example.hackapp2020.application;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {

        super.onCreate();

        // Register parse model

        Parse.enableLocalDatastore(this);

        // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(Keys.getAppId()) // should correspond to APP_ID env variable
                .clientKey(Keys.getMasterKey())  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("http://hack-mit2020.herokuapp.com/parse")
                .enableLocalDataStore().build());

    }
}
