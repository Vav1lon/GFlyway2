package gflyway2

import org.flywaydb.core.Flyway

class FlywayClean extends AbstractFlyway {

    FlywayClean(config) {
        super(config)
    }

    @Override
    protected void doExecute(Flyway flyway) {
        flyway.clean()
    }
}
