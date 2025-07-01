import React, { useEffect, useState } from "react";
import api from "../services/api";

const ProjectSection = () => {
  const [projects, setProjects] = useState([]);

  useEffect(() => {
    const fetchProjects = async () => {
      try {
        const res = await api.get("/projects");
        setProjects(res.data);
      } catch (error) {
        console.error("Error fetching projects:", error);
      }
    };
    fetchProjects();
  }, []);

  return (
    <section>
      <h2>Our Projects</h2>
      {projects.length === 0 ? (
        <p>No projects to display.</p>
      ) : (
        <div className="card-grid">
          {projects.map((project) => (
            <div className="card" key={project.id}>
              <img src={project.imageUrl} alt={project.name} />
              <h3>{project.name}</h3>
              <p>{project.description}</p>
              <button>Read More</button>
            </div>
          ))}
        </div>
      )}
    </section>
  );
};

export default ProjectSection;
