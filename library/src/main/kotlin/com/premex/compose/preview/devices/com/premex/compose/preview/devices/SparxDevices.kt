package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sparx device specifications for Android Compose previews.
 *
 * This extension provides Sparx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sparx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sparx: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sparx, code=NEO5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=NEO5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEO5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Neo8Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo8Lite, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEO8LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_11, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_11, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEO_11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_5_Plus, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_5_Plus, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NEO_5_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_5_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_5_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEO_5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=NEO_6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=NEO_6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEO_6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_7, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_7, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NEO_7 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_7_Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_7_Pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NEO_7_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_7_Ultra, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_7_Ultra, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEO_7_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_8, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_8, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NEO_8 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_8_Plus, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_8_Plus, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NEO_8_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_8_Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_8_Pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NEO_8_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Sparx, code=Neo_X, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Neo_X, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NEO_X = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Note_12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Note_12, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOTE_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Note_20, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Note_20, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NOTE_20 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sparx, code=S3, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=S3, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val S3 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Sparx, code=S6, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=S6, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val S6 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Sparx, code=S9, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=S9, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Sparx_Edge_20_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Sparx_Edge_20_Pro,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val SPARX_EDGE_20_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sparx, code=Sparx_NEO_9, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Sparx_NEO_9, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val SPARX_NEO_9 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Sparx, code=Sparx_S7, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Sparx_S7, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val SPARX_S7 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Sparx, code=Ultra8, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Ultra8, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ULTRA8 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sparx, code=Ultra8Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Ultra8Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ULTRA8PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sparx, code=Ultra_11, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Ultra_11, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val ULTRA_11 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sparx, code=Ultra_8, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Ultra_8, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ULTRA_8 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sparx, code=Ultra_8i, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Ultra_8i, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val ULTRA_8I = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sparx, code=Ultra_8_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sparx, code=Ultra_8_Pro,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ULTRA_8_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
