package org.techtown.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ViewerFragment extends Fragment {
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) { //인플레이션 진행
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_viewer, container, false);

        imageView = rootview.findViewById(R.id.imageView); //이미지 뷰 객체를 찾아 imageView라는 이름의 변수에 할당
        return rootview;
    }

    public void setImage(int resId) { //액티비티에서 이 프래그먼트에 있는 이미지뷰에 이미지를 설정할 수 있다.

        imageView.setImageResource(resId);
    }
}
