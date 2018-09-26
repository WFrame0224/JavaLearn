package com.day15._02_process_communication_lock;

public class Producer implements Runnable{
	//共享的资源对象
	private ShareResource resource = null;
	public Producer(ShareResource resource){
		this.resource = resource;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if((i % 2) == 0){
				resource.push("春哥哥","男");
			}else{
				resource.push("凤姐姐","女");
			}
		}
	}
}
