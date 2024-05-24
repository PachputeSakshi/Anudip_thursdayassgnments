/*If the employee is not a Indian
The calculator should throw a CountryNotValidException*/

package thursday_assignments;


class CountryNotValidException extends Exception 
{
    public CountryNotValidException(String message)
    {
        super(message);
    }
}


