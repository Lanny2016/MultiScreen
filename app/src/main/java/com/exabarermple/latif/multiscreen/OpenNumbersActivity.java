package com.exabarermple.latif.multiscreen;

import android.view.View;
import android.widget.Toast;

public class OpenNumbersActivity implements View.OnClickListener {
    /** we use implements View.OnClickListener here becasue to use onclick listener.
     * we use @override it because we use it according to our need */
    @Override

    public void onClick(View view){

        Toast.makeText ( view.getContext (),"you have opended NumbersActivity",Toast.LENGTH_SHORT).show ();

    }
}
