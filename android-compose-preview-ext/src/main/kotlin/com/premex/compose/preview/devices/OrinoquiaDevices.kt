package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Orinoquia device specifications for Android Compose previews.
 *
 * This extension provides Orinoquia device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orinoquia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orinoquia: Any
  get() = object {
      /** Orinoquia hws7701u */
      val HWS7701U = "spec:width=600,height=976,unit=px,dpi=160"

      /** Orinoquia hws7721u */
      val HWS7721U = "spec:width=600,height=1024,unit=px,dpi=160"

  }
