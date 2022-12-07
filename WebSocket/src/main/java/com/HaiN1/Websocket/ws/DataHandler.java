package com.HaiN1.Websocket.ws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

@Slf4j
public class DataHandler extends TextWebSocketHandler {

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws IOException, InterruptedException {
        log.info("Message: {}", message.getPayload());
        session.sendMessage(new TextMessage("Hello My Friend...!!!"));
    }
}
