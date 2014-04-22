package gflyway2

import org.flywaydb.core.Flyway

class FlywayRepair extends AbstractFlyway {

    FlywayRepair(config) {
        super(config)
    }

    @Override
    protected void doExecute(Flyway flyway) {
        flyway.repair()
    }

}
