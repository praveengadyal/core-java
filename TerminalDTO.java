class TerminalDTO{

public TerminalDTO(){System.out.println("inside TerimanalDTO const........");}

private int id;
private String terminalName;
private int noOfTerminal;
private String type;


public int getId(){return id;}

public void setId(int id){this.id=id;}

public String getTerminalName(){return terminalName;}

public void setTerminalName(String terminalName){this.terminalName=terminalName;}

public String getType(){return type;}

public void setType(String type){this.type=type;}

public int getNoOfTerminal(){return noOfTerminal;}

public void setNoOfTerminal(int noOfTerminal){this.noOfTerminal=noOfTerminal;}

@Override
public String toString(){
return "[TerminalDTO : id="+this.id+",terminalName="+this.terminalName+",noOfTerminal="+this.noOfTerminal+",type="+this.type+"]";
}

}