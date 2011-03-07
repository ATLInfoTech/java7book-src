package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerList {

	private List<String> servers = new ArrayList<>();

	public void add(String server) {
		doSomething();
		servers.add(server);
	}

	public List<String> getServers() {
		return Collections.unmodifiableList(servers);
	}

	private void doSomething() {
	}

	public static void main(String[] args) {
		ServerList serverList = new ServerList();
		serverList.add("10.1.1.10");
		List<String> servers = serverList.getServers();
		servers.add("10.1.1.11"); // 예외 발생
	}
}
