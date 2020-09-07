package com.andy.returnjson;

import java.util.List;

/**
 * @author andy-liu
 * @date 2020/8/28 - 7:57 PM
 */
public class Permissions {

    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "permissions=" + permissions +
                '}';
    }
}
