package de.agiledojo.arcdoc

import org.pegdown.PegDownProcessor;

public class MarkDownProcessor {
	
	private PegDownProcessor pgProcessor;

	public MarkDownProcessor(PegDownProcessor pgProcessor) {
		this.pgProcessor = pgProcessor;
	}
	
	public String toHtml(String markDown) {
		return pgProcessor.markdownToHtml(markDown);
	}
}
