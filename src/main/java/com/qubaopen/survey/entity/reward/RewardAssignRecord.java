package com.qubaopen.survey.entity.reward;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.qubaopen.survey.entity.util.AbstractBaseEntity;

/**
 * 奖品分发记录 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "reward_assign_record")
@Audited
public class RewardAssignRecord extends AbstractBaseEntity<Long> {

	private static final long serialVersionUID = -2180641333847011629L;


	private RewardActivityRecord rewardActivityRecord;

	private RewardInfo rewardInfo;
}
