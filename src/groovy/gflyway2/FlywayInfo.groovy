package gflyway2

import com.googlecode.flyway.core.Flyway
import com.googlecode.flyway.core.info.MigrationInfoDumper

class FlywayInfo extends AbstractFlyway {

    FlywayInfo(config) {
        super(config)
    }

    @Override
    protected void doExecute(Flyway flyway) {
        print MigrationInfoDumper.dumpToAsciiTable(flyway.info().all())
    }

}
