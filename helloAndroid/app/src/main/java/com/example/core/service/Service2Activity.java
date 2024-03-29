package com.example.core.service;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.helloandroid.R;
import androidx.appcompat.app.AppCompatActivity;

public class Service2Activity extends AppCompatActivity {

    //保持所启动的Service的IBinder对象,同时定义一个ServiceConnection对象
    private MyService2.MyBinder binder;

    private ServiceConnection conn = new ServiceConnection() {

        //Activity与Service断开连接时回调该方法
        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e("service", " ------Service DisConnected-------");
        }

        //Activity与Service连接成功时回调该方法
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.e("service", " ------Service Connected------ - ");
            binder = (MyService2.MyBinder) service;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_layout2);
        Button btnbind = (Button) findViewById(R.id.btnbind);
        Button btncancel = (Button) findViewById(R.id.btncancel);
        Button btnstatus = (Button) findViewById(R.id.btnstatus);
        final Intent intent = new Intent(Service2Activity.this, MyService2.class);

        btnbind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //绑定service
                bindService(intent, conn, Service.BIND_AUTO_CREATE);
            }
        });

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //解除service绑定
                unbindService(conn);
            }
        });

        btnstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Service的count的值为:"
                        + binder.getCount(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(conn); // 销毁Activity时需要解绑Service
    }
}
