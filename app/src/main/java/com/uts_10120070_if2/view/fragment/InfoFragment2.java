/**
 * Nim : 10120070
 * Nama : Fikri Adam Pratama Sutanto
 * Kelas : IF2
 */

package com.uts_10120070_if2.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.uts_10120070_if2.R;


public class InfoFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_info_slide2, container, false);
        return rootView;
    }
}

