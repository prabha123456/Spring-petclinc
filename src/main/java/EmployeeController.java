h
	@Controller
	public class EmployeeController {
	     
	    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	     
	    //Map to store employees, ideally we should use database
	    Map<Integer, Employee> empData = new HashMap<Integer, Employee>();
	     
	    @RequestMapping(value = EmpRestURIConstants.DUMMY_EMP, method = RequestMethod.GET)
	    public @ResponseBody Employee getDummyEmployee() {
	        logger.info("Start getDummyEmployee");
	        Employee emp = new Employee();
	        emp.setId(9999);
	        emp.setName("Dummy");
	        emp.setCreatedDate(new Date());
	        empData.put(9999, emp);
	        return emp;
	    }
}
