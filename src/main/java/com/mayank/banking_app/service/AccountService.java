package com.mayank.banking_app.service;

import com.mayank.banking_app.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

    List<AccountDto> bulkUploadAccounts(List<AccountDto> accountDtos);

    void bulkDeleteAccounts(List<Long> ids);

}
