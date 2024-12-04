package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private ArrayList<Contact> contactList;

    public ContactAdapter(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact contact = contactList.get(position);

        // Set only the essential fields
        holder.contactName.setText(contact.getFirstName() + " " + contact.getLastName());
        holder.contactNumber.setText(contact.getNumber());
        holder.contactRelationship.setText(contact.getRelationship());

        // Set the click listener to reveal more details
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), ContactDetailActivity.class);
            intent.putExtra("contact", contact);
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView contactName;
        TextView contactNumber;
        TextView contactRelationship;

        public ContactViewHolder(View itemView) {
            super(itemView);
            contactName = itemView.findViewById(R.id.contact_name);
            contactNumber = itemView.findViewById(R.id.contact_number);
            contactRelationship = itemView.findViewById(R.id.contact_relationship);
        }
    }
}
