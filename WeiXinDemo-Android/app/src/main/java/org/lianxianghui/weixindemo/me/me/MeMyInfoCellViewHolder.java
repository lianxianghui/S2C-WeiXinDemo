package org.lianxianghui.weixindemo.me.me;

import androidx.recyclerview.widget.RecyclerView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Intent;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.appcompat.widget.AppCompatImageView;
import org.lianxianghui.weixindemo.R;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;

/**
* Generated by Sketch2Code
* Created by lianxianghui on 21-08-18.
*/

public class MeMyInfoCellViewHolder extends RecyclerView.ViewHolder {
    private MeMyInfoCellData meMyInfoCellData;

    public final View bottomLine;
    public final AppCompatImageView rightIcon;
    public final AppCompatTextView label;
    public final AppCompatTextView name;
    public final AppCompatImageView rightImage;
    public final AppCompatImageView headImage;
    public final Space pointForBottomOfNameToTopOfRightImage;

    public MeMyInfoCellViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.me_my_info_cell, parent, false));
        View v = itemView;
        bottomLine = v.findViewById(R.id.bottom_line);
        rightIcon = (AppCompatImageView) v.findViewById(R.id.right_icon);
        label = (AppCompatTextView) v.findViewById(R.id.label);
        name = (AppCompatTextView) v.findViewById(R.id.name);
        rightImage = (AppCompatImageView) v.findViewById(R.id.right_image);
        headImage = (AppCompatImageView) v.findViewById(R.id.head_image);
        pointForBottomOfNameToTopOfRightImage = (Space) v.findViewById(R.id.point_for_bottom_of_name_to_top_of_right_image);
    }

    public void bind(MeMyInfoCellData meMyInfoCellData) {
        this.meMyInfoCellData = meMyInfoCellData;
        label.setText(meMyInfoCellData.getLabel());
        name.setText(meMyInfoCellData.getName());
        String imageName = meMyInfoCellData.getRightIcon();
        if (imageName != null) {
            int rightIconResId = itemView.getResources().getIdentifier(imageName, "drawable", "org.lianxianghui.weixindemo");
            if (rightIconResId != 0)
                rightIcon.setImageResource(rightIconResId);
        }
        imageName = meMyInfoCellData.getRightImage();
        if (imageName != null) {
            int rightImageResId = itemView.getResources().getIdentifier(imageName, "drawable", "org.lianxianghui.weixindemo");
            if (rightImageResId != 0)
                rightImage.setImageResource(rightImageResId);
        }
        imageName = meMyInfoCellData.getHeadImage();
        if (imageName != null) {
            int headImageResId = itemView.getResources().getIdentifier(imageName, "drawable", "org.lianxianghui.weixindemo");
            if (headImageResId != 0)
                headImage.setImageResource(headImageResId);
        }
        boolean clickable = meMyInfoCellData.getClickable();
        if (clickable) {
            itemView.setEnabled(true);
        } else {
            itemView.setEnabled(false);
        }
    }

    public MeMyInfoCellData getMeMyInfoCellData() {
        return meMyInfoCellData;
    }






}

class MeMyInfoCellData {
    private String cellId;
    private String headImage;
    private String rightIcon;
    private String label;
    private boolean clickable;
    private String name;
    private String rightImage;

    public String getCellId() {
        return cellId;
    }
    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getHeadImage() {
        return headImage;
    }
    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getRightIcon() {
        return rightIcon;
    }
    public void setRightIcon(String rightIcon) {
        this.rightIcon = rightIcon;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public boolean getClickable() {
        return clickable;
    }
    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRightImage() {
        return rightImage;
    }
    public void setRightImage(String rightImage) {
        this.rightImage = rightImage;
    }

}
