package chainsOfResponsability;

import java.util.Map;

public class GeradorArquivoPropriedades extends GeradorArquivo {
    public GeradorArquivoPropriedades(Processador proximo){
        super(proximo);
    }

    @Override
    public String gerarConteudo(Map<String, Object> propriedades){
        //Gera properties
        StringBuilder propFileBuilder = new StringBuilder();

        for(String prop: propriedades.keySet()){
            propFileBuilder.append(prop+"="+propriedades.get(prop)+"\n");
        }

        return propFileBuilder.toString();
    }
}
