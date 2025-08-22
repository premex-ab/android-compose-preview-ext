package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Einstein device specifications for Android Compose previews.
 *
 * This extension provides Einstein device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Einstein.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Einstein: Any
  get() = object {
      /** DeviceSpec(manufacturer=Einstein, code=ENTAB3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Einstein, code=ENTAB3, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ENTAB3 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
