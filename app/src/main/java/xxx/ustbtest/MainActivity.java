package xxx.ustbtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Context context = this;
    protected Button connectButton, infoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputListener();
        addButtonListener();
    }

    protected void addButtonListener(){

        connectButton = (Button) findViewById(R.id.connect_button);
        infoButton = (Button) findViewById(R.id.info_button);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Connect to attached device
            }
        });

        connectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSend = "info";
                //send via usb
            }
        });
    }

    protected void inputListener(){
        //show received data from bus
    }
	

	public void foo(){

        UsbManager manager = (UsbManager) getSystemService(Context.USB_SERVICE);

        HashMap<String, UsbDevice> allDevices = manager.getDeviceList();

        String devicelist = "Devices found:\n";
        for(String skey : allDevices.keySet()){
            devicelist += ("skey:" + skey + "\n" +
                    "device:" + allDevices.get(skey).toString() + " \n" +
                    "------\n");
        }
        logTextView.setText(devicelist); /* change this to your textview*/
    }

}
