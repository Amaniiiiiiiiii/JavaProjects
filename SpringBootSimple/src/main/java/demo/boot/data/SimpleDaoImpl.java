package demo.boot.data;

import org.springframework.stereotype.Repository;

@Repository
public class SimpleDaoImpl implements ISimpleDao{

	@Override
	public String disp() {
		return "Data Tier";
	}

}
