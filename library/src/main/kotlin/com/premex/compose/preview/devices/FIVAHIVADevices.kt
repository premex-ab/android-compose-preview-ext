package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FIVAHIVA device specifications for Android Compose previews.
 *
 * This extension provides FIVAHIVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FIVAHIVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FIVAHIVA: Any
  get() = object {
      /** FIVAHIVA FF1010 */
      val FF1010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FIVAHIVA YY_766 */
      val YY_766 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** FIVAHIVA YY_766_EEA */
      val YY_766_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
