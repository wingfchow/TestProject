package com.wing.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.wing.testproject.MainActivity;
import com.wing.testproject.R;

import org.w3c.dom.Text;

/**
 * Created by Wing on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2 <MainActivity>{
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}
