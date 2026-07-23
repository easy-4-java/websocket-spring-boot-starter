package io.github.easy4j.websocket.session.handler;

import io.github.easy4j.websocket.event.WebSocketMessageEvent;
import io.github.easy4j.websocket.session.handler.chain.HandlerChain;

public interface WebSocketMessageHandler<T extends WebSocketMessageEvent> {

	public void doHandler(T event, HandlerChain<T> handlerChain) throws Exception;
	
}
