package observer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

    public static void main(String[] args) throws IOException {
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("nome","Rafael");
        mapa.put("idade",26);

        List<Processador> processadores = new ArrayList<Processador>();
        processadores.add(new ProcessaCriptografado());
        processadores.add(new ProcessaCompactado());

        List<Processador> processadores1 = new ArrayList<Processador>();
        processadores1.add(new ProcessaCompactado());
        processadores1.add(new ProcessaCriptografado());

        List<Processador> processadores2 = new ArrayList<Processador>();
        processadores2.add(new ProcessaDefault());
        processadores2.add(new ProcessaCriptografado());

        List<Processador> processadores3 = new ArrayList<Processador>();
        processadores3.add(new ProcessaDefault());
        processadores3.add(new ProcessaCompactado());

        GeradorArquivo gerador = new GeradorArquivoPropriedades(new ProcessadorComposto(processadores));
        gerador.addObservador(new LogService());
        gerador.addObservador(new LogBO());
        gerador.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/prop1.zip", mapa);

        GeradorArquivo gerador1 = new GeradorArquivoXml(new ProcessadorComposto(processadores1));
        gerador1.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/xml1.txt", mapa);

        GeradorArquivo gerador2 = new GeradorArquivoPropriedades(new ProcessadorComposto(processadores2));
        gerador2.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/default.zip", mapa);

        GeradorArquivo gerador3 = new GeradorArquivoXml(new ProcessadorComposto(processadores3));
        gerador3.gerarArquivo("/mnt/3A62612948B5569C/Pos_ADS/POO/PadroesProjetoGof/src/arquivos/xml1.txt", mapa);
    }
}
