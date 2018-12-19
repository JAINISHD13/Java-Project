package com.parking.learning.Dao.Impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.parking.learning.Dao.CustomerDao;
import com.parking.learning.model.Customer;
import com.parking.learning.model.Parking;
import com.parking.learning.util.HibernateUtil;

@Repository("customerDao")
@Transactional
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void insert(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	public List<Customer> getAllCustomer() {
		StringBuffer stringBuffer = new StringBuffer("From " + Customer.class.getName());
		List<Customer> list = sessionFactory.getCurrentSession().createQuery(stringBuffer.toString()).list();
		return list;
	}

	public List<Parking> findparkingByFid(int f_id) {
		StringBuffer stringBuffer = new StringBuffer("From " + Parking.class.getName() + " where f_id=:f_id");
		List<Parking> list = sessionFactory.getCurrentSession().createQuery(stringBuffer.toString()).setParameter("f_id", f_id).list();
		return list;
	}

	public void delete(int id) {
		Customer info = this.findCUstomerById(id);
		sessionFactory.getCurrentSession().delete(info);
	}

	public Customer findCUstomerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Customer.class);
		crit.add(Restrictions.eq("id", id));
		return (Customer) crit.uniqueResult();
	}
	
	
	
}
