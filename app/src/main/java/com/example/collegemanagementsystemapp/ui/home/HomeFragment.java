package com.example.collegemanagementsystemapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.collegemanagementsystemapp.R;
import com.example.collegemanagementsystemapp.TeacherActivity;
import com.example.collegemanagementsystemapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

   TextView teacher;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
teacher=root.findViewById(R.id.ahp_teacher);
teacher.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(getActivity(), TeacherActivity.class);
        startActivity(intent);
    }
});

        return root;
    }


}