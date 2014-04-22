package gflyway2

import org.flywaydb.core.Flyway

class FlywayMigrate extends AbstractFlyway {

    FlywayMigrate(config) {
        super(config)
    }

    @Override
    protected void doExecute(Flyway flyway) {
        flyway.migrate()
    }

}
