public enum MenuOption {
    SAVE,
    UPDATE,
    DELETE,
    FIND,
    FIND_ALL

    private final Consumer<MenuOption> action;

    MenuOption(Consumer<MenuOption> action) {
        this.action = action;
    }

    public void execute() {
        action.accept(this);
    }
}
