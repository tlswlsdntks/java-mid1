package enumeration.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public String[] printMenus() {
        return switch (level) {
            case 1 -> new String[]{"메인 화면"};
            case 2 -> new String[]{"메인 화면", "이메일 관리 화면"};
            case 3 -> new String[]{"메인 화면", "이메일 관리 화면", "관리자 회원"};
            default -> throw new IllegalStateException("Unexpected value: " + level);
        };
    }
}
