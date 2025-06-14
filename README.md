<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

  <h1>🔐 Springboot-Security</h1>
  <p>A sample Spring Boot project with basic security: user authentication, password encoding, role-based access, and JWT support.</p>

  <h2>⚙️ Features</h2>
  <ul>
    <li>In-memory user store (e.g., <code>user</code>, <code>admin</code>)</li>
    <li>Password encoding with BCrypt</li>
    <li>Role-based endpoint authorization</li>
    <li>JWT token generation and validation</li>
  </ul>

  <h2>🛠️ Technologies Used</h2>
  <ul>
    <li>Spring Boot</li>
    <li>Spring Security</li>
    <li>JWT (<code>io.jsonwebtoken</code>)</li>
    <li>Java 17+</li>
  </ul>

  <h2>📂 Project Structure</h2>
  <pre><code>src/
├─ main/
│  ├─ java/com/anuj/security/
│  │    ├─ config/         # Security config, CORS, filters
│  │    ├─ controllers/    # REST controllers (auth endpoints)
│  │    ├─ models/         # Entities/DTOs (User, AuthRequest, AuthResponse)
│  │    ├─ repository/     # (optional) user repository
│  │    ├─ security/       # JWT utils, filters, services
│  │    └─ Application.java # main Spring Boot class
│  └─ resources/
│       ├─ application.yml # config (server port, auth settings)
│       └─ public/         # static assets
└─ test/                   # unit/integration tests</code></pre>

  <h2>🚀 Running the Project</h2>
  <ol>
    <li>Clone the repo:<br><code>git clone https://github.com/Anujmaurya6/Springboot-security.git</code></li>
    <li>Switch to the project folder:<br><code>cd Springboot-security</code></li>
    <li>Build the project:<br><code>./mvnw clean install</code></li>
    <li>Run the application:<br><code>./mvnw spring-boot:run</code></li>
  </ol>

  <h2>🔍 Usage</h2>
  <p>Use Postman or cURL to interact with the API:</p>

  <h3>1. Authenticate</h3>
  <pre><code>POST /auth/login
Content-Type: application/json

{
  "username": "user",
  "password": "password"
}</code></pre>

  <p>Response:</p>
  <pre><code>{
  "token": "eyJhbGciOiJIUzI1NiIsIn..."
}</code></pre>

  <h3>2. Call Secure Endpoint</h3>
  <pre><code>GET /api/user/profile
Authorization: Bearer eyJhbGciOiJIUzI1NiIsIn...</code></pre>

  <h2>🧩 Configuration</h2>
  <p>Edit <code>src/main/resources/application.yml</code> to customize settings:</p>
  <ul>
    <li><code>server.port</code>: HTTP port (default 8080)</li>
    <li><code>jwt.secret</code>: Secret key for JWTs</li>
    <li><code>jwt.expirationMs</code>: Token expiration in milliseconds</li>
    <li>User credentials and roles for in-memory authentication</li>
  </ul>

  <h2>👨‍💻 Extending / Customizing</h2>
  <ul>
    <li>Switch to database-backed users (JPA + <code>UserDetailsService</code>)</li>
    <li>Add refresh token support</li>
    <li>Implement logout/token blacklisting</li>
    <li>Deploy via Docker or cloud platforms</li>
  </ul>

  <h2>🎓 Pre-requisites</h2>
  <ul>
    <li>Java JDK 17+</li>
    <li>Maven</li>
    <li>Postman or another REST client</li>
  </ul>

  <h2>📝 License</h2>
  <p>Distributed under the MIT License. See the <code>LICENSE</code> file for details.</p>

  <hr>
  <p>Created and maintained by <strong>Anuj Maurya</strong>. Contact: 
    <a href="mailto:maurya.anuj.0612@gmail.com">maurya.anuj.0612@gmail.com</a>
  </p>

</body>
</html>
