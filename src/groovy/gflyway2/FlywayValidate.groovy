package gflyway2

import com.googlecode.flyway.core.Flyway

class FlywayValidate extends AbstractFlyway {

    FlywayValidate(config) {
        super(config)
    }

    @Override
    protected void doExecute(Flyway flyway) {
        flyway.validate()
    }

}
