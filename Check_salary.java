/*If  empSal is greater than one lakh and isIndian true
taxAmount =empSal *8/100
Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
taxAmount =empSal *6/100
Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
taxAmount =empSal *5/100
Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
taxAmount =empSal *4/100
Otherwise
The calculator should throw a TaxNotEligibleException.*/

package thursday_assignments;


class TaxNotEligibleException extends Exception 
{
    public TaxNotEligibleException(String message)
    {
        super(message);
    }
}
