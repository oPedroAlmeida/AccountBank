package com.techbank.accountcmd.api.commands;

import com.techbank.cqrscore.commands.BaseCommand;
import lombok.Data;

@Data
public class CloseAccountCommand extends BaseCommand {

    public CloseAccountCommand(String id) {
        super(id);
    }
}
