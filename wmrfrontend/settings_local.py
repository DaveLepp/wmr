##
## Set these if the WebMapReduce backend is running on a remote server or on
## a port other than the default.
##
WMR_HOST = 'master'
WMR_PORT = 50100


##
## Set this if WebMapReduce is deployed at a sub-url of your website. This will
## guarantee that media files are served properly and will fix some redirects.
##
FORCE_SCRIPT_NAME = '/wmr'


##
## Uncomment this disable open registration.
##
#REGISTRATION_ENABLED = False
##
## Uncomment this to disable the use of timed keys with open registration.
## If REGISTRATION_ENABLED is False, this has no effect.
##
#REQUIRE_REGISTRATION_KEY = False


##
## It would be a good idea to set this to your own long, random string.
##
#SECRET_KEY = '9kvvyam(xb2gf+bf^=o&_%vwsm_o6+o-6o^bs+-50-c46f9n@2'


##
## Disable debugging once you have verified that your setup is properly
## configured.
##
#DEBUG = False
#TEMPLATE_DEBUG = False


##
## Optionally override the default list of languages. The strings on the left
## are the language name as it is known to the WebMapReduce backend (in
## languages.conf), and the strings on the right are the human-readable names.
##
WMR_LANGUAGES = [
    ('python3',  'Python 3'),
    ('python2',  'Python 2'),
#    ('scheme-i', 'Scheme (Imperative)'),
#    ('cpp',      'C++'),
    ('java',     'Java'),
#    ('c',	  'C'),
#    ('csharp',	  'C#'),
]

##
## If a particular language will be used most commonly in your setup, set an
## appropriate default here.
##
WMR_DEFAULT_LANGUAGE = 'java'


##
## Uncomment to enable running test jobs. Test jobs should also be enabled on
## the backend for this to work.
##
#WMR_ALLOW_TEST_JOBS = True


##
## These lines enable LDAP-based user authentication in addition to the builtin
## user/group database. You must have the django-auth-ldap package installed.
##
## For information on how to properly configure these settings, see the
## documentation for django-auth-ldap at:
##
##   http://packages.python.org/django-auth-ldap/
##
#AUTHENTICATION_BACKENDS = (
#    'django_auth_ldap.backend.LDAPBackend',
#    'django.contrib.auth.backends.ModelBackend',
#)
#
#AUTH_LDAP_SERVER_URI = "ldap://ldap.example.com"
#
#AUTH_LDAP_BIND_DN = ""
#AUTH_LDAP_BIND_PASSWORD = ""
#
#AUTH_LDAP_USER_DN_TEMPLATE = "uid=%(user)s,ou=users,dc=example,dc=com"
