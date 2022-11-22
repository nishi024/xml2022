package com.example;

import org.xml.sax.XMLReader;
import org.xml.sax.ContentHandler;

import javax.xml.parsers.*;

public class classe {

    private static String xml;

    public static void main(String args[]) throws Exception {
        String xmlFilename = classe.xml;
        SAXParserFactory spf = SAXParserFactory.newDefaultInstance();
        SAXParser saxParser = spf.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();
        try {
            ContentHandler handler = (ContentHandler) new classeSAXParser();
            xmlReader.setContentHandler(handler);
            System.out.println("\nParser del file" + xmlFilename);
            xmlReader.parse(xmlFilename);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}
