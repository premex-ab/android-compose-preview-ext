package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GlobalSec device specifications for Android Compose previews.
 *
 * This extension provides GlobalSec device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GlobalSec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GlobalSec: Any
  get() = object {
      /** GlobalSec BW819E_CR_EEA */
      val BW819E_CR_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** GlobalSec BW819E_SK_EEA */
      val BW819E_SK_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
