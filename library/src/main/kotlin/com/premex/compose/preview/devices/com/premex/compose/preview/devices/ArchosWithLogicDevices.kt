package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ArchosWithLogic device specifications for Android Compose previews.
 *
 * This extension provides ArchosWithLogic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ArchosWithLogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ArchosWithLogic: Any
  get() = object {
      /** DeviceSpec(manufacturer=ArchosWithLogic, code=ac67x5g, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ArchosWithLogic, code=ac67x5g,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val AC67X5G = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
