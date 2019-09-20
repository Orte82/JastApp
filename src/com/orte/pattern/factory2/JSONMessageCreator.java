package com.orte.pattern.factory2;

import com.orte.pattern.factory2.message.JSONMessage;
import com.orte.pattern.factory2.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
