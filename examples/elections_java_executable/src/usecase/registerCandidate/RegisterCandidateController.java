/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.15.0.1751 modeling language!*/

package usecase.registerCandidate;
import view.registerCandidate.RegisterCandidateView;
import javax.swing.JOptionPane;
import service.CandidateService;
import shared.domain.Candidate;
import usecase.startup.Controller;

public class RegisterCandidateController
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static RegisterCandidateController theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RegisterCandidateController Attributes
  private RegisterCandidateView registerCandidateView;
  private String candidateName;
  private String candidateAddress;
  private String candidateTelephone;
  private boolean candidateFound;

  //RegisterCandidateController State Machines
  enum CandidateRegistrationSteps { Initial, RegisterCandidateViewShown, CheckingCandidateData, CheckingExistingCandidate, AddingCandidate, CandidateAdded, CandidateNotAdded, CandidateExists, CandidateNameEmpty, CandidateAddressEmpty, CandidateTelephoneEmpty, ClosingView }
  private CandidateRegistrationSteps CandidateRegistrationSteps;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private RegisterCandidateController()
  {
    candidateName = null;
    candidateAddress = null;
    candidateTelephone = null;
    candidateFound = false;
    setCandidateRegistrationSteps(CandidateRegistrationSteps.Initial);
  }

  public static RegisterCandidateController getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new RegisterCandidateController();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getCandidateRegistrationStepsFullName()
  {
    String answer = CandidateRegistrationSteps.toString();
    return answer;
  }

  public CandidateRegistrationSteps getCandidateRegistrationSteps()
  {
    return CandidateRegistrationSteps;
  }

  public boolean registerCandidate()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case Initial:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.RegisterCandidateViewShown);
        wasEventProcessed = true;
        break;
    }

    return wasEventProcessed;
  }

  public boolean addButtonClicked()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case RegisterCandidateViewShown:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.CheckingCandidateData);
        wasEventProcessed = true;
        break;
      case CandidateNameEmpty:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.CheckingCandidateData);
        wasEventProcessed = true;
        break;
      case CandidateAddressEmpty:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.CheckingCandidateData);
        wasEventProcessed = true;
        break;
      case CandidateTelephoneEmpty:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.CheckingCandidateData);
        wasEventProcessed = true;
        break;
    }

    return wasEventProcessed;
  }

  public boolean closeView()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case RegisterCandidateViewShown:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.ClosingView);
        wasEventProcessed = true;
        break;
      case CandidateNameEmpty:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.ClosingView);
        wasEventProcessed = true;
        break;
      case CandidateAddressEmpty:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.ClosingView);
        wasEventProcessed = true;
        break;
      case CandidateTelephoneEmpty:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.ClosingView);
        wasEventProcessed = true;
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1278__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CheckingCandidateData:
        if (candidateName.trim().isEmpty())
        {
          setCandidateRegistrationSteps(CandidateRegistrationSteps.CandidateNameEmpty);
          wasEventProcessed = true;
          break;
        }
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1279__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CheckingCandidateData:
        if (candidateAddress.trim().isEmpty())
        {
          setCandidateRegistrationSteps(CandidateRegistrationSteps.CandidateAddressEmpty);
          wasEventProcessed = true;
          break;
        }
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1280__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CheckingCandidateData:
        if (candidateTelephone.trim().isEmpty())
        {
          setCandidateRegistrationSteps(CandidateRegistrationSteps.CandidateTelephoneEmpty);
          wasEventProcessed = true;
          break;
        }
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1281__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CheckingCandidateData:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.CheckingExistingCandidate);
        wasEventProcessed = true;
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1282__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CheckingExistingCandidate:
        if (!candidateFound)
        {
          setCandidateRegistrationSteps(CandidateRegistrationSteps.AddingCandidate);
          wasEventProcessed = true;
          break;
        }
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1283__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CheckingExistingCandidate:
        if (candidateFound)
        {
          setCandidateRegistrationSteps(CandidateRegistrationSteps.CandidateExists);
          wasEventProcessed = true;
          break;
        }
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1284__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case AddingCandidate:
        if (CandidateService.getInstance().getCandidateAdded())
        {
          setCandidateRegistrationSteps(CandidateRegistrationSteps.CandidateAdded);
          wasEventProcessed = true;
          break;
        }
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1285__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case AddingCandidate:
        if (CandidateService.getInstance().getCandidateAdded())
        {
          setCandidateRegistrationSteps(CandidateRegistrationSteps.CandidateNotAdded);
          wasEventProcessed = true;
          break;
        }
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1286__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CandidateAdded:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.Initial);
        wasEventProcessed = true;
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1287__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CandidateNotAdded:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.Initial);
        wasEventProcessed = true;
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1288__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case CandidateExists:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.Initial);
        wasEventProcessed = true;
        break;
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1289__()
  {
    boolean wasEventProcessed = false;
    
    CandidateRegistrationSteps aCandidateRegistrationSteps = CandidateRegistrationSteps;
    switch (aCandidateRegistrationSteps)
    {
      case ClosingView:
        setCandidateRegistrationSteps(CandidateRegistrationSteps.Initial);
        wasEventProcessed = true;
        break;
    }

    return wasEventProcessed;
  }

  private void setCandidateRegistrationSteps(CandidateRegistrationSteps aCandidateRegistrationSteps)
  {
    CandidateRegistrationSteps = aCandidateRegistrationSteps;

    // entry actions and do activities
    switch(CandidateRegistrationSteps)
    {
      case RegisterCandidateViewShown:
        showRegisterCandidateView();
        break;
      case CheckingCandidateData:
        checkCandidateData();
        __autotransition1278__();
        __autotransition1279__();
        __autotransition1280__();
        __autotransition1281__();
        break;
      case CheckingExistingCandidate:
        CandidateService.getInstance().setCandidateNameToSearch(candidateName);
          candidateFound=CandidateService.getInstance().getCandidateFound();
        __autotransition1282__();
        __autotransition1283__();
        break;
      case AddingCandidate:
        tryToAddCandidate();
        __autotransition1284__();
        __autotransition1285__();
        break;
      case CandidateAdded:
        JOptionPane.showMessageDialog(null, "Candidate Added Successfully!", "Success!", JOptionPane.INFORMATION_MESSAGE);
          Controller.getInstance().start();
        __autotransition1286__();
        break;
      case CandidateNotAdded:
        JOptionPane.showMessageDialog(null, "Adding Candidate Failed!", "Error!", JOptionPane.ERROR_MESSAGE); Controller.getInstance().start();
        __autotransition1287__();
        break;
      case CandidateExists:
        JOptionPane.showMessageDialog(null, "Candidate Exists!", "Error!", JOptionPane.ERROR_MESSAGE);
          Controller.getInstance().start();
          registerCandidateView.dispose();
        __autotransition1288__();
        break;
      case CandidateNameEmpty:
        JOptionPane.showMessageDialog(null, "Candidate name cannot be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
        break;
      case CandidateAddressEmpty:
        JOptionPane.showMessageDialog(null, "Candidate address cannot be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
        break;
      case CandidateTelephoneEmpty:
        JOptionPane.showMessageDialog(null, "Candidate telephone cannot be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
        break;
      case ClosingView:
        registerCandidateView.dispose();
        __autotransition1289__();
        break;
    }
  }

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  private void showRegisterCandidateView() {
    registerCandidateView=new RegisterCandidateView();
    registerCandidateView.setVisible(true);
  }
  
  private void checkCandidateData() {
    candidateName=registerCandidateView.getCandidateName();
    candidateAddress=registerCandidateView.getCandidateAddress();
    candidateTelephone=registerCandidateView.getCandidateTelephone();
  }
  
  private void tryToAddCandidate() {
    Candidate candidate=new Candidate(-1, candidateName, candidateAddress, candidateTelephone);
    CandidateService.getInstance().setNewCandidate(candidate);
    registerCandidateView.dispose();
  }
}