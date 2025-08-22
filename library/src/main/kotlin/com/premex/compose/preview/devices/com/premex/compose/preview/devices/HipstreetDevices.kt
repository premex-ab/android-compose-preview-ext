package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * hipstreet device specifications for Android Compose previews.
 *
 * This extension provides hipstreet device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hipstreet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hipstreet: Any
  get() = object {
      /** DeviceSpec(manufacturer=hipstreet, code=10DTB42, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hipstreet, code=10DTB42, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _10DTB42 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
