package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mobicell device specifications for Android Compose previews.
 *
 * This extension provides Mobicell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobicell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobicell: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mobicell, code=ICE, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicell, code=ICE, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ICE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicell, code=SHIFT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicell, code=SHIFT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SHIFT = "spec:width=480,height=854,unit=px,dpi=240"

  }
