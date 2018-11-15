package com.example.aluno.jantr_filosofos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnFilosofo1, btnFilosofo2, btnFilosofo3;
    List<Filosofo> listaFilosofos = new ArrayList<>();
    List<Garfo> listaGarfos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int a = 0; a < 3; a++) {
            Filosofo f = new Filosofo();
            f.setStatus("faminto");
            listaFilosofos.add(f);
        }

        for (int a = 0; a < 4; a++) {
            Garfo g = new Garfo();
            g.setId(1);
            listaGarfos.add(g);
        }

        btnFilosofo1 = findViewById(R.id.btnFilosofo1);
        btnFilosofo2 = findViewById(R.id.btnFilosofo2);
        btnFilosofo3 = findViewById(R.id.btnFilosofo3);


        btnFilosofo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Filosofo fil = new Filosofo();
                listaFilosofos = fil.jantar(listaGarfos, 0, listaFilosofos);
                if (listaFilosofos.get(0).getStatus().equalsIgnoreCase("Jantando")) {
                    System.out.println("Filoso 1 Jantando");
                    listaGarfos.remove(0);
                    listaGarfos.remove(0);
                    btnFilosofo1.setText("Parar de Comer");
                } else if (listaFilosofos.get(0).getStatus().equalsIgnoreCase("Pensando")) {
                    System.out.println("Filoso 1 Pensando");
                    Garfo g = new Garfo();
                    g.setId(1);
                    listaGarfos.add(g);
                    listaGarfos.add(g);
                    btnFilosofo1.setText("Comer Novamente");

                }else{
                    btnFilosofo1.setText("Estou com fome");
                }

            }
        });


        btnFilosofo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Filosofo fil = new Filosofo();
                listaFilosofos = fil.jantar(listaGarfos, 1, listaFilosofos);
                if (listaFilosofos.get(1).getStatus().equalsIgnoreCase("Jantando")) {
                    System.out.println("Filoso 2 Jantando");
                    listaGarfos.remove(0);
                    listaGarfos.remove(0);
                    btnFilosofo2.setText("Parar de Comer");
                } else if (listaFilosofos.get(1).getStatus().equalsIgnoreCase("Pensando")) {
                    System.out.println("Filoso 2 Pensando");
                    Garfo g = new Garfo();
                    g.setId(1);
                    listaGarfos.add(g);
                    listaGarfos.add(g);
                    btnFilosofo2.setText("Comer Novamente");
                }else{
                    System.out.println("Filoso 2 Faminto");
                    btnFilosofo2.setText("Estou com Fome");
                }

            }
        });


        btnFilosofo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Filosofo fil = new Filosofo();
                listaFilosofos = fil.jantar(listaGarfos, 2, listaFilosofos);
                if (listaFilosofos.get(2).getStatus().equalsIgnoreCase("Jantando")) {
                    System.out.println("Filoso 3 Jantando");
                    listaGarfos.remove(0);
                    listaGarfos.remove(0);
                    btnFilosofo3.setText("Parar de Comer");
                } else if (listaFilosofos.get(2).getStatus().equalsIgnoreCase("Pensando")) {
                    System.out.println("Filoso 3 Pensando");
                    Garfo g = new Garfo();
                    g.setId(1);
                    listaGarfos.add(g);
                    listaGarfos.add(g);
                    btnFilosofo3.setText("Comer Novamente");
                }else{
                    btnFilosofo3.setText("Estou com Fome");
                    System.out.println("Filoso 3 Faminto");
                }

            }
        });


    }
}
