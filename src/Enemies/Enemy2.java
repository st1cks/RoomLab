package Enemies;

public class Enemy2 {
    private final int MAX_HP = 20;
    private int HP;
    private final int ATK= 10;
    private final int GoldDrop = 20;
    public String getName(){
        return "Funky Hand Cat";
    }

    public int getATK(){
        return this.ATK;
    }

    public int getInitialHP(){
        return this.MAX_HP;
    }

    public int getHP(){
        return this.HP;
    }
    public void printEnemy(){
        System.out.println("            .               ,.\n" +
                "           T.\"-._..---.._,-\"/|\n" +
                "           l|\"-.  _.v._   (\" |\n" +
                "           [l /.'_ \\; _~\"-.`-t\n" +
                "           Y \" _(o} _{o)._ ^.|\n" +
                "           j  T  ,-<v>-.  T  ]\n" +
                "           \\  l ( /-^-\\ ) !  !\n" +
                "            \\. \\.  \"~\"  ./  /c-..,__\n" +
                "              ^r- .._ .- .-\"  `- .  ~\"--.\n" +
                "               > \\.                      \\\n" +
                "               ]   ^.                     \\\n" +
                "               3  .  \">            .       Y  -Row\n" +
                "  ,.__.--._   _j   \\ ~   .         ;       |\n" +
                " (    ~\"-._~\"^._\\   ^.    ^._      I     . l\n" +
                "  \"-._ ___ ~\"-,_7    .Z-._   7\"   Y      ;  \\        _\n" +
                "     /\"   \"~-(r r  _/_--._~-/    /      /,.--^-._   / Y\n" +
                "     \"-._    '\"~~~>-._~]>--^---./____,.^~        ^.^  !\n" +
                "         ~--._    '   Y---.                        \\./\n" +
                "              ~~--._  l_   )                        \\\n" +
                "                    ~-._~~~---._,____..---           \\\n" +
                "                        ~----\"~       \\\n" +
                "                                       \\\n" +
                "\n" +
                "------------------------------------------------\n" +
                "Thank you for visiting https://asciiart.website/\n" +
                "This ASCII pic can be found at\n" +
                "https://asciiart.website/index.php?art=animals/cats\n");
    }

    public int getGoldDrop(){
        return 20;
    }
}
