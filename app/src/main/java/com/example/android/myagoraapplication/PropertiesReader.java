//package com.example.android.myagoraapplication;
//
//import android.content.Context;
//import android.content.res.AssetManager;
//import android.util.Log;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
//public class PropertiesReader {
//    private Context context;
//    private Properties properties;
//
//    public PropertiesReader(Context context) {
//        this.context = context;
//        //creates a new object ‘Properties’
//        properties = new Properties();
//
//        public Properties getProperties(String FileName){
//            try {
//                //access to the folder ‘assets’
//                AssetManager am = context.getAssets();
//                //opening the file
//                InputStream inputStream = am.open(FileName);
//                //loading of the properties
//                properties.load(inputStream);
//            } catch (IOException e) {
//                Log.e("PropertiesReader", e.toString());
//            }
//        }
//        return properties;
