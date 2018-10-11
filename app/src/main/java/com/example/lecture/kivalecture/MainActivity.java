package com.example.lecture.kivalecture;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.lecture.kivalecture.Network.KivaLoans;
import com.example.lecture.kivalecture.Network.VolleySingleton;
import com.google.gson.Gson;


import java.lang.reflect.Method;

public class MainActivity extends Activity {
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        VolleySingleton singleton = VolleySingleton.getInstance(this);

        String url = "https://api.kivaws.org/v1/loans/newest.json";


        Response.Listener<String> onResponse = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                KivaLoans Loans = gson.fromJson(response, KivaLoans.class);
                Toast.makeText(mContext, response.subSequence(0, 32), Toast.LENGTH_LONG).show();
            }
        };


        Response.ErrorListener onError = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(mContext, error.toString().subSequence(0, 32), Toast.LENGTH_LONG).show();
            }
        };

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, onResponse,onError);

        singleton.addToRequestQueue(stringRequest);
    }
}
