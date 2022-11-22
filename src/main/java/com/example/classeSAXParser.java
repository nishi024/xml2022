package com.example;

import java.util.jar.Attributes;
import org.xml.sax.helpers.DefaultHandler;


public class classeSAXParser extends DefaultHandler{
  
    private boolean nome=false;
    private boolean cognome=false;
    private String nome,cognome;
    public void startElements (String namespace, String rawName, String dato, Attributes attrib){
        if(dato.equals("nome")){
            nome=true;
        }
        if (dato.equals("cognome")){
            cognome=true;
        }
    }  
    public void characters(char struingParserizzati[], int inizio, int lungo){
        char[] stringaParserizzati;
        if(nome)
        nome=new String(stringaParserizzati, inizio, lungo) != null;
        if(cognome)
        cognome=new String(stringaParserizzati, inizio, lungo) !=null;
    }
    public void endElements(String namespace){
        if(dato.equals(""))
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


} 



