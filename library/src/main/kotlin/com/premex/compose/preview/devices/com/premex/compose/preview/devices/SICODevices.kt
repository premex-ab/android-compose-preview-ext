package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SICO device specifications for Android Compose previews.
 *
 * This extension provides SICO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SICO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SICO: Any
  get() = object {
      /** DeviceSpec(manufacturer=SICO, code=Diamond_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=Diamond_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DIAMOND_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SICO, code=Mega2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=Mega2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MEGA2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SICO, code=Mega2max, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=Mega2max, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MEGA2MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SICO, code=More_3, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=More_3, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MORE_3 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SICO, code=Nile_X, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=Nile_X, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NILE_X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SICO, code=Plus2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=Plus2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PLUS2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SICO, code=Plus3_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=Plus3_4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PLUS3_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SICO, code=SICO_Express3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=SICO_Express3,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SICO_EXPRESS3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SICO, code=Topaz, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SICO, code=Topaz, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TOPAZ = "spec:width=720,height=1280,unit=px,dpi=320"

  }
