package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tiwell device specifications for Android Compose previews.
 *
 * This extension provides Tiwell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tiwell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tiwell: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tiwell, code=t662_dh4_tiwell, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tiwell, code=t662_dh4_tiwell,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val T662_DH4_TIWELL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tiwell, code=t662_gq_tiwell, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tiwell, code=t662_gq_tiwell,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val T662_GQ_TIWELL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
