package com.souza.fs.com.firesave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();//RECOVER iNSTANCE FROM DATEBASE
    private DatabaseReference usuarioReferencia =  databaseReferencia.child("usuarios");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // usuarioReferencia.child("001").child("nome").setValue("Henrique M souza");

        Usuario usuario = new Usuario();
        usuario.setNome("Ubuntu");
        usuario.setSobrenome("man");
        usuario.setIdade(50);
        usuario.setSexo("M");

        usuarioReferencia.child("003").setValue(usuario);

    }
}
//___________________________________________________________________________________________________________
//___________________________________________________________________________________________________________



package com.souza.fs.com.firesave;



public class Usuario {


    private String  nome;
    private String sobrenome;
    private String  sexo;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Usuario() {
    }



}
