##### themeleaf模板找不到异常处理
+ 1.检查配置文件"spring.thymeleaf.prefix"属性是否配置正确的文件夹
+ 2.检查访问的url所映射的模板是否存在目标文件夹下
+ 3.检查编译后target文件下的classess目录下是否存在目标模板，若不存在需要加上插件
```
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <fork>true</fork>
                </configuration>
            </plugin>
        </plugins>
    </build>
```