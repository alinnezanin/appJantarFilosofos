package com.example.aluno.jantr_filosofos;

import java.util.List;

public class Filosofo {

    private String status;

    public Filosofo(String status) {
        this.status = status;
    }

    public Filosofo() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Filosofo> jantar(List<Garfo> lista_garfos, int filosofo, List<Filosofo> lista_filosofos) {

        if (lista_filosofos.get(filosofo).getStatus().equalsIgnoreCase("Jantando")) {
            lista_filosofos.get(filosofo).setStatus("Pensando");
            return lista_filosofos;
        } else if(lista_filosofos.get(filosofo).getStatus().equalsIgnoreCase("Pensando")) {
            if (lista_garfos.size() >= 2) {
                lista_filosofos.get(filosofo).setStatus("jantando");
                return lista_filosofos;
            }else {
                lista_filosofos.get(filosofo).setStatus("faminto");
                return lista_filosofos;
            }

        }else{
            if (lista_garfos.size() >= 2) {
                lista_filosofos.get(filosofo).setStatus("jantando");
                return lista_filosofos;
            } else {
                return lista_filosofos;
            }
        }


    }

}
