package templateMethod;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) throws IOException {
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("nome","Rafael");
        mapa.put("idade",26);

        GeradorArquivo gerador = new GeradorArquivoPropriedades(new ProcessaCriptografado());
        gerador.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/Cript.txt", mapa);

        GeradorArquivo gerador1 = new GeradorArquivoXml(new ProcessaCompactado());
        gerador1.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/XML.zip", mapa);

        GeradorArquivo gerador2 = new GeradorArquivoPropriedades(new ProcessaDefault());
        gerador2.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/default.txt", mapa);


    }
}
