package org.bitleet.saraf.contact;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact>{


    private List<Contact> contactList;
    private Context context;

    public ContactAdapter(@NonNull Context context, int resource, @NonNull List<Contact> contactList) {
        super(context, resource, contactList);
        this.context = context;
        this.contactList = contactList;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.list_layout, parent, false);

        ImageView contactIV = convertView.findViewById(R.id.contactImage);
        TextView nameTV = convertView.findViewById(R.id.contactName);
        ImageView callButton = convertView.findViewById(R.id.callButton);
        ImageView mailButton = convertView.findViewById(R.id.mailButton);
        ImageView smsButton = convertView.findViewById(R.id.smsButton);
        ImageView optionButton = convertView.findViewById(R.id.optionButton);

        contactIV.setImageResource(contactList.get(position).getImage());
        nameTV.setText(contactList.get(position).getName());

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Call Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Mail Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        smsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "SMS Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        optionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Option Clicked", Toast.LENGTH_SHORT).show();
            }
        });




        return convertView;
    }
}
