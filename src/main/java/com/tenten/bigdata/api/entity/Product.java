package com.tenten.bigdata.api.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * NOTE: Such entities will be a direct mapping of Cassandra data.
 * 
 * @author gaurav.bang
 *
 */
@Data
@Slf4j
public class Product implements Serializable {

	private static final long serialVersionUID = -534534051376127021L;

	String product_code;

}
