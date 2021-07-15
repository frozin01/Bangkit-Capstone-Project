FROM python:3

ENV PYTHONUNBUFFERED True

ENV APP_HOME /app
WORKDIR $APP_HOME
COPY . ./

RUN pip install -r requirement.txt
RUN pip install gunicorn

CMD exec gunicorn --bind :$PORT --workers 1 --threads 3 --timeout 0 main:app