/**
 */
package dataMapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dataMapper.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link dataMapper.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link dataMapper.Attribute#getOutNode <em>Out Node</em>}</li>
 *   <li>{@link dataMapper.Attribute#getInNode <em>In Node</em>}</li>
 *   <li>{@link dataMapper.Attribute#getFieldParent <em>Field Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see dataMapper.DataMapperPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataMapper.DataMapperPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataMapper.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dataMapper.DataMapperPackage#getAttribute_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dataMapper.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Out Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Node</em>' containment reference.
	 * @see #setOutNode(OutNode)
	 * @see dataMapper.DataMapperPackage#getAttribute_OutNode()
	 * @model containment="true"
	 * @generated
	 */
	OutNode getOutNode();

	/**
	 * Sets the value of the '{@link dataMapper.Attribute#getOutNode <em>Out Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Node</em>' containment reference.
	 * @see #getOutNode()
	 * @generated
	 */
	void setOutNode(OutNode value);

	/**
	 * Returns the value of the '<em><b>In Node</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dataMapper.InNode#getAttributeParent <em>Attribute Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Node</em>' containment reference.
	 * @see #setInNode(InNode)
	 * @see dataMapper.DataMapperPackage#getAttribute_InNode()
	 * @see dataMapper.InNode#getAttributeParent
	 * @model opposite="attributeParent" containment="true"
	 * @generated
	 */
	InNode getInNode();

	/**
	 * Sets the value of the '{@link dataMapper.Attribute#getInNode <em>In Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Node</em>' containment reference.
	 * @see #getInNode()
	 * @generated
	 */
	void setInNode(InNode value);

	/**
	 * Returns the value of the '<em><b>Field Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dataMapper.TreeNode#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Parent</em>' container reference.
	 * @see #setFieldParent(TreeNode)
	 * @see dataMapper.DataMapperPackage#getAttribute_FieldParent()
	 * @see dataMapper.TreeNode#getAttribute
	 * @model opposite="attribute" transient="false"
	 * @generated
	 */
	TreeNode getFieldParent();

	/**
	 * Sets the value of the '{@link dataMapper.Attribute#getFieldParent <em>Field Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Parent</em>' container reference.
	 * @see #getFieldParent()
	 * @generated
	 */
	void setFieldParent(TreeNode value);

} // Attribute
