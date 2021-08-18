package org.lianxianghui.weixindemo.weixin.conversationlist;

import androidx.appcompat.widget.AppCompatTextView;
import org.lianxianghui.weixindemo.R;
import android.graphics.BitmapFactory;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.KeyEvent;
import android.graphics.Bitmap;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.LayoutInflater;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;

/**
* Generated by Sketch2Code
* Created by lianxianghui on 21-08-18.
*/

public class ConversationListLoginStatusCellViewHolder extends RecyclerView.ViewHolder {
    private ConversationListLoginStatusCellData conversationListLoginStatusCellData;

    public final AppCompatImageView statusImage;
    public final AppCompatTextView statusLabel;

    public ConversationListLoginStatusCellViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.conversation_list_login_status_cell, parent, false));
        View v = itemView;
        statusImage = (AppCompatImageView) v.findViewById(R.id.status_image);
        statusLabel = (AppCompatTextView) v.findViewById(R.id.status_label);
        setStatusLabelMultipleStyles();
    }

    public void bind(ConversationListLoginStatusCellData conversationListLoginStatusCellData) {
        this.conversationListLoginStatusCellData = conversationListLoginStatusCellData;
        statusLabel.setText(conversationListLoginStatusCellData.getStatusLabel());
        String imageName = conversationListLoginStatusCellData.getStatusImage();
        if (imageName != null) {
            int statusImageResId = itemView.getResources().getIdentifier(imageName, "drawable", "org.lianxianghui.weixindemo");
            if (statusImageResId != 0)
                statusImage.setImageResource(statusImageResId);
        }
        boolean clickable = conversationListLoginStatusCellData.getClickable();
        if (clickable) {
            itemView.setEnabled(true);
        } else {
            itemView.setEnabled(false);
        }
    }

    public ConversationListLoginStatusCellData getConversationListLoginStatusCellData() {
        return conversationListLoginStatusCellData;
    }


    private void setStatusLabelMultipleStyles() {
        final int flag = android.text.Spannable.SPAN_EXCLUSIVE_EXCLUSIVE;
        int start;
        int end;
        android.text.SpannableStringBuilder text = new android.text.SpannableStringBuilder();

        start = text.length();
        text.append("Mac");
        end = text.length();
        text.setSpan(new android.text.style.TypefaceSpan("sans-serif"), start, end, flag);
        text.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.NORMAL), start, end, flag);
        text.setSpan(new android.text.style.AbsoluteSizeSpan((int)12, true), start, end, flag);
        text.setSpan(new android.text.style.AlignmentSpan.Standard(android.text.Layout.Alignment.ALIGN_NORMAL), start, end, flag);
        text.setSpan(new android.text.style.ForegroundColorSpan(0xFF939396), start, end, flag);

        start = text.length();
        text.append("微信已登录，手机通知已关闭");
        end = text.length();
        text.setSpan(new android.text.style.TypefaceSpan("sans-serif"), start, end, flag);
        text.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.NORMAL), start, end, flag);
        text.setSpan(new android.text.style.AbsoluteSizeSpan((int)12, true), start, end, flag);
        text.setSpan(new android.text.style.AlignmentSpan.Standard(android.text.Layout.Alignment.ALIGN_NORMAL), start, end, flag);
        text.setSpan(new android.text.style.ForegroundColorSpan(0xFF939396), start, end, flag);
        this.statusLabel.setText(text);
    }

}

class ConversationListLoginStatusCellData {
    private String statusLabel;
    private String cellId;
    private boolean clickable;
    private String statusImage;

    public String getStatusLabel() {
        return statusLabel;
    }
    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
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

    public String getStatusImage() {
        return statusImage;
    }
    public void setStatusImage(String statusImage) {
        this.statusImage = statusImage;
    }

}
