package chainsOfResponsability;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) throws IOException {
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("nome","Rafael");
        mapa.put("idade",26);

        Processador processaCompactado = new ProcessaCompactado();

        Processador processaCriptografado = new ProcessaCriptografado(processaCompactado);

       GeradorArquivo gerador = new GeradorArquivoPropriedades(processaCriptografado);
        gerador.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/prop1.zip", mapa);

        /*GeradorArquivo gerador1 = new GeradorArquivoXml(new ProcessadorComposto(processadores1));
        gerador1.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/xml1.txt", mapa);

        GeradorArquivo gerador2 = new GeradorArquivoPropriedades(new ProcessadorComposto(processadores2));
        gerador2.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/default.zip", mapa);

        GeradorArquivo gerador3 = new GeradorArquivoXml(new ProcessadorComposto(processadores3));
        gerador3.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/xml1.txt", mapa);*/
    }
}
