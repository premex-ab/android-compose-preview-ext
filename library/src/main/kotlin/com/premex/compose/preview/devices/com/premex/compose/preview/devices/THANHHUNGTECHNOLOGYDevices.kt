package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * THANHHUNG_TECHNOLOGY device specifications for Android Compose previews.
 *
 * This extension provides THANHHUNG_TECHNOLOGY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.THANHHUNGTECHNOLOGY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.THANHHUNGTECHNOLOGY: Any
  get() = object {
      /** DeviceSpec(manufacturer=THANHHUNG_TECHNOLOGY, code=HERO_9, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=THANHHUNG_TECHNOLOGY,
      code=HERO_9, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HERO_9 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
