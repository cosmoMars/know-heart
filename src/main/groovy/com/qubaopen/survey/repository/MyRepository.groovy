package com.qubaopen.survey.repository

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface MyRepository<T, ID extends Serializable> extends
		JpaRepository<T, ID> {

	Page<T> findAll(Map filters, Pageable pageable)

}
