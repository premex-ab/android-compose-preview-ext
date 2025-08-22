package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xsmart device specifications for Android Compose previews.
 *
 * This extension provides Xsmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xsmart: Any
  get() = object {
      /** DeviceSpec(manufacturer=Xsmart, code=CORE_X, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xsmart, code=CORE_X, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val CORE_X = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Xsmart, code=Mate_10, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xsmart, code=Mate_10, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val MATE_10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Xsmart, code=NOVA_7, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xsmart, code=NOVA_7, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val NOVA_7 = "spec:width=720,height=1612,unit=px,dpi=300"

  }
