package composite;

import java.io.IOException;

public class ProcessaDefault implements Processador {
    @Override
    public byte[] processaConteudo(byte[] bytes) throws IOException {
        return bytes;
    }
}
