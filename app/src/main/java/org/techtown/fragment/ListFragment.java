package org.techtown.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

    public interface ImageSelectionCallback { //인터페이스를 하나 정의하고, 메인액티비티에 호출하기
        void onImageSelected(int position);
    }

    public ImageSelectionCallback callback;

    @Override
    public void onAttach(Context context) { //프래그먼트가 액티비티 위에 올라오는 시점에 호출된다.
        super.onAttach(context);// 온어테치 메서드로 전달되는 파라미터를 참조한다.

        if(context instanceof ImageSelectionCallback) { //instanceof : 왼쪽에는 참조변수, 오른쪽에는 클래스를 두는 인스턴스의 실제타입을 알아보기 위한 연산자 해석 :
            //이 것을 구현하는 것이 맞다면
            callback = (ImageSelectionCallback) context; //자료형이 Activity가 아니라 ImageSelectionCallback인 이유 :
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, false);
        Button button = rootview.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(0);
                }
            }
        });

        Button button2 = rootview.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(1);
                }
            }
        });

        Button button3 = rootview.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(2);
                }
            }
        });
        return rootview;
    }

}

