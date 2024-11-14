import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String email = "marco.mazzei@fatec.sp.gov.br";
        String regex = "^[A-Za-z0-9.]+@[A-Za-z0-9]+\\.[a-zA-Z]+(\\.[A-Za-z]+)?+(\\.[A-Za-z]+)?$";
        /*
        * ^ no começo da String obriga que ela comece com o que vem depois
        [a-zA-Z0-9_.+-] aceita qualquer caractere alfanumérico, ponto, underline, sinal de mais e sinal de menos
        +@ aceita um ou mais caracteres do conjunto anterior seguido de @
        {2,6} aceita de 2 a 6 caracteres do conjunto anterior
        $ no final da String obriga que ela termine com o que vem antes
        */ 
        Pattern padrao = Pattern.compile(regex);
        Matcher buscador = padrao.matcher(email);
        boolean emailValido = buscador.matches();

        if (emailValido) {
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        };
    }
}
