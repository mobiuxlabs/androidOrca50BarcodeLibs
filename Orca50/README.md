# Barcode Reader Library for Orca50 Device, which uses zebra hardware for scanning

# Steps 1: add jitpack repo in project-level gradle
     repositories {
          maven { url 'https://jitpack.io' }
      } 

# Steps 2: add in app-level gradle dependencies
    dependencies  {
        implementation 'com.github.mobiuxlabs:androidOrca50BarcodeLibs:v1.0.1'
    }
    
# Steps 3: extends BarcodeReaderBaseActivity in you activity and override onBarcodeScan(String barcode)
    public class MainActivity extends BarcodeReaderBaseActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    
        @Override
        public void onBarcodeScan(String barcode) {
            tvMessage.setText(barcode);
        }
    }
