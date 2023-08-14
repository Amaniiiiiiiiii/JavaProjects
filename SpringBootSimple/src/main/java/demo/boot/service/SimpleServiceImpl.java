package demo.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.boot.data.ISimpleDao;

@Service
public class SimpleServiceImpl  implements ISimpleService{
	@Autowired
	ISimpleDao simpleDao;
	
	@Override
	public String disp() {
		// TODO Auto-generated method stub
		return "Business Tier" + simpleDao.disp();
	}

}
