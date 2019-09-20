package com.orte.pattern.factory2;


import com.orte.pattern.factory2.message.Message;
import com.orte.pattern.factory2.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
