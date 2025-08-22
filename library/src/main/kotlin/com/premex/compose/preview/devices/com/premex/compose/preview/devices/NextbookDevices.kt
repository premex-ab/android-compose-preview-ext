package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nextbook device specifications for Android Compose previews.
 *
 * This extension provides Nextbook device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nextbook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nextbook: Any
  get() = object {
      /** DeviceSpec(manufacturer=Nextbook, code=NXM865FD, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nextbook, code=NXM865FD, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NXM865FD = "spec:width=768,height=1024,unit=px,dpi=160"

  }
