package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HQ device specifications for Android Compose previews.
 *
 * This extension provides HQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=HQ, code=Tablet_HQ_T616, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HQ, code=Tablet_HQ_T616, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TABLET_HQ_T616 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
