package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class new_toast {

    public static void set_toast(Context context, String value)
    {
        Toast.makeText(context, "value ==> "+value, Toast.LENGTH_SHORT).show();
    }
}
