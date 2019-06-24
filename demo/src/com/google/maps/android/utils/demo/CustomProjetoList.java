package com.google.maps.android.utils.demo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.maps.android.utils.demo.model.Projeto;
import java.util.ArrayList;

public class CustomProjetoList extends BaseAdapter {

    private Activity context;
    ArrayList<Projeto> projetos;

    public CustomProjetoList(Activity context, ArrayList projetos) {
        //   super(context, R.layout.row_item, countries);
        this.context = context;
        this.projetos=projetos;
    }
    public static class ViewHolder{
        TextView textViewId;
        TextView textViewNome;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;

        LayoutInflater inflater = context.getLayoutInflater();
        ViewHolder vh;
        if(convertView==null) {
            vh=new ViewHolder();
            row = inflater.inflate(R.layout.row_item_projeto, null, true);
            vh.textViewId = (TextView) row.findViewById(R.id.textViewId);
            vh.textViewNome = (TextView) row.findViewById(R.id.textViewNome);
            // store the holder with the view.
            row.setTag(vh);
        }
        else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.textViewNome.setText(projetos.get(position).getNome());
        vh.textViewId.setText(""+projetos.get(position).getId());
        return  row;
    }
    public long getItemId(int position) {
        return position;
    }
    public Object getItem(int position) {
        return position;
    }
    public int getCount() {
        if(projetos.size()<=0)
            return 1;
        return projetos.size();
    }
}