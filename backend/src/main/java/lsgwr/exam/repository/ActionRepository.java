/***********************************************************
 * @Description : Action的数据库操作类
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019-05-26 12:39
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package lsgwr.exam.repository;

import lsgwr.exam.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, Integer> {
}
