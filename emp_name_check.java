/*If the employee name is null or empty
The calculator should throw a EmployeeNameInvalidException*/

package thursday_assignments;


class EmployeeNameInvalidException extends Exception 
{
    public EmployeeNameInvalidException(String message)
    {
        super(message);
    }
}
