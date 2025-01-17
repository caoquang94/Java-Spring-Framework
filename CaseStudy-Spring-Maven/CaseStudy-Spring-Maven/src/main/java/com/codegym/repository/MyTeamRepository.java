package com.codegym.repository;

import com.codegym.model.MyTeam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

@Transactional
public interface MyTeamRepository extends PagingAndSortingRepository<MyTeam,Long> {
    @Query(value = "select e from MyTeam e where e.name =?1")
    Page<MyTeam> findAllByTeamName(String name, Pageable pageable);

    @Query("update MyTeam e set e.isDelete = true where e.id=?1")
    @Modifying
    void softDelete(Long id);
}
