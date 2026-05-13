package Core;

import Audio.MusicPlayer;

public enum EnemyType {

    DUWENDE("Duwende", 6, 15, "throws a tiny rock", MusicPlayer.SFX_DUWENDE),
    TIYANAK("Tiyanak", 7, 16, "bites viciously", MusicPlayer.SFX_DUWENDE),
    BUNGISNGIS("Bungisngis", 12, 32, "swings a large tree branch", MusicPlayer.SFX_BUNGISNGIS),
    BUNGISNGIS2("Bungisngis", 8, 29, "swings arm at you", MusicPlayer.SFX_BUNGISNGIS),
    ASWANG("Aswang", 9, 20, "slashes with claws", MusicPlayer.SFX_ASWANG),
    SIGBIN("Sigbin", 7, 22, "lunges with shadow fangs", MusicPlayer.SFX_SIGBIN),
    TIKTIK("Tiktik", 8, 22, "whips their tongue at you", MusicPlayer.SFX_TIKTIK),
    ABWAK("Abwak", 7, 22, "lunges with claws", MusicPlayer.SFX_ABWAK),
    BABAYLANS("Babaylans", 13, 25, "casts a curse on you", MusicPlayer.SFX_BABAYLAN),
    BABAYLANS2("Babaylan Sentinels", 13, 30, "casts a curse on you", MusicPlayer.SFX_BABAYLAN),
    HUMANS("Humans", 10, 67, "fires their gun", MusicPlayer.SFX_HUMAN),
    TRIA("Tria", 20, 50, "throws knives on you", MusicPlayer.SFX_TRIA),
    ERIKA("Erika", 20, 40, "lunges at you", MusicPlayer.SFX_ERIKA),
    ERIKA2("Erika Clones", 15, 20, "scratches you", MusicPlayer.SFX_ERIKA);

    public final String typeName;
    public final String sfxFile;
    public final int minDamage;
    public final int maxDamage;
    public final String attackDescription;

    EnemyType(String typeName, int minDamage, int maxDamage, String attackDescription, String sfxFile) {
        this.typeName = typeName;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attackDescription = attackDescription;
        this.sfxFile = sfxFile;
    }
}