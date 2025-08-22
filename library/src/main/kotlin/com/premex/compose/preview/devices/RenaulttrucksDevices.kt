package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * renault_trucks device specifications for Android Compose previews.
 *
 * This extension provides renault_trucks device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Renaulttrucks.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Renaulttrucks: Any
  get() = object {
      /** renault_trucks aivi2_r_full_dom */
      val AIVI2_R_FULL_DOM = "spec:width=720,height=1280,unit=px,dpi=160"

  }
