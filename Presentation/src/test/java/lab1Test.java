import com.bank.Entities.Account;
import com.bank.Repository.AccountRepository;
import com.bank.Repository.UserRepository;
import com.bank.ResultType.Result;
import com.bank.ResultType.ResultDescription;
import com.bank.Services.AccountService;
import com.bank.Services.ProducerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class lab1Test {

//     Тест: Снятие денег со счёта (при достаточном балансе)
    @Test
    public void test1() {
        AccountRepository mockAccountRepo = Mockito.mock(AccountRepository.class);
        UserRepository mockUserRepo = Mockito.mock(UserRepository.class);
        ProducerService pr = Mockito.mock(ProducerService.class);
        AccountService accountService = new AccountService(mockAccountRepo, mockUserRepo, pr);

        int accountId = 1;
        double initialBalance = 100.0;
        double withdrawAmount = 50.0;

        Account fakeAccount = new Account(initialBalance, "asd", accountId);
        Mockito.when(mockAccountRepo.getAccountById(accountId)).thenReturn(new Result(ResultDescription.TheAccountIsSuccessfullyFound, fakeAccount));

        accountService.createAccount(initialBalance, "asd", accountId);
        Result res = accountService.withdrawMoney(accountId, withdrawAmount);

        assertEquals(ResultDescription.TheMoneyIsWithdrawToAccount, res.getStatus());
        assertEquals(initialBalance - withdrawAmount, accountService.checkBalance(accountId).getInformation());
    }

    // Тест: Снятие денег со счёта (при недостаточном балансе)
    @Test
    public void test2() {
        AccountRepository mockAccountRepo = Mockito.mock(AccountRepository.class);
        UserRepository mockUserRepo = Mockito.mock(UserRepository.class);
        ProducerService pr = Mockito.mock(ProducerService.class);
        AccountService accountService = new AccountService(mockAccountRepo, mockUserRepo, pr);

        int accountId = 12;
        double initialBalance = 30.0;
        double withdrawAmount = 50.0;

        Account fakeAccount = new Account(initialBalance, "asd", accountId);
        Mockito.when(mockAccountRepo.getAccountById(accountId)).thenReturn(new Result(ResultDescription.TheAccountIsSuccessfullyFound, fakeAccount));

        accountService.createAccount(initialBalance, "asd", accountId);
        Result res = accountService.withdrawMoney(accountId, withdrawAmount);

        assertEquals(ResultDescription.ThereIsNotEnoughMoneyInTheAccount, res.getStatus());
    }

    // Тест: Пополнение счёта
    @Test
    public void test3() {
        AccountRepository mockAccountRepo = Mockito.mock(AccountRepository.class);
        UserRepository mockUserRepo = Mockito.mock(UserRepository.class);
        ProducerService pr = Mockito.mock(ProducerService.class);
        AccountService accountService = new AccountService(mockAccountRepo, mockUserRepo, pr);

        int accountId = 12;
        double initialBalance = 100.0;
        double depositAmount = 50.0;

        Account fakeAccount = new Account(initialBalance, "asd", accountId);
        Mockito.when(mockAccountRepo.getAccountById(accountId)).thenReturn(new Result(ResultDescription.TheAccountIsSuccessfullyFound, fakeAccount));


        Result res = accountService.putMoney(accountId, depositAmount);

        assertEquals(ResultDescription.TheMoneyIsPutToAccount, res.getStatus());
        assertEquals(initialBalance + depositAmount, accountService.checkBalance(accountId).getInformation());
    }
}