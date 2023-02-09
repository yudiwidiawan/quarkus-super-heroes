package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class VillainApplicationLifeCycle {
    private static final Logger LOGGER = Logger.getLogger(VillainApplicationLifeCycle.class);


    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("____   ____.__.__  .__         .__            _____ __________.___ ");
        LOGGER.info("\\   \\ /   /|__|  | |  | _____  |__| ____     /  _  \\\\______   \\   |");
        LOGGER.info(" \\   Y   / |  |  | |  | \\__  \\ |  |/    \\   /  /_\\  \\|     ___/   |");
        LOGGER.info("  \\     /  |  |  |_|  |__/ __ \\|  |   |  \\ /    |    \\    |   |   |");
        LOGGER.info("   \\___/   |__|____/____(____  /__|___|  / \\____|__  /____|   |___|");
        LOGGER.info("                             \\/        \\/          \\/             ");
        LOGGER.info("The application VILLAIN is starting with profile " + ProfileManager.getActiveProfile());
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}
