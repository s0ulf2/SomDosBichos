package com.example.somdosbichos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//implementando a classe View.OnClickListener para capturar cliques nos botoes

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //declara variaveis e seus tipos
        public Button cao;
        public Button gato;
        public Button leao;
        public Button ovelha;
        public Button macaco;
        public Button vaca;
        public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Direciona a variavel para o botao criado
        cao = findViewById(R.id.ID_CAO);
        gato= findViewById(R.id.ID_GATO);
        leao = findViewById(R.id.ID_LEAO);
        ovelha = findViewById(R.id.ID_OVELHA);
        macaco = findViewById(R.id.ID_MACACO);
        vaca = findViewById(R.id.ID_VACA);
        //após direcionamento para os botoes foi implementado o View.OnClickListener na Main

        //após implementação segue o passo para informar que será utilizado no metodo onClick abaixo
        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        macaco.setOnClickListener(this);
        vaca.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //substituindo else e if pelo switch /case
        //setando o ID CLICADO do botao , a criação do player e o local onde fica o som a executar
        switch (v.getId()){
            case R.id.ID_CAO:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.cao);
                tocarSom();
                break;
            case R.id.ID_GATO:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato);
                tocarSom();
                break;
            case R.id.ID_LEAO:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.leao);
                tocarSom();
                break;
            case R.id.ID_OVELHA:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ovelha);
                tocarSom();
                break;
            case R.id.ID_VACA:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.vaca);
                tocarSom();
                break;
            case R.id.ID_MACACO:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.macaco);
                tocarSom();
                break;
        }

    }
    //Metodo declarado para tocar o som
    public void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }
    }

}
