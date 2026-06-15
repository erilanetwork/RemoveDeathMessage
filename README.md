# RemoveDeathMessage

A lightweight [Paper](https://papermc.io/) plugin that removes player death messages from chat.

## Requirements

- Paper (or a Paper fork) running Minecraft **1.21.4** (API `1.21`)
- Java 21

## Installation

1. Download or build `RemoveDeathMessage.jar` (see [Building](#building)).
2. Drop the jar into your server's `plugins/` folder.
3. Restart the server.

## Building

```bash
./gradlew build
```

The compiled jar lands in `build/libs/`.

To test locally on a Paper server:

```bash
./gradlew runServer
```

## How It Works

The plugin listens for `PlayerDeathEvent` and sets the death message to an
empty component:

```java
@EventHandler
public void onPlayerDeath(PlayerDeathEvent e) {
    e.deathMessage(Component.empty());
}
```

## License

[MIT](LICENSE) © xRookieFight
