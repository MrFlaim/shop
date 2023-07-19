package practice.contentmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.contentmanagement.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Integer> {
}
