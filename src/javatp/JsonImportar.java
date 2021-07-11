/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author Romulo Leite
 */
public class JsonImportar {

    public JsonImportar() {
    }

    public boolean importarData(Hotel hotel, String filePath) throws FileNotFoundException {

        JSONArray jsonArray = (JSONArray) JSONValue.parse(new FileReader(filePath));

        for (Object o : jsonArray) {
            JSONObject jsonObj = (JSONObject) o;
            if (!containsKeys(jsonObj, new String[]{"divisão", "temperatura", "pessoa", "data", "hora"})) {
                System.out.println("O objeto não é válido");
            }

            JSONObject jsonDiv = (JSONObject) jsonObj.get("divisão");
            String id_divisao = jsonDiv.get("id").toString();
            String tipo_divisao = jsonDiv.get("tipo").toString();
          

            Double temperatura = Double.parseDouble(jsonObj.get("temperatura").toString());

            JSONObject jsonPessoa = (JSONObject) jsonObj.get("pessoa");
            String id_pessoa = jsonDiv.get("id").toString();
            String tipo_pessoa = jsonDiv.get("tipo").toString();

            String data = jsonObj.get("data").toString();
            String hora = jsonObj.get("hora").toString();
            
            Registo registo = new Registo(String data, String hora, double temperatura, String id_divisao, String tipo_divisao, String id_pessoa, String tipo_pessoa)
            hotel.adicionarRegisto();
        }

    }

    public boolean containsKeys(JSONObject jsonObj, String[] keys) {
        if (jsonObj == null) {
            return false;
        }
        for (String key : keys) {
            if (!jsonObj.containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    
    
}
