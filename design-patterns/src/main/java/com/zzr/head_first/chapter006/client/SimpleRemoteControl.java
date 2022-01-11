package com.zzr.head_first.chapter006.client;

import com.zzr.head_first.chapter006.command.Command;

/**
 * @author zhaozhirong
 * @date 2022/1/3 10:10 上午
 */
public class SimpleRemoteControl {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonWasPressed(){
        this.command.execute();
    }

}
