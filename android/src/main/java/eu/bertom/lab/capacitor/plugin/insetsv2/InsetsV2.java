package eu.bertom.lab.capacitor.plugin.insetsv2;

import android.util.DisplayMetrics;
import androidx.appcompat.app.AppCompatActivity;

public class InsetsV2 {

    private AppCompatActivity activity;

    public InsetsV2(AppCompatActivity activity) {
        this.activity = activity;
    }

    public float getTop() {
        float titleBarHeight = 0;

        int resourceId = this.activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            titleBarHeight = this.activity.getResources().getDimensionPixelSize(resourceId);
        }
        DisplayMetrics metrics = this.activity.getResources().getDisplayMetrics();

        return titleBarHeight / metrics.density;
    }
}