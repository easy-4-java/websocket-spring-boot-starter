package io.github.easy4j.websocket.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import org.junit.jupiter.api.Test;
import org.springframework.web.socket.WebSocketSession;

class WebSocketUtilsTest {

    @Test
    void sessionsUsesGuavaConcurrentMapAndAppliesFilter() throws Exception {
        WebSocketSession selected = session();
        WebSocketSession excluded = session();
        Map<String, WebSocketSession> source = new HashMap<>();
        source.put("selected", selected);
        source.put("excluded", excluded);

        Map<String, WebSocketSession> result =
                WebSocketUtils.sessions(source, session -> session == selected);

        assertTrue(result instanceof ConcurrentMap);
        assertEquals(1, result.size());
        assertSame(selected, result.get("selected"));
    }

    private static WebSocketSession session() {
        return (WebSocketSession) Proxy.newProxyInstance(
                WebSocketSession.class.getClassLoader(),
                new Class<?>[] { WebSocketSession.class },
                (proxy, method, args) -> null);
    }
}
