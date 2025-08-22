package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GDL device specifications for Android Compose previews.
 *
 * This extension provides GDL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GDL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GDL: Any
  get() = object {
      /** DeviceSpec(manufacturer=GDL, code=G200, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GDL, code=G200, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val G200 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GDL, code=GigaX_Y21, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GDL, code=GigaX_Y21, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val GIGAX_Y21 = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GDL, code=Y30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GDL, code=Y30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Y30 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
