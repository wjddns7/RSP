# 가위바위보 어플

## 1. 제작 시간
* 3시간
<br/>

## 2. 사용 기술
* Android Studio
<br/>

## 3. 핵심 기능
* 쉬움, 어려움 난이도 선택 기능
* 승부 결과에 따라 화면에 승, 패, 무 표시 기능
* 승, 패에 따라 최종결과 표시 기능
<br/>

## 4. 주요 코드
### 난이도 선택
```
public void gomain(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void hard(View view){
        Intent intent = new Intent(getApplicationContext(),hard.class);
        startActivity(intent);
        finish();
    }
```
### 가위바위보 알고리즘
```
public int vs(int n, int r){
        int result = 0;
        if (n == r) result = 0; // 무승부
        else if (n - r == 1 || n - r == -2) result = 1; // 승리
        else result = 2; //패배
        return result;
    }
```
### 승, 무, 패 결과 코드
```
int n = 0;
            String s = null;
            int r = new Random().nextInt(3) + 1;

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
                default:
                    s = "다시";
                    break;
            }
```
### 패배시 체력 감소
```
public void gg(){

        ImageView a = (ImageView)findViewById(R.id.imageView);
        ImageView b = (ImageView)findViewById(R.id.imageView3);
        ImageView c = (ImageView)findViewById(R.id.imageView4);
        ImageView d = (ImageView)findViewById(R.id.imageView5);
        ImageView e = (ImageView)findViewById(R.id.imageView7);
        ImageView f = (ImageView)findViewById(R.id.imageView8);
        ImageView g = (ImageView)findViewById(R.id.imageView9);
        ImageView h = (ImageView)findViewById(R.id.imageView10);
        ImageView i = (ImageView)findViewById(R.id.imageView11);
        ImageView j = (ImageView)findViewById(R.id.imageView12);

        ImageView a1 = (ImageView)findViewById(R.id.imageView33);
        ImageView b1 = (ImageView)findViewById(R.id.imageView34);
        ImageView c1 = (ImageView)findViewById(R.id.imageView35);
        ImageView d1 = (ImageView)findViewById(R.id.imageView36);
        ImageView e1 = (ImageView)findViewById(R.id.imageView37);
        ImageView f1 = (ImageView)findViewById(R.id.imageView38);
        ImageView g1 = (ImageView)findViewById(R.id.imageView39);
        ImageView h1 = (ImageView)findViewById(R.id.imageView40);
        ImageView i1 = (ImageView)findViewById(R.id.imageView41);
        ImageView j1 = (ImageView)findViewById(R.id.imageView42);

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
```
### 최종 결과 알림창
```
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
```
## 5. 실행 화면
* 시작 화면<br/> ![image](https://user-images.githubusercontent.com/108790183/193714923-cc6c319b-70c6-438a-9616-de966edaa367.png)
* 보통 난이도<br/>![image](https://user-images.githubusercontent.com/108790183/193715060-3144f15d-c754-41af-8c7b-b9f15b64ed97.png)
* 어려움 난이도<br/>![image](https://user-images.githubusercontent.com/108790183/193714981-94b700be-5241-4b7a-99bb-1f880c5b7341.png)
* 승리 후 알림창<br/>![image](https://user-images.githubusercontent.com/108790183/193715086-0102f3c5-cf4c-4987-b150-aaa13b4098ce.png)
<br/>

## 6. 데이터 흐름도

![image](https://user-images.githubusercontent.com/108790183/193722324-8cb6ac94-7638-4452-b33f-b33f741f89ef.png)
