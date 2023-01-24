package services.interfaces;

import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;

public interface IBankService {
    void transfert(String from, String to, double amount)
            throws InsufficientBalanceException, UnknownAccountException;
}
