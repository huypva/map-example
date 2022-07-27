The hello-world project

<div align="center">
    <img src="./assets/images/map.png"/>
</div>


## Project structure
```
.
├── map
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

- Build project

```shell script 
$ ./mvnw clean package
...
[INFO] 
[INFO] Map ................................................ SUCCESS [  5.438 s]
[INFO] Parent ............................................. SUCCESS [  0.011 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.594 s
[INFO] Finished at: 2022-07-27T08:59:10+07:00
[INFO] ------------------------------------------------------------------------
```

- Run project

```shell script 
$ java -jar map/target/map-0.0.1-SNAPSHOT.jar
HashMap
Entry <1,a>
Entry <2,b>
Entry <3,c>
Entry <11111,a1>
Entry <333,c3>
Entry <2222,b2>
LinkedHashMap
Entry <1,a>
Entry <11111,a1>
Entry <2,b>
Entry <2222,b2>
Entry <3,c>
Entry <333,c3>
TreeMap
Entry <1,a>
Entry <2,b>
Entry <3,c>
Entry <333,c3>
Entry <2222,b2>
Entry <11111,a1>
```

## Reference