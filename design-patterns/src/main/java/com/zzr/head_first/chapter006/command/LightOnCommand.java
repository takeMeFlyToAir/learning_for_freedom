package com.zzr.head_first.chapter006.command;

import com.zzr.head_first.chapter006.executor.LightExecutor;

/**
 * @author zhaozhirong
 * @date 2022/1/3 10:08 上午
 */
public class LightOnCommand implements Command{

    private LightExecutor lightExecutor;

    public LightOnCommand(LightExecutor lightExecutor) {
        this.lightExecutor = lightExecutor;
    }

    @Override
    public void execute() {
        lightExecutor.on();
    }
}
