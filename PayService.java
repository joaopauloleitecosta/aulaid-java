package services;

public class PayService {
    /*
    Solução ruim com alto acoplamento por conta dos objetos instanciados
    private TaxService taxService = new TaxService();
    private DeliverService deliverService = new DeliverService();
    */

    private TaxService taxService;
    private DeliverService deliverService;
    public PayService(TaxService taxService, DeliverService deliverService) {
        this.taxService = taxService;
        this.deliverService = deliverService;
    }
    public double finalPrice(double cost, String state) {
        return cost + deliverService.fee(state) + taxService.tax(cost);
    }
}
