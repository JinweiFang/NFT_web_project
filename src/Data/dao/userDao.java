package Data.dao;

import Domain.User;

public interface userDao extends AbstractDao<User> {
    User findByUsername(User item);
    User updateByUsername(User item);
    String getSecurityAnswer(String username, int status);

    Double queryUserBalance(String username);

    boolean updateUserBalance(String username, double newBalance);
}
