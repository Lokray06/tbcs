package lists;

import java.util.ArrayList;
import java.util.List;

import objects.PokemonHolder;

public class PokemonDatabase {
    public static List<PokemonHolder> pokemons;

    public PokemonDatabase() {
       pokemons = new ArrayList<>();

        // Generation I
        pokemons.add(new PokemonHolder(1, "Bulbasaur", new int[]{5, 8}, new int[]{201, 124, 52}));
        pokemons.add(new PokemonHolder(2, "Ivysaur", new int[]{5, 8}, new int[]{201, 124}));
        pokemons.add(new PokemonHolder(3, "Venusaur", new int[]{5, 8}, new int[]{201, 124, 52}));
        pokemons.add(new PokemonHolder(4, "Charmander", new int[]{2}, new int[]{66, 62, 35}));
        pokemons.add(new PokemonHolder(5, "Charmeleon", new int[]{2}, new int[]{66, 62, 35}));
        pokemons.add(new PokemonHolder(6, "Charizard", new int[]{2, 10}, new int[]{66, 62, 35}));
        pokemons.add(new PokemonHolder(7, "Squirtle", new int[]{3}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(8, "Wartortle", new int[]{3}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(9, "Blastoise", new int[]{3}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(10, "Caterpie", new int[]{12}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(11, "Metapod", new int[]{12}, new int[]{11}));
        pokemons.add(new PokemonHolder(12, "Butterfree", new int[]{12, 10}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(13, "Weedle", new int[]{8, 12}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(14, "Kakuna", new int[]{8, 12}, new int[]{11}));
        pokemons.add(new PokemonHolder(15, "Beedrill", new int[]{8, 12, 10}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(16, "Pidgey", new int[]{10, 1}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(17, "Pidgeotto", new int[]{10, 1}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(18, "Pidgeot", new int[]{10, 1}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(19, "Rattata", new int[]{1}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(20, "Raticate", new int[]{1}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(21, "Spearow", new int[]{10, 12}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(22, "Fearow", new int[]{10}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(23, "Ekans", new int[]{8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(24, "Arbok", new int[]{8}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(25, "Pikachu", new int[]{4}, new int[]{9, 52}));
        pokemons.add(new PokemonHolder(26, "Raichu", new int[]{4}, new int[]{9, 52}));
        pokemons.add(new PokemonHolder(27, "Sandshrew", new int[]{9}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(28, "Sandslash", new int[]{9}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(29, "Nidoran♀", new int[]{8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(30, "Nidorina", new int[]{8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(31, "Nidoqueen", new int[]{8, 5}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(32, "Nidoran♂", new int[]{8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(33, "Nidorino", new int[]{8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(34, "Nidoking", new int[]{8, 5}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(35, "Clefairy", new int[]{18}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(36, "Clefable", new int[]{18}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(37, "Vulpix", new int[]{2}, new int[]{9, 52}));
        pokemons.add(new PokemonHolder(38, "Ninetales", new int[]{2}, new int[]{9, 52}));
        pokemons.add(new PokemonHolder(39, "Jigglypuff", new int[]{18}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(40, "Wigglytuff", new int[]{18}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(41, "Zubat", new int[]{14, 10}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(42, "Golbat", new int[]{14, 10}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(43, "Oddish", new int[]{5, 8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(44, "Gloom", new int[]{5, 8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(45, "Vileplume", new int[]{5, 8}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(46, "Paras", new int[]{12, 5}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(47, "Parasect", new int[]{12, 5}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(48, "Venonat", new int[]{12, 8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(49, "Venomoth", new int[]{12, 8}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(50, "Diglett", new int[]{9}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(51, "Dugtrio", new int[]{9}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(52, "Meowth", new int[]{1}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(53, "Persian", new int[]{1}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(54, "Psyduck", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(55, "Golduck", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(56, "Poliwag", new int[]{3}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(57, "Poliwhirl", new int[]{3}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(58, "Poliwrath", new int[]{3}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(59, "Abra", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(60, "Kadabra", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(61, "Alakazam", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(62, "Machop", new int[]{7}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(63, "Machoke", new int[]{7}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(64, "Machamp", new int[]{7}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(65, "Bellsprout", new int[]{5, 8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(66, "Weepinbell", new int[]{5, 8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(67, "Victreebel", new int[]{5, 8}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(68, "Tentacool", new int[]{10}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(69, "Tentacruel", new int[]{10}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(70, "Geodude", new int[]{9}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(71, "Graveler", new int[]{9}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(72, "Golem", new int[]{9}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(73, "Ponyta", new int[]{2}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(74, "Rapidash", new int[]{2}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(75, "Slowpoke", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(76, "Slowbro", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(77, "Magnemite", new int[]{14}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(78, "Magneton", new int[]{14}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(79, "Farfetch'd", new int[]{10}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(80, "Doduo", new int[]{10}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(81, "Dodrio", new int[]{10}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(82, "Seel", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(83, "Dewgong", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(84, "Grimer", new int[]{12}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(85, "Muk", new int[]{12}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(86, "Shellder", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(87, "Cloyster", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(88, "Gastly", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(89, "Haunter", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(90, "Gengar", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(91, "Onix", new int[]{9}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(92, "Drowzee", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(93, "Hypno", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(94, "Krabby", new int[]{11}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(95, "Kingler", new int[]{11}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(96, "Voltorb", new int[]{14}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(97, "Electrode", new int[]{14}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(98, "Exeggcute", new int[]{5, 8}, new int[]{11, 8}));
        pokemons.add(new PokemonHolder(99, "Exeggutor", new int[]{5, 8}, new int[]{11, 8, 52}));
        pokemons.add(new PokemonHolder(100, "Cubone", new int[]{9}, new int[]{11, 8}));
    }

    public List<PokemonHolder> getPokemons() {
        return pokemons;
    }
}