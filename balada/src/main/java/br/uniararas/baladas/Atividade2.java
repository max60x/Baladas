package br.uniararas.baladas;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by David on 12/04/2014.
 */
public class Atividade2 extends Activity{


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("UNiararas","Passando pelo onstart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("UNiararas","Passando pelo restart");


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("UNiararas","Passando pelo resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String texto  = null;
        texto = getIntent().getExtras().getString("ChaveNome");

        Button botao = new Button(this);
        botao.setText(texto);

        setContentView(R.layout.activity_lista_baladas);
        setContentView(botao);



    }


}
