<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
</head>
<body>
  <h1>🔐 Springboot-Security</h1>
  <p>A sample Spring Boot project with basic security: user authentication, password encoding, role-based access, and JWT support.</p>

  <h2>⚙️ Features</h2>
  <ul>
    <li>In-memory user store (e.g. `user`, `admin`)</li>
    <li>Password encoding with BCrypt</li>
    <li>Role-based endpoint authorization</li>
    <li>JWT token generation and validation</li>
  </ul>

  <h2>🛠️ Technologies Used</h2>
  <ul>
    <li>Spring Boot</li>
    <li>Spring Security</li>
    <li>JWT (`io.jsonwebtoken`)</li>
    <li>Java 17+</li>
  </ul>

  <h2>📂 Project Structure</h2>
  <pre><code>
src/
├─ main/
|  ├─ java/com/anuj/security/
|  |    ├─ config/         # Security config, CORS, filters
|  |    ├─ controllers/    # REST controllers (auth endpoints)
|  |    ├─ models/         # Entities/DTOs (User, AuthRequest, AuthResponse)
|  |    ├─ repository/     # (optional) user repository
|  |    ├─ security/       # JWT utils, filters, services
|  |    └─ Application.java # main Spring Boot class
|  └─ resources/
|       ├─ application.yml # config (server port, auth settings)
|       └─ public/         # static assets
└─ test/                   # unit/integration tests
  </code></pre>

  <h2>🚀 Running the Project</h2>
  <ol>
    <li>Clone the repo:<br><code>git clone https://github.com/Anujmaurya6/Springboot-security.git</code></li>
    <li>Switch to project folder:<br><code>cd Springboot-security</code></li>
    <li>Build:<br><code>./mvnw clean package</code></li>
    <li>Run:<br><code>./mvnw spring-boot:run</code></li>
  </ol>

  <h2>🔍 Usage</h2>
  <p>Use Postman or cURL to interact:</p>
  <h3>1. Authenticate</h3>
  <pre><code>POST /auth/login
Content-Type: application/json

{
  "username": "user",
  "password": "password"
}
</code></pre>
  <p>Receive JSON containing a JWT token:</p>
  <pre><code>{
  "token": "eyJhbGciOiJIUzI1NiIsIn..."
}</code></pre>

  <h3>2. Call Secure Endpoint</h3>
  <pre><code>GET /api/user/profile
Authorization: Bearer eyJhbGciOiJIUzI1NiIsIn...
</code></pre>

  <h2>🧩 Configuration</h2>
  <p>Tune settings in <code>src/main/resources/application.yml</code>:</p>
  <ul>
    <li><code>server.port</code>: HTTP port (default 8080)</li>
    <li><code>jwt.secret</code>: secret key for JWTs</li>
    <li><code>jwt.expirationMs</code>: token expiry in milliseconds</li>
    <li>User credentials and roles for in-memory auth</li>
  </ul>

  <h2>👨‍💻 Extending / Customizing</h2>
  <ul>
    <li>Switch from in-memory to database-backed users (JPA + `UserDetailsService`)</li>
    <li>Add refresh token flow</li>
    <li>Implement logout / token blacklisting</li>
    <li>Deploy to Docker or cloud environments</li>
  </ul>

  <h2>🎓 Pre-requisites</h2>
  <ul>
    <li>Java JDK 17+</li>
    <li>Maven</li>
    <li>Postman or similar REST client</li>
  </ul>

  <h2>📝 License</h2>
  <p>Distributed under MIT License. See <code>LICENSE</code> file.</p>

  <hr>
  <p>Created and maintained by <strong>Anuj Maurya</strong>. Contact: <a href="mailto:maurya.anuj.0612@gmail.com">maurya.anuj.0612@gmail.com</a></p>

# 1. Clone the repository
git clone https://github.com/Anujmaurya6/Springboot-security.git

# 2. Navigate into the project
cd Springboot-security

# 3. Build the project
./mvnw clean install

# 4. Run the application
./mvnw spring-boot:run

</body>
</html>
