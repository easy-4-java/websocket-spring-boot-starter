package io.github.easy4j.websocket.session.handler.chain;

import io.github.easy4j.websocket.event.WebSocketMessageEvent;

public interface HandlerChain<T extends WebSocketMessageEvent>{

	void doHandler(T event) throws Exception;
	
}
