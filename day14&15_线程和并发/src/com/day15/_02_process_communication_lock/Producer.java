package com.day15._02_process_communication_lock;

public class Producer implements Runnable{
	//�������Դ����
	private ShareResource resource = null;
	public Producer(ShareResource resource){
		this.resource = resource;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if((i % 2) == 0){
				resource.push("�����","��");
			}else{
				resource.push("����","Ů");
			}
		}
	}
}
