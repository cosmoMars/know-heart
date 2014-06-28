package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars
 * 问卷标签
 */
@Entity
@Table(name = "tag")
public class Tag extends AbstractPersistable<Long>{

}
