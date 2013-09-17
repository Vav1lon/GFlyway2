package gflyway2

import com.googlecode.flyway.core.Flyway

class FlywayClean extends AbstractFlyway {

    FlywayClean(config) {
        super(config)
    }

    @Override
    protected void doExecute(Flyway flyway) {
        flyway.clean()
    }
}
