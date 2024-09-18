package TrabalhoJava;

import java.lang.foreign.SymbolLookup;
import java.util.concurrent.ThreadLocalRandom;
public class caso {

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    public static void main(String[] args) {

                final double VALOR_BASE = 2000.00;
                String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "ANA", "BRUNO", "LUCAS", "MARIANA", "GABRIEL",
                        "RENATA" };
                String[] aprovados = new String[5];
                int aprovadosCount = 0;
                for (int i = 0; i < candidatos.length; i++) {
                    double valorPretendido = valorPretendido();
                    if (VALOR_BASE >= valorPretendido && aprovadosCount < 5) {
                        aprovados[aprovadosCount++] = candidatos[i];
                        System.out.println("LIGAR PARA O CANDIDATO " + candidatos[i]);
                    } else if (VALOR_BASE == valorPretendido) {
                        System.out.println("LIGAR PARA O CANDIDATO " + candidatos[i] + " COM CONTRA PROPOSTA");
                    } else {
                        System.out.println(candidatos[i] + " AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
                    }
                }
                System.out.println("Candidatos Selecionados:");
                for (int i = 0; i < aprovadosCount; i++) {
                    System.out.println(aprovados[i]);
                    int tentativas = 0;
                    boolean contato = false;
                    while (tentativas <= 3 && !contato) {
                        tentativas++;
                        contato = ThreadLocalRandom.current().nextBoolean();
                        if (contato) {
                            System.out.println("CONSEGUIMOS CONTATO COM " + aprovados[i] + " APÓS " + tentativas + " TENTATIVA(S)");
                        }
                    }
                    if (!contato) {
                        System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + aprovados[i]);
                    }
                }
            }
        }


