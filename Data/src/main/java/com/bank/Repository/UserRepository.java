package com.bank.Repository;
import com.bank.Entities.User;
import com.bank.ResultType.Result;
import com.bank.ResultType.ResultDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * интерфейс для класса репозиторий пользователей
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
    default Result createUser(User user) {
        User savedUser = save(user);
        return new Result(ResultDescription.TheUserHasBeenSuccessfullyCreated, savedUser);
    }

    default Result getUserById(int id) {
        User user = findById(id).orElse(null);
        if (user != null) {
            return new Result(ResultDescription.TheUserIsSuccessfullyFound, user);
        } else {
            return new Result(ResultDescription.TheUserIsNotFound);
        }
    }

    default Result updateUser(User user) {
        User updatedUser = save(user);
        return new Result(ResultDescription.TheUserIsSuccessfullyUpdated, updatedUser);
    }

    default Result deleteUser(User user) {
        delete(user);
        return new Result(ResultDescription.TheUserIsSuccessfullyDeleted);
    }
}
