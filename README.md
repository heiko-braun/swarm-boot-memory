
## Swarm App

As a baseline we build a static app . This is perfectly fine for serving nice-looking static content maybe with a REST endpoint or two. The source code for the app we used to test is [in github](https://github.com/heiko-braun/swarm-boot-memory/tree/master/src/main/java/com/example). You can build it with `mvn` if you have a JDK 1.8 available and on your path (`mvn package`). It can be launched like this:

```
$ java -Xmx32m -Xss256k -jar target/swarm-demo-0.0.1-SNAPSHOT-swarm.jar
```

The we add some load, just to warm up the thread pools and force all the code paths to be exercised:

```
$ ab -n 2000 -c 4 http://localhost:8080/
```

### JVM Tools

To measure memory usage there are some tools in the JVM.
You can get quite a lot of useful information from JConsole or JVisualVM (with the JConsole plugin so you can inspect MBeans).

The average weighs in at roughly 18MB-20MB for an app under load (and 15MB after a manual GC). JConsole also reports ~60MB non-heap usage.

Here's a graph of the heap usage from a quiescent app under load,
followed by a manual garbage collection (the double nick in the
middle) and a new equilibrium with a lower heap usage.

<img src="https://raw.githubusercontent.com/heiko-braun/swarm-boot-memory/master/manual-gc-web.png" width="80%"/>

