package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Westgate_Resorts device specifications for Android Compose previews.
 *
 * This extension provides Westgate_Resorts device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WestgateResorts.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WestgateResorts: Any
  get() = object {
      /** DeviceSpec(manufacturer=Westgate_Resorts, code=T802, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Westgate_Resorts, code=T802,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val T802 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
