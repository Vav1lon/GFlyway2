log4j = {
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%m%n')
    }

    error 'org.codehaus.groovy.grails.commons', // core / classloading
            'org.codehaus.groovy.grails.plugins', // plugins
            'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
            'org.springframework',
            'org.hibernate',
            'net.sf.ehcache.hibernate'

    info 'com.googlecode.flyway'
}
