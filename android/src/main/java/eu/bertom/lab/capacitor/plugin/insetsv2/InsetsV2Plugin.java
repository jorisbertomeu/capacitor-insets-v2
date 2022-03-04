package eu.bertom.lab.plugin.capacitorinsetspluginv2;

import android.app.Activity;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "InsetsPluginV2")
public class InsetsPluginV2Plugin extends Plugin {

    private InsetsPluginV2 implementation;

    @Override
    public void load() {
        this.implementation = new InsetsPluginV2(getActivity());
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
