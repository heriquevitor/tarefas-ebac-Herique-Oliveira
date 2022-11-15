package br.com.herique.Celular;

/**
 * @author herique.oliveira
 * @version 1.0
 *
 * <br>Classe criada para desmonstrar se a chama foi aceita ou não id e nome, com as respectivas mensagens
 *
 */


public class Chamada {
    private String connect;
    private String disconect;
    private int id;
    private String name;
    /**
     * @return O getConnect representando a chamada foi aceita
     * @class br.com.herique.Chamada
     * @see br.com.herique.Celular.Chamada
     *
     * */
public String getConnect(){
    return connect;
}
    /**
     * @return O setConnect apresenta uma mensagem quando a chamada for aceita
     * @class br.com.herique.Chamada
     * @see br.com.herique.Celular.Chamada
     *
     * */
public void setConnect(String connect){
    this.connect = connect;
}
    /**
     * @return O getDisconect representando a chamada foi negada
     * @class br.com.herique.Chamada
     * @see br.com.herique.Celular.Chamada
     *
     * */
public String getDisconect(){
    return disconect;
}
    /**
     * @return O setDisconect apresenta uma mensagem quando a chamada for negada
     * @class br.com.herique.Chamada
     * @see br.com.herique.Celular.Chamada
     *
     * */
public void setDisconect(String disconect){
    this.disconect = disconect;
}

public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
    /**
     * @return O getName representando quem está fazendo a chamada
     * @class br.com.herique.Chamada
     * @see br.com.herique.Celular.Chamada
     *
     * */
public String getName(){
    return name;
}
    /**
     * @return O setName apresenta uma mensagem com nome de quem está ligando
     * @class br.com.herique.Chamada
     * @see br.com.herique.Celular.Chamada
     *
     * */
public void setName(String name){
    this.name = name;
}

}
