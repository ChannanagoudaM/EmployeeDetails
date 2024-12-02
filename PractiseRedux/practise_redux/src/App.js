import "./App.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import CreateForm from "./componenets/form";
import RegisterForm from "./componenets/Register";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<CreateForm />} />
        <Route path="/register" element={<RegisterForm />} />
      </Routes>
    </Router>
  );
}

export default App;
