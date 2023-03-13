package de.rieckpil.blog.dashboard;

import java.util.Set;

public class QuickNote {

	private String title;
	private String content;
	private Set<String> tags;
	
	
	/** Getter of title
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/** Setter of title
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/** Getter of content
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/** Setter of content
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/** Getter of tags
	 * @return the tags
	 */
	public Set<String> getTags() {
		return tags;
	}
	/** Setter of tags
	 * @param tags the tags to set
	 */
	public void setTags(Set<String> tags) {
		this.tags = tags;
	}
	
	
}
