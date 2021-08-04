package com.tia.myapplication;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
//    private void fun simpleToast(context :Conte ){
//        Toast.makeText(this,"me"+,Toast.LENGTH_SHORT);
//    }
    public static void simpleToast(Context context,String mess){
        Toast.makeText(context,"me"+mess,Toast.LENGTH_SHORT).show();
    }
}
