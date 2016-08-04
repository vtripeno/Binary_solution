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

	private TextView resultado;
	private Convert convert = new Convert();
	private EditText textoParaConversao;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary__main);
        resultado = (TextView) findViewById(R.id.labelResultado);
        
        textoParaConversao = (EditText) findViewById(R.id.edtPalavraToBinario);
        
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
    	final Button button = (Button) findViewById(R.id.btnPalavraToBinario);
        button.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	
	
	        	Log.e("Edit Text", textoParaConversao.toString());
            	resultado.setText(convert.conversao(textoParaConversao.getText().toString()));
	
	
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
