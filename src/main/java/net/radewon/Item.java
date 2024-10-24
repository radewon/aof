package net.radewon;
public enum Item {
    //HERMES_BOOTS("Hermes Boots"),
    BAND_OF_REGENERATION,
    MAGIC_MIRROR,
    ABIGAIL_FLOWER,
    LIFE_CRYSTAL,
    BED,
    TECHNOBLADE,
    ITEM_UPGRADE,
    CLENTAMINATOR,
    ROD_OF_DISCORD,
    WARDEN_SHIELD,
    WARDEN_PERMANENT_HEART,
    SHARK_TOOTH_NECKLACE,
    DEMON_HEART,
    PWNHAMMER,
    TOTEM_OF_UNDYING,
    WARDEN_COMPASS,
    ARROW,
    BAMBOO_FISHING_POLE,
    WOODEN_FISHING_POLE,
    IRON_FISHING_POLE,
    DIAMOND_FISHING_POLE,
    WARDEN_FISHING_POLE,
    WATER_BOLT,
    METAL_DETECTOR,
    ANKLET_OF_THE_WIND,
    LAVA_CHARM,
    PEACE_CANDLE,
    BAST_STATUE,
    NEPTUNE_SHELL,
    ROTTEN_CHUNK,
    RED_BALLOON,
    PANIC_NECKLACE,
    AUTOHAMMER,
    LUCKY_COIN,
    BLESSED_APPLE,
    SNOWBALL_CANNON,
    BLOODY_TEAR,
    ANCHOR,
    OBSIDIAN_ROSE,
    VAMPIRE_KNIVES,
    WORM_SCARF,
    FROZEN_TURTLE_SHELL,
    LIFE_FRUIT,
    ANGEL_STATUE,
    BIOME_SOLUTION,
    RECALL_POTION,
    WORMHOLE_POTION,
    HEALTH_POTION,
    TELEPORTATION_POTION;

    private String name;
    private String desc;
    private Utility[] mode;

    Item() {
        this.name = "null";
        this.desc = "placeholder description";
        this.mode = null;
    }

    Item(String name, String desc, Utility... mode) {
        this.name = "null";
        this.desc = "placeholder description";
        this.mode = null;
    }
}
