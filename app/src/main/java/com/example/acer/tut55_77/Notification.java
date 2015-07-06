package com.example.acer.tut55_77;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.NotificationManager;
import android.content.Intent;
import android.view.View;
import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat;


public class Notification extends ActionBarActivity {
    NotificationCompat.Builder notification;
    private static int UNIQUE_ID = 456;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
    }

    public void notify(View view) {
        notification.setSmallIcon(R.drawable.criminal);
        notification.setTicker("this is");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("I m title of notifiction");
        notification.setContentText("I m d body of notification");

        Intent in = new Intent(this, MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, in, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pi);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(UNIQUE_ID, notification.build());
    }
}
