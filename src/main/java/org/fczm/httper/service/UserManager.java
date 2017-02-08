package org.fczm.httper.service;

import org.fczm.httper.bean.UserBean;

public interface UserManager {

    /**
     * Add a user
     * @param name
     * @param type
     * @param identifier
     * @param credential
     * @return
     */
    String addUser(String name, String type, String identifier, String credential);

    /**
     * Get user by identifier
     * @param identifier
     * @param type
     * @return
     */
    UserBean getByIdentifierWithType(String identifier, String type);

    /**
     * User authentication by login token
     * @param token
     * @return
     */
    UserBean authByToken(String token);

    /**
     * Send a email with an url to user for modifying password.
     * @param uid
     * @return
     */
    boolean sendModifyPasswordMail(String uid);

    /**
     *
     * @param code
     * @param password
     * @return
     */
    boolean modifyPassword(String code, String password);
}

