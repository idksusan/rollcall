package model;

import java.util.List;

public class Character {
    private String name;
    private String description;
    private CharRace charRace;
    private CharClass charClass;
    private Integer level;
    private List<Integer> abilityModifiers;
    private List<Integer> abilityScores;
    private Integer proficiencyBonus;
    private List<Integer> savingThrowModifiers;
    private List<Integer> skillModifiers;
    private Integer passiveWisdom;
    private Integer armorClass;
    private Integer initiative;
    private Integer speed;
    private Integer totalHitPoints;
    private List<String> equipment;
    private List<Attack> attacks;
    private String background;
    private List<String> traits;
    private List<String> features;
    private Integer age;
    private Integer height;
    private Integer weight;
    private String eyeColor;
    private String skinColor;
    private String hair;
    private String alignment;
    private List<String> languages;
}