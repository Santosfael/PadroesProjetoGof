package chainsOfResponsability;

import java.io.IOException;

public class ProcessaCriptografado  extends Processador {

    public ProcessaCriptografado(Processador proximo){
        super(proximo);
    }

    public ProcessaCriptografado(){

    }

    @Override
    protected byte[] processaConteudo(byte[] bytes) throws IOException {
        return bytes;
    }
}
