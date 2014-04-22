package gflyway2

import org.flywaydb.core.Flyway
import org.flywaydb.core.internal.info.MigrationInfoDumper


class FlywayInfo extends AbstractFlyway {

    FlywayInfo(config) {
        super(config)
    }

    @Override
    protected void doExecute(Flyway flyway) {
        print MigrationInfoDumper.dumpToAsciiTable(flyway.info().all())
    }

}
