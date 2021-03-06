package com.khan.opensns.api.dao.hibernate;

import org.springframework.stereotype.Repository;

import com.khan.opensns.api.dao.FeedLikeDao;
import com.khan.opensns.model.FeedLike;

@Repository
public class FeedLikeDaoHibernate extends GenericDaoHibernate<FeedLike, Long> implements FeedLikeDao {

	public FeedLikeDaoHibernate() {
		super(FeedLike.class);
	}
	
}
