package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LYF device specifications for Android Compose previews.
 *
 * This extension provides LYF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LYF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LYF: Any
  get() = object {
      /** DeviceSpec(manufacturer=LYF, code=C-451, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=C-451, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C_451 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LYF, code=FL7008, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=FL7008, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val FL7008 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LYF, code=HL-L51P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=HL-L51P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HL_L51P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=LS-4006, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-4006, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LS_4006 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LYF, code=LS-4008, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-4008, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LS_4008 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LYF, code=LS-4503, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-4503, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LS_4503 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LYF, code=LS-4505, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-4505, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LS_4505 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LYF, code=LS-5009, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-5009, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LS_5009 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LYF, code=LS-5010, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-5010, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LS_5010 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=LS-5013, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-5013, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LS_5013 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=LS-5016, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-5016, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LS_5016 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=LS-5020, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-5020, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LS_5020 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=LS-5505, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-5505, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LS_5505 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LYF, code=LS-5506, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-5506, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LS_5506 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LYF, code=LS-5512, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-5512, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LS_5512 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=LS-6001, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LS-6001, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LS_6001 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=LT-8001, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LT-8001, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LT_8001 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LYF, code=LT-8001-IRIS, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=LT-8001-IRIS, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LT_8001_IRIS = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LYF, code=P839F30, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=P839F30, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P839F30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=P839F50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=P839F50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P839F50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LYF, code=panda01a_msm8952_64, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=panda01a_msm8952_64,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val PANDA01A_MSM8952_64 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LYF, code=ZTE_T920, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=ZTE_T920, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZTE_T920 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LYF, code=zx55q05_64, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYF, code=zx55q05_64, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZX55Q05_64 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
