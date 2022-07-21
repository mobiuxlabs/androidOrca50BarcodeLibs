package in.mobiux.android.orca50barcodereader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;

import com.zebra.sdl.BarcodeReaderBaseActivity;

public class MainActivity extends BarcodeReaderBaseActivity {

    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.tvMessage);
    }

    @Override
    public void onBarcodeScan(String barcode) {
//        super.onBarcodeScan(barcode);
        tvMessage.setText(barcode);
    }
}