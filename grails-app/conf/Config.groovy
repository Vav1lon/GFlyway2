log4j = {
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%m%n')
    }

    error 'org.codehaus.groovy.grails',
          'org.springframework',
          'org.hibernate',
          'net.sf.ehcache.hibernate'

    info 'com.googlecode.flyway'
}
