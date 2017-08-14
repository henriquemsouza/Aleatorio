package com.souza.fs.com.firesave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();//RECOVER iNSTANCE FROM DATEBASE
    //private DatabaseReference usuarioReferencia =  databaseReferencia.child("usuarios");
    private DatabaseReference produtooReferencia =  databaseReferencia.child("´produtos");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        Produto produto = new Produto();
        produto.setDescricao("Notebook D800");
        produto.setCor("Azul marinho");
        produto.setFabricante("HP");
        produtooReferencia.child("003").setValue(produto);
 */

        produtooReferencia.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.i("Firebase",dataSnapshot.getValue().toString() );
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

       //
    }
}
