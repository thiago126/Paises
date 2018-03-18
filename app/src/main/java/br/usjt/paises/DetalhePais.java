package br.usjt.paises;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Thiago Freitas
 * @ra 816119076
 */

public class DetalhePais extends Activity {

    /**
     * @author Thiago Freitas
     * @ra 816119076
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        TextView txtPais = (TextView)findViewById(R.id.txtPais);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListaPaises.PAIS);
        txtPais.setText(pais.toString());
    }
}
