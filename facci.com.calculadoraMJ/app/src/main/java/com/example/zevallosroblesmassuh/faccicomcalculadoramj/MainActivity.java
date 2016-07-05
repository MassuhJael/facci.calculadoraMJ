package com.example.zevallosroblesmassuh.faccicomcalculadoramj;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    boolean suma = false;
    boolean resta = false;
    boolean mult = false;
    Double[] numero = new Double[20];
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n0 = (Button) findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button) findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2 = (Button) findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3 = (Button) findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4 = (Button) findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5 = (Button) findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6 = (Button) findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7 = (Button) findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8 = (Button) findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9 = (Button) findViewById(R.id.btn9);
        n9.setOnClickListener(this);
        Button su = (Button) findViewById(R.id.btnsuma);
        su.setOnClickListener(this);
        Button res = (Button) findViewById(R.id.btnresta);
        res.setOnClickListener(this);
        Button mul = (Button) findViewById(R.id.btnmul);
        mul.setOnClickListener(this);
        Button igua = (Button) findViewById(R.id.btnigual);
        igua.setOnClickListener(this);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();


        try {
            switch (seleccion) {

                case R.id.btn0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.btn1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.btn2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.btn3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.btn4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.btn5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.btn6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.btn7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.btn8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.btn9:
                    pantalla.setText(a+"9");
                    break;
                case R.id.btnsuma:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");

                    break;
                case R.id.btnresta:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    break;
                case R.id.btnmul:
                    mult = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    break;
                case R.id.btnigual:
                    numero[1] = Double.parseDouble(a);

                    if (suma == true){
                        resultado = numero [0] + numero [1];
                        pantalla.setText(String.valueOf(resultado));

                    }else if (resta == true){
                        resultado = numero [0] - numero [1];
                        pantalla.setText(String.valueOf(resultado));

                    }else if (mult == true){
                        resultado = numero [0] * numero [1];
                        pantalla.setText(String.valueOf(resultado));

                    }
                    suma = false;
                    resta = false;
                    mult = false;
                    break;

            }
        } catch (Exception e) {

            pantalla.setText("error");
        }
        ;


    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.zevallosroblesmassuh.faccicomcalculadoramj/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.zevallosroblesmassuh.faccicomcalculadoramj/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
