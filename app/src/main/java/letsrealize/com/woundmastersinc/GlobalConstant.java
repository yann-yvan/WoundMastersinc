package letsrealize.com.woundmastersinc;

/**
 * Created by yann on 12/09/17.
 */

public class GlobalConstant {
    private final static String SIGN_IN_PREFERENCES_KEY = "sign_in_preferences";
    private final static String SIGN_IN_COMPLETE_KEY = "sign_in_complete";

    /**
     * get the sign in preferences key
     * @return the value of the key
     */
    public static String getSignInCompleteKey() {
        return SIGN_IN_COMPLETE_KEY;
    }

    /**
     * get the sign complete key
     * @return the value of the key
     */
    public static String getSignInPreferencesKey() {
        return SIGN_IN_PREFERENCES_KEY;
    }
}
