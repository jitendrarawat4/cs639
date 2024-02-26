package com.example.asyntaskimage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.asyntaskimage.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Log.i("FIRSTFRAGMENT","In OnCreateCreated");
//
//        AsyncTaskImageDownloader imgDownloader = new AsyncTaskImageDownloader(this.getActivity());
//        imgDownloader.execute("https://picsum.photos/seed/picsum/200/300");
//
//        LongOperation lop = new LongOperation();
//        lop.execute("Hello");
//        try {
//            Integer myResult = lop.get();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}