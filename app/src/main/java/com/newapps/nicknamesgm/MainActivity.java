package com.newapps.nicknamesgm;

import androidx.appcompat.app.AppCompatActivity;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private InterstitialAd mInterstitialAd;
    Spinner lista1, lista2;
    String ants="", desps="";
    TextView r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11;
    EditText nick;
    Button generate, copy1,copy2,copy3,copy4,copy5,copy6,copy7,copy8,copy9,copy10,copy11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.intersti));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }

        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        lista1 = findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this, R.array.dato1, android.R.layout.simple_spinner_item);

        lista1.setAdapter(adapter);
        lista1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ants = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        lista2 = findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.dato2, android.R.layout.simple_spinner_item);

        lista2.setAdapter(adapter2);

        lista2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                desps = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        nick =findViewById(R.id.editText);

        r1 = findViewById(R.id.textViewr1);
        r2 = findViewById(R.id.textViewr2);
        r3 = findViewById(R.id.textViewr3);
        r4 = findViewById(R.id.textViewr4);
        r5 = findViewById(R.id.textViewr5);
        r6 = findViewById(R.id.textViewr6);
        r7 = findViewById(R.id.textViewr7);
        r8 = findViewById(R.id.textViewr8);
        r9 = findViewById(R.id.textViewr9);
        r10 = findViewById(R.id.textViewr10);
        r11 = findViewById(R.id.textViewr11);
        generate = findViewById(R.id.button);
        copy1 =findViewById(R.id.botonc1);
        copy1.setOnClickListener(this);
        copy2 =findViewById(R.id.botonc2);
        copy2.setOnClickListener(this);
        copy3 =findViewById(R.id.botonc3);
        copy3.setOnClickListener(this);
        copy4 = findViewById(R.id.botonc4);
        copy4.setOnClickListener(this);
        copy5 = findViewById(R.id.botonc5);
        copy5.setOnClickListener(this);
        copy6 = findViewById(R.id.botonc6);
        copy6.setOnClickListener(this);
        copy7 = findViewById(R.id.botonc7);
        copy7.setOnClickListener(this);
        copy8 = findViewById(R.id.botonc8);
        copy8.setOnClickListener(this);
        copy9 = findViewById(R.id.botonc9);
        copy9.setOnClickListener(this);
        copy10 = findViewById(R.id.botonc10);
        copy10.setOnClickListener(this);
        copy11 = findViewById(R.id.botonc11);
        copy11.setOnClickListener(this);
        r1.setText("Nick");
        r2.setText("Nick");
        r3.setText("Nick");
        r4.setText("Nick");
        r5.setText("Nick");
        r6.setText("Nick");
        r7.setText("Nick");
        r8.setText("Nick");
        r9.setText("Nick");
        r10.setText("Nick");
        r11.setText("Nick");
        nick.setText("Nick");

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String escan1;
                String sal = "";
                String nick1 = "";
                String nick2 = "";
                String nick3 = "";
                String nick4 = "";
                String nick5 = "";
                String nick6 = "";
                String nick7 = "";
                String nick8 = "";
                String nick9 = "";
                String nick10 = "";
                String nick11 = "";
                char letra;
                char letra2;
                char letra3;
                char letra4;
                char letra5;
                char letra6;
                char letra7;
                String letra8;
                char letra9;
                String letra10;
                String letra11;

                char[] ArrayCadena;
                escan1 = nick.getText().toString();
                Scanner scan = new Scanner(escan1);
                sal = scan.nextLine();
                ArrayCadena = sal.toCharArray();
                for (int i = 0; i < ArrayCadena.length; i++) {
                    letra = ArrayCadena[i];


                    if (letra == 'a' || letra == 'A') {
                        letra = '∀';
                        letra2 = 'ค';
                        letra3 = 'ⓐ';
                        letra4 = 'Ⱥ';
                        letra5 = 'ɐ';
                        letra6 = 'ค';
                        letra7 = '凡';
                        letra8 = "【a】";
                        letra9 ='ﾑ';
                        letra10 ="a⃣ ";
                        letra11 ="𝖆";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'b' || letra == 'B') {
                        letra = 'β';
                        letra2 = '๒';
                        letra3 = 'ⓑ';
                        letra4 = 'ƀ';
                        letra5 = 'q';
                        letra6 = 'ც';
                        letra7 = '乃';
                        letra8 = "【b】";
                        letra9 ='乃';
                        letra10 ="b⃣ ";
                        letra11 ="𝖇";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'c' || letra == 'C') {
                        letra = '€';
                        letra2 = 'ς';
                        letra3 = 'ⓒ';
                        letra4 = 'ȼ';
                        letra5 = 'ɔ';
                        letra6 = '८';
                        letra7 = 'ㄈ';
                        letra8 = "【c】";
                        letra9 ='ᄃ';
                        letra10 ="c⃣ ";
                        letra11 ="𝖈";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'd' || letra == 'D') {
                        letra = 'Ð';
                        letra2 = '๔';
                        letra3 = 'ⓓ';
                        letra4 = 'đ';
                        letra5 = 'p';
                        letra6 = 'ძ';
                        letra7 = '刀';
                        letra8 = "【d】";
                        letra9 ='り';
                        letra10 ="d⃣ ";
                        letra11 ="𝖉";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'e' || letra == 'E') {
                        letra = 'Э';
                        letra2 = 'є';
                        letra3 = 'ⓔ';
                        letra4 = 'ɇ';
                        letra5 = 'ǝ';
                        letra6 = '૯';
                        letra7 = 'モ';
                        letra8 = "【e】";
                        letra9 ='乇';
                        letra10 ="e⃣ ";
                        letra11 ="𝖊";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'f' || letra == 'F') {
                        letra = '╒';
                        letra2 = 'Ŧ';
                        letra3 = 'ⓕ';
                        letra4 = 'f';
                        letra5 = 'ɟ';
                        letra6 = 'Բ';
                        letra7 = '下';
                        letra8 = "【f】";
                        letra9 ='ｷ';
                        letra10 ="f⃣ ";
                        letra11 ="𝖋";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'g' || letra == 'G') {
                        letra = 'б';
                        letra2 = 'ɠ';
                        letra3 = 'ⓖ';
                        letra4 = 'ǥ';
                        letra5 = 'ɓ';
                        letra6 = '૭';
                        letra7 = 'G';
                        letra8 = "【g】";
                        letra9 ='ム';
                        letra10 ="g⃣ ";
                        letra11 ="𝖌";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'h' || letra == 'H') {
                        letra = 'Ћ';
                        letra2 = 'ђ';
                        letra3 = 'ⓗ';
                        letra4 = 'ħ';
                        letra5 = 'ɥ';
                        letra6 = 'Һ';
                        letra7 = '什';
                        letra8 = "【h】";
                        letra9 ='ん';
                        letra10 ="h⃣ ";
                        letra11 ="𝖍";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'i' || letra == 'I') {
                        letra = '∔';
                        letra2 = 'เ';
                        letra3 = 'ⓘ';
                        letra4 = 'ɨ';
                        letra5 = 'ᴉ';
                        letra6 = 'ɿ';
                        letra7 = 'ﾉ';
                        letra8 = "【i】";
                        letra9 ='ﾉ';
                        letra10 ="i⃣ ";
                        letra11 ="𝖎";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'j' || letra == 'J') {
                        letra = 'ﻞ';
                        letra2 = 'ן';
                        letra3 = 'ⓙ';
                        letra4 = 'ɉ';
                        letra5 = 'ſ';
                        letra6 = 'ʆ';
                        letra7 = 'ﾌ';
                        letra8 = "【j】";
                        letra9 ='ﾌ';
                        letra10 ="j⃣ ";
                        letra11 ="𝖏";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'k' || letra == 'K') {
                        letra = 'Ќ';
                        letra2 = 'к';
                        letra3 = 'ⓚ';
                        letra4 = 'ꝁ';
                        letra5 = 'ʞ';
                        letra6 = 'қ';
                        letra7 = 'に';
                        letra8 = "【k】";
                        letra9 ='ズ';
                        letra10 ="k⃣ ";
                        letra11 ="𝖐";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'l' || letra == 'L') {
                        letra = '¦';
                        letra2 = 'l';
                        letra3 = 'ⓛ';
                        letra4 = 'ł';
                        letra5 = 'ๅ';
                        letra6 = 'Ն';
                        letra7 = '乚';
                        letra8 = "【l】";
                        letra9 ='ﾚ';
                        letra10 ="l⃣ ";
                        letra11 ="𝖑";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'm' || letra == 'M') {
                        letra = 'ᗰ';
                        letra2 = '๓';
                        letra3 = 'ⓜ';
                        letra4 = 'ɯ';
                        letra5 = 'ɱ';
                        letra6 = 'ᗰ';
                        letra7 = '州';
                        letra8 = "【m】";
                        letra9 ='ﾶ';
                        letra10 ="m⃣ ";
                        letra11 ="𝖒";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'n' || letra == 'N') {
                        letra = 'И';
                        letra2 = 'ภ';
                        letra3 = 'ⓝ';
                        letra4 = 'n';
                        letra5 = 'u';
                        letra6 = 'Ո';
                        letra7 = '几';
                        letra8 = "【n】";
                        letra9 ='刀';
                        letra10 ="n⃣ ";
                        letra11 ="𝖓";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'ñ' || letra == 'Ñ') {
                        letra = 'й';
                        letra2 = 'ภ';
                        letra3 = 'ⓝ';
                        letra4 = 'n';
                        letra5 = 'u';
                        letra6 = 'Ո';
                        letra7 = '几';
                        letra8 = "【n】";
                        letra9 ='刀';
                        letra10 ="n⃣ ";
                        letra11 ="𝖓";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'o' || letra == 'O') {
                        letra = 'Θ';
                        letra2 = '๏';
                        letra3 = 'ⓞ';
                        letra4 = 'ø';
                        letra5 = 'o';
                        letra6 = '૦';
                        letra7 = 'ロ';
                        letra8 = "【o】";
                        letra9 ='の';
                        letra10 ="o⃣ ";
                        letra11 ="𝖔";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'p' || letra == 'P') {
                        letra = 'ρ';
                        letra2 = 'թ';
                        letra3 = 'ⓟ';
                        letra4 = 'ᵽ';
                        letra5 = 'd';
                        letra6 = 'ƿ';
                        letra7 = '尸';
                        letra8 = "【p】";
                        letra9 ='ｱ';
                        letra10 ="p⃣ ";
                        letra11 ="𝖕";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'q' || letra == 'Q') {
                        letra = 'φ';
                        letra2 = 'ợ';
                        letra3 = 'ⓠ';
                        letra4 = 'ꝗ';
                        letra5 = 'b';
                        letra6 = 'ҩ';
                        letra7 = 'Q';
                        letra8 = "【q】";
                        letra9 ='ゐ';
                        letra10 ="q⃣ ";
                        letra11 ="𝖖";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'r' || letra == 'R') {
                        letra = 'Я';
                        letra2 = 'г';
                        letra3 = 'ⓡ';
                        letra4 = 'ɍ';
                        letra5 = 'ɹ';
                        letra6 = 'Ր';
                        letra7 = '尺';
                        letra8 = "【r】";
                        letra9 ='尺';
                        letra10 ="r⃣ ";
                        letra11 ="𝖗";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 's' || letra == 'S') {
                        letra = 'δ';
                        letra2 = 'ร';
                        letra3 = 'ⓢ';
                        letra4 = 's';
                        letra5 = 's';
                        letra6 = '౮';
                        letra7 = 'ら';
                        letra8 = "【s】";
                        letra9 ='丂';
                        letra10 ="s⃣ ";
                        letra11 ="𝖘";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 't' || letra == 'T') {
                        letra = 'Ŧ';
                        letra2 = 't';
                        letra3 = 'ⓣ';
                        letra4 = 'ŧ';
                        letra5 = 'ʇ';
                        letra6 = '੮';
                        letra7 = 'イ';
                        letra8 = "【t】";
                        letra9 ='ｲ';
                        letra10 ="t⃣ ";
                        letra11 ="𝖙";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'u' || letra == 'U') {
                        letra = 'Ц';
                        letra2 = 'ย';
                        letra3 = 'ⓤ';
                        letra4 = 'ᵾ';
                        letra5 = 'n';
                        letra6 = 'υ';
                        letra7 = '凵';
                        letra8 = "【u】";
                        letra9 ='ひ';
                        letra10 ="u⃣ ";
                        letra11 ="𝖚";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'v' || letra == 'V') {
                        letra = '∇';
                        letra2 = 'v';
                        letra3 = 'ⓥ';
                        letra4 = 'v';
                        letra5 = 'ʌ';
                        letra6 = 'ע';
                        letra7 = 'レ';
                        letra8 = "【v】";
                        letra9 ='√';
                        letra10 ="v⃣ ";
                        letra11 ="𝖛";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'w' || letra == 'W') {
                        letra = 'Щ';
                        letra2 = 'ฬ';
                        letra3 = 'ⓦ';
                        letra4 = 'w';
                        letra5 = 'ʍ';
                        letra6 = 'ω';
                        letra7 = '山';
                        letra8 = "【w】";
                        letra9 ='W';
                        letra10 ="w⃣ ";
                        letra11 ="𝖜";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'x' || letra == 'X') {
                        letra = 'Ж';
                        letra2 = 'x';
                        letra3 = 'ⓧ';
                        letra4 = 'x';
                        letra5 = 'x';
                        letra6 = '૪';
                        letra7 = 'ㄨ';
                        letra8 = "【x】";
                        letra9 ='ﾒ';
                        letra10 ="x⃣ ";
                        letra11 ="𝖝";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else if (letra == 'y' || letra == 'Y') {
                        letra = 'Ў';
                        letra2 = 'ץ';
                        letra3 = 'ⓨ';
                        letra4 = 'ɏ';
                        letra5 = 'ʎ';
                        letra6 = 'ע';
                        letra7 = 'ㄚ';
                        letra8 = "【y】";
                        letra9 ='ﾘ';
                        letra10 ="y⃣ ";
                        letra11 ="𝖞";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    } else {
                        letra = 'ᘔ';
                        letra2 = 'z';
                        letra3 = 'ⓩ';
                        letra4 = 'ƶ';
                        letra5 = 'z';
                        letra6 = 'ઽ';
                        letra7 = '乙';
                        letra8 = "【z】";
                        letra9 ='乙';
                        letra10 ="z⃣";
                        letra11 ="𝖟";
                        nick1 = nick1 + letra;
                        nick2 = nick2 + letra2;
                        nick3 = nick3 + letra3;
                        nick4 = nick4 + letra4;
                        nick5 = nick5 + letra5;
                        nick6 = nick6 + letra6;
                        nick7 = nick7 + letra7;
                        nick8 = nick8 + letra8;
                        nick9 = nick9 + letra9;
                        nick10 = nick10 + letra10;
                        nick11 = nick11 + letra11;
                    }


                }

                r1.setText(ants+nick7+desps);
                r2.setText(ants+nick6+desps);
                r3.setText(ants+nick5+desps);
                r4.setText(ants+nick2+desps);
                r5.setText(ants+nick3+desps);
                r6.setText(ants+nick1+desps);
                r7.setText(ants+nick4+desps);
                r8.setText(ants+nick8+desps);
                r9.setText(ants+nick11+desps);
                r10.setText(ants+nick9+desps);
                r11.setText(ants+nick10+desps);

            }
        });
            }


    public void onClick(View v) {

        switch (v.getId()){
            case R.id.botonc1: copy(r1.getText().toString()); break;
            case R.id.botonc2: copy(r2.getText().toString()); break;
            case R.id.botonc3: copy(r3.getText().toString()); break;
            case R.id.botonc4: copy(r4.getText().toString()); break;
            case R.id.botonc5: copy(r5.getText().toString()); break;
            case R.id.botonc6: copy(r6.getText().toString()); break;
            case R.id.botonc7: copy(r7.getText().toString()); break;
            case R.id.botonc8: copy(r8.getText().toString()); break;
            case R.id.botonc9: copy(r9.getText().toString()); break;
            case R.id.botonc10: copy(r10.getText().toString()); break;
            case R.id.botonc11: copy(r11.getText().toString()); break;

        }
    }
    private void copy(String text){

        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("text",  text);
        clipboard.setPrimaryClip(clip);
        showMessage(text);

    }
    private void showMessage(String text){
        Toast.makeText(this,R.string.copied,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
        }