package com.taimusurotto.slotmanagementservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason="Slot Does Not Exist")
public class SlotDoesNotExist extends Exception{
    public SlotDoesNotExist(){
        super("Slot Does Not Exist");
    }
}
