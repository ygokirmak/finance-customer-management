package com.company.cc.account.service.mapper;

import com.company.cc.account.domain.Account;
import com.company.cc.shared.AccountDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface AccountMapper extends EntityMapper<AccountDTO, Account> {

    AccountDTO toDto(Account account);

    Account toEntity(AccountDTO accountDTO);

    default Account fromId(Long id) {
        if (id == null) {
            return null;
        }
        Account user = new Account();
        user.setId(id);
        return user;
    }
}

