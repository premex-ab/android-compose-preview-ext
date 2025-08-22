package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AMobile device specifications for Android Compose previews.
 *
 * This extension provides AMobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=AMobile, code=PD470, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AMobile, code=PD470, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PD470 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
