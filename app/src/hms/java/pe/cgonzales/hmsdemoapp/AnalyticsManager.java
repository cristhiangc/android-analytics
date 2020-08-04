package pe.cgonzales.hmsdemoapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.huawei.hms.analytics.HiAnalytics;
import com.huawei.hms.analytics.HiAnalyticsInstance;

/**
 * Clase centralizada para el manejo de Analytics
 * Es un ejemplo simple, uds pueden mejorar la clase, tal vez usar metodos estaticos, singleton, etc
 */
class AnalyticsManager {

    private HiAnalyticsInstance mInstance;

    static AnalyticsManager getInstance(Context context) {
        return new AnalyticsManager(context);
    }

    private AnalyticsManager(Context context) {
        this.mInstance = HiAnalytics.getInstance(context);
    }

    void setCurrentScreen(Activity activity,  String screenName, @Nullable String screenClass) {
        mInstance.pageStart(screenName, screenClass);
    }

    void sendEvent (String eventName, Bundle bundle) {
        mInstance.onEvent(eventName, bundle);
    }
}
