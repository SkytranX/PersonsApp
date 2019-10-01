package com.example.personsapp.adapter;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.personsapp.R;
import com.example.personsapp.model.Person;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> {

    private List<Person> peopleList;

    public PeopleAdapter(List<Person> peopleList){
        this.peopleList = peopleList;
    }


    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.person_item,
                parent,
                false
        );
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        Person person = peopleList.get(position);

        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        holder.userName.setText(firstName+" "+lastName);
        String phone = person.getPhoneNumber();
        String email = person.getEmail();
        holder.userPhone.setText(phone);
        holder.userEmail.setText(email);
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    class PeopleViewHolder extends RecyclerView.ViewHolder{
        TextView userName;
        TextView userPhone;
        TextView userEmail;
        ImageView userImage;

        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.tvName);
            userPhone = itemView.findViewById(R.id.info_phone);
            userEmail = itemView.findViewById(R.id.info_email);
            userImage = itemView.findViewById(R.id.user_image);

        }
    }

}
