
package com.deun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deun.model.MemberEntity;

@Repository
public interface MemberJpaRepository extends JpaRepository<MemberEntity, Long> {
	MemberEntity findByName(@Param("name") String name);
}
