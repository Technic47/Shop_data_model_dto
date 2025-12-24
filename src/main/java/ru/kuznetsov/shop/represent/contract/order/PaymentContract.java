package ru.kuznetsov.shop.represent.contract.order;

import ru.kuznetsov.shop.represent.dto.payment.ReceiptDto;

public interface PaymentContract {

    Boolean sendReceipt(ReceiptDto receipt);
}
