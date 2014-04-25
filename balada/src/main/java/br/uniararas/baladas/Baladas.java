        package br.uniararas.baladas;

        import android.content.Intent;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.text.TextWatcher;
        import android.util.Log;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;


        public class Baladas extends ActionBarActivity {

            EditText texto;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_baladas);


                Button novo = (Button) findViewById(R.id.balada_btnEntrar) ;
                novo.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {

                                                Intent intencao = new Intent(Baladas.this,Atividade2.class);

                                                intencao.putExtra("ChaveNome","Valor");
                                                intencao.putExtra("ChaveInteiro",1);
                                                startActivity(intencao);


                                            }
                                        }

                );


                texto = (EditText) findViewById(R.id.balada_edtUsuario);

                texto.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                texto.setText("");
                            }
                        }
                );
                texto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View view, boolean b) {
                        Log.i("sssss","Entrouisssss");
                        if ( !b) {
                            Log.i("sssss", "saiu");
                            Toast.makeText(Baladas.this, R.string.aviso_Digite_usuario, Toast.LENGTH_LONG).show();
                        }
                    }
                });


            }


            @Override
            public boolean onCreateOptionsMenu(Menu menu) {

                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.baladas, menu);


                return true;


            }

            @Override
            public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();
                if (id == R.id.action_settings) {
                    return true;
                }
                return super.onOptionsItemSelected(item);
            }

        }
