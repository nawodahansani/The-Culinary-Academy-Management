package lk.ijse.bo;

import lk.ijse.bo.custom.SignInBO;
import lk.ijse.bo.custom.impl.SettingBOImpl;
import lk.ijse.bo.custom.impl.SignInBOImpl;
import lk.ijse.bo.custom.impl.SignUpBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){
    }
    public static BOFactory getBoFactory() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOType {
        SIGNIN,SIGNUP,SETTING
    }

    public SuperBo getBO(BOType boType) {

        switch (boType) {
            case  SIGNIN:
                return new SignInBOImpl();
            case SIGNUP:
                return new SignUpBOImpl();
            case SETTING:
                return new SettingBOImpl();
            default :
                return null;
        }
    }
}
