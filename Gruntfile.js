module.exports = function(grunt) {
  // Toda la definición y configuración de tareas va aquí
	
grunt.initConfig({
  tarea1: {
    // configuración de "tarea1"
  },
  cssmin: {
    grayscale: {
        files: [{
          expand: true,
          cwd: './bower_components/grayscale/css',
          src: ['*.css'],
          dest: './bower_components/grayscale/css',
          ext: '.min.css'
        }]
    }
  }, 
  sync: {
    //Sync CSS
        bootstrapCss: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/bootstrap/dist/css',
                src: [                
                    'bootstrap.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },
        fontAwesomeCss: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/font-awesome/css',
                src: [
                    'font-awesome.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        }, 
        nprogressCss: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/nprogress',
                src: [
                    'nprogress.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },
        skinsFlatGreenCss: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/iCheck/skins/flat',
                src: [
                    'green.css',
                    'green.png'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },
        googleCodePrettifyCss: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/google-code-prettify/src',
                src: [
                    'prettify.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },
        select2Css: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/select2/dist/css',
                src: [
                    'select2.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },
        switcheryCss: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/switchery/dist',
                src: [
                    'switchery.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },        
        starrrCss: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/starrr/dist',
                src: [
                    'starrr.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },
        bootstrapDaterangepickerCss: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/bootstrap-daterangepicker',
                src: [
                    'daterangepicker.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },
        gentelellaCss: {
            files: [{
                cwd: 'bower_components/gentelella/build/css',
                src: [
                    'custom.css'
                    ],
                    dest: './public/css/'
            }],
            pretend: false,
            verbose: true
        },
        //Sync JavaScript

        gentelellaJs: {
            files: [{
                cwd: 'bower_components/gentelella/build/js',
                src: [
                    'custom.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },

        starrrJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/starrr/dist',
                src: [
                    'starrr.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        jqueryAutocompleteJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/devbridge-autocomplete/dist',
                src: [
                    'jquery.autocomplete.min.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        autosizeJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/autosize/dist',
                src: [
                    'autosize.min.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        parsleyJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/parsleyjs/dist',
                src: [
                    'parsley.min.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        select2Js: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/select2/dist/js',
                src: [
                    'select2.full.min.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        switcheryJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/switchery/dist',
                src: [
                    'switchery.min.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        jqueryTagsinputJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/jquery.tagsinput/src',
                src: [
                    'jquery.tagsinput.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        googleCodePrettifyJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/google-code-prettify/src',
                src: [
                    'prettify.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        jqueryHotkeysJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/jquery.hotkeys',
                src: [
                    'jquery.hotkeys.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        bootstrapWysiwygJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/bootstrap-wysiwyg/js',
                src: [
                    'bootstrap-wysiwyg.min.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        bootstrapDaterangepickerJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/bootstrap-daterangepicker',
                src: [
                    'daterangepicker.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        momentJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/moment',
                src: [
                    'moment.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        icheckJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/iCheck',
                src: [
                    'icheck.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        bootstrapProgressbarJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/bootstrap-progressbar',
                src: [
                    'bootstrap-progressbar.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        fastclickJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/fastclick/lib',
                src: [
                    'fastclick.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        jQueryJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/jquery/dist',
                src: [
                    'jquery.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        nprogressJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/nprogress',
                src: [
                    'nprogress.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        bootstrapJs: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/bootstrap/dist/js',
                src: [
                    'bootstrap.js'
                    ],
                    dest: './public/js/'
            }],
            pretend: false,
            verbose: true
        },
        //Sync Fonts
        bootstrapFonts: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/bootstrap/dist/fonts',
                src: [                
                    '*'
                    ],
                    dest: './public/fonts/'
            }],
            pretend: false,
            verbose: true
        }, 
        fontAwesomeFont: {
            files: [{
                cwd: 'bower_components/gentelella/vendors/font-awesome/fonts',
                src: [
                    '*'
                    ],
                    dest: './public/fonts/'
            }],
            pretend: false,
            verbose: true
        }
    }
});

grunt.loadNpmTasks('grunt-contrib-concat');
grunt.loadNpmTasks('grunt-contrib-cssmin');
grunt.loadNpmTasks('grunt-sync');

grunt.registerTask('default', ['sync','cssmin']);
};
