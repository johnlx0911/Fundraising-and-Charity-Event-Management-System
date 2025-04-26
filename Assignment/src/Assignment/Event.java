
package Assignment;

class Event {
    private String name;
    private String month;
    private String location;
    private String address;

    public Event(String name, String month, String location, String address) {
        this.name = name;
        this.month = month;
        this.location = location;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getMonth() {
        return month;
    }
    
    public String getLocation(){
        return location;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setEventName(String eventName) {
        this.name = eventName;
    }
    
    public void setEventLocation(String eventLocation){
        this.location = eventLocation;
    }
    
    public void setEventMonth(String eventMonth){
        this.month = eventMonth;
    }
    
    public void setEventAddress(String eventAddress){
        this.address = eventAddress;
    }
}
