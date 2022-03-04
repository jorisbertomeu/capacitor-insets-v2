package eu.bertom.lab.plugin.capacitorinsetspluginv2;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;

import androidx.appcompat.app.AppCompatActivity;

public class InsetsPluginV2 {

    private AppCompatActivity activity;

    public InsetsPluginV2(AppCompatActivity activity) {
        this.activity = activity;
    }

    public float getTop() {
        Rect rectangle = new Rect();

        this.activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rectangle);
        DisplayMetrics metrics = this.activity.getResources().getDisplayMetrics();

        return rectangle.top / metrics.density;
    }
}