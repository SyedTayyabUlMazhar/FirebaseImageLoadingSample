package com.magentastudio.firebasestoragesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity
{

    FirebaseStorage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storage = FirebaseStorage.getInstance();

        // Create a storage reference from our app
        String imgUrl = "pictures/profile_pic_6.jpeg";

        StorageReference storageRef = storage.getReference();
        StorageReference imagesRef = storageRef.child(imgUrl);

        ImageView imageView = findViewById(R.id.imageView);

        Glide.with(this).load(imagesRef).into(imageView);
    }


}