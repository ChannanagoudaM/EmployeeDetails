import { useState } from "react";
import styles from "../styles/App.module.css";
import { useNavigate } from "react-router-dom";

const CreateForm = () => {
  const navigate = useNavigate();
  const [FormData, setFormData] = useState({
    name: "",
    password: "",
  });
  const handleOnSubmit = (e) => {
    e.preventDefault();
  };
  const handlechange = (event) => {
    const { name, value } = event.target;
    setFormData({
      ...FormData,
      [name]: value, 
    });
  };

  const handleRegister = () => {
    navigate("/register");
  };

  return (
    <>
      <div className={styles.body}>
        <div className={styles.container}>
          <form action="form" onSubmit={handleOnSubmit}>
            <label htmlFor="name">Username :</label>
            <input
              type="text"
              name="name"
              id=""
              value={FormData.name}
              onChange={handlechange}
            />
            <br />
            <br />
            <label htmlFor="password">Password :</label>
            <input
              type="password"
              name="password"
              id=""
              value={FormData.password}
              onChange={handlechange}
            />
            <br />
            <br />
            <button type="submit">Login</button>
            <button
              type="submit"
              style={{ marginLeft: "100px" }}
              onClick={handleRegister}
            >
              Register
            </button>
          </form>
        </div>
      </div>
    </>
  );
};

export default CreateForm;
