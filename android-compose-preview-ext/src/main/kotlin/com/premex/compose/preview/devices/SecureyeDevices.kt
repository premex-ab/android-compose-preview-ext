package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SECUREYE device specifications for Android Compose previews.
 *
 * This extension provides SECUREYE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Secureye.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Secureye: Any
  get() = object {
      /** SECUREYE S-SAB220 */
      val S_SAB220 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
