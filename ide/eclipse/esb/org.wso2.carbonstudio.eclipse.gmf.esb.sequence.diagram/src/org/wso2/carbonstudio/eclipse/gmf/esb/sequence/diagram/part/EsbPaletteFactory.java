package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part;

import java.util.Collections;
import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class EsbPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createMediators2Group());
		paletteRoot.add(createLinks3Group());
		paletteRoot.add(createHelpers4Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createEsbServer1CreationTool());
		paletteContainer.add(createSequence2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Mediators" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createMediators2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Mediators2Group_title);
		paletteContainer.setId("createMediators2Group"); //$NON-NLS-1$

		paletteContainer.add(createLogMediator3CreationTool());
		paletteContainer.add(createDropMediator1CreationTool());
		paletteContainer.add(createPropertyMediator4CreationTool());
		paletteContainer.add(createEnrichMediator5CreationTool());
		paletteContainer.add(createEventMediator8CreationTool());
		paletteContainer.add(createSendMediator19CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createFilterMediator2CreationTool());
		paletteContainer.add(createSwitchMediator7CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createXSLTMediator6CreationTool());
		paletteContainer.add(createXQueryMediator14CreationTool());
		paletteContainer.add(createFaultMediator13CreationTool());
		paletteContainer.add(createHeaderMediator20CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createDBLookupMediator16CreationTool());
		paletteContainer.add(createDBReportMediator17CreationTool());
		paletteContainer.add(createEntitlementMediator9CreationTool());
		paletteContainer.add(createCloneMediator21CreationTool());
		paletteContainer.add(createIterateMediator23CreationTool());
		paletteContainer.add(createCacheMediator22CreationTool());
		paletteContainer.add(createAggregateMediator24CreationTool());
		paletteContainer.add(createCalloutMediator25CreationTool());
		paletteContainer.add(createTransactionMediator26CreationTool());
		paletteContainer.add(createThrottleMediator27CreationTool());
		paletteContainer.add(createRMSequenceMediator28CreationTool());
		paletteContainer.add(createOAuthMediator30CreationTool());
		paletteContainer.add(createRuleMediator29CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createClassMediator10CreationTool());
		paletteContainer.add(createSpringMediator11CreationTool());
		paletteContainer.add(createScriptMediator12CreationTool());
		paletteContainer.add(createSmooksMediator18CreationTool());
		paletteContainer.add(createCommandMediator15CreationTool());

		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Links3Group_title);
		paletteContainer.setId("createLinks3Group"); //$NON-NLS-1$
		paletteContainer.add(createEsbLink1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Helpers" palette tool group
	 * @generated
	 */
	private PaletteContainer createHelpers4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Helpers4Group_title);
		paletteContainer.setId("createHelpers4Group"); //$NON-NLS-1$
		paletteContainer.add(createMergeNode1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEsbServer1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EsbServer1CreationTool_title,
				Messages.EsbServer1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EsbSequence_2501));
		entry.setId("createEsbServer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EsbSequence_2501));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequence2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Sequence2CreationTool_title,
				Messages.Sequence2CreationTool_desc, null, null) {
		};
		entry.setId("createSequence2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDropMediator1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DropMediator1CreationTool_title,
				Messages.DropMediator1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.DropMediator_3519));
		entry.setId("createDropMediator1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DropMediator_3519));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilterMediator2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FilterMediator2CreationTool_title,
				Messages.FilterMediator2CreationTool_desc,
				Collections.singletonList(EsbElementTypes.FilterMediator_3524));
		entry.setId("createFilterMediator2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.FilterMediator_3524));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogMediator3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogMediator3CreationTool_title,
				Messages.LogMediator3CreationTool_desc,
				Collections.singletonList(EsbElementTypes.LogMediator_3501));
		entry.setId("createLogMediator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.LogMediator_3501));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPropertyMediator4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PropertyMediator4CreationTool_title,
				Messages.PropertyMediator4CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.PropertyMediator_3512));
		entry.setId("createPropertyMediator4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.PropertyMediator_3512));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnrichMediator5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnrichMediator5CreationTool_title,
				Messages.EnrichMediator5CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EnrichMediator_3521));
		entry.setId("createEnrichMediator5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EnrichMediator_3521));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXSLTMediator6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XSLTMediator6CreationTool_title,
				Messages.XSLTMediator6CreationTool_desc,
				Collections.singletonList(EsbElementTypes.XSLTMediator_3528));
		entry.setId("createXSLTMediator6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.XSLTMediator_3528));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitchMediator7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SwitchMediator7CreationTool_title,
				Messages.SwitchMediator7CreationTool_desc,
				Collections.singletonList(EsbElementTypes.SwitchMediator_3537));
		entry.setId("createSwitchMediator7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SwitchMediator_3537));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventMediator8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EventMediator8CreationTool_title,
				Messages.EventMediator8CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EventMediator_3531));
		entry.setId("createEventMediator8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EventMediator_3531));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntitlementMediator9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntitlementMediator9CreationTool_title,
				Messages.EntitlementMediator9CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.EntitlementMediator_3534));
		entry.setId("createEntitlementMediator9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EntitlementMediator_3534));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassMediator10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ClassMediator10CreationTool_title,
				Messages.ClassMediator10CreationTool_desc,
				Collections.singletonList(EsbElementTypes.ClassMediator_3541));
		entry.setId("createClassMediator10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ClassMediator_3541));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpringMediator11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SpringMediator11CreationTool_title,
				Messages.SpringMediator11CreationTool_desc,
				Collections.singletonList(EsbElementTypes.SpringMediator_3544));
		entry.setId("createSpringMediator11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SpringMediator_3544));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScriptMediator12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ScriptMediator12CreationTool_title,
				Messages.ScriptMediator12CreationTool_desc,
				Collections.singletonList(EsbElementTypes.ScriptMediator_3547));
		entry.setId("createScriptMediator12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ScriptMediator_3547));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFaultMediator13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FaultMediator13CreationTool_title,
				Messages.FaultMediator13CreationTool_desc,
				Collections.singletonList(EsbElementTypes.FaultMediator_3550));
		entry.setId("createFaultMediator13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.FaultMediator_3550));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXQueryMediator14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XQueryMediator14CreationTool_title,
				Messages.XQueryMediator14CreationTool_desc,
				Collections.singletonList(EsbElementTypes.XQueryMediator_3553));
		entry.setId("createXQueryMediator14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.XQueryMediator_3553));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCommandMediator15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CommandMediator15CreationTool_title,
				Messages.CommandMediator15CreationTool_desc,
				Collections.singletonList(EsbElementTypes.CommandMediator_3556));
		entry.setId("createCommandMediator15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CommandMediator_3556));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDBLookupMediator16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DBLookupMediator16CreationTool_title,
				Messages.DBLookupMediator16CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.DBLookupMediator_3559));
		entry.setId("createDBLookupMediator16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DBLookupMediator_3559));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDBReportMediator17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DBReportMediator17CreationTool_title,
				Messages.DBReportMediator17CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.DBReportMediator_3562));
		entry.setId("createDBReportMediator17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DBReportMediator_3562));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSmooksMediator18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SmooksMediator18CreationTool_title,
				Messages.SmooksMediator18CreationTool_desc,
				Collections.singletonList(EsbElementTypes.SmooksMediator_3565));
		entry.setId("createSmooksMediator18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SmooksMediator_3565));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSendMediator19CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SendMediator19CreationTool_title,
				Messages.SendMediator19CreationTool_desc,
				Collections.singletonList(EsbElementTypes.SendMediator_3568));
		entry.setId("createSendMediator19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SendMediator_3568));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeaderMediator20CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HeaderMediator20CreationTool_title,
				Messages.HeaderMediator20CreationTool_desc,
				Collections.singletonList(EsbElementTypes.HeaderMediator_3571));
		entry.setId("createHeaderMediator20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.HeaderMediator_3571));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloneMediator21CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CloneMediator21CreationTool_title,
				Messages.CloneMediator21CreationTool_desc,
				Collections.singletonList(EsbElementTypes.CloneMediator_3574));
		entry.setId("createCloneMediator21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CloneMediator_3574));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCacheMediator22CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CacheMediator22CreationTool_title,
				Messages.CacheMediator22CreationTool_desc,
				Collections.singletonList(EsbElementTypes.CacheMediator_3577));
		entry.setId("createCacheMediator22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CacheMediator_3577));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIterateMediator23CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IterateMediator23CreationTool_title,
				Messages.IterateMediator23CreationTool_desc,
				Collections.singletonList(EsbElementTypes.IterateMediator_3580));
		entry.setId("createIterateMediator23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.IterateMediator_3580));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregateMediator24CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AggregateMediator24CreationTool_title,
				Messages.AggregateMediator24CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.AggregateMediator_3583));
		entry.setId("createAggregateMediator24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.AggregateMediator_3583));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCalloutMediator25CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CalloutMediator25CreationTool_title,
				Messages.CalloutMediator25CreationTool_desc,
				Collections.singletonList(EsbElementTypes.CalloutMediator_3586));
		entry.setId("createCalloutMediator25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CalloutMediator_3586));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransactionMediator26CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TransactionMediator26CreationTool_title,
				Messages.TransactionMediator26CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.TransactionMediator_3589));
		entry.setId("createTransactionMediator26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.TransactionMediator_3589));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThrottleMediator27CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ThrottleMediator27CreationTool_title,
				Messages.ThrottleMediator27CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.ThrottleMediator_3592));
		entry.setId("createThrottleMediator27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ThrottleMediator_3592));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRMSequenceMediator28CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RMSequenceMediator28CreationTool_title,
				Messages.RMSequenceMediator28CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.RMSequenceMediator_3595));
		entry.setId("createRMSequenceMediator28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.RMSequenceMediator_3595));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuleMediator29CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RuleMediator29CreationTool_title,
				Messages.RuleMediator29CreationTool_desc,
				Collections.singletonList(EsbElementTypes.RuleMediator_3598));
		entry.setId("createRuleMediator29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.RuleMediator_3598));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOAuthMediator30CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OAuthMediator30CreationTool_title,
				Messages.OAuthMediator30CreationTool_desc,
				Collections.singletonList(EsbElementTypes.OAuthMediator_3601));
		entry.setId("createOAuthMediator30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.OAuthMediator_3601));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEsbLink1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EsbLink1CreationTool_title,
				Messages.EsbLink1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EsbLink_4001));
		entry.setId("createEsbLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EsbLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMergeNode1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.MergeNode1CreationTool_title,
				Messages.MergeNode1CreationTool_desc, null, null) {
		};
		entry.setId("createMergeNode1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
