import { useState } from "react";
import styles from "../styles/App.module.css";

const RegisterForm = () => {
  const [registerForm, setRegisterForm] = useState({
    firstName: "",
    lastName: "",
    email: "",
    password: "",
    confirmpassword: "",
  });
  const handleChange = (event) => {
    const { name, value } = event.target;
    setRegisterForm({
      ...registerForm,
      [name]: value,
    });
  };
  const handleOnSubmit = (event) => {
    event.preventDefault();

    fetch("http://localhost:8090/employees/api/addEmployees", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(registerForm),
    })
      .then((response) => response.json())
      .then((data) => console.log(data))
      .catch((error) => console.log(error));

    setRegisterForm({
      firstName: "",
      lastName: "",
      email: "",
      password: "",
      confirmpassword: "",
    });
  };

  return (
    <>
      <div className={styles.body}>
        <div className={styles.rcontainer}>
          <form action="register" onSubmit={handleOnSubmit}>
            <label htmlFor="firstName">Firstname</label>
            <input
              type="text"
              name="firstName"
              id=""
              value={registerForm.firstName}
              onChange={handleChange}
            />
            <br />
            <br />
            <label htmlFor="lastName">Lastname</label>
            <input
              type="text"
              name="lastName"
              id=""
              value={registerForm.lastName}
              onChange={handleChange}
            />
            <br />
            <br />
            <label htmlFor="email">Email</label>
            <input
              type="email"
              name="email"
              id=""
              value={registerForm.email}
              onChange={handleChange}
            />
            <br />
            <br />
            <label htmlFor="password">Password</label>
            <input
              type="password"
              name="password"
              id=""
              value={registerForm.password}
              onChange={handleChange}
            />
            <br />
            <br />
            <label htmlFor="confirmPassword">Confirm Password</label>
            <input
              type="password"
              name="confirmpassword"
              id=""
              value={registerForm.confirmpassword}
              onChange={handleChange}
            />
            <br />
            <br />
            <button type="submit">Submit</button>
          </form>
        </div>
      </div>
    </>
  );
};

export default RegisterForm;
