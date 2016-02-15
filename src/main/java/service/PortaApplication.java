package service;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class PortaApplication extends Application{
	private Set<Object> singletons = new HashSet<Object>();

	public PortaApplication() {
		singletons.add(new PortaService());
	}

	public Set<Object> getSingletons() {
		return singletons;
	}
}
