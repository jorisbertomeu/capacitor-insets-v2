package eu.bertom.lab.capacitor.plugin.insetsv2;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;

import androidx.appcompat.app.AppCompatActivity;

public class InsetsV2 {

    private AppCompatActivity activity;

    public InsetsV2(AppCompatActivity activity) {
        this.activity = activity;
    }

    public float getTop() {
        Rect rectangle = new Rect();

        this.activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rectangle);
        DisplayMetrics metrics = this.activity.getResources().getDisplayMetrics();

        return rectangle.top / metrics.density;
    }
}