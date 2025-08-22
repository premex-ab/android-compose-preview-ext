package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Realtime device specifications for Android Compose previews.
 *
 * This extension provides Realtime device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Realtime.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Realtime: Any
  get() = object {
      /** DeviceSpec(manufacturer=Realtime, code=Realtime_T503F_L1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realtime, code=Realtime_T503F_L1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val REALTIME_T503F_L1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Realtime, code=RT8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realtime, code=RT8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RT8 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
