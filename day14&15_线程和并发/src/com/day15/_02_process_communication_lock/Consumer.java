package com.day15._02_process_communication_lock;

//Ïû·ÑÕß
public class Consumer implements Runnable {
	private ShareResource resource = null;

	public Consumer(ShareResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			resource.popup();
		}
	}
}
