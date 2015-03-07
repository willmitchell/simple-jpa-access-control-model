package model.domain;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity@javax.persistence.Table(name = "GROUPTABLE")
public class Group
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.ManyToOne
	protected User user;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "group")
	protected Set<Role> role;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	protected Long id;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Group(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetUser(User myUser) {
		if (this.user != myUser) {
			if (myUser != null){
				if (this.user != myUser) {
					User olduser = this.user;
					this.user = myUser;
					if (olduser != null)
						olduser.removeGroups(this);
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public User getUser() {
		return this.user;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Role> getRole() {
		if(this.role == null) {
				this.role = new HashSet<Role>();
		}
		return (Set<Role>) this.role;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllRole(Set<Role> newRole) {
		if (this.role == null) {
			this.role = new HashSet<Role>();
		}
		for (Role tmp : newRole)
			tmp.setGroup(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllRole(Set<Role> newRole) {
		if(this.role == null) {
			return;
		}
		
		this.role.removeAll(newRole);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setUser(User myUser) {
		this.basicSetUser(myUser);
		myUser.addGroups(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addRole(Role newRole) {
		if(this.role == null) {
			this.role = new HashSet<Role>();
		}
		
		if (this.role.add(newRole))
			newRole.basicSetGroup(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setId(long myId) {
		this.id = myId;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetUser() {
		if (this.user == null)
			return;
		User olduser = this.user;
		this.user = null;
		olduser.removeGroups(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeRole(Role oldRole) {
		if(this.role == null)
			return;
		
		if (this.role.remove(oldRole))
			oldRole.unsetGroup();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetId() {
		this.id = 0L;	
	}
	
}

