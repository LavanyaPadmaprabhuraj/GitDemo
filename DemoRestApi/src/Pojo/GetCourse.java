package Pojo;

public class GetCourse {

//Alt+shift+s for getting setter and getter  ->Generate setter and getter ->select all we need then ok
		private String url;
		private String services;
		private String instructor;
		private String expertise;
		private courses courses;
		private String linkedIn;
		
		
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getServices() {
			return services;
		}
		public void setServices(String services) {
			this.services = services;
		}
		public String getInstructor() {
			return instructor;
		}
		public void setInstructor(String instructor) {
			this.instructor = instructor;
		}
		public String getExpertise() {
			return expertise;
		}
		public void setExpertise(String expertise) {
			this.expertise = expertise;
		}
		public Pojo.courses getCourses() {
			return courses;
		}
		public void setCourses(Pojo.courses courses) {
			this.courses = courses;
		}
		public String getLinkedIn() {
			return linkedIn;
		}
		public void setLinkedIn(String linkedIn) {
			this.linkedIn = linkedIn;
		}
		
	}


