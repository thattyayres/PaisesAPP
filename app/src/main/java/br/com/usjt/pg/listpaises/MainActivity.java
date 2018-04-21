package br.com.usjt.pg.listpaises;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * Tatiane do Nascimento Ayres 816118367
 */
public class MainActivity extends Activity {
    Spinner spinnerContinente;
    public static final String CHAVE = "br.com.usjt.pg.listpaises";
    String continente = "Todos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerContinente = (Spinner)findViewById(R.id.spinnerContinente);
        spinnerContinente.setOnItemSelectedListener(new PaisSelecionado());
    }

    public void listarPaises(View view){
        Intent intent = new Intent(this, ListaPaisesActivity.class);

        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }

    private class PaisSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            continente = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
