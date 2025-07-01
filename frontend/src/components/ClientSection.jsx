import React, { useEffect, useState } from "react";
import api from "../services/api";

const ClientSection = () => {
  const [clients, setClients] = useState([]);

  useEffect(() => {
    const fetchClients = async () => {
      try {
        const res = await api.get("/clients");
        setClients(res.data);
      } catch (error) {
        console.error("Error fetching clients:", error);
      }
    };
    fetchClients();
  }, []);

  return (
    <section>
      <h2>Happy Clients</h2>
      {clients.length === 0 ? (
        <p>No clients found.</p>
      ) : (
        <div className="card-grid">
          {clients.map((client) => (
            <div className="card" key={client.id}>
              <img src={client.imageUrl} alt={client.name} />
              <h4>{client.name}</h4>
              <p>
                <i>{client.designation}</i>
              </p>
              <p>{client.description}</p>
            </div>
          ))}
        </div>
      )}
    </section>
  );
};

export default ClientSection;
