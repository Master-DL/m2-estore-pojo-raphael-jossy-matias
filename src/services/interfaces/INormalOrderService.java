package services.interfaces;

import data.Cart;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownItemException;
import services.Client;

public interface INormalOrderService {
    Cart addItemToCart (
            Cart cart,
            Client client,
            Object item,
            int qty ) throws UnknownItemException, InvalidCartException;

}
