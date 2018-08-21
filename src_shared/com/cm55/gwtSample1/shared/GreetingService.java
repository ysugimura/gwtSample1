package com.cm55.gwtSample1.shared;

import com.google.gwt.user.client.rpc.*;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
  String greetServer(String name) throws IllegalArgumentException;
}
