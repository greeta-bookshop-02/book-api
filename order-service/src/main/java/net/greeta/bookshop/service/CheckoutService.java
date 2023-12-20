package net.greeta.bookshop.service;

import net.greeta.bookshop.dto.PaymentInfo;
import net.greeta.bookshop.dto.Purchase;
import net.greeta.bookshop.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
