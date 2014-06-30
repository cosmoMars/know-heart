package com.qubaopen.survey.entity.system;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 滚动信息
 * Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "SYSTEM_ROLLING_MESSAGE")
public class SystemRollingMessage extends AbstractPersistable<Long> {

    private String content;

}
