package com.qubaopen.survey.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

import com.fasterxml.jackson.databind.ObjectMapper
import com.qubaopen.survey.repository.MyRepository

abstract class AbstractBaseController<T, ID extends Serializable> {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass())
	
	protected abstract MyRepository<T, ID> getRepository()
	
	@Autowired
	ObjectMapper objectMapper

	@RequestMapping(method = RequestMethod.GET)
	findAll(
		@RequestParam(defaultValue = "{}") String filters, 
		Pageable pageable) {
		
		Map filterMap = null
		try {
			filterMap = objectMapper.readValue(filters, HashMap.class)
		} catch (IOException e) {
			logger.error(e.getMessage())
			throw new RuntimeException(e)
		}
		
		getRepository().findAll(filterMap, pageable)
	}

	@RequestMapping(value = '{id}', method = RequestMethod.GET)
	findOne(@PathVariable ID id) {
		getRepository().findOne(id)
	}

	@RequestMapping(method = RequestMethod.POST)
	add(@RequestBody T entity) {
		getRepository().save(entity)
	}

	@RequestMapping(method = RequestMethod.PUT)
	modify(@RequestBody T entity) {
		getRepository().save(entity)
	}

	@RequestMapping(value = '{id}', method = RequestMethod.DELETE)
	void delete(@PathVariable ID id) {
		def entity = getRepository().findOne(id)
		getRepository().delete(entity)
	}

}
