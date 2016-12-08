package com.walletmix.humayunkabir.cholbe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class RechargeHistoryAdapter extends BaseAdapter {

    final Context context;
    final String [] transactionID;
    final String [] orderID;
    final String [] rechargeAMMOUNT;
    final String [] phoneNO;
    final String [] rechargeTYPE;
    final String [] rechargeREMARK;

    public RechargeHistoryAdapter(Context context, String [] transactionID, String [] orderID, String [] rechargeAMMOUNT, String [] phoneNO, String [] rechargeTYPE, String [] rechargeREMARK) {
        this.context = context;
        this.transactionID = transactionID;
        this.orderID = orderID;
        this.rechargeAMMOUNT = rechargeAMMOUNT;
        this.phoneNO = phoneNO;
        this.rechargeTYPE = rechargeTYPE;
        this.rechargeREMARK = rechargeREMARK;
    }


    @Override
    public int getCount() {
        return transactionID.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View rowView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        rowView = inflater.inflate(R.layout.recharge_history_row, null);

        TextView transaction_id = (TextView) rowView.findViewById(R.id.transactionID);
        TextView order_id = (TextView) rowView.findViewById(R.id.orderID);
        TextView rechargeAmmount = (TextView) rowView.findViewById(R.id.rechargeAMMOUNT);
        TextView phoneNo = (TextView) rowView.findViewById(R.id.phoneNO);
        TextView rechargeType = (TextView) rowView.findViewById(R.id.rechargeTYPE);
        TextView rechargeRemark = (TextView) rowView.findViewById(R.id.rechargeREMARK);


        transaction_id.setText(transactionID[position]);
        order_id.setText(orderID[position]);
        rechargeAmmount.setText(rechargeAMMOUNT[position]);
        phoneNo.setText(phoneNO[position]);
        rechargeType.setText(rechargeTYPE[position]);
        rechargeRemark.setText(rechargeREMARK[position]);

        return rowView;

    }

}
