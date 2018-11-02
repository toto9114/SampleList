package kr.co.startop.samplelist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by jihun on 02/11/2018.
 */

public class ItemsView extends FrameLayout {
    TextView ageView, nameView;

    public ItemsView(@NonNull Context context) {
        super(context);
        inflate(context, R.layout.view_item, this);
        ageView = findViewById(R.id.text_age);
        nameView = findViewById(R.id.text_name);
    }

    public void setData(Person person) {
        ageView.setText(""+person.age);
        nameView.setText(person.name);
    }
}
