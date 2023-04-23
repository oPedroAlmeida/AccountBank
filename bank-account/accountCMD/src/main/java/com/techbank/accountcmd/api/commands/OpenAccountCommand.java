package com.techbank.accountcmd.api.commands;

import com.techbank.accountcommon.dto.AccountType;
import com.techbank.cqrscore.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}