import ExceptionPackage.ExceptionType1;
import FilterPackage.Filter;
import FilterPackage.FilterFactory;
import OrderPackage.Order;
import OrderPackage.OrderFactory;


/**
 * Created by roi.aharonson on 5/25/17.
 */
public class Section {

    public Filter filterCondition;
    public Order orderCondition;
    public ExceptionType1 error = null;

    public Section(String filterCondition, String orderCondition){
        this.filterCondition = FilterFactory.createFilter(filterCondition);
        this.orderCondition = OrderFactory.createOrder(orderCondition);

    }
    public void add_err(ExceptionType1 err){
        this.error = err;
    }

}
