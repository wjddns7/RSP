package com.example.myapplication090709;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class hard extends AppCompatActivity {


    int mycnt = 10;
    int ccnt = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //버튼의 리스트 할당
        findViewById(R.id.gawi).setOnClickListener(mybutton);
        findViewById(R.id.bawi).setOnClickListener(mybutton);
        findViewById(R.id.bo).setOnClickListener(mybutton);
    }
    void showAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("결과");

        if(mycnt <= 0)
            builder.setMessage("세계는 로봇에게 멸망되었습니다.");
        else if(ccnt <= 0)
            builder.setMessage("로봇에게서 세계를 구하셨습니다!");

        builder.setPositiveButton("다시 도전", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int lll) {

                ImageView a = (ImageView)findViewById(R.id.imageView22);
                ImageView b = (ImageView)findViewById(R.id.imageView21);
                ImageView c = (ImageView)findViewById(R.id.imageView20);
                ImageView d = (ImageView)findViewById(R.id.imageView19);
                ImageView e = (ImageView)findViewById(R.id.imageView18);
                ImageView f = (ImageView)findViewById(R.id.imageView17);
                ImageView g = (ImageView)findViewById(R.id.imageView16);
                ImageView h = (ImageView)findViewById(R.id.imageView15);
                ImageView i = (ImageView)findViewById(R.id.imageView14);
                ImageView j = (ImageView)findViewById(R.id.imageView13);

                ImageView a1 = (ImageView)findViewById(R.id.imageView32);
                ImageView b1 = (ImageView)findViewById(R.id.imageView31);
                ImageView c1 = (ImageView)findViewById(R.id.imageView30);
                ImageView d1 = (ImageView)findViewById(R.id.imageView29);
                ImageView e1 = (ImageView)findViewById(R.id.imageView28);
                ImageView f1 = (ImageView)findViewById(R.id.imageView27);
                ImageView g1 = (ImageView)findViewById(R.id.imageView26);
                ImageView h1 = (ImageView)findViewById(R.id.imageView25);
                ImageView i1 = (ImageView)findViewById(R.id.imageView24);
                ImageView j1 = (ImageView)findViewById(R.id.imageView23);

                a.setVisibility(View.VISIBLE);
                b.setVisibility(View.VISIBLE);
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                e.setVisibility(View.VISIBLE);
                f.setVisibility(View.VISIBLE);
                g.setVisibility(View.VISIBLE);
                h.setVisibility(View.VISIBLE);
                i.setVisibility(View.VISIBLE);
                j.setVisibility(View.VISIBLE);


                a1.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                c1.setVisibility(View.VISIBLE);
                d1.setVisibility(View.VISIBLE);
                e1.setVisibility(View.VISIBLE);
                f1.setVisibility(View.VISIBLE);
                g1.setVisibility(View.VISIBLE);
                h1.setVisibility(View.VISIBLE);
                i1.setVisibility(View.VISIBLE);
                j1.setVisibility(View.VISIBLE);

                mycnt = 10;
                ccnt = 10;
            }
        });
        builder.setNegativeButton("처음 화면",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),intro.class);
                        startActivity(intent);
                        finish();
                    }
                });
        builder.show();
    }
    public int vs(int n, int r){
        int result = 0;
        if (n == r) result = 0; // 무승부
        else if (n - r == 1 || n - r == -2) result = 1; // 승리
        else result = 2; //패배
        return result;
    }

    public void gg(){

        ImageView a = (ImageView)findViewById(R.id.imageView22);
        ImageView b = (ImageView)findViewById(R.id.imageView21);
        ImageView c = (ImageView)findViewById(R.id.imageView20);
        ImageView d = (ImageView)findViewById(R.id.imageView19);
        ImageView e = (ImageView)findViewById(R.id.imageView18);
        ImageView f = (ImageView)findViewById(R.id.imageView17);
        ImageView g = (ImageView)findViewById(R.id.imageView16);
        ImageView h = (ImageView)findViewById(R.id.imageView15);
        ImageView i = (ImageView)findViewById(R.id.imageView14);
        ImageView j = (ImageView)findViewById(R.id.imageView13);

        ImageView a1 = (ImageView)findViewById(R.id.imageView32);
        ImageView b1 = (ImageView)findViewById(R.id.imageView31);
        ImageView c1 = (ImageView)findViewById(R.id.imageView30);
        ImageView d1 = (ImageView)findViewById(R.id.imageView29);
        ImageView e1 = (ImageView)findViewById(R.id.imageView28);
        ImageView f1 = (ImageView)findViewById(R.id.imageView27);
        ImageView g1 = (ImageView)findViewById(R.id.imageView26);
        ImageView h1 = (ImageView)findViewById(R.id.imageView25);
        ImageView i1 = (ImageView)findViewById(R.id.imageView24);
        ImageView j1 = (ImageView)findViewById(R.id.imageView23);

        if(ccnt == 9)
            a.setVisibility(View.INVISIBLE);
        else if(ccnt == 8)
            b.setVisibility(View.INVISIBLE);
        else if(ccnt == 7)
            c.setVisibility(View.INVISIBLE);
        else if(ccnt == 6)
            d.setVisibility(View.INVISIBLE);
        else if(ccnt == 5)
            e.setVisibility(View.INVISIBLE);
        else if(ccnt == 4)
            f.setVisibility(View.INVISIBLE);
        else if(ccnt == 3)
            g.setVisibility(View.INVISIBLE);
        else if(ccnt == 2)
            h.setVisibility(View.INVISIBLE);
        else if(ccnt == 1)
            i.setVisibility(View.INVISIBLE);
        else if(ccnt == 0)
            j.setVisibility(View.INVISIBLE);

        if(mycnt == 9)
            a1.setVisibility(View.INVISIBLE);
        else if(mycnt == 8)
            b1.setVisibility(View.INVISIBLE);
        else if(mycnt == 7)
            c1.setVisibility(View.INVISIBLE);
        else if(mycnt == 6)
            d1.setVisibility(View.INVISIBLE);
        else if(mycnt == 5)
            e1.setVisibility(View.INVISIBLE);
        else if(mycnt == 4)
            f1.setVisibility(View.INVISIBLE);
        else if(mycnt == 3)
            g1.setVisibility(View.INVISIBLE);
        else if(mycnt == 2)
            h1.setVisibility(View.INVISIBLE);
        else if(mycnt == 1)
            i1.setVisibility(View.INVISIBLE);
        else if(mycnt == 0)
            j1.setVisibility(View.INVISIBLE);
    }

    View.OnClickListener mybutton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            ImageView cba = (ImageView)findViewById(R.id.cbawi);
            ImageView cga =(ImageView)findViewById(R.id.cgawi);
            ImageView cb =(ImageView)findViewById(R.id.cbo);

            cb.setVisibility(View.INVISIBLE);
            cba.setVisibility(View.INVISIBLE);
            cga.setVisibility(View.INVISIBLE);

            int n = 0;
            String s = null;
            int r = new Random().nextInt(10) + 1;

            switch (view.getId()) {
                case R.id.gawi:
                    n = 1;
                    break;
                case R.id.bawi:
                    n = 2;
                    break;
                case R.id.bo:
                    n = 3;
                    break;
            }
            int result = vs(n, r);

            switch (result) {
                case 0:
                    if(n == 1)
                        cga.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cb.setVisibility(View.VISIBLE);
                    s = "무승부";
                    break;
                case 1:
                    if(n == 1)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cga.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cba.setVisibility(View.VISIBLE);
                    s = "승리";

                    ccnt -= 1;
                    gg();
                    break;
                case 2:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);

                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                case 3:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);

                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                case 4:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);

                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                case 5:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);

                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                case 6:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);

                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                case 7:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);

                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                case 8:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);

                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                case 9:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);

                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                case 10:
                    if(n == 1)
                        cba.setVisibility(View.VISIBLE);
                    else if(n == 2)
                        cb.setVisibility(View.VISIBLE);
                    else if(n == 3)
                        cga.setVisibility(View.VISIBLE);
                    s = "패배";
                    mycnt -= 1;
                    gg();
                    break;
                default:
                    s = "다시";
                    break;
            }

            if(mycnt <= 0)
                showAlertDialog();
            if(ccnt <= 0)
                showAlertDialog();

            ((TextView) findViewById(R.id.result)).setText(s);
        }
    };
    public void reset(View view){
        Intent intent = new Intent(getApplicationContext(),intro.class);
        startActivity(intent);
        finish();
    }
}