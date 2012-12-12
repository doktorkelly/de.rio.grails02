dataSource {
	pooled = false
	driverClassName = "org.postgresql.Driver"
	username = "grails02"
	password = "grails02"
	dialect = org.hibernate.dialect.PostgreSQLDialect

}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
			url = "jdbc:postgresql://localhost:5432/grails02_develop"
			logSql = true;
            dbCreate = "update"
        }
    }
    test {
        dataSource {
			url = "jdbc:postgresql://localhost:5432/grails02_test"
            dbCreate = "validate"
        }
    }
    production {
        dataSource {
			url = "jdbc:postgresql://localhost:5432/grails02"
            dbCreate = "validate"
            pooled = true
//            properties {
//               maxActive = -1
//               minEvictableIdleTimeMillis=1800000
//               timeBetweenEvictionRunsMillis=1800000
//               numTestsPerEvictionRun=3
//               testOnBorrow=true
//               testWhileIdle=true
//               testOnReturn=true
//               validationQuery="SELECT 1"
//            }
        }
    }
}
