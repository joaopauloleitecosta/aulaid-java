import services.DeliverService;
import services.PayService;
import services.TaxService;

/*
PROBLEMA:
Fazer um programa para calcular o preço final de um produto,
dado seu custo e o local de entrega.

REGRAS:
- Taxa de entrega = R$ 10,00(SP) ou R$ 20,00(outros).
- Imposto = 10%.

EXEMPLO:
Custo: 300.00
Local de Entrega: SC
Resposta: 350.0

 */
public class Main {
    public static void main(String[] args) {

        // Controle das dependências passa para o programa principal
        TaxService taxService = new TaxService();
        DeliverService deliverService = new DeliverService();

        PayService payService = new PayService(taxService, deliverService);

        System.out.println("RESULTADO = " + payService.finalPrice(300.0, "SC"));
    }
}