package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maxwest device specifications for Android Compose previews.
 *
 * This extension provides Maxwest device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxwest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxwest: Any
  get() = object {
      /** DeviceSpec(manufacturer=Maxwest, code=Astro_55R, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Astro_55R, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ASTRO_55R = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=Astro_55T, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Astro_55T, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ASTRO_55T = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=Astro_5T, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Astro_5T, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val ASTRO_5T = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=Astro_5X, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Astro_5X, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val ASTRO_5X = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=Astro_63R, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Astro_63R, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ASTRO_63R = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=Astro_8Q, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Astro_8Q, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ASTRO_8Q = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=Astro_8R, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Astro_8R, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ASTRO_8R = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=Gravity_5_GO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Gravity_5_GO,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GRAVITY_5_GO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=Gravity_6P, width=720, height=1560, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Gravity_6P,
      width=720, height=1560, dpi=240, isGoogleDevice=false).code */
      val GRAVITY_6P = "spec:width=720,height=1560,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=GRAVITY_G6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=GRAVITY_G6,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val GRAVITY_G6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A100RWW, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A100RWW,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val MX_A100RWW = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A10R1WW, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A10R1WW,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val MX_A10R1WW = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A10RWW, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A10RWW, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val MX_A10RWW = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A10WW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A10WW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MX_A10WW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A4R, width=480, height=800, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A4R, width=480,
      height=800, dpi=220, isGoogleDevice=false).code */
      val MX_A4R = "spec:width=480,height=800,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A63, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A63, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val MX_A63 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A64, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A64, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val MX_A64 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MX_A65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A66WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A66WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MX_A66WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-A6T, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-A6T, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val MX_A6T = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-G55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-G55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MX_G55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-GG128WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-GG128WW,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MX_GG128WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-GG64WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-GG64WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MX_GG64WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-GG65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-GG65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MX_GG65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-NA65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-NA65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MX_NA65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-NG56, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-NG56, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val MX_NG56 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Maxwest, code=MX-NN62WW01, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=MX-NN62WW01,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val MX_NN62WW01 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_4X, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_4X, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val NITRO_4X = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_55A, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_55A, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NITRO_55A = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_55C, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_55C, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NITRO_55C = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_55E, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_55E, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NITRO_55E = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_55Q, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_55Q, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NITRO_55Q = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_55R, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_55R, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NITRO_55R = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_5C, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_5C, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val NITRO_5C = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_5P, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_5P, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NITRO_5P = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_7Q, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_7Q, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NITRO_7Q = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Maxwest, code=Nitro_8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=Nitro_8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NITRO_8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maxwest, code=PANDA_KIDS_7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=PANDA_KIDS_7,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PANDA_KIDS_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Maxwest, code=TAB-9G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=TAB-9G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_9G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Maxwest, code=TAB_MAX_7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxwest, code=TAB_MAX_7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_MAX_7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
