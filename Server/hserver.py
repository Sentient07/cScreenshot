from time import strftime
import tornado.ioloop
import tornado.web
import random, os, sys, datetime
import uuid, shutil


class MainHandler(tornado.web.RequestHandler):


	URL = ""

	def post(self):

		image_buffer = memoryview(self.request.body)

		try:
			print("entering One")
			file_url = self.generate_url(image_buffer.tobytes())
			#self.write(file_url + "\n")
			self.write(file_url)

		except Exception as e:
			print str(e)
			

	def generate_url(self, image_buffer):

		baseURL = "http://127.0.0.1:8888/"
		file_name = ""
		file_dir = ""

		try :
			#Need to add somemore code here {..}
			file_dir = "static/images/" \
			+str(datetime.datetime.now().date())
			os.mkdir(file_dir, 777)

		except OSError:
			pass
		
		print("hello There")
		file_name = file_dir + str(uuid.uuid4()) +".jpg"

		try :

			print("hello again")
			_file = open(file_name, 'wb')
			_file.write(image_buffer)
			_file.close()
			self.URL = baseURL+file_name
			print("hello")
			return  baseURL+file_name

		except IOError or FileNotFoundError:
			print("IOError")


if __name__ == "__main__":
 
	settings = {
	'debug': True,
	'autoreload': True,
	'static_path': '/home/ramana/projects/Server/static'
	}

	application = tornado.web.Application([\
				(r"/", MainHandler),
                (r"([\w\d-]+/.jpg)",tornado.web.StaticFileHandler,\
                {"path":"images/"}),],\
                **settings)
	application.listen(8888)
	tornado.ioloop.IOLoop.instance().start()