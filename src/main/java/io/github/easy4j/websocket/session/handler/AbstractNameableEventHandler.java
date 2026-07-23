package io.github.easy4j.websocket.session.handler;

import io.github.easy4j.websocket.event.WebSocketMessageEvent;

public abstract class AbstractNameableEventHandler<T extends WebSocketMessageEvent> implements WebSocketMessageHandler<T>, Nameable {

	/**
	 * 过滤器名称
	 */
	protected String name;

	protected String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
