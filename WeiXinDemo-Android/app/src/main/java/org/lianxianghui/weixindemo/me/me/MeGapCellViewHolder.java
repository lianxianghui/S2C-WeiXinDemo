package org.lianxianghui.weixindemo.me.me;

import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.lianxianghui.weixindemo.R;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;

/**
* Generated by Sketch2Code
* Created by lianxianghui on 21-08-18.
*/

public class MeGapCellViewHolder extends RecyclerView.ViewHolder {
    private MeGapCellData meGapCellData;


    public MeGapCellViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.me_gap_cell, parent, false));
        View v = itemView;
    }

    public void bind(MeGapCellData meGapCellData) {
        this.meGapCellData = meGapCellData;
        boolean clickable = meGapCellData.getClickable();
        if (clickable) {
            itemView.setEnabled(true);
        } else {
            itemView.setEnabled(false);
        }
    }

    public MeGapCellData getMeGapCellData() {
        return meGapCellData;
    }

}

class MeGapCellData {
    private boolean clickable;
    private String cellId;

    public boolean getClickable() {
        return clickable;
    }
    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public String getCellId() {
        return cellId;
    }
    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

}
