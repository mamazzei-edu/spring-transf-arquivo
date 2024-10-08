package br.com.fatecipi.ubs.sig.armazenamento;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface ArmazenamentoService {

    void init();

    void armazenar(MultipartFile arquivo);

    Stream<Path> carregarTodos();

    Path carregar(String nomeArquivo);

    Resource carregarComoRecurso(String nomeArquivo);

    void deletarTodos();

}
