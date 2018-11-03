package org.bitleet.saraf.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        adapter = new ContactAdapter(this,R.layout.list_layout, Contact.generateContacts());

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Contact.generateContacts().get(position).getName(),
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), DialogueActivity.class);
                intent.putExtra("details", Contact.generateContacts().get(position).getName());
                intent.putExtra("image", Contact.generateContacts().get(position).getImage());

                startActivity(intent);


            }
        });
    }

}
