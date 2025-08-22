package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PLDTHOME device specifications for Android Compose previews.
 *
 * This extension provides PLDTHOME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PLDTHOME.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PLDTHOME: Any
  get() = object {
      /** DeviceSpec(manufacturer=PLDTHOME, code=DS8942-KPP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLDTHOME, code=DS8942-KPP,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DS8942_KPP = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
