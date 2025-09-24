package com.example.androidself7_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText edtAngle;
    ImageView imageView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("제주도 풍경");

        edtAngle = (EditText) findViewById(R.id.edtAngle);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 클릭된 메뉴 아이템의 ID를 가져옵니다.
        int itemId = item.getItemId();

        // '그림 회전' 메뉴를 선택했을 때
        if (itemId == R.id.itemRotate) {
            try {
                // EditText에서 각도 값을 가져와 숫자로 변환
                float angle = Float.parseFloat(edtAngle.getText().toString());
                // 이미지 회전
                imageView1.setRotation(angle);
            } catch (NumberFormatException e) {
                // 입력값이 비어있거나 숫자가 아니면 아무것도 하지 않음
            }
            // 작업이 처리되었음을 시스템에 알림
            return true;

            // '한라산' 메뉴를 선택했을 때
        } else if (itemId == R.id.item1) {
            imageView1.setImageResource(R.drawable.jeju2);
            // 선택된 아이템에 체크 표시
            item.setChecked(true);
            return true;

            // '추자도' 메뉴를 선택했을 때
        } else if (itemId == R.id.item2) {
            imageView1.setImageResource(R.drawable.jeju14);
            item.setChecked(true);
            return true;

            // '범섬' 메뉴를 선택했을 때
        } else if (itemId == R.id.item3) {
            imageView1.setImageResource(R.drawable.jeju6);
            item.setChecked(true);
            return true;
        }

        // 위에서 처리되지 않은 메뉴 선택은 기본 동작에 맡김
        return super.onOptionsItemSelected(item);
    }
}