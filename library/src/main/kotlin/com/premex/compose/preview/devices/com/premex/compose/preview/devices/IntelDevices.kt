package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * intel device specifications for Android Compose previews.
 *
 * This extension provides intel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Intel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Intel: Any
  get() = object {
      /** DeviceSpec(manufacturer=intel, code=redhookbay, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=intel, code=redhookbay, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val REDHOOKBAY = "spec:width=600,height=1024,unit=px,dpi=160"

  }
