package com.leonestudios.notificacionfirebase;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;


public class NotificationIDTokenService extends FirebaseMessagingService {

    private static final String TAG = "FIREBASE_TOKEN";

    @Override
    public void onNewToken(@NonNull String s) {
        String token = FirebaseMessagingService.NETWORK_STATS_SERVICE;
        enviarTokenRegistro(token);
    }



    private void enviarTokenRegistro(String token){
        Log.d(TAG, token);
    }
}