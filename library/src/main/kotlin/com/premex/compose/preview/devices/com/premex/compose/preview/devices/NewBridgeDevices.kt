package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NewBridge device specifications for Android Compose previews.
 *
 * This extension provides NewBridge device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NewBridge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NewBridge: Any
  get() = object {
      /** DeviceSpec(manufacturer=NewBridge, code=NBTB101, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NewBridge, code=NBTB101,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val NBTB101 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NewBridge, code=NBTB102, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NewBridge, code=NBTB102,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val NBTB102 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
