package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Algar device specifications for Android Compose previews.
 *
 * This extension provides Algar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Algar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Algar: Any
  get() = object {
      /** DeviceSpec(manufacturer=Algar, code=GIU6770, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Algar, code=GIU6770, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GIU6770 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
