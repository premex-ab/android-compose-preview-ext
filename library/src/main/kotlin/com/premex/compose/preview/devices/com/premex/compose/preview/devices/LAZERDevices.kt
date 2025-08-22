package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAZER device specifications for Android Compose previews.
 *
 * This extension provides LAZER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LAZER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LAZER: Any
  get() = object {
      /** DeviceSpec(manufacturer=LAZER, code=LZ_890, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAZER, code=LZ_890, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LZ_890 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
