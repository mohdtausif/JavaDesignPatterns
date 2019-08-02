package mohdtausif.demo.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> personList) {
		List<Person> filteredPersonList=new ArrayList<Person>();
		for (Person person : personList)
		{
			if(person.getSex().equalsIgnoreCase("male"))
			{
				filteredPersonList.add(person);	
			}
		}
		return filteredPersonList;
	}

}
