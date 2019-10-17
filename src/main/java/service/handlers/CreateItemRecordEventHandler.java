package service.handlers;

import io.vertx.core.Future;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import model.events.Context;

public class CreateItemRecordEventHandler extends AbstractEventHandler {
    private final Logger LOGGER = LoggerFactory.getLogger(CreateItemRecordEventHandler.class);

    @Override
    public Future<Context> handleContext(Context context) {
        LOGGER.info("Handling event " + getEventType());
        return Future.succeededFuture(context);
    }

    @Override
    public String getEventType() {
        return "CREATED_HOLDINGS_RECORD";
    }

    @Override
    public String getNextEventType() {
        return "CREATED_ITEM_RECORD";
    }
}