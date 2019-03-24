package estruturado;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) throws IOException {
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("nome","Rafael");
        mapa.put("idade",26);

        GeradorArquivo gerador = new GeradorArquivo();
        gerador.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/Cript.txt", mapa, "PROPRIEDADES_CRIPTOGRADO");

        GeradorArquivo gerador1 = new GeradorArquivo();
        gerador1.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/XML.zip", mapa,"XML_COMPACTADO");
    }
}
