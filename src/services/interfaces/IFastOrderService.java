package services.interfaces;

import data.Order;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;
import services.Client;

public interface IFastOrderService {
    Order oneShotOrder(
            Client client,
            Object item,
            int qty,
            String address,
            String bankAccountRef) throws
            UnknownItemException,
            InsufficientBalanceException, UnknownAccountException;
}
