  import React from "react";
  import ProjectSection from "../components/ProjectSection";
  import ClientSection from "../components/ClientSection";
  import ContactForm from "../components/ContactForm";
  import NewsletterForm from "../components/NewsLetterForm"

  export default function LandingPage() {
    return (
      <div>
        <h1>Welcome to Flipr</h1>
        <ProjectSection />
        <ClientSection />
        <ContactForm />
        <NewsletterForm />
      </div>
    );
  }
