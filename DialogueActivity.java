 package org.bitleet.saraf.contact;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

 public class DialogueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);

        Intent intent = getIntent();
        String value = intent.getStringExtra("details");
        TextView textView = findViewById(R.id.DialougeName);
        textView.setText(value);




//        int image = intent.getIntExtra("image", Integer.parseInt(String.valueOf(Contact.generateContacts().get())));
//        ImageView imageView = findViewById(R.id.contactImage);
//        imageView.setImageResource(image);

    }
}
