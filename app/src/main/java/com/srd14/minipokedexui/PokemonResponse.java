package com.srd14.minipokedexui;

public class PokemonResponse {
    public int id;
    public String name;
    public int weight;
    public Sprites sprites;
    public Type[] types;
    public Ability[] abilities;

    public static class Sprites {
        public String front_default;
        public String back_default;
        public String front_shiny;
        public String back_shiny;
        public Other other;

        public static class Other {
            public OfficialArtwork official_artwork;

            public static class OfficialArtwork {
                public String front_default;
                public String front_shiny;
            }
        }
    }

    public static class Type {
        public TypeInfo type;

        public static class TypeInfo {
            public String name;
        }
    }

    public static class Ability {
        public AbilityInfo ability;

        public static class AbilityInfo {
            public String name;
        }
    }
}
