package io.github.easy4j.websocket.session.handler.chain;

import io.github.easy4j.websocket.event.WebSocketMessageEvent;

public interface HandlerChainResolver<T extends WebSocketMessageEvent> {

	HandlerChain<T> getChain(T event , HandlerChain<T> originalChain);
	
}
