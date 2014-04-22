package gflyway2

import org.flywaydb.core.Flyway
import org.flywaydb.core.api.MigrationVersion

class FlywayInit extends AbstractFlyway {

    String initialVersion
    String initialDescription

    FlywayInit(config) {
        super(config)
        initialVersion = flywayConfig("initialVersion", "0")
        initialDescription = flywayConfig("initialDescription", "Flyway Init")
    }

    @Override
    protected void doExecute(Flyway flyway) {
        if (initialVersion != null) {
            flyway.setInitVersion(new MigrationVersion(initialVersion))
        }
        if (initialDescription != null) {
            flyway.setInitDescription(initialDescription)
        }

        flyway.init()
    }
}
