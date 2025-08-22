package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Entity device specifications for Android Compose previews.
 *
 * This extension provides Entity device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Entity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Entity: Any
  get() = object {
      /** DeviceSpec(manufacturer=Entity, code=ENTG1011, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Entity, code=ENTG1011, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ENTG1011 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Entity, code=HW304_HW291, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Entity, code=HW304_HW291,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val HW304_HW291 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
