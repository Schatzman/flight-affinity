# Flight Affinity (Fabric 1.20.1)

Armor enchantment **Flight Affinity** removes the vanilla **not-on-ground** mining slowdown (the same rule that makes mid-air mining slow; it is separate from the underwater slowdown that **Aqua Affinity** fixes).

- **Applies to:** any armor piece (including **elytra**), same slot rules as vanilla armor enchants.
- **Obtaining:** enchanting table, anvil, `/enchant`, **librarian** enchanted-book trades (included in the vanilla random tradeable enchantment pool).

## Build

```bash
./gradlew build
```

Output: `build/libs/flight-affinity-<version>.jar`

## Manual E2E

See your product plan §6: verify airborne mining with/without the enchant on each armor slot, underwater behavior unchanged, table/anvil/book, and librarian books.

## Requirements

- Minecraft **1.20.1**
- Fabric Loader **≥ 0.18.4**
- Fabric API (for Gradle `modImplementation`; runtime same as other Fabric mods using API)
