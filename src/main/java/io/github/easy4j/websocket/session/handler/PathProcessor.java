package io.github.easy4j.websocket.session.handler;

import io.github.easy4j.websocket.event.WebSocketMessageEvent;

/**
 * 给Handler设置路径
 */
public interface PathProcessor<T extends WebSocketMessageEvent> {
	
	WebSocketMessageHandler<T> processPath(String path);

}
