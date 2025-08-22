package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Allnet device specifications for Android Compose previews.
 *
 * This extension provides Allnet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Allnet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Allnet: Any
  get() = object {
      /** DeviceSpec(manufacturer=Allnet, code=PrimeOne, width=1080, height=1920, dpi=214,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Allnet, code=PrimeOne, width=1080,
      height=1920, dpi=214, isGoogleDevice=false).code */
      val PRIMEONE = "spec:width=1080,height=1920,unit=px,dpi=214"

  }
