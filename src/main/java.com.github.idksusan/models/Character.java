package models;

import java.util.List;

public class Character {
    private ImmutableCharacteristics immutableCharacteristics;

    //MUTABLE CHARACTERISTICS
    private Integer level;
    private List<Ability> abilityModifiers;
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
    private List<String> traits;
    private List<String> features;
}
