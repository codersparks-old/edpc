EDPC Model
==========

This project contains the code that models the data use within the EDPC project.

Currently this consists of:

* `System` - This is a class that models the data avaialable for the star systems with Elite Dangerous
* `Station` - This class models the data available for the stations that reside within a star system
* `Commodity` - This class models the data available for a commodity within the trade system
* `CommodityCategory` - The categories used to categorise the commodities

This project also contains the [Spring Data JPA](http://projects.spring.io/spring-data-jpa/ "Spring Data JPA") repository interfaces that allows automatic generation using [Spring Data Rest](http://projects.spring.io/spring-data-rest/ "Spring Data Rest") project