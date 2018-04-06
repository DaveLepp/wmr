from django.conf.urls import *
from django.views.generic.base import RedirectView
from django.conf import settings
from os import path
from wmr import views

# Uncomment the next two lines to enable the admin:
from django.contrib import admin
admin.autodiscover()

# Get admin path (based on path module is loaded from)
ADMIN_MEDIA_ROOT = path.normpath(path.join(path.dirname(admin.__file__), 'media'))

urlpatterns = [

    url(r'^$', RedirectView.as_view(url='jobs/new')),
    
    # WMR
    url(r'^datasets/$', views.dataset_list, name='dataset_list'),
    url(r'^datasets/new/$', views.dataset_new, name='dataset_new'),
    url(r'^datasets/(?P<dataset_id>\d+)/delete/$', views.dataset_delete, name='dataset_delete'),
    url(r'^jobs/$', views.job_list, name='job_list'),
    url(r'^jobs/new/$', views.job_new, name='job_new'),
    url(r'^jobs/(?P<job_id>\d+)/kill/$', views.job_kill, name='job_kill'),
    url(r'^jobs/(?P<job_id>\d+)/$', views.job_view, name='job_view'),
    url(r'^configs/$', views.configs, name='configs'),

    # Admin
    url(r'^admin/', admin.site.urls),
    url('^', include('django.contrib.auth.urls'))
       
    # Media
    #url(r'^media/admin/(?P<path>.*)', 'django.views.static.serve',
    #    {'document_root': ADMIN_MEDIA_ROOT}),
    #url(r'^media/(?P<path>.*)$', 'django.views.static.serve',
    #    {'document_root': settings.MEDIA_ROOT}),

#Password reset requires an email server to be setup, which I think is a reasonable thing, but am not setting up for this realease.
#urlpatterns += patterns('',
#    (r'^accounts/resetpassword/$', 'django.contrib.auth.views.password_reset'),
#    (r'^accounts/passwordreset/$', 'django.contrib.auth.views.password_reset_done'),
#    (r'^accounts/confirmpassword/(?P<uidb36>\w+)/(?P<token>.*)/$', 'django.contrib.auth.views.password_reset_confirm'),
#    (r'^accounts/passwordconfirmed/$', 'django.contrib.auth.views.password_reset_complete'),
#)

#if getattr(settings, 'REGISTRATION_ENABLED', False):
    # Registration
    #urlpatterns += patterns('registration.views',
     #   (r'^accounts/register/$', 'create_account'),
      #  (r'^accounts/register/thanks/$', 'create_account_done'),
    #)
]
