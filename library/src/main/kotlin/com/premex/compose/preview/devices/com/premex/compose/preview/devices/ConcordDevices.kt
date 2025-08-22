package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Concord device specifications for Android Compose previews.
 *
 * This extension provides Concord device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Concord.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Concord: Any
  get() = object {
      /** DeviceSpec(manufacturer=Concord, code=A10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Concord, code=A10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val A10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Concord, code=Concord_M15, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Concord, code=Concord_M15,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val CONCORD_M15 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Concord, code=Concord_RANGE_HS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Concord, code=Concord_RANGE_HS,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val CONCORD_RANGE_HS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
