package spcgroup.damrong.myrestaurant;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by damrong.da on 12/13/2015.
 */
public class MyAlertDialog {
    public void errorDialog(Context context, String strTitle, String strMessage) {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(context);
        objBuilder.setIcon(R.drawable.icon_question);
        objBuilder.setTitle(strTitle);
        objBuilder.setMessage(strMessage);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();
    }

} // Main Class
