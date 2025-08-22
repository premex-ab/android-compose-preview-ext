package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CILICO device specifications for Android Compose previews.
 *
 * This extension provides CILICO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CILICO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CILICO: Any
  get() = object {
      /** CILICO C6_R */
      val C6_R = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CILICO C7X_R */
      val C7X_R = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CILICO C80 */
      val C80 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
