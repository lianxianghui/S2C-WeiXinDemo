package org.lianxianghui.weixindemo.me.me;

import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import org.lianxianghui.weixindemo.R;
import android.view.ViewGroup;
import android.os.Bundle;
import android.graphics.BitmapFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import android.content.Intent;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;

/**
* Generated by Sketch2Code
* Created by lianxianghui on 21-08-18.
*/

public class MeFragment extends Fragment {
    private static final String TAG = "MeFragment";
    private ConstraintLayout contentView;
    private RecyclerView listView;
    private ConstraintLayout customNavigationBar;
    private View bottomLine;
    private AppCompatTextView title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.me_fragment, container, false);
 
        contentView = (ConstraintLayout) v.findViewById(R.id.content_view);
        listView = (RecyclerView) v.findViewById(R.id.list_view);
        listView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateListView();
        customNavigationBar = (ConstraintLayout) v.findViewById(R.id.custom_navigation_bar);
        bottomLine = v.findViewById(R.id.bottom_line);
        title = (AppCompatTextView) v.findViewById(R.id.title);
        return v;
    }

    private ListViewAdapter listViewAdapter;
    private void updateListView() {
        List<Object> dataList  = getListViewDataList();
        listViewAdapter = new ListViewAdapter(dataList);
        listView.setAdapter(listViewAdapter);
    }

    private List<Object> getListViewDataList() {
        ArrayList<Object> list = new ArrayList<Object>();

        MeGapCellData cellData0 = new MeGapCellData();
        cellData0.setClickable(false);
        cellData0.setCellId("0");
        list.add(cellData0);

        MeMyInfoCellData cellData1 = new MeMyInfoCellData();
        cellData1.setCellId("0");
        cellData1.setHeadImage("me_me_my_info_cell_head_image");
        cellData1.setRightIcon("me_me_my_info_cell_right_icon");
        cellData1.setLabel("微信号：Sketch2Code");
        cellData1.setClickable(true);
        cellData1.setName("Skech2Code");
        cellData1.setRightImage("me_me_my_info_cell_right_image");
        list.add(cellData1);

        MeGapCellData cellData2 = new MeGapCellData();
        cellData2.setClickable(true);
        cellData2.setCellId("1");
        list.add(cellData2);

        MeWalletCellData cellData3 = new MeWalletCellData();
        cellData3.setLeftImage("me_me_wallet_cell_left_image");
        cellData3.setCellId("0");
        cellData3.setClickable(true);
        cellData3.setName("钱包");
        cellData3.setRightIcon("me_me_wallet_cell_right_icon");
        list.add(cellData3);

        MeGapCellData cellData4 = new MeGapCellData();
        cellData4.setClickable(true);
        cellData4.setCellId("2");
        list.add(cellData4);

        MeCellData cellData5 = new MeCellData();
        cellData5.setLeftImage("me_me_cell_left_image");
        cellData5.setCellId("0");
        cellData5.setClickable(true);
        cellData5.setName("收藏");
        cellData5.setRightIcon("me_me_cell_right_icon");
        list.add(cellData5);

        MeCellData cellData6 = new MeCellData();
        cellData6.setLeftImage("me_me_cell_left_image_4");
        cellData6.setCellId("1");
        cellData6.setClickable(true);
        cellData6.setName("相册");
        cellData6.setRightIcon("me_me_cell_right_icon_4");
        list.add(cellData6);

        MeCellData cellData7 = new MeCellData();
        cellData7.setLeftImage("me_me_cell_left_image_3");
        cellData7.setCellId("2");
        cellData7.setClickable(true);
        cellData7.setName("卡包");
        cellData7.setRightIcon("me_me_cell_right_icon_3");
        list.add(cellData7);

        MeCellData cellData8 = new MeCellData();
        cellData8.setLeftImage("me_me_cell_left_image_2");
        cellData8.setCellId("3");
        cellData8.setClickable(true);
        cellData8.setName("表情");
        cellData8.setRightIcon("me_me_cell_right_icon_2");
        list.add(cellData8);

        MeGapCellData cellData9 = new MeGapCellData();
        cellData9.setClickable(true);
        cellData9.setCellId("3");
        list.add(cellData9);

        MeCellData cellData10 = new MeCellData();
        cellData10.setLeftImage("me_me_cell_left_image_1");
        cellData10.setCellId("4");
        cellData10.setClickable(true);
        cellData10.setName("设置");
        cellData10.setRightIcon("me_me_cell_right_icon_1");
        list.add(cellData10);

        return list;
    }

    private class ListViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private static final int ITEM_TYPE_MEGAPCELL = 0;
        private static final int ITEM_TYPE_MEMYINFOCELL = 1;
        private static final int ITEM_TYPE_MEWALLETCELL = 2;
        private static final int ITEM_TYPE_MECELL = 3;

        private List<Object> dataList;

        public ListViewAdapter(List<Object> dataList) {
            this.dataList = dataList;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            if (viewType == ITEM_TYPE_MEGAPCELL)  {
                MeGapCellViewHolder viewHolder = new MeGapCellViewHolder(layoutInflater, parent);
                return viewHolder;
            }
            else if (viewType == ITEM_TYPE_MEMYINFOCELL)  {
                MeMyInfoCellViewHolder viewHolder = new MeMyInfoCellViewHolder(layoutInflater, parent);
                return viewHolder;
            }
            else if (viewType == ITEM_TYPE_MEWALLETCELL)  {
                MeWalletCellViewHolder viewHolder = new MeWalletCellViewHolder(layoutInflater, parent);
                return viewHolder;
            }
            else if (viewType == ITEM_TYPE_MECELL)  {
                MeCellViewHolder viewHolder = new MeCellViewHolder(layoutInflater, parent);
                return viewHolder;
            }
            else 
                return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            Object data = dataList.get(position);
            if (holder instanceof MeGapCellViewHolder) {
		        MeGapCellViewHolder viewHolder = (MeGapCellViewHolder)holder;
		        MeGapCellData meGapCellData = (MeGapCellData)data;
                viewHolder.bind(meGapCellData);
                boolean clickable = meGapCellData.getClickable();
                if (clickable) {
                    viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });
                } else {
                    viewHolder.itemView.setOnClickListener(null);
                }
            }
            else if (holder instanceof MeMyInfoCellViewHolder) {
		        MeMyInfoCellViewHolder viewHolder = (MeMyInfoCellViewHolder)holder;
		        MeMyInfoCellData meMyInfoCellData = (MeMyInfoCellData)data;
                viewHolder.bind(meMyInfoCellData);
                boolean clickable = meMyInfoCellData.getClickable();
                if (clickable) {
                    viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });
                } else {
                    viewHolder.itemView.setOnClickListener(null);
                }
            }
            else if (holder instanceof MeWalletCellViewHolder) {
		        MeWalletCellViewHolder viewHolder = (MeWalletCellViewHolder)holder;
		        MeWalletCellData meWalletCellData = (MeWalletCellData)data;
                viewHolder.bind(meWalletCellData);
                boolean clickable = meWalletCellData.getClickable();
                if (clickable) {
                    viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });
                } else {
                    viewHolder.itemView.setOnClickListener(null);
                }
            }
            else if (holder instanceof MeCellViewHolder) {
		        MeCellViewHolder viewHolder = (MeCellViewHolder)holder;
		        MeCellData meCellData = (MeCellData)data;
                viewHolder.bind(meCellData);
                boolean clickable = meCellData.getClickable();
                if (clickable) {
                    viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });
                } else {
                    viewHolder.itemView.setOnClickListener(null);
                }
            }
        }

        @Override
        public int getItemViewType(int position) {
            Object data = dataList.get(position);
            if (data instanceof MeGapCellData)
                return ITEM_TYPE_MEGAPCELL;
            else if (data instanceof MeMyInfoCellData)
                return ITEM_TYPE_MEMYINFOCELL;
            else if (data instanceof MeWalletCellData)
                return ITEM_TYPE_MEWALLETCELL;
            else if (data instanceof MeCellData)
                return ITEM_TYPE_MECELL;
            else
                return -1;
        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }

    }


}




