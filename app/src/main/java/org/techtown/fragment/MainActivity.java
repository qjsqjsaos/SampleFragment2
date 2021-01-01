package org.techtown.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements ListFragment.ImageSelectionCallback {//ImageSelectionCallback을 쓰겠다고 호출하고 구현해준다.

    ListFragment listFragment;
    ViewerFragment viewerFragment;

    int[] images = {R.drawable.draw01, R.drawable.draw02, R.drawable.draw03}; //배열 만들기

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        listFragment = (ListFragment) manager.findFragmentById(R.id.listFragment);
        viewerFragment = (ViewerFragment) manager.findFragmentById(R.id.viewerFragment);
    }

    @Override
    public void onImageSelected(int position) { //그리고 ImageSelectionCallback 인터페이스안에 들어있던 onImageSelected 메서드를 사용한다.
        viewerFragment.setImage(images[position]); //이미지 바꾸기 ViewerFragment에 있는
                                                     //setImage메서드를 가져옴.
    }
}