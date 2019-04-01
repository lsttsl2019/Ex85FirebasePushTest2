package com.mrhi2018.ex85firebasepushtest;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        //super.onMessageReceived(remoteMessage);
        //메세지를 받으면 실행되는 메소드
        //메세지 내용은 파라미터로 전달된 remoteMessage로 부터 얻어오면 됨.

        Log.e("TAG", "receiced Message!!!!");


    }
}
