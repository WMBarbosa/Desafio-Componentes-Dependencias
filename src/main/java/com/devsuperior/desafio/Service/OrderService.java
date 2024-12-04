package com.devsuperior.desafio.Service;

import com.devsuperior.desafio.Entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        double discountAccount = order.getBasic() * (order.getDiscount() /100);
        double valueDiscount = order.getBasic() - discountAccount;
        double ShippingCost = shippingService.shipment(order);
        return valueDiscount + ShippingCost;
    }
}
