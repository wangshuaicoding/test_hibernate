# test_hibernate
练习hibernate这个ORM框架

# 学习记录
【注】：可以对比 mybatis-plus 学习
1、在pom中配置
```xml
<plugin>
                <groupId>com.mysema.maven</groupId>
                <artifactId>apt-maven-plugin</artifactId>
                <version>1.1.3</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>process</goal>
                        </goals>
                        <configuration>
                            <outputDirectory>target/generated-sources/java</outputDirectory>
                            <processor>com.querydsl.apt.jpa.JPAAnnotationProcessor</processor>
                        </configuration>
                    </execution>
                </executions>
            </plugin> 
```

2、在Maven中先clean,然后再compile之后才会出现Q开头的实体
3、注意：使用fetch()查询时，数据库没有符合该条件的数据时，返回的是空集合，而不是null
4、.execute()：用于执行增删改操作，返回的是受影响的行数，不能用于查询
    .fetch()和.select():是查询用的
