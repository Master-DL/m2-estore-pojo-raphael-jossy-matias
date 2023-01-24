package services.interfaces;

import estorePojo.exceptions.UnknownItemException;
import services.Store;

public interface IProviderService {
    double getPrice(Object item) throws UnknownItemException;

    int order(Store store, Object item, int qty) throws UnknownItemException;
}
