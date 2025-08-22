package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Just5 device specifications for Android Compose previews.
 *
 * This extension provides Just5 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Just5.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Just5: Any
  get() = object {
      /** DeviceSpec(manufacturer=Just5, code=Konrow, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Just5, code=Konrow, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val KONROW = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Just5, code=M503, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Just5, code=M503, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M503 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Just5, code=MD-02P, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Just5, code=MD-02P, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MD_02P = "spec:width=480,height=800,unit=px,dpi=240"

  }
