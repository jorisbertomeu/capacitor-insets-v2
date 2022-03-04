package eu.bertom.lab.capacitor.plugin.insetsv2;

import android.app.Activity;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "InsetsV2")
public class InsetsV2Plugin extends Plugin {

    private InsetsV2 implementation;

    @Override
    public void load() {
        this.implementation = new InsetsV2(getActivity());
    }

    @PluginMethod
    public void top(PluginCall call) {

        //getBridge().executeOnMainThread(() -> {
            float statusBarHeight = implementation.getTop();
            JSObject ret = new JSObject();
            ret.put("value", statusBarHeight);
            call.resolve(ret);
        //});
    }
}
