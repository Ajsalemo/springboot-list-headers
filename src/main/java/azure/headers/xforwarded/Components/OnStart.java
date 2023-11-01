package azure.headers.xforwarded.Components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class OnStart implements ApplicationListener<ApplicationReadyEvent>
    {

    Logger LOG = LoggerFactory.getLogger(OnStart.class);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        LOG.info("ApplicationListener#onApplicationEvent()");
        LOG.info("Application starting up..");
        LOG.info("Calling exit..");
        System.exit(1);
    }
}
