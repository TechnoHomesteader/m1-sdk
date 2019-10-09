var Mach1SoundPlayer=function(e){var t={};function n(o){if(t[o])return t[o].exports;var r=t[o]={i:o,l:!1,exports:{}};return e[o].call(r.exports,r,r.exports,n),r.l=!0,r.exports}return n.m=e,n.c=t,n.d=function(e,t,o){n.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:o})},n.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},n.t=function(e,t){if(1&t&&(e=n(e)),8&t)return e;if(4&t&&"object"==typeof e&&e&&e.__esModule)return e;var o=Object.create(null);if(n.r(o),Object.defineProperty(o,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var r in e)n.d(o,r,function(t){return e[t]}.bind(null,r));return o},n.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return n.d(t,"a",t),t},n.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},n.p="",n(n.s=1)}([function(e,t){var n;n=function(){return this}();try{n=n||new Function("return this")()}catch(e){"object"==typeof window&&(n=window)}e.exports=n},function(e,t,n){e.exports=n(2)},function(e,t,n){"use strict";n(3);let o={},r=new AudioContext;e.exports=function(e,t){let n,i,u,f,a,c=0,l=this,s=!1,d=!1,p=0,h=!1,y=!1,b=0,g=0,m=!1,v=!1,w=0;function A(){i=x(c),u=x(c),f=x(c),a=x(c)}function x(e){return Array.apply(null,Array(e)).map(Number.prototype.valueOf,0)}function O(e,t){console.time("load file "+e),fetch(e,{method:"GET",responseType:"arrayBuffer",cache:"force-cache"}).then(e=>e.arrayBuffer()).then(t=>o[e]?Promise.resolve(o[e]):r.decodeAudioData(t)).then(r=>(n[Math.floor(t/2)]=r,o[e]||(o[e]=r),t)).then(t=>{console.log("Mach1Sound {path: "+e+", i: "+t+", "+(t+1)+"} loaded"),console.timeEnd("load file "+e),(d=c==(p+=2))&&m&&(l.play(v,w),m=!1)}).catch(e=>{console.warn(e)})}function C(){if(l.isReady()&&h)for(let e=0;e<i.length;++e)u[e].gain.value=f[e]}return this.setup=function(e,t){s=!1,c=2*e.length,n=x(e.length),A();for(let t=0;t<e.length;++t)O(e[t],2*t)},this.setup=function(e){s=!0,c=2*e.numberOfChannels,n=e,A(),(d=!0)&&m&&(l.play(v,w),m=!1)},this.getBuffer=function(){let e=x(c/2);for(let t=0;t<c/2;++t)e[t]=i[2*t].buffer;return e},this.isReady=function(){return d&&!y},this.isPlaying=function(){return h},this.play=function(e=!1,t=l.currentTime()){!this.isReady()||h||y?(m=!0,v=e,w=t):(!function(e,t){if(l.isReady()&&!h){for(let e=0,t=0;t<c/2;++t,e+=2)i[e]=r.createBufferSource(),s?(i[e].buffer=r.createBuffer(1,n.length/n.numberOfChannels,r.sampleRate),i[e].buffer.copyToChannel(n.getChannelData(t),0,0)):i[e].buffer=n[t],u[e]=r.createGain(),u[e].gain.value=0,a[e]=r.createPanner(),a[e].setPosition(-1,0,0),a[e].panningModel="equalpower",i[e].connect(a[e]),a[e].connect(u[e]),u[e].connect(r.destination),i[e+1]=r.createBufferSource(),s?(i[e+1].buffer=r.createBuffer(1,n.length/n.numberOfChannels,r.sampleRate),i[e+1].buffer.copyToChannel(n.getChannelData(t),0,0)):i[e+1].buffer=n[t],u[e+1]=r.createGain(),u[e+1].gain.value=0,a[e+1]=r.createPanner(),a[e+1].setPosition(1,0,0),a[e+1].panningModel="equalpower",i[e+1].connect(a[e+1]),a[e+1].connect(u[e+1]),u[e+1].connect(r.destination);for(let n=0;n<c;++n)i[n].loop=e,i[n].start(0,t);b=r.currentTime-t,h=!0}}(e,t),C())},this.pause=function(){this.stop()},this.stop=function(){if(this.isReady()&&h&&!y){h=!1,m=!1,g=r.currentTime;for(let e=0;e<i.length;++e)i[e].stop(),"function"==typeof i[e].disconnect&&i[e].disconnect()}},this.remove=function(){if(this.isReady())for(let e=0;e<i.length;++e)i[e].stop();y=!0},this.currentTime=function(){return this.isReady()&&h?r.currentTime-b:g-b>0?g-b:0},this.rewind=function(e){e<0&&(e=0),this.stop(),this.play(e),console.log("rewind")},this.getVolumes=function(){return f},this.updateVolumes=function(e){if(Array.isArray(e))for(let t=0;t<c;++t)f[t]=e[t];h&&C()},this}},function(e,t,n){"use strict";(function(e){var t=n(4),o=e.OfflineAudioContext||e.webkitOfflineAudioContext;if(o){var r=new Uint32Array([1179011410,56,1163280727,544501094,16,65537,44100,88200,1048578,1635017060,20,0,0,0,0,0]).buffer;if(!new o(1,128,44100).decodeAudioData(r,function(){},function(){})){var i=t.prototype.decodeAudioData;t.prototype.decodeAudioData=function(e,t,n){var o=this,r=new Promise(function(t,n){return i.call(o,e,t,n)});return r.then(t,n),r},t.prototype.decodeAudioData.original=i}}}).call(this,n(0))},function(e,t,n){(function(t){var n=t.AudioContext||t.webkitAudioContext,o=t.OfflineAudioContext||t.webkitOfflineAudioContext,r=t.BaseAudioContext||o&&Object.getPrototypeOf(o);e.exports="function"==typeof r&&r.prototype?r:n}).call(this,n(0))}]);