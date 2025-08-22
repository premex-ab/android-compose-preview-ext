package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * icon device specifications for Android Compose previews.
 *
 * This extension provides icon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Icon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Icon: Any
  get() = object {
      /** DeviceSpec(manufacturer=icon, code=Portal_10i, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=icon, code=Portal_10i, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PORTAL_10I = "spec:width=800,height=1280,unit=px,dpi=160"

  }
