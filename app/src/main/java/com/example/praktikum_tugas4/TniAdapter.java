package com.example.praktikum_tugas4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

    public class TniAdapter extends RecyclerView.Adapter<TniAdapter.tniViewHolder> {
        private ArrayList<tni> dataList;
        public TniAdapter(ArrayList<tni> dataList) {
            this.dataList = dataList;
        }
        @NonNull
        @Override
        public TniAdapter.tniViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.item_tni, parent, false);
            return new tniViewHolder(view);
        }

        public void onBindViewHolder(tniViewHolder holder, int position) {
            holder.foto.setImageResource(dataList.get(position).getFoto());
            holder.txtNama.setText(dataList.get(position).getNama());
            holder.txtLahir.setText(dataList.get(position).getLahir());
            holder.txtPangkat.setText(dataList.get(position).getPangkat());
        }

        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }

        public class tniViewHolder extends RecyclerView.ViewHolder{
            private TextView txtNama, txtLahir, txtPangkat;
            private ImageView foto;

            public tniViewHolder(View itemView) {
                super(itemView);
                foto = (ImageView) itemView.findViewById(R.id.foto);
                txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
                txtLahir = (TextView) itemView.findViewById(R.id.txt_lahir);
                txtPangkat = (TextView) itemView.findViewById(R.id.txt_pangkat);
            }
        }

    }
