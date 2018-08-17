package com.as.gotbeginner;

import android.app.Application;
import android.content.Context;

public class GotApp extends Application {

    private static Context context;

    public GotApp() {
        context= this;
    }

    public static Context getAppContext(){
        return context;
    }
}
