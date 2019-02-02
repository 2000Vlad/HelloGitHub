package vlad.services.client;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void startService(View view)
    {
        ComponentName name=new ComponentName
                ("vlad.services.provider",
                        "vlad.services.provider.SampleService");

        Intent serviceIntent=new Intent();
        serviceIntent.setComponent(name);
        Toast.makeText(this,"Service starts...",Toast.LENGTH_LONG).show();
        ComponentName result=startService(serviceIntent);
        name=null;

    }
    protected void stopService(View view)
    {
        ComponentName name=new ComponentName
                ("vlad.services.provider",
                        "vlad.services.provider.SampleService");
        Intent serviceIntent=new Intent();
        serviceIntent.setComponent(name);
       boolean stopped= stopService(serviceIntent);
       if(stopped)
        Toast.makeText(this,"Service Stopped",Toast.LENGTH_SHORT).show();
       else Toast.makeText(this,"Service Not Stopped",Toast.LENGTH_SHORT).show();
    }
}
