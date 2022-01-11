package com.zzr.head_first.chapter006;

import com.zzr.head_first.chapter006.client.SimpleRemoteControl;
import com.zzr.head_first.chapter006.command.Command;
import com.zzr.head_first.chapter006.command.LightOnCommand;
import com.zzr.head_first.chapter006.executor.LightExecutor;

/**
 * @author zhaozhirong
 * @date 2022/1/3 10:07 上午
 */
public class Main {


    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Command command = new LightOnCommand(new LightExecutor());
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();
    }

}
