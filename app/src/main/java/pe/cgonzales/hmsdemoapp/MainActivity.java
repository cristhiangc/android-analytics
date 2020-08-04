package pe.cgonzales.hmsdemoapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AnalyticsManager analyticsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Revisar la clase AnalyticsManager
        analyticsManager = AnalyticsManager.getInstance(this);
        setup();
    }

    /* Pagina 25 del PDF */
    private void setup() {
        // Crear un objeto...
        Bundle params = new Bundle();

        // Configurar los datos...
        params.putString("numero_celular", "999888777");
        // otros datos...

        // Comentamos el codigo a cambiar
        //mFirebaseAnalytics...

        // Ejecutamos los metodos correspondientes de la nueva clase
        analyticsManager.setCurrentScreen(this, "splash_face", null);
        analyticsManager.sendEvent("eventPage", params);
    }
}