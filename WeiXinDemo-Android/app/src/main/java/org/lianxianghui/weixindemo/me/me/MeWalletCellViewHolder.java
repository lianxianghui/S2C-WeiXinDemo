package org.lianxianghui.weixindemo.me.me;

import androidx.recyclerview.widget.RecyclerView;
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

public class MeWalletCellViewHolder extends RecyclerView.ViewHolder {
    private MeWalletCellData meWalletCellData;

    public final View bottomLine;
    public final AppCompatImageView leftImage;
    public final AppCompatTextView name;
    public final AppCompatImageView rightIcon;

    public MeWalletCellViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.me_wallet_cell, parent, false));
        View v = itemView;
        bottomLine = v.findViewById(R.id.bottom_line);
        leftImage = (AppCompatImageView) v.findViewById(R.id.left_image);
        name = (AppCompatTextView) v.findViewById(R.id.name);
        rightIcon = (AppCompatImageView) v.findViewById(R.id.right_icon);
    }

    public void bind(MeWalletCellData meWalletCellData) {
        this.meWalletCellData = meWalletCellData;
        name.setText(meWalletCellData.getName());
        String imageName = meWalletCellData.getLeftImage();
        if (imageName != null) {
            int leftImageResId = itemView.getResources().getIdentifier(imageName, "drawable", "org.lianxianghui.weixindemo");
            if (leftImageResId != 0)
                leftImage.setImageResource(leftImageResId);
        }
        imageName = meWalletCellData.getRightIcon();
        if (imageName != null) {
            int rightIconResId = itemView.getResources().getIdentifier(imageName, "drawable", "org.lianxianghui.weixindemo");
            if (rightIconResId != 0)
                rightIcon.setImageResource(rightIconResId);
        }
        boolean clickable = meWalletCellData.getClickable();
        if (clickable) {
            itemView.setEnabled(true);
        } else {
            itemView.setEnabled(false);
        }
    }

    public MeWalletCellData getMeWalletCellData() {
        return meWalletCellData;
    }




}

class MeWalletCellData {
    private String leftImage;
    private String cellId;
    private boolean clickable;
    private String name;
    private String rightIcon;

    public String getLeftImage() {
        return leftImage;
    }
    public void setLeftImage(String leftImage) {
        this.leftImage = leftImage;
    }

    public String getCellId() {
        return cellId;
    }
    public void setCellId(String cellId) {
        this.cellId = cellId;
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

    public String getRightIcon() {
        return rightIcon;
    }
    public void setRightIcon(String rightIcon) {
        this.rightIcon = rightIcon;
    }

}
