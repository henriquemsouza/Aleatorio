package com.souza.fs.com.firesave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();//RECOVER iNSTANCE FROM DATEBASE
    //private DatabaseReference usuarioReferencia =  databaseReferencia.child("usuarios");
    private DatabaseReference produtooReferencia =  databaseReferencia.child("´produtos");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Produto produto = new Produto();
        produto.setDescricao("Notebook D40");
        produto.setCor("Preto");
        produto.setFabricante("Dell");


        produtooReferencia.child("001").setValue(produto);

    }
}

//**************************************************************************************************************************************

package com.souza.fs.com.firesave;


public class Produto {

    private String descricao;
    private String cor;
    private String fabricante;

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
