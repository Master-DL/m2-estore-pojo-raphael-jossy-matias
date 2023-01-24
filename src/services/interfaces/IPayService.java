package services.interfaces;

import data.Cart;
import data.Order;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface IPayService {
    Order pay(Cart cart, String address, String bankAccountRef) throws
            InvalidCartException, UnknownItemException,
            InsufficientBalanceException, UnknownAccountException;
}
