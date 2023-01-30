package machine;

public enum Action {
    BUY,FILL,TAKE,REMAINING, EXIT;


    public static Action createFromString(String action){
        return switch (action){
            case "buy" -> Action.BUY;
            case "fill" -> Action.FILL;
            case "take" -> Action.TAKE;
            case "remaining" -> Action.REMAINING;
            case "exit" -> Action.EXIT;
            default -> throw new DomainException("INVALID_ACTION_INDEX");
        };
    }
}