package br.com.fatecipi.ubs.sig.armazenamento;

import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class ExtraiTextoPDF {
    
    public static String extraiTextoPDF(String caminhoArquivo) throws IOException {
        String texto = "Não retornou texto";
        try (PDDocument documento = Loader.loadPDF(new RandomAccessReadBufferedFile(caminhoArquivo))) {
                texto = new PDFTextStripper().getText(documento);
        } catch (Exception e) {
        }
        return texto;
    }
}
