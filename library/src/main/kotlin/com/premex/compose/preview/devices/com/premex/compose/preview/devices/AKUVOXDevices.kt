package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AKUVOX device specifications for Android Compose previews.
 *
 * This extension provides AKUVOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AKUVOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AKUVOX: Any
  get() = object {
      /** DeviceSpec(manufacturer=AKUVOX, code=S567, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AKUVOX, code=S567, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S567 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
