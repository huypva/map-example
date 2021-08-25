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

```shell
$ mvn clean package
$ java -jar map/target/map-0.0.1-SNAPSHOT.jar
```

```shell
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

## Contribute

## Reference