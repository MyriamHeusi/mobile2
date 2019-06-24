package com.google.maps.android.utils.demo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.maps.android.utils.demo.model.OrdemServico;
import java.util.ArrayList;

public class CustomOsList extends BaseAdapter {

    private Activity context;
    ArrayList<OrdemServico> oss;

    public CustomOsList(Activity context, ArrayList oss) {
        this.context = context;
        this.oss=oss;
    }
    public static class ViewHolder{
        TextView textViewId;
        TextView textViewDescricao;
        TextView textViewLocal;
        TextView textViewDataInicio;
        TextView textViewDataFim;
        TextView textViewStatus;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row=convertView;

        LayoutInflater inflater = context.getLayoutInflater();
        ViewHolder vh;
        if(convertView==null) {
            vh=new ViewHolder();

            row = inflater.inflate(R.layout.row_item_os, null, true);
            vh.textViewId = (TextView) row.findViewById(R.id.textViewId);
            vh.textViewDescricao = (TextView) row.findViewById(R.id.textViewDescricao);
            vh.textViewLocal = (TextView) row.findViewById(R.id.textViewLocal);
            vh.textViewDataInicio = (TextView) row.findViewById(R.id.textViewDataInicio);
            vh.textViewDataFim = (TextView) row.findViewById(R.id.textViewDataFim);
            vh.textViewStatus = (TextView) row.findViewById(R.id.textViewStatus);
            // store the holder with the view.
            row.setTag(vh);
        }
        else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.textViewId.setText(""+oss.get(position).getId());
        vh.textViewDescricao.setText(oss.get(position).getDescricao());
        vh.textViewLocal.setText(oss.get(position).getLocal());
        vh.textViewDataInicio.setText(oss.get(position).getDatainicio());
        vh.textViewDataFim.setText(oss.get(position).getDatafim());
        vh.textViewStatus.setText(oss.get(position).getStatus());
        return  row;
    }
    public long getItemId(int position) {
        return position;
    }
    public Object getItem(int position) {
        return position;
    }
    public int getCount() {
        if(oss.size()<=0)
            return 1;
        return oss.size();
    }
}
