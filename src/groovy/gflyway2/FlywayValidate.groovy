package gflyway2

import org.flywaydb.core.Flyway

class FlywayValidate extends AbstractFlyway {

    FlywayValidate(config) {
        super(config)
    }

    @Override
    protected void doExecute(Flyway flyway) {
        flyway.validate()
    }

}
