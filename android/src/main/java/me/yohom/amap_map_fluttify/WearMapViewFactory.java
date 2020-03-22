//////////////////////////////////////////////////////////
// GENERATED BY FLUTTIFY. DO NOT EDIT IT.
//////////////////////////////////////////////////////////

package me.yohom.amap_map_fluttify;

import android.content.Context;
import android.view.View;
import android.util.Log;
import android.app.Activity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

import static me.yohom.foundation_fluttify.FoundationFluttifyPluginKt.getHEAP;
import static me.yohom.foundation_fluttify.FoundationFluttifyPluginKt.getEnableLog;

@SuppressWarnings("ALL")
class WearMapViewFactory extends PlatformViewFactory {

    WearMapViewFactory(BinaryMessenger messenger, Activity activity) {
        super(StandardMessageCodec.INSTANCE);

        this.messenger = messenger;
        this.activity = activity;

        new MethodChannel(messenger, "me.yohom/amap_map_fluttify/com_amap_api_maps_WearMapView").setMethodCallHandler((methodCall, methodResult) -> {
                Map<String, Object> args = (Map<String, Object>) methodCall.arguments;
                AmapMapFluttifyPlugin.Handler handler = handlerMap.get(methodCall.method);
                if (handler != null) {
                    try {
                        handler.call(args, methodResult);
                    } catch (Exception e) {
                        e.printStackTrace();
                        methodResult.error(e.getMessage(), null, null);
                    }
                } else {
                    methodResult.notImplemented();
                }
            });
    }

    private BinaryMessenger messenger;
    private Activity activity;

    private final Map<String, AmapMapFluttifyPlugin.Handler> handlerMap = new HashMap<String, AmapMapFluttifyPlugin.Handler>() {{
        // method
        put("com.amap.api.maps.WearMapView::getMap", (args, methodResult) -> {
            // args
        
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::getMap(" + "" + ")");
            }
        
            // invoke native method
            com.amap.api.maps.AMap result;
            try {
                result = ref.getMap();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            Integer jsonableResult = null;
            if (result != null) {
                jsonableResult = result.hashCode();
                getHEAP().put(jsonableResult, result);
            }
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onCreate", (args, methodResult) -> {
            // args
            // ref arg
            android.os.Bundle var1 = (android.os.Bundle) getHEAP().get((int) ((Map<String, Object>) args).get("var1"));
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onCreate(" + var1 + ")");
            }
        
            // invoke native method
            try {
                ref.onCreate(var1);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onResume", (args, methodResult) -> {
            // args
        
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onResume(" + "" + ")");
            }
        
            // invoke native method
            try {
                ref.onResume();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onPause", (args, methodResult) -> {
            // args
        
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onPause(" + "" + ")");
            }
        
            // invoke native method
            try {
                ref.onPause();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onDestroy", (args, methodResult) -> {
            // args
        
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onDestroy(" + "" + ")");
            }
        
            // invoke native method
            try {
                ref.onDestroy();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onLowMemory", (args, methodResult) -> {
            // args
        
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onLowMemory(" + "" + ")");
            }
        
            // invoke native method
            try {
                ref.onLowMemory();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onSaveInstanceState", (args, methodResult) -> {
            // args
            // ref arg
            android.os.Bundle var1 = (android.os.Bundle) getHEAP().get((int) ((Map<String, Object>) args).get("var1"));
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onSaveInstanceState(" + var1 + ")");
            }
        
            // invoke native method
            try {
                ref.onSaveInstanceState(var1);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::setVisibility", (args, methodResult) -> {
            // args
            // jsonable arg
            int var1 = (int) ((Map<String, Object>) args).get("var1");
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::setVisibility(" + var1 + ")");
            }
        
            // invoke native method
            try {
                ref.setVisibility(var1);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::setOnDismissCallbackListener", (args, methodResult) -> {
            // args
        
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::setOnDismissCallbackListener(" + "" + ")");
            }
        
            // invoke native method
            try {
                ref.setOnDismissCallbackListener(new com.amap.api.maps.WearMapView.OnDismissCallback() {
                // method channel
                MethodChannel callbackChannel = new MethodChannel(messenger, "com.amap.api.maps.WearMapView::setOnDismissCallbackListener::Callback");
        
                // call dart method
                @Override
                public void onDismiss() {
                    // print log
                    if (getEnableLog()) {
                        Log.d("java-callback", "fluttify-java-callback: onDismiss(" + "" + ")");
                    }
        
                    // convert to jsonable data
        
        
                    // call dart method
                    callbackChannel.invokeMethod(
                            "Callback::com.amap.api.maps.WearMapView.OnDismissCallback::onDismiss",
                            new HashMap<String, Object>() {{
                
                            }}
                    );
        
                    // method result
        
                }
        
                @Override
                public void onNotifySwipe() {
                    // print log
                    if (getEnableLog()) {
                        Log.d("java-callback", "fluttify-java-callback: onNotifySwipe(" + "" + ")");
                    }
        
                    // convert to jsonable data
        
        
                    // call dart method
                    callbackChannel.invokeMethod(
                            "Callback::com.amap.api.maps.WearMapView.OnDismissCallback::onNotifySwipe",
                            new HashMap<String, Object>() {{
                
                            }}
                    );
        
                    // method result
        
                }
        
            });
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onDismiss", (args, methodResult) -> {
            // args
        
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onDismiss(" + "" + ")");
            }
        
            // invoke native method
            try {
                ref.onDismiss();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onEnterAmbient", (args, methodResult) -> {
            // args
            // ref arg
            android.os.Bundle var1 = (android.os.Bundle) getHEAP().get((int) ((Map<String, Object>) args).get("var1"));
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onEnterAmbient(" + var1 + ")");
            }
        
            // invoke native method
            try {
                ref.onEnterAmbient(var1);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
        // method
        put("com.amap.api.maps.WearMapView::onExitAmbient", (args, methodResult) -> {
            // args
        
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.WearMapView ref = (com.amap.api.maps.WearMapView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.WearMapView@" + refId + "::onExitAmbient(" + "" + ")");
            }
        
            // invoke native method
            try {
                ref.onExitAmbient();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
    }};

    @Override
    public PlatformView create(Context __, int id, Object params) {
        Map<String, Object> args = (Map<String, Object>) params;
        // ref arg
        com.amap.api.maps.AMapOptions var2 = (com.amap.api.maps.AMapOptions) getHEAP().get((int) ((Map<String, Object>) args).get("var2"));

        com.amap.api.maps.WearMapView view = new com.amap.api.maps.WearMapView(activity, var2);
        getHEAP().put(Integer.MAX_VALUE - id, view);
        return new PlatformView() {

            // add to HEAP
            @Override
            public View getView() {
                return view;
            }

            @Override
            public void dispose() {}
        };
    }
}
