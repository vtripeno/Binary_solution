package com.example.leitura_binario;

import botoes.Convert;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Binary_Main extends Activity {

	private TextView resultadoBinario;
	private TextView resultadoPalavra;
	private Convert convert = new Convert();
	private EditText textoParaConversaoBinario;
	private EditText textoParaConversaoPalavra;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary__main);
        resultadoBinario = (TextView) findViewById(R.id.labelResultadoBinario);
        textoParaConversaoBinario = (EditText) findViewById(R.id.edtPalavraToBinario);
        
        resultadoPalavra = (TextView) findViewById(R.id.labelResultadoPalavra);
        textoParaConversaoPalavra = (EditText) findViewById(R.id.edtBinarioToPalavra);
        
        listenerClick();
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.binary__main, menu);
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
    
    private void listenerClick() {
    	final Button buttonBinary = (Button) findViewById(R.id.btnPalavraToBinario);
    	buttonBinary.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	
	
	        	Log.e("Edit Text", textoParaConversaoBinario.toString());
	        	resultadoBinario.setText(convert.conversaoParaBinario(textoParaConversaoBinario.getText().toString()));
	
	
	        }
        });
        
        final Button buttonWord = (Button) findViewById(R.id.btnBinarioToPalavra);
        buttonWord.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	
	
	        	Log.e("Edit Text", textoParaConversaoPalavra.toString());
	        	resultadoPalavra.setText(convert.conversaoParaPalavra(textoParaConversaoPalavra.getText().toString()));
	
	
	        }
        });
	}

	public Convert getConvert() {
		return convert;
	}

	public void setConvert(Convert convert) {
		this.convert = convert;
	}

}
