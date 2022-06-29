package com.example.cafe_management_systemfin.validator;

import com.example.cafe_management_systemfin.domain.entity.User;
import com.example.cafe_management_systemfin.domain.enums.RoleType;

public class CafeTableValidator {

    public static boolean isUserWaiter(User user) {

        return (!user.getRoleType().equals(RoleType.WAITER));
    }

}
