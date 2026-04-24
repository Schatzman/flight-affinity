# Flight Affinity (Fabric 1.20.1)

Armor enchantment **Flight Affinity** removes the vanilla **not-on-ground** mining slowdown (the same rule that makes mid-air mining slow; it is separate from the underwater slowdown that **Aqua Affinity** fixes).

- **Applies to:** any armor piece (including **elytra**), same slot rules as vanilla armor enchants.
- **Obtaining:** enchanting table, anvil, `/enchant`, **librarian** enchanted-book trades (included in the vanilla random tradeable enchantment pool).

## Build

```bash
./gradlew build
```

Output: `build/libs/flight-affinity-<version>.jar`

## Manual check (E2E)

- **In air:** with boots (or any enchantable armor) **without** Flight Affinity, break a block after jumping: mining is slow while not on the ground. Add Flight Affinity to that piece and repeat: mining in mid-air should match **on-ground** speed (no not-on-ground penalty from this rule).
- **Per slot:** try the same test with the enchant on **helmet, chest, legs, boots**, and on **elytra** (in the chest slot) — behavior should be consistent for each slot the enchant is on.
- **Underwater:** with **Aqua Affinity** on a helmet, underwater mining is unchanged by this mod; confirm Flight Affinity + Aqua Affinity does not break the usual underwater case.
- **Sources:** get the book from a **librarian**, combine at an **anvil** with the armor piece, or use the **enchanting table** / creative books as usual.

## Requirements

- Minecraft **1.20.1**
- Fabric Loader **≥ 0.18.4** (see `gradle.properties` / `fabric.mod.json`)
- [Fabric API](https://github.com/FabricMC/fabric) — **required** at runtime (`modImplementation` in `build.gradle`)
