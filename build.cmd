rd/s/q  "backend/src/main/resources/static"
rd/s/q "frontend/dist"
cd frontend 
npm install&&npm run build &&move dist ../backend/src/main/resources/static && cd ../backend &&mvn clean package&&cd .. &&docker build -t waterknife/exam . 