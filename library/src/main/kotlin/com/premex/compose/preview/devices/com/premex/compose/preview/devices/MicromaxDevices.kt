package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Micromax device specifications for Android Compose previews.
 *
 * This extension provides Micromax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Micromax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Micromax: Any
  get() = object {
      /** DeviceSpec(manufacturer=Micromax, code=A107, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=A107, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A107 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=AQ5001, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=AQ5001, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AQ5001 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=B5_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=B5_Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B5_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Bharat_5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Bharat_5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BHARAT_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Bharat_5_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Bharat_5_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BHARAT_5_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Bharat_5_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Bharat_5_Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BHARAT_5_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=C1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=C1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=C1A, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=C1A, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C1A = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=C2A, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=C2A, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C2A = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=C2APlus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=C2APlus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C2APLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=E311, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E311, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E311 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=E313, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E313, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E313 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=E352, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E352, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E352 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=E453, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E453, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E453 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Micromax, code=E455, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E455, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E455 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=E460, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E460, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E460 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Micromax, code=E481, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E481, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E481 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Micromax, code=E4816, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E4816, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E4816 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Micromax, code=E484, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E484, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E484 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Micromax, code=E485, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E485, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E485 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Micromax, code=E6523, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E6523, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val E6523 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Micromax, code=E6533, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E6533, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val E6533 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Micromax, code=E6746, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E6746, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val E6746 = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Micromax, code=E7446, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E7446, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val E7446 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Micromax, code=E7533, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E7533, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val E7533 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Micromax, code=E7544, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E7544, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val E7544 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Micromax, code=E7746, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=E7746, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val E7746 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Micromax, code=F666, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=F666, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F666 = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Micromax, code=HS1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=HS1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HS1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=HS2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=HS2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HS2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=HS3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=HS3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HS3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=ikebukuro,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Micromax, code=N4120, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=N4120, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val N4120 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=N8301, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=N8301, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val N8301 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=N8305, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=N8305, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val N8305 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=P290, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P290, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P290 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Micromax, code=P470, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P470, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P470 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Micromax, code=P480, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P480, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P480 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Micromax, code=P680, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P680, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P680 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Micromax, code=P681, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P681, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P681 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Micromax, code=P701, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P701, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P701 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Micromax, code=P702, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P702, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P702 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Micromax, code=P70221, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P70221, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P70221 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Micromax, code=P802, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=P802, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P802 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Micromax, code=Q300, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q300, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val Q300 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Micromax, code=Q301, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q301, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Q301 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q326, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q326, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Q326 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q334, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q334, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q334 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q338, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q338, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q338 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q340, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q340, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q340 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q346, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q346, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q346 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q349, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q349, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q349 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q350, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q350, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q350 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q3502, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q3502, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Q3502 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q354, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q354, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q354 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q3551, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q3551, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q3551 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q372, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q372, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Q372 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q380, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q380, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Q380 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q381, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q381, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q381 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q385, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q385, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q385 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q386, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q386, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q386 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q391, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q391, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Q391 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q392, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q392, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q392 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q394, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q394, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q394 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q4001, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4001, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Q4001 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q4002, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4002, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q4002 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q402, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q402, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Q402 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q402Plus, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q402Plus, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Q402PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q409, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q409, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val Q409 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Micromax, code=Q409A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q409A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q409A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q413, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q413, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q413 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q416, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q416, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q416 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q417, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q417, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q417 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q4202, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4202, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q4202 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q4204, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4204, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Q4204 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q421, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q421, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q421 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q4251, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4251, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q4251 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q426, width=540, height=960, dpi=230,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q426, width=540,
      height=960, dpi=230, isGoogleDevice=false).code */
      val Q426 = "spec:width=540,height=960,unit=px,dpi=230"

      /** DeviceSpec(manufacturer=Micromax, code=Q4260, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4260, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q4260 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q427, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q427, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q427 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q4310, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4310, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q4310 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q4311, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4311, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q4311 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q437, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q437, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q437 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q440, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q440, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q440 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q452, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q452, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Q452 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Micromax, code=Q4601, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q4601, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q4601 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q461, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q461, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q461 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q462, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q462, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q462 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q463, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q463, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q463 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q465, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q465, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q465 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Micromax, code=Q479, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Micromax, code=Q479, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Q479 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
