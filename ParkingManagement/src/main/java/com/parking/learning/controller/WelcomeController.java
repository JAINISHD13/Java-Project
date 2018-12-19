package com.parking.learning.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.parking.learning.Dao.CustomerDao;
import com.parking.learning.model.Customer;
import com.parking.learning.model.Parking;

@Controller

public class WelcomeController 
{
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	CustomerDao customerDao;

	Customer customer;
	
	Parking parking;
	int x = 6,y=5,z=4,p=3,q=2,r=1;//floor number 
	int i=1,j=1,k=1,l=1,m=1,n=1;
	
	@RequestMapping(value="/floor",method=RequestMethod.GET)
	public ModelAndView floor()
	{
		List<Parking> clist6 = customerDao.findparkingByFid(x);
		List<Parking> clist5 = customerDao.findparkingByFid(y);
		List<Parking> clist4 = customerDao.findparkingByFid(z);
		List<Parking> clist3 = customerDao.findparkingByFid(p);
		List<Parking> clist2 = customerDao.findparkingByFid(q);
		List<Parking> clist1 = customerDao.findparkingByFid(r);
		List<List<Parking>> clist = new ArrayList<List<Parking>>();
		clist.add(clist1);
		clist.add(clist2);
		clist.add(clist3);
		clist.add(clist4);
		clist.add(clist5);
		clist.add(clist6);
		ModelAndView andView = new ModelAndView("floor", "clist", clist);
		andView.addObject("parking", parking);
		
		return andView;
	}
	
	@RequestMapping(value="/design",method=RequestMethod.GET)
	public ModelAndView design()
	{
		ModelAndView andView = new ModelAndView("design");
		return andView;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView andView = new ModelAndView("index");
		return andView;
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView registration() {
		ModelAndView andView = new ModelAndView("registration", "customer", new Customer());

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i = 1; i <= 24; i++) {
			map.put(i, i);
		}
		andView.addObject("tid", map);
		return andView;
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String insert(@ModelAttribute Customer customer) {
		System.out.println("car no :" + customer.getCarno());
	
		if(customer.getParking().getT_id()>20 && customer.getParking().getT_id()<=24)
		{
			List<Parking> list = customerDao.findparkingByFid(x);			
			if(list.size()==0)
			{
				sizeZero(customer,x);
				return "redirect:/ViewCustomer.html";
			}
			else if(list.size()==10)
			{
				x--;
				if(x==0)
				{
					System.out.println("Building is full");
				}
				else
				{
					list = new ArrayList<Parking>();
					list = customerDao.findparkingByFid(x);
					callAddUser(customer,list,1,x);
					return "redirect:/ViewCustomer.html";
				}
				
			}
			else
			{
				i=1;
				callAddUser(customer, list, i, x);
				return "redirect:/ViewCustomer.html";
			}
			
			
		}
		else if(customer.getParking().getT_id()>16 && customer.getParking().getT_id()<=20)
		{
			List<Parking> list = customerDao.findparkingByFid(y);
			
			if(list.size()==0)
			{
				sizeZero(customer,y);
				return "redirect:/ViewCustomer.html";
			}
			else if(list.size()==10)
			{
				y--;
				if(y==0)
				{
					System.out.println("Building is full");
				}
				else
				{
					list = new ArrayList<Parking>();
					list = customerDao.findparkingByFid(y);
					callAddUser(customer,list,1,y);
					return "redirect:/ViewCustomer.html";
				}
				
			}else
			{
				j=1;
				callAddUser(customer, list, j, y);
				return "redirect:/ViewCustomer.html";
			}	
			
		}	
		else if(customer.getParking().getT_id()>12 && customer.getParking().getT_id()<=16)
		{
			List<Parking> list = customerDao.findparkingByFid(z);
			
			if(list.size()==0)
			{
				sizeZero(customer,z);
				return "redirect:/ViewCustomer.html";
			}
			else if(list.size()==10)
			{
				z--;
				if(z==0)
				{
					System.out.println("Building is full");
				}
				else
				{
					list = new ArrayList<Parking>();
					list = customerDao.findparkingByFid(z);
					callAddUser(customer,list,1,z);
					return "redirect:/ViewCustomer.html";
				}
				
			}
			else
			{
				k=1;
				callAddUser(customer, list, k, z);
				return "redirect:/ViewCustomer.html";
			}
			
			
		}else if(customer.getParking().getT_id()>8 && customer.getParking().getT_id()<=12)
		{
			List<Parking> list = customerDao.findparkingByFid(p);
			
			if(list.size()==0)
			{
				sizeZero(customer,p);
				return "redirect:/ViewCustomer.html";
			}
			else if(list.size()==10)
			{
				p--;
				if(p==0)
				{
					System.out.println("Building is full");
				}
				else
				{
					list = new ArrayList<Parking>();
					list = customerDao.findparkingByFid(p);
					callAddUser(customer,list,1,p);
					return "redirect:/ViewCustomer.html";
				}
				
			}
			else
			{
				l=1;
				callAddUser(customer, list, l, z);
				return "redirect:/ViewCustomer.html";
			}
			
			
		}else if(customer.getParking().getT_id()>4 && customer.getParking().getT_id()<=8)
		{
			List<Parking> list = customerDao.findparkingByFid(q);
			
			if(list.size()==0)
			{
				sizeZero(customer,q);
				return "redirect:/ViewCustomer.html";
			}
			else if(list.size()==10)
			{
				q--;
				if(q==0)
				{
					System.out.println("Building is full");
				}
				else
				{
					list = new ArrayList<Parking>();
					list = customerDao.findparkingByFid(q);
					callAddUser(customer,list,1,q);
					return "redirect:/ViewCustomer.html";
				}
				
			}
			else
			{
				m=1;
				callAddUser(customer, list, m, q);
				return "redirect:/ViewCustomer.html";
			}
			
			
		}else if(customer.getParking().getT_id()>0 && customer.getParking().getT_id()<=4)
		{
			List<Parking> list = customerDao.findparkingByFid(r);
			
			if(list.size()==0)
			{
				sizeZero(customer,r);
				return "redirect:/ViewCustomer.html";
			}
			else if(list.size()==10)
			{
				r--;
				if(r==0)
				{
					System.out.println("Building is full");
				}
				else
				{
					list = new ArrayList<Parking>();
					list = customerDao.findparkingByFid(r);
					callAddUser(customer,list,1,r);
					return "redirect:/ViewCustomer.html";
				}
				
			}
			else
			{
				n=1;
				callAddUser(customer, list, n, r);
				return "redirect:/ViewCustomer.html";
			}
			
			
		}


		return "redirect:/ViewCustomer.html";
	}

	private String callAddUser(Customer customer, List<Parking> list, int i, int A)
	{
		if(list.size()==0)
		{
			sizeZero(customer, A);
		}
		else if(list.size()==10)
		{
			A--;
			if (A == 0)
				System.out.println("erororroro");
			else {
				list = customerDao.findparkingByFid(A);
				callAddUser(customer, list, 1, A);
				return "redirect:/ViewCustomer.html";
			}
		}
		else
		{
			for(Parking p:list)
			{
				if(p.getOccupied()==true)
				{
					if(p.getP_id()!=i)
					{
						customer.getParking().setF_id(A);
						customer.getParking().setP_id(i);
						customer.getParking().setOccupied(true);
						customerDao.insert(customer);
						return "redirect:/ViewCustomer.html";
					}
					i++;
				}
			}
			
			customer.getParking().setF_id(A);
			customer.getParking().setP_id(i);
			customer.getParking().setOccupied(true);
			customerDao.insert(customer);
			return "redirect:/ViewCustomer.html";
		}
		
		return "redirect:/ViewCustomer.html";
	}

	private void sizeZero(Customer customer, int A)
	{
		customer.getParking().setF_id(A);
		customer.getParking().setP_id(1);
		customer.getParking().setOccupied(true);
		customerDao.insert(customer);
	}
	
	

	@RequestMapping(value = { "/ViewCustomer" }, method = RequestMethod.GET)
	public ModelAndView manageUser() throws SQLException {
		List<Customer> clist = customerDao.getAllCustomer();
		ModelAndView andView = new ModelAndView("viewCustomer", "clist", clist);
		andView.addObject("customer", customer);
		return andView;
	}
	
	@RequestMapping(value = { "/deleteClient" }, method = RequestMethod.GET)
	public String delete(@RequestParam("id") int id) throws SQLException {
		customerDao.delete(id);
		return "redirect:/ViewCustomer.html";
	}
}
